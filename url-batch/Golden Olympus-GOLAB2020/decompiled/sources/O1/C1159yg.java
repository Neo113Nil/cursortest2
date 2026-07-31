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

/* renamed from: O1.yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1159yg implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8663a;

    public C1159yg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8663a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1141xg deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "name");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"name\")");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ELPER_INT, NUMBER_TO_INT)");
        return new C1141xg((String) read, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1141xg value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "name", value.f8502a);
        JsonPropertyParser.write(context, jSONObject, "type", "integer");
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f8503b);
        return jSONObject;
    }
}
