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
public final class P implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4287a;

    public P(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4287a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_DICT);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …value\", TYPE_HELPER_DICT)");
        return new O(readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, O value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "dict");
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f4181a);
        return jSONObject;
    }
}
