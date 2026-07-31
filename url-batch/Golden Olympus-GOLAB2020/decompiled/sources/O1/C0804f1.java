package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0804f1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6171a;

    public C0804f1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6171a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0786e1 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "on_fail_actions", this.f6171a.u0());
        List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "on_success_actions", this.f6171a.u0());
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
        return new C0786e1(readOptionalList, readOptionalList2, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0786e1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(context, jSONObject, "on_fail_actions", value.f6066a, this.f6171a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "on_success_actions", value.f6067b, this.f6171a.u0());
        JsonPropertyParser.write(context, jSONObject, "type", "download");
        JsonExpressionParser.writeExpression(context, jSONObject, "url", value.f6068c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
