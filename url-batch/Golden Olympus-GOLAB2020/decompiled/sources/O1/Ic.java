package O1;

import O1.Bc;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ic implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3167a;

    public Ic(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3167a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bc.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        C1127x2 c1127x2 = (C1127x2) JsonPropertyParser.readOptional(context, data, "animation_in", this.f3167a.n1());
        C1127x2 c1127x22 = (C1127x2) JsonPropertyParser.readOptional(context, data, "animation_out", this.f3167a.n1());
        Z z4 = (Z) JsonPropertyParser.readOptional(context, data, "div", this.f3167a.J4());
        Object read = JsonPropertyParser.read(context, data, "state_id");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"state_id\")");
        return new Bc.c(c1127x2, c1127x22, z4, (String) read, JsonPropertyParser.readOptionalList(context, data, "swipe_out_actions", this.f3167a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Bc.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "animation_in", value.f1534a, this.f3167a.n1());
        JsonPropertyParser.write(context, jSONObject, "animation_out", value.f1535b, this.f3167a.n1());
        JsonPropertyParser.write(context, jSONObject, "div", value.f1536c, this.f3167a.J4());
        JsonPropertyParser.write(context, jSONObject, "state_id", value.f1537d);
        JsonPropertyParser.writeList(context, jSONObject, "swipe_out_actions", value.f1538e, this.f3167a.u0());
        return jSONObject;
    }
}
