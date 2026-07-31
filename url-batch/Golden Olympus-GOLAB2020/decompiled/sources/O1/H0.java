package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class H0 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2935a;

    public H0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2935a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public J0 deserialize(ParsingContext context, J0 j02, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, j02 != null ? j02.f3294a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.index, NUMBER_TO_INT)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "value", allowPropertyOverride, j02 != null ? j02.f3295b : null, this.f2935a.c9());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…dValueJsonTemplateParser)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, j02 != null ? j02.f3296c : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…de, parent?.variableName)");
        return new J0(readFieldWithExpression, readField, readFieldWithExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, J0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, FirebaseAnalytics.Param.INDEX, value.f3294a);
        JsonPropertyParser.write(context, jSONObject, "type", "array_set_value");
        JsonFieldParser.writeField(context, jSONObject, "value", value.f3295b, this.f2935a.c9());
        JsonFieldParser.writeExpressionField(context, jSONObject, "variable_name", value.f3296c);
        return jSONObject;
    }
}
