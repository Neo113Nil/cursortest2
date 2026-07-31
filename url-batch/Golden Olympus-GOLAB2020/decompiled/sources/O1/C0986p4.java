package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0986p4 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7462a;

    public C0986p4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7462a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1021r4 deserialize(ParsingContext context, C1021r4 c1021r4, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c1021r4 != null ? c1021r4.f7763a : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…Override, parent?.locale)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "raw_text_variable", allowPropertyOverride, c1021r4 != null ? c1021r4.f7764b : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,… parent?.rawTextVariable)");
        return new C1021r4(readOptionalFieldWithExpression, readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1021r4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, CommonUrlParts.LOCALE, value.f7763a);
        JsonFieldParser.writeField(context, jSONObject, "raw_text_variable", value.f7764b);
        JsonPropertyParser.write(context, jSONObject, "type", "currency");
        return jSONObject;
    }
}
