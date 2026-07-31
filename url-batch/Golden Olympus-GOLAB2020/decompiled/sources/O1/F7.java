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
public final class F7 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2804a;

    public F7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2804a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public H7 deserialize(ParsingContext context, H7 h7, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, context.getAllowPropertyOverride(), h7 != null ? h7.f2972a : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…verride, parent?.pattern)");
        return new H7(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, H7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "pattern", value.f2972a);
        JsonPropertyParser.write(context, jSONObject, "type", "regex");
        return jSONObject;
    }
}
