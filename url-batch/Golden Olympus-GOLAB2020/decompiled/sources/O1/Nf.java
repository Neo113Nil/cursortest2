package O1;

import O1.Mf;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Nf implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4173a;

    public Nf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4173a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ype\", TYPE_HELPER_STRING)");
        Mf.c cVar = (Mf.c) JsonPropertyParser.readOptional(context, data, CommonCode.MapKey.HAS_RESOLUTION, this.f4173a.n9());
        Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …E_HELPER_URI, ANY_TO_URI)");
        return new Mf(readOptionalExpression, readExpression, cVar, readExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Mf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "bitrate", value.f4057a);
        JsonExpressionParser.writeExpression(context, jSONObject, "mime_type", value.f4058b);
        JsonPropertyParser.write(context, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, value.f4059c, this.f4173a.n9());
        JsonPropertyParser.write(context, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(context, jSONObject, "url", value.f4060d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
