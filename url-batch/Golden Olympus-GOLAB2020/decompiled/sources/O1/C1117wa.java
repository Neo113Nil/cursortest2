package O1;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.wa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1117wa implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8337a;

    public C1117wa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8337a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1153ya deserialize(ParsingContext context, C1153ya c1153ya, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, "x", allowPropertyOverride, c1153ya != null ? c1153ya.f8641a : null, this.f8337a.K2());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…ensionJsonTemplateParser)");
        Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "y", allowPropertyOverride, c1153ya != null ? c1153ya.f8642b : null, this.f8337a.K2());
        Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…ensionJsonTemplateParser)");
        return new C1153ya(readField, readField2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1153ya value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, "x", value.f8641a, this.f8337a.K2());
        JsonFieldParser.writeField(context, jSONObject, "y", value.f8642b, this.f8337a.K2());
        return jSONObject;
    }
}
