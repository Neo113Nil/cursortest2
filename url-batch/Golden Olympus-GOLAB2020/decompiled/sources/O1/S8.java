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
public final class S8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4783a;

    public S8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4783a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R8 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
        Object read = JsonPropertyParser.read(context, data, "insets", this.f4783a.E());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"ins…geInsetsJsonEntityParser)");
        return new R8(readExpression, (C0713a0) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, R8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "image_url", value.f4647a, ParsingConvertersKt.URI_TO_STRING);
        JsonPropertyParser.write(context, jSONObject, "insets", value.f4648b, this.f4783a.E());
        JsonPropertyParser.write(context, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
