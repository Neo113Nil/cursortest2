package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3800a;

    public M1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3800a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public L1 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ELPER_INT, NUMBER_TO_INT)");
        Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        Object read = JsonPropertyParser.read(context, data, "value", this.f3800a.b9());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"val…pedValueJsonEntityParser)");
        return new L1(readExpression, readExpression2, (AbstractC1086uf) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, L1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "lifetime", value.f3654a);
        JsonExpressionParser.writeExpression(context, jSONObject, "name", value.f3655b);
        JsonPropertyParser.write(context, jSONObject, "type", "set_stored_value");
        JsonPropertyParser.write(context, jSONObject, "value", value.f3656c, this.f3800a.b9());
        return jSONObject;
    }
}
