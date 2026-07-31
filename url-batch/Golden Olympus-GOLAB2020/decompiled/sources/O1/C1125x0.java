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

/* renamed from: O1.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1125x0 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8373a;

    public C1125x0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8373a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1161z0 deserialize(ParsingContext context, C1161z0 c1161z0, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, c1161z0 != null ? c1161z0.f8672a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…nt?.index, NUMBER_TO_INT)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "value", allowPropertyOverride, c1161z0 != null ? c1161z0.f8673b : null, this.f8373a.c9());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…dValueJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1161z0 != null ? c1161z0.f8674c : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…de, parent?.variableName)");
        return new C1161z0(readOptionalFieldWithExpression, readField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1161z0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, FirebaseAnalytics.Param.INDEX, value.f8672a);
        JsonPropertyParser.write(context, jSONObject, "type", "array_insert_value");
        JsonFieldParser.writeField(context, jSONObject, "value", value.f8673b, this.f8373a.c9());
        JsonFieldParser.writeExpressionField(context, jSONObject, "variable_name", value.f8674c);
        return jSONObject;
    }
}
