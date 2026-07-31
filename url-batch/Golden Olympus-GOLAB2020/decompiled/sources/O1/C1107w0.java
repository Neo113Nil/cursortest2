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

/* renamed from: O1.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1107w0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8296a;

    public C1107w0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8296a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1089v0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Object read = JsonPropertyParser.read(context, data, "value", this.f8296a.b9());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"val…pedValueJsonEntityParser)");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        return new C1089v0(readOptionalExpression, (AbstractC1086uf) read, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1089v0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, FirebaseAnalytics.Param.INDEX, value.f8187a);
        JsonPropertyParser.write(context, jSONObject, "type", "array_insert_value");
        JsonPropertyParser.write(context, jSONObject, "value", value.f8188b, this.f8296a.b9());
        JsonExpressionParser.writeExpression(context, jSONObject, "variable_name", value.f8189c);
        return jSONObject;
    }
}
