package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class V0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5007a;

    public V0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5007a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public P0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, FirebaseAnalytics.Param.CONTENT, this.f5007a.c0());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"con…dContentJsonEntityParser)");
        return new P0((Q0) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, P0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, FirebaseAnalytics.Param.CONTENT, value.f4290a, this.f5007a.c0());
        JsonPropertyParser.write(context, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
