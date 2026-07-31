package O1;

import O1.Na;
import O1.U5;
import O1.Ya;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Oa implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4270a;

    public Oa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4270a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new Na.c(((U5.c) this.f4270a.t3().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "relative")) {
            return new Na.d(((Ya.c) this.f4270a.r6().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Ra ra = orThrow instanceof Ra ? (Ra) orThrow : null;
        if (ra != null) {
            return ((Qa) this.f4270a.n6().getValue()).resolve(context, ra, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Na value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Na.c) {
            return ((U5.c) this.f4270a.t3().getValue()).serialize(context, ((Na.c) value).c());
        }
        if (value instanceof Na.d) {
            return ((Ya.c) this.f4270a.r6().getValue()).serialize(context, ((Na.d) value).c());
        }
        throw new W1.m();
    }
}
