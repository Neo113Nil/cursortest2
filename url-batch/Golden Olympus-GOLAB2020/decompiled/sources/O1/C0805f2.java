package O1;

import O1.C0859i2;
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

/* renamed from: O1.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0805f2 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6172a;

    public C0805f2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6172a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0859i2.c.C0045c deserialize(ParsingContext context, C0859i2.c.C0045c c0045c, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "name", typeHelper, allowPropertyOverride, c0045c != null ? c0045c.f6453a : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…owOverride, parent?.name)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", typeHelper, allowPropertyOverride, c0045c != null ? c0045c.f6454b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(…wOverride, parent?.value)");
        return new C0859i2.c.C0045c(readFieldWithExpression, readFieldWithExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0859i2.c.C0045c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "name", value.f6453a);
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f6454b);
        return jSONObject;
    }
}
