package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class R1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4495a;

    public R1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4495a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q1 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "value", this.f4495a.b9());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"val…pedValueJsonEntityParser)");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        return new Q1((AbstractC1086uf) read, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Q1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "set_variable");
        JsonPropertyParser.write(context, jSONObject, "value", value.f4367a, this.f4495a.b9());
        JsonExpressionParser.writeExpression(context, jSONObject, "variable_name", value.f4368b);
        return jSONObject;
    }
}
