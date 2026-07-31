package O1;

import O1.C0876j2;
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

/* renamed from: O1.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1090v1 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8192a;

    public C1090v1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8192a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0876j2.c deserialize(ParsingContext context, C0876j2.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "action", allowPropertyOverride, cVar != null ? cVar.f6565a : null, this.f8192a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ActionJsonTemplateParser)");
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "actions", allowPropertyOverride, cVar != null ? cVar.f6566b : null, this.f8192a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f6567c : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…owOverride, parent?.text)");
        return new C0876j2.c(readOptionalField, readOptionalListField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0876j2.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "action", value.f6565a, this.f8192a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "actions", value.f6566b, this.f8192a.v0());
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15450K0, value.f6567c);
        return jSONObject;
    }
}
