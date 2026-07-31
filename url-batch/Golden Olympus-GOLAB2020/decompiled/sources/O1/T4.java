package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4862a;

    public T4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4862a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S4 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return new S4(JsonPropertyParser.readOptionalList(context, data, "on_fail_actions", this.f4862a.u0()), JsonPropertyParser.readOptionalList(context, data, "on_success_actions", this.f4862a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, S4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(context, jSONObject, "on_fail_actions", value.f4707a, this.f4862a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "on_success_actions", value.f4708b, this.f4862a.u0());
        return jSONObject;
    }
}
