package O1;

import O1.R9;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4784a;

    public S9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4784a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R9.a deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "id");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"id\")");
        return new R9.a((String) read, JsonPropertyParser.readOptionalList(context, data, FirebaseAnalytics.Param.ITEMS, this.f4784a.J4()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, R9.a value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "id", value.f4661a);
        JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f4662b, this.f4784a.J4());
        return jSONObject;
    }
}
