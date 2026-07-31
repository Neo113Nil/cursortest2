package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0732b1 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5765a;

    public C0732b1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5765a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0768d1 deserialize(ParsingContext context, C0768d1 c0768d1, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15463W, typeHelper, allowPropertyOverride, c0768d1 != null ? c0768d1.f5991a : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lowOverride, parent?.key)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "value", allowPropertyOverride, c0768d1 != null ? c0768d1.f5992b : null, this.f5765a.c9());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…dValueJsonTemplateParser)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "variable_name", typeHelper, allowPropertyOverride, c0768d1 != null ? c0768d1.f5993c : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…de, parent?.variableName)");
        return new C0768d1(readFieldWithExpression, readOptionalField, readFieldWithExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0768d1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15463W, value.f5991a);
        JsonPropertyParser.write(context, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(context, jSONObject, "value", value.f5992b, this.f5765a.c9());
        JsonFieldParser.writeExpressionField(context, jSONObject, "variable_name", value.f5993c);
        return jSONObject;
    }
}
