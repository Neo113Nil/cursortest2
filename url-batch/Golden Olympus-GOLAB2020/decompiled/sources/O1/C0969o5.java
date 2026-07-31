package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0969o5 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7258a;

    public C0969o5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7258a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1005q5 deserialize(ParsingContext context, C1005q5 c1005q5, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "id", allowPropertyOverride, c1005q5 != null ? c1005q5.f7570a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…llowOverride, parent?.id)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "params", allowPropertyOverride, c1005q5 != null ? c1005q5.f7571b : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…Override, parent?.params)");
        return new C1005q5(readField, readOptionalField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1005q5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "id", value.f7570a);
        JsonFieldParser.writeField(context, jSONObject, "params", value.f7571b);
        return jSONObject;
    }
}
