package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0863i6 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6472a;

    public C0863i6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6472a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0898k6 deserialize(ParsingContext context, C0898k6 c0898k6, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "name", allowPropertyOverride, c0898k6 != null ? c0898k6.f6825a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…owOverride, parent?.name)");
        Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "type", allowPropertyOverride, c0898k6 != null ? c0898k6.f6826b : null, EnumC0915l5.f6908e);
        Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…valuableType.FROM_STRING)");
        return new C0898k6(readField, readField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0898k6 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "name", value.f6825a);
        JsonFieldParser.writeField(context, jSONObject, "type", value.f6826b, EnumC0915l5.f6907d);
        return jSONObject;
    }
}
