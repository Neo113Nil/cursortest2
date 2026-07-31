package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0951n5 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7148a;

    public C0951n5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7148a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0933m5 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "id");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"id\")");
        return new C0933m5((String) read, (JSONObject) JsonPropertyParser.readOptional(context, data, "params"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0933m5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "id", value.f6988a);
        JsonPropertyParser.write(context, jSONObject, "params", value.f6989b);
        return jSONObject;
    }
}
