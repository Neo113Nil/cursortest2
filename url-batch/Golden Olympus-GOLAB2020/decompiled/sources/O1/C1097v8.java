package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.v8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1097v8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8229a;

    public C1097v8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8229a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1079u8 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C1079u8((String) JsonPropertyParser.readOptional(context, data, "height_variable_name"), (String) JsonPropertyParser.readOptional(context, data, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1079u8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "height_variable_name", value.f8145a);
        JsonPropertyParser.write(context, jSONObject, "width_variable_name", value.f8146b);
        return jSONObject;
    }
}
