package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4147a;

    public N8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4147a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M8 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "neighbour_page_width", this.f4147a.t3());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"nei…ixedSizeJsonEntityParser)");
        return new M8((S5) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, M8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "neighbour_page_width", value.f3873a, this.f4147a.t3());
        JsonPropertyParser.write(context, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
