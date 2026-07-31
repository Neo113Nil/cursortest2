package O1;

import O1.Id;
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

/* renamed from: O1.sd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048sd implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7942a;

    public C1048sd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7942a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Id.c deserialize(ParsingContext context, Id.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "div", allowPropertyOverride, cVar != null ? cVar.f3228a : null, this.f7942a.K4());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…nt.divJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, b9.h.f15436D0, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f3229b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.title)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "title_click_action", allowPropertyOverride, cVar != null ? cVar.f3230c : null, this.f7942a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ActionJsonTemplateParser)");
        return new Id.c(readField, readFieldWithExpression, readOptionalField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Id.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "div", value.f3228a, this.f7942a.K4());
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15436D0, value.f3229b);
        JsonFieldParser.writeField(context, jSONObject, "title_click_action", value.f3230c, this.f7942a.v0());
        return jSONObject;
    }
}
