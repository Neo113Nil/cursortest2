package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class G0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2807a;

    public G0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2807a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ELPER_INT, NUMBER_TO_INT)");
        Object read = JsonPropertyParser.read(context, data, "value", this.f2807a.b9());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"val…pedValueJsonEntityParser)");
        Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        return new F0(readExpression, (AbstractC1086uf) read, readExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, F0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, FirebaseAnalytics.Param.INDEX, value.f2703a);
        JsonPropertyParser.write(context, jSONObject, "type", "array_set_value");
        JsonPropertyParser.write(context, jSONObject, "value", value.f2704b, this.f2807a.b9());
        JsonExpressionParser.writeExpression(context, jSONObject, "variable_name", value.f2705c);
        return jSONObject;
    }
}
