package O1;

import O1.Me;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Nd implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4161a;

    public Nd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4161a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Me.c deserialize(ParsingContext context, Me.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, cVar != null ? cVar.f3997a : null, this.f4161a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "images", allowPropertyOverride, cVar != null ? cVar.f3998b : null, this.f4161a.h8());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…tImageJsonTemplateParser)");
        Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "ranges", allowPropertyOverride, cVar != null ? cVar.f3999c : null, this.f4161a.t8());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField3, "readOptionalListField(co…tRangeJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f4000d : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…owOverride, parent?.text)");
        return new Me.c(readOptionalListField, readOptionalListField2, readOptionalListField3, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Me.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(context, jSONObject, "actions", value.f3997a, this.f4161a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "images", value.f3998b, this.f4161a.h8());
        JsonFieldParser.writeListField(context, jSONObject, "ranges", value.f3999c, this.f4161a.t8());
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15450K0, value.f4000d);
        return jSONObject;
    }
}
