package O1;

import O1.F4;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D4 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2456a;

    public D4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2456a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F4.c deserialize(ParsingContext context, F4.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "div", allowPropertyOverride, cVar != null ? cVar.f2734a : null, this.f2456a.K4());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…nt.divJsonTemplateParser)");
        Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "state_id", allowPropertyOverride, cVar != null ? cVar.f2735b : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…?.stateId, NUMBER_TO_INT)");
        return new F4.c(readField, readField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, F4.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "div", value.f2734a, this.f2456a.K4());
        JsonFieldParser.writeField(context, jSONObject, "state_id", value.f2735b);
        return jSONObject;
    }
}
