package O1;

import O1.C0765cg;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.fg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0819fg implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6197a;

    public C0819fg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6197a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0765cg deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0765cg(JsonExpressionParser.readOptionalExpression(context, data, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (C0765cg.c) JsonPropertyParser.readOptional(context, data, "max_size", this.f6197a.t9()), (C0765cg.c) JsonPropertyParser.readOptional(context, data, "min_size", this.f6197a.t9()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0765cg value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "constrained", value.f5970a);
        JsonPropertyParser.write(context, jSONObject, "max_size", value.f5971b, this.f6197a.t9());
        JsonPropertyParser.write(context, jSONObject, "min_size", value.f5972c, this.f6197a.t9());
        JsonPropertyParser.write(context, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
