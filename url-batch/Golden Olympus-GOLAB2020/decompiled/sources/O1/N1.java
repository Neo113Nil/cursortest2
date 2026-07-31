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
public final class N1 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4079a;

    public N1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4079a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public P1 deserialize(ParsingContext context, P1 p12, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, p12 != null ? p12.f4295a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(….lifetime, NUMBER_TO_INT)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, p12 != null ? p12.f4296b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…owOverride, parent?.name)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "value", allowPropertyOverride, p12 != null ? p12.f4297c : null, this.f4079a.c9());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…dValueJsonTemplateParser)");
        return new P1(readFieldWithExpression, readFieldWithExpression2, readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, P1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "lifetime", value.f4295a);
        JsonFieldParser.writeExpressionField(context, jSONObject, "name", value.f4296b);
        JsonPropertyParser.write(context, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(context, jSONObject, "value", value.f4297c, this.f4079a.c9());
        return jSONObject;
    }
}
