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
public final class Ua implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4925a;

    public Ua(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4925a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wa deserialize(ParsingContext context, Wa wa, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, context.getAllowPropertyOverride(), wa != null ? wa.f5145a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(….value, NUMBER_TO_DOUBLE)");
        return new Wa(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Wa value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "relative");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f5145a);
        return jSONObject;
    }
}
