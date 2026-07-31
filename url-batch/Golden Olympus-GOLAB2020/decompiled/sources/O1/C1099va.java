package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1099va implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8245a;

    public C1099va(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8245a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1081ua deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "x", this.f8245a.J2());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"x\",…imensionJsonEntityParser)");
        Object read2 = JsonPropertyParser.read(context, data, "y", this.f8245a.J2());
        Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"y\",…imensionJsonEntityParser)");
        return new C1081ua((J4) read, (J4) read2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1081ua value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "x", value.f8167a, this.f8245a.J2());
        JsonPropertyParser.write(context, jSONObject, "y", value.f8168b, this.f8245a.J2());
        return jSONObject;
    }
}
