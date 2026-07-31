package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class L implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3650a;

    public L(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3650a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public N deserialize(ParsingContext context, N n4, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_URI, context.getAllowPropertyOverride(), n4 != null ? n4.f4076a : null, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…arent?.value, ANY_TO_URI)");
        return new N(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, N value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f4076a, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
