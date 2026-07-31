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

/* renamed from: O1.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0927m implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6964a;

    public C0927m(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6964a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0963o deserialize(ParsingContext context, C0963o c0963o, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, context.getAllowPropertyOverride(), c0963o != null ? c0963o.f7239a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…t?.value, ANY_TO_BOOLEAN)");
        return new C0963o(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0963o value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "type", "boolean");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f7239a);
        return jSONObject;
    }
}
