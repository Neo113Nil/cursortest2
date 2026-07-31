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

/* renamed from: O1.i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0866i9 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6478a;

    public C0866i9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6478a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0901k9 deserialize(ParsingContext context, C0901k9 c0901k9, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readField = JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(context), data, "page_width", context.getAllowPropertyOverride(), c0901k9 != null ? c0901k9.f6831a : null, this.f6478a.I5());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…geSizeJsonTemplateParser)");
        return new C0901k9(readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0901k9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "page_width", value.f6831a, this.f6478a.I5());
        JsonPropertyParser.write(context, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
