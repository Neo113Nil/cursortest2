package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5052a;

    public W(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5052a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y deserialize(ParsingContext context, Y y4, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "name", allowPropertyOverride, y4 != null ? y4.f5292a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…owOverride, parent?.name)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, y4 != null ? y4.f5293b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…wOverride, parent?.value)");
        return new Y(readField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Y value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "name", value.f5292a);
        JsonPropertyParser.write(context, jSONObject, "type", "dict");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f5293b);
        return jSONObject;
    }
}
