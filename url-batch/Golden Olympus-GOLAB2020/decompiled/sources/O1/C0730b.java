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

/* renamed from: O1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0730b implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5764a;

    public C0730b(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5764a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0712a deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …, TYPE_HELPER_JSON_ARRAY)");
        return new C0712a(readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0712a value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "array");
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f5571a);
        return jSONObject;
    }
}
