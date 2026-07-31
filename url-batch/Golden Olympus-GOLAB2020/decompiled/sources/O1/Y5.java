package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y5 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5379a;

    public Y5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5379a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0773d6 deserialize(ParsingContext context, C0773d6 c0773d6, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, io.appmetrica.analytics.impl.L2.f37912g, allowPropertyOverride, c0773d6 != null ? c0773d6.f6011a : null, this.f5379a.D1());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…groundJsonTemplateParser)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "border", allowPropertyOverride, c0773d6 != null ? c0773d6.f6012b : null, this.f5379a.J1());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…BorderJsonTemplateParser)");
        Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "next_focus_ids", allowPropertyOverride, c0773d6 != null ? c0773d6.f6013c : null, this.f5379a.A3());
        Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…cusIdsJsonTemplateParser)");
        Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_blur", allowPropertyOverride, c0773d6 != null ? c0773d6.f6014d : null, this.f5379a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_focus", allowPropertyOverride, c0773d6 != null ? c0773d6.f6015e : null, this.f5379a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…ActionJsonTemplateParser)");
        return new C0773d6(readOptionalListField, readOptionalField, readOptionalField2, readOptionalListField2, readOptionalListField3);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0773d6 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f6011a, this.f5379a.D1());
        JsonFieldParser.writeField(context, jSONObject, "border", value.f6012b, this.f5379a.J1());
        JsonFieldParser.writeField(context, jSONObject, "next_focus_ids", value.f6013c, this.f5379a.A3());
        JsonFieldParser.writeListField(context, jSONObject, "on_blur", value.f6014d, this.f5379a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "on_focus", value.f6015e, this.f5379a.v0());
        return jSONObject;
    }
}
