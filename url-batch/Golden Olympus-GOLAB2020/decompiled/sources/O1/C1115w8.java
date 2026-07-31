package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1115w8 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8322a;

    public C1115w8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8322a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1151y8 deserialize(ParsingContext context, C1151y8 c1151y8, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "height_variable_name", allowPropertyOverride, c1151y8 != null ? c1151y8.f8636a : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…rent?.heightVariableName)");
        Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "width_variable_name", allowPropertyOverride, c1151y8 != null ? c1151y8.f8637b : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…arent?.widthVariableName)");
        return new C1151y8(readOptionalField, readOptionalField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1151y8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "height_variable_name", value.f8636a);
        JsonFieldParser.writeField(context, jSONObject, "width_variable_name", value.f8637b);
        return jSONObject;
    }
}
