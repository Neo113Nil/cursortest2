package O1;

import O1.C0773d6;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0737b6 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5787a;

    public C0737b6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5787a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0773d6.c deserialize(ParsingContext context, C0773d6.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "down", typeHelper, allowPropertyOverride, cVar != null ? cVar.f6019a : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…owOverride, parent?.down)");
        Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "forward", typeHelper, allowPropertyOverride, cVar != null ? cVar.f6020b : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression2, "readOptionalFieldWithExp…verride, parent?.forward)");
        Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "left", typeHelper, allowPropertyOverride, cVar != null ? cVar.f6021c : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression3, "readOptionalFieldWithExp…owOverride, parent?.left)");
        Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "right", typeHelper, allowPropertyOverride, cVar != null ? cVar.f6022d : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression4, "readOptionalFieldWithExp…wOverride, parent?.right)");
        Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "up", typeHelper, allowPropertyOverride, cVar != null ? cVar.f6023e : null);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression5, "readOptionalFieldWithExp…llowOverride, parent?.up)");
        return new C0773d6.c(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0773d6.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "down", value.f6019a);
        JsonFieldParser.writeExpressionField(context, jSONObject, "forward", value.f6020b);
        JsonFieldParser.writeExpressionField(context, jSONObject, "left", value.f6021c);
        JsonFieldParser.writeExpressionField(context, jSONObject, "right", value.f6022d);
        JsonFieldParser.writeExpressionField(context, jSONObject, "up", value.f6023e);
        return jSONObject;
    }
}
