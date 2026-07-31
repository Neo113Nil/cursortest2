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

/* renamed from: O1.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0822g1 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6211a;

    public C0822g1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6211a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0858i1 deserialize(ParsingContext context, C0858i1 c0858i1, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_fail_actions", allowPropertyOverride, c0858i1 != null ? c0858i1.f6433a : null, this.f6211a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_success_actions", allowPropertyOverride, c0858i1 != null ? c0858i1.f6434b : null, this.f6211a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, c0858i1 != null ? c0858i1.f6435c : null, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(… parent?.url, ANY_TO_URI)");
        return new C0858i1(readOptionalListField, readOptionalListField2, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0858i1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(context, jSONObject, "on_fail_actions", value.f6433a, this.f6211a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "on_success_actions", value.f6434b, this.f6211a.v0());
        JsonPropertyParser.write(context, jSONObject, "type", "download");
        JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f6435c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
