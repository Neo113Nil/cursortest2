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

/* renamed from: O1.qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1010qa implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7579a;

    public C1010qa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7579a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1045sa deserialize(ParsingContext context, C1045sa c1045sa, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, context.getAllowPropertyOverride(), c1045sa != null ? c1045sa.f7858a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(….value, NUMBER_TO_DOUBLE)");
        return new C1045sa(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1045sa value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "pivot-percentage");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f7858a);
        return jSONObject;
    }
}
