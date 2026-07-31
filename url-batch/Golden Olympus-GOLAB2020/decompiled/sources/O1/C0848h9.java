package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.h9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0848h9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6382a;

    public C0848h9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6382a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0830g9 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "page_width", this.f6382a.H5());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"pag…tageSizeJsonEntityParser)");
        return new C0830g9((Y9) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0830g9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "page_width", value.f6241a, this.f6382a.H5());
        JsonPropertyParser.write(context, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
