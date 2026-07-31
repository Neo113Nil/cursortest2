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
public final class C0 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1555a;

    public C0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1555a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public E0 deserialize(ParsingContext context, E0 e02, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, e02 != null ? e02.f2493a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.index, NUMBER_TO_INT)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, e02 != null ? e02.f2494b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…de, parent?.variableName)");
        return new E0(readFieldWithExpression, readFieldWithExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, E0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, FirebaseAnalytics.Param.INDEX, value.f2493a);
        JsonPropertyParser.write(context, jSONObject, "type", "array_remove_value");
        JsonFieldParser.writeExpressionField(context, jSONObject, "variable_name", value.f2494b);
        return jSONObject;
    }
}
