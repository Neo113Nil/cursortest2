package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S1 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4697a;

    public S1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4697a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U1 deserialize(ParsingContext context, U1 u12, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "value", allowPropertyOverride, u12 != null ? u12.f4911a : null, this.f4697a.c9());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…dValueJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, u12 != null ? u12.f4912b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…de, parent?.variableName)");
        return new U1(readField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, U1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "set_variable");
        JsonFieldParser.writeField(context, jSONObject, "value", value.f4911a, this.f4697a.c9());
        JsonFieldParser.writeExpressionField(context, jSONObject, "variable_name", value.f4912b);
        return jSONObject;
    }
}
