package O1;

import O1.C1047sc;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.qc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1012qc implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7580a;

    public C1012qc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7580a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1047sc.c deserialize(ParsingContext context, C1047sc.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field = cVar != null ? cVar.f7919a : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "end", typeHelper, allowPropertyOverride, field, function1);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…rent?.end, NUMBER_TO_INT)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "margins", allowPropertyOverride, cVar != null ? cVar.f7920b : null, this.f7580a.W2());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…InsetsJsonTemplateParser)");
        Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "start", typeHelper, allowPropertyOverride, cVar != null ? cVar.f7921c : null, function1);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…nt?.start, NUMBER_TO_INT)");
        Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "track_active_style", allowPropertyOverride, cVar != null ? cVar.f7922d : null, this.f7580a.T2());
        Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…awableJsonTemplateParser)");
        Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "track_inactive_style", allowPropertyOverride, cVar != null ? cVar.f7923e : null, this.f7580a.T2());
        Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…awableJsonTemplateParser)");
        return new C1047sc.c(readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readOptionalField2, readOptionalField3);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1047sc.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "end", value.f7919a);
        JsonFieldParser.writeField(context, jSONObject, "margins", value.f7920b, this.f7580a.W2());
        JsonFieldParser.writeExpressionField(context, jSONObject, "start", value.f7921c);
        JsonFieldParser.writeField(context, jSONObject, "track_active_style", value.f7922d, this.f7580a.T2());
        JsonFieldParser.writeField(context, jSONObject, "track_inactive_style", value.f7923e, this.f7580a.T2());
        return jSONObject;
    }
}
