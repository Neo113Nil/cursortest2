package O1;

import O1.U0;
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
public final class S0 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4696a;

    public S0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4696a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U0 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        U0 u02 = entityTemplate instanceof U0 ? (U0) entityTemplate : null;
        if (u02 != null && (a4 = u02.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, b9.h.f15450K0)) {
            return new U0.c(((G) this.f4696a.t().getValue()).deserialize(context, (I) (u02 != null ? u02.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "url")) {
            return new U0.d(((L) this.f4696a.w().getValue()).deserialize(context, (N) (u02 != null ? u02.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, U0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof U0.c) {
            return ((G) this.f4696a.t().getValue()).serialize(context, ((U0.c) value).c());
        }
        if (value instanceof U0.d) {
            return ((L) this.f4696a.w().getValue()).serialize(context, ((U0.d) value).c());
        }
        throw new W1.m();
    }
}
