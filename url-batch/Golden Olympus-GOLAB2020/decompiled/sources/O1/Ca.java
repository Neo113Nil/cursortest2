package O1;

import O1.Ea;
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
public final class Ca implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1599a;

    public Ca(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1599a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ea deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Ea ea = entityTemplate instanceof Ea ? (Ea) entityTemplate : null;
        if (ea != null && (a4 = ea.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new Ea.c(((Ia.d) this.f1599a.g6().getValue()).deserialize(context, (Ja) (ea != null ? ea.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "relative")) {
            return new Ea.d(((Ua) this.f1599a.p6().getValue()).deserialize(context, (Wa) (ea != null ? ea.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Ea value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Ea.c) {
            return ((Ia.d) this.f1599a.g6().getValue()).serialize(context, ((Ea.c) value).c());
        }
        if (value instanceof Ea.d) {
            return ((Ua) this.f1599a.p6().getValue()).serialize(context, ((Ea.d) value).c());
        }
        throw new W1.m();
    }
}
