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
public final class Qb implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4470a;

    public Qb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4470a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Sb deserialize(ParsingContext context, Sb sb, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, sb != null ? sb.f4792a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lor, STRING_TO_COLOR_INT)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "shape", allowPropertyOverride, sb != null ? sb.f4793b : null, this.f4470a.T6());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…vShapeJsonTemplateParser)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "stroke", allowPropertyOverride, sb != null ? sb.f4794c : null, this.f4470a.x7());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…StrokeJsonTemplateParser)");
        return new Sb(readFieldWithExpression, readField, readOptionalField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Sb value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f4792a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonFieldParser.writeField(context, jSONObject, "shape", value.f4793b, this.f4470a.T6());
        JsonFieldParser.writeField(context, jSONObject, "stroke", value.f4794c, this.f4470a.x7());
        JsonPropertyParser.write(context, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
