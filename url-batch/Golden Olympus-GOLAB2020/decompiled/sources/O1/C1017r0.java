package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1017r0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7730a;

    public C1017r0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7730a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1000q0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "animator_id");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"animator_id\")");
        return new C1000q0((String) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1000q0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "animator_id", value.f7553a);
        JsonPropertyParser.write(context, jSONObject, "type", "animator_stop");
        return jSONObject;
    }
}
