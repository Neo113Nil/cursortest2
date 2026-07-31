package O1;

import com.ironsource.b9;
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
public final class B implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1438a;

    public B(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1438a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public D deserialize(ParsingContext context, D d4, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "name", allowPropertyOverride, d4 != null ? d4.f2429a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…owOverride, parent?.name)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, d4 != null ? d4.f2430b : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lue, STRING_TO_COLOR_INT)");
        return new D(readField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, D value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "name", value.f2429a);
        JsonPropertyParser.write(context, jSONObject, "type", b9.h.f15459S);
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f2430b, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
