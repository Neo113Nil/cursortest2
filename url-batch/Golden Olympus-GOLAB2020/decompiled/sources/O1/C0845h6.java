package O1;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.h6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0845h6 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6372a;

    public C0845h6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6372a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0827g6 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "name");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"name\")");
        Object read2 = JsonPropertyParser.read(context, data, "type", (Function1<R, Object>) EnumC0915l5.f6908e);
        Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"typ…valuableType.FROM_STRING)");
        return new C0827g6((String) read, (EnumC0915l5) read2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0827g6 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "name", value.f6228a);
        JsonPropertyParser.write(context, jSONObject, "type", value.f6229b, (Function1<EnumC0915l5, R>) EnumC0915l5.f6907d);
        return jSONObject;
    }
}
