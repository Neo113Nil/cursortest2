package O1;

import O1.W5;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X5 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5217a;

    public X5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5217a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W5 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return new W5(JsonPropertyParser.readOptionalList(context, data, io.appmetrica.analytics.impl.L2.f37912g, this.f5217a.C1()), (C0860i3) JsonPropertyParser.readOptional(context, data, "border", this.f5217a.I1()), (W5.c) JsonPropertyParser.readOptional(context, data, "next_focus_ids", this.f5217a.z3()), JsonPropertyParser.readOptionalList(context, data, "on_blur", this.f5217a.u0()), JsonPropertyParser.readOptionalList(context, data, "on_focus", this.f5217a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, W5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(context, jSONObject, io.appmetrica.analytics.impl.L2.f37912g, value.f5099a, this.f5217a.C1());
        JsonPropertyParser.write(context, jSONObject, "border", value.f5100b, this.f5217a.I1());
        JsonPropertyParser.write(context, jSONObject, "next_focus_ids", value.f5101c, this.f5217a.z3());
        JsonPropertyParser.writeList(context, jSONObject, "on_blur", value.f5102d, this.f5217a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "on_focus", value.f5103e, this.f5217a.u0());
        return jSONObject;
    }
}
