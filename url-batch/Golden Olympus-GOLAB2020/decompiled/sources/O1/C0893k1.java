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

/* renamed from: O1.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0893k1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6781a;

    public C0893k1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6781a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0875j1 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "element_id", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …_id\", TYPE_HELPER_STRING)");
        return new C0875j1(readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0875j1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "element_id", value.f6545a);
        JsonPropertyParser.write(context, jSONObject, "type", "focus_element");
        return jSONObject;
    }
}
