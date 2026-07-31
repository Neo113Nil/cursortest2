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

/* renamed from: O1.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0751c2 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5842a;

    public C0751c2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5842a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0859i2 deserialize(ParsingContext context, C0859i2 c0859i2, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, c0859i2 != null ? c0859i2.f6439a : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…ide, parent?.containerId)");
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_fail_actions", allowPropertyOverride, c0859i2 != null ? c0859i2.f6440b : null, this.f5842a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_success_actions", allowPropertyOverride, c0859i2 != null ? c0859i2.f6441c : null, this.f5842a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "request", allowPropertyOverride, c0859i2 != null ? c0859i2.f6442d : null, this.f5842a.c1());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…equestJsonTemplateParser)");
        return new C0859i2(readFieldWithExpression, readOptionalListField, readOptionalListField2, readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0859i2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "container_id", value.f6439a);
        JsonFieldParser.writeListField(context, jSONObject, "on_fail_actions", value.f6440b, this.f5842a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "on_success_actions", value.f6441c, this.f5842a.v0());
        JsonFieldParser.writeField(context, jSONObject, "request", value.f6442d, this.f5842a.c1());
        JsonPropertyParser.write(context, jSONObject, "type", "submit");
        return jSONObject;
    }
}
