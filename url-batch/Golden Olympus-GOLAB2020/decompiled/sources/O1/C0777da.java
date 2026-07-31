package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0777da implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6033a;

    public C0777da(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6033a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0759ca deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "raw_text_variable");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"raw_text_variable\")");
        return new C0759ca((String) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0759ca value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "raw_text_variable", value.a());
        JsonPropertyParser.write(context, jSONObject, "type", "phone");
        return jSONObject;
    }
}
