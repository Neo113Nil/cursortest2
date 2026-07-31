package O1;

import O1.Q0;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class R0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4494a;

    public R0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4494a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, b9.h.f15450K0)) {
            return new Q0.c(((F) this.f4494a.s().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "url")) {
            return new Q0.d(((K) this.f4494a.v().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        U0 u02 = orThrow instanceof U0 ? (U0) orThrow : null;
        if (u02 != null) {
            return ((T0) this.f4494a.e0().getValue()).resolve(context, u02, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Q0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Q0.c) {
            return ((F) this.f4494a.s().getValue()).serialize(context, ((Q0.c) value).c());
        }
        if (value instanceof Q0.d) {
            return ((K) this.f4494a.v().getValue()).serialize(context, ((Q0.d) value).c());
        }
        throw new W1.m();
    }
}
