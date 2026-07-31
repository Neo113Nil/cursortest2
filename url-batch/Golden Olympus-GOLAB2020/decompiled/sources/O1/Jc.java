package O1;

import O1.Lc;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Jc implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3332a;

    public Jc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3332a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Lc.c deserialize(ParsingContext context, Lc.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "animation_in", allowPropertyOverride, cVar != null ? cVar.f3765a : null, this.f3332a.o1());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…mationJsonTemplateParser)");
        Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "animation_out", allowPropertyOverride, cVar != null ? cVar.f3766b : null, this.f3332a.o1());
        Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…mationJsonTemplateParser)");
        Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "div", allowPropertyOverride, cVar != null ? cVar.f3767c : null, this.f3332a.K4());
        Intrinsics.checkNotNullExpressionValue(readOptionalField3, "readOptionalField(contex…nt.divJsonTemplateParser)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "state_id", allowPropertyOverride, cVar != null ? cVar.f3768d : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…verride, parent?.stateId)");
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "swipe_out_actions", allowPropertyOverride, cVar != null ? cVar.f3769e : null, this.f3332a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        return new Lc.c(readOptionalField, readOptionalField2, readOptionalField3, readField, readOptionalListField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Lc.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "animation_in", value.f3765a, this.f3332a.o1());
        JsonFieldParser.writeField(context, jSONObject, "animation_out", value.f3766b, this.f3332a.o1());
        JsonFieldParser.writeField(context, jSONObject, "div", value.f3767c, this.f3332a.K4());
        JsonFieldParser.writeField(context, jSONObject, "state_id", value.f3768d);
        JsonFieldParser.writeListField(context, jSONObject, "swipe_out_actions", value.f3769e, this.f3332a.v0());
        return jSONObject;
    }
}
