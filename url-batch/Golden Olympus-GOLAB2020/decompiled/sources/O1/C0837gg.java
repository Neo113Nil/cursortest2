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

/* renamed from: O1.gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0837gg implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6303a;

    public C0837gg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6303a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0872ig deserialize(ParsingContext context, C0872ig c0872ig, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, c0872ig != null ? c0872ig.f6514a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…strained, ANY_TO_BOOLEAN)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "max_size", allowPropertyOverride, c0872ig != null ? c0872ig.f6515b : null, this.f6303a.u9());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…ntSizeJsonTemplateParser)");
        Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, "min_size", allowPropertyOverride, c0872ig != null ? c0872ig.f6516c : null, this.f6303a.u9());
        Intrinsics.checkNotNullExpressionValue(readOptionalField2, "readOptionalField(contex…ntSizeJsonTemplateParser)");
        return new C0872ig(readOptionalFieldWithExpression, readOptionalField, readOptionalField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0872ig value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "constrained", value.f6514a);
        JsonFieldParser.writeField(context, jSONObject, "max_size", value.f6515b, this.f6303a.u9());
        JsonFieldParser.writeField(context, jSONObject, "min_size", value.f6516c, this.f6303a.u9());
        JsonPropertyParser.write(context, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
