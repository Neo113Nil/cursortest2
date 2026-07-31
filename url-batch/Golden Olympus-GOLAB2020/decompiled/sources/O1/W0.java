package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W0 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5053a;

    public W0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5053a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y0 deserialize(ParsingContext context, Y0 y02, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readField = JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(context), data, FirebaseAnalytics.Param.CONTENT, context.getAllowPropertyOverride(), y02 != null ? y02.f5297a : null, this.f5053a.d0());
        Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…ontentJsonTemplateParser)");
        return new Y0(readField);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Y0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(context, jSONObject, FirebaseAnalytics.Param.CONTENT, value.f5297a, this.f5053a.d0());
        JsonPropertyParser.write(context, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
