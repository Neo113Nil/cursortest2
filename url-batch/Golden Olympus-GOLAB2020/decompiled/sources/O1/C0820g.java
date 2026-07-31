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

/* renamed from: O1.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0820g implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6199a;

    public C0820g(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6199a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0802f deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "name");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"name\")");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …, TYPE_HELPER_JSON_ARRAY)");
        return new C0802f((String) read, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0802f value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "name", value.f6155a);
        JsonPropertyParser.write(context, jSONObject, "type", "array");
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f6156b);
        return jSONObject;
    }
}
