package O1;

import O1.C1172zb;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1136xb implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8491a;

    public C1136xb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8491a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1172zb.c deserialize(ParsingContext context, C1172zb.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, b9.h.f15450K0, typeHelper, allowPropertyOverride, cVar != null ? cVar.f8882a : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…owOverride, parent?.text)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", typeHelper, allowPropertyOverride, cVar != null ? cVar.f8883b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.value)");
        return new C1172zb.c(readOptionalFieldWithExpression, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1172zb.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15450K0, value.f8882a);
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f8883b);
        return jSONObject;
    }
}
