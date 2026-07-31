package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T8 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4870a;

    public T8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4870a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public V8 deserialize(ParsingContext context, V8 v8, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, v8 != null ? v8.f5029a : null, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.imageUrl, ANY_TO_URI)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "insets", allowPropertyOverride, v8 != null ? v8.f5030b : null, this.f4870a.F());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…InsetsJsonTemplateParser)");
        return new V8(readFieldWithExpression, readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, V8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "image_url", value.f5029a, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(context, jSONObject, "insets", value.f5030b, this.f4870a.F());
        JsonPropertyParser.write(context, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
