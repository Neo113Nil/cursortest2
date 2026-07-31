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

/* renamed from: O1.ea, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0795ea implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6098a;

    public C0795ea(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6098a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0831ga deserialize(ParsingContext context, C0831ga c0831ga, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readField = JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(context), data, "raw_text_variable", context.getAllowPropertyOverride(), c0831ga != null ? c0831ga.f6246a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,… parent?.rawTextVariable)");
        return new C0831ga(readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0831ga value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "raw_text_variable", value.f6246a);
        JsonPropertyParser.write(context, jSONObject, "type", "phone");
        return jSONObject;
    }
}
