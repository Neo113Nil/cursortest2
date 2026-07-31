package O1;

import O1.C0715a2;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0733b2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5766a;

    public C0733b2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5766a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0715a2 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
        List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "on_fail_actions", this.f5766a.u0());
        List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "on_success_actions", this.f5766a.u0());
        Object read = JsonPropertyParser.read(context, data, "request", this.f5766a.b1());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"req…tRequestJsonEntityParser)");
        return new C0715a2(readExpression, readOptionalList, readOptionalList2, (C0715a2.c) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0715a2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "container_id", value.f5589a);
        JsonPropertyParser.writeList(context, jSONObject, "on_fail_actions", value.f5590b, this.f5766a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "on_success_actions", value.f5591c, this.f5766a.u0());
        JsonPropertyParser.write(context, jSONObject, "request", value.f5592d, this.f5766a.b1());
        JsonPropertyParser.write(context, jSONObject, "type", "submit");
        return jSONObject;
    }
}
