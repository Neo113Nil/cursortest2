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

/* renamed from: O1.zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1177zg implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8903a;

    public C1177zg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8903a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bg deserialize(ParsingContext context, Bg bg, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "name", allowPropertyOverride, bg != null ? bg.f1551a : null);
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…owOverride, parent?.name)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, bg != null ? bg.f1552b : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…nt?.value, NUMBER_TO_INT)");
        return new Bg(readField, readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Bg value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "name", value.f1551a);
        JsonPropertyParser.write(context, jSONObject, "type", "integer");
        JsonFieldParser.writeExpressionField(context, jSONObject, "value", value.f1552b);
        return jSONObject;
    }
}
