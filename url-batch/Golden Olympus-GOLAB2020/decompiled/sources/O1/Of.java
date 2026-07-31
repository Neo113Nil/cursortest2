package O1;

import com.huawei.hms.adapter.internal.CommonCode;
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

/* loaded from: classes2.dex */
public final class Of implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4286a;

    public Of(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4286a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tf deserialize(ParsingContext context, Tf tf, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean allowPropertyOverride = context.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, data, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, tf != null ? tf.f4887a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(readOptionalFieldWithExpression, "readOptionalFieldWithExp…?.bitrate, NUMBER_TO_INT)");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, tf != null ? tf.f4888b : null);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…erride, parent?.mimeType)");
        Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, data, CommonCode.MapKey.HAS_RESOLUTION, allowPropertyOverride, tf != null ? tf.f4889c : null, this.f4286a.o9());
        Intrinsics.checkNotNullExpressionValue(readOptionalField, "readOptionalField(contex…lutionJsonTemplateParser)");
        Field readFieldWithExpression2 = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, data, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, tf != null ? tf.f4890d : null, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression2, "readFieldWithExpression(… parent?.url, ANY_TO_URI)");
        return new Tf(readOptionalFieldWithExpression, readFieldWithExpression, readOptionalField, readFieldWithExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Tf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, "bitrate", value.f4887a);
        JsonFieldParser.writeExpressionField(context, jSONObject, "mime_type", value.f4888b);
        JsonFieldParser.writeField(context, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, value.f4889c, this.f4286a.o9());
        JsonPropertyParser.write(context, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(context, jSONObject, "url", value.f4890d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
