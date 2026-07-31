package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class U4 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4914a;

    public U4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4914a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W4 deserialize(ParsingContext context, W4 w4, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_fail_actions", allowPropertyOverride, w4 != null ? w4.f5094a : null, this.f4914a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField, "readOptionalListField(co…ActionJsonTemplateParser)");
        Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, data, "on_success_actions", allowPropertyOverride, w4 != null ? w4.f5095b : null, this.f4914a.v0());
        Intrinsics.checkNotNullExpressionValue(readOptionalListField2, "readOptionalListField(co…ActionJsonTemplateParser)");
        return new W4(readOptionalListField, readOptionalListField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, W4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(context, jSONObject, "on_fail_actions", value.f5094a, this.f4914a.v0());
        JsonFieldParser.writeListField(context, jSONObject, "on_success_actions", value.f5095b, this.f4914a.v0());
        return jSONObject;
    }
}
