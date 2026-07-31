package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O8 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4268a;

    public O8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4268a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q8 deserialize(ParsingContext context, Q8 q8, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readField = JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(context), data, "neighbour_page_width", context.getAllowPropertyOverride(), q8 != null ? q8.f4410a : null, this.f4268a.u3());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…edSizeJsonTemplateParser)");
        return new Q8(readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Q8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "neighbour_page_width", value.f4410a, this.f4268a.u3());
        JsonPropertyParser.write(context, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
