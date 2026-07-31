package O1;

import O1.C1165z4;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1578a;

    public C4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1578a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1165z4.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "div", this.f1578a.J4());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"div…nent.divJsonEntityParser)");
        Object read2 = JsonPropertyParser.read(context, data, "state_id", (Function1<R, Object>) ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"state_id\", NUMBER_TO_INT)");
        return new C1165z4.c((Z) read, ((Number) read2).longValue());
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1165z4.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "div", value.f8721a, this.f1578a.J4());
        JsonPropertyParser.write(context, jSONObject, "state_id", Long.valueOf(value.f8722b));
        return jSONObject;
    }
}
