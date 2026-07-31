package O1;

import O1.Aa;
import O1.Ia;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ba implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1474a;

    public Ba(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1474a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Aa deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new Aa.c(((Ia.c) this.f1474a.f6().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "relative")) {
            return new Aa.d(((Ta) this.f1474a.o6().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Ea ea = orThrow instanceof Ea ? (Ea) orThrow : null;
        if (ea != null) {
            return ((Da) this.f1474a.b6().getValue()).resolve(context, ea, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Aa value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Aa.c) {
            return ((Ia.c) this.f1474a.f6().getValue()).serialize(context, ((Aa.c) value).c());
        }
        if (value instanceof Aa.d) {
            return ((Ta) this.f1474a.o6().getValue()).serialize(context, ((Aa.d) value).c());
        }
        throw new W1.m();
    }
}
