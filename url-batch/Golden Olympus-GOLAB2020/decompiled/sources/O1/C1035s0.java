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

/* renamed from: O1.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1035s0 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7788a;

    public C1035s0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7788a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1071u0 deserialize(ParsingContext context, C1071u0 c1071u0, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readField = JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(context), data, "animator_id", context.getAllowPropertyOverride(), c1071u0 != null ? c1071u0.f8125a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…ride, parent?.animatorId)");
        return new C1071u0(readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1071u0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "animator_id", value.f8125a);
        JsonPropertyParser.write(context, jSONObject, "type", "animator_stop");
        return jSONObject;
    }
}
