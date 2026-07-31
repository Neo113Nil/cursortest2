package O1;

import O1.AbstractC0810f7;
import O1.H4;
import O1.Oc;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0774d7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6025a;

    public C0774d7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6025a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0810f7 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0810f7 abstractC0810f7 = entityTemplate instanceof AbstractC0810f7 ? (AbstractC0810f7) entityTemplate : null;
        if (abstractC0810f7 != null && (a4 = abstractC0810f7.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "default")) {
            return new AbstractC0810f7.c(((H4.c) this.f6025a.H2().getValue()).deserialize(context, (I4) (abstractC0810f7 != null ? abstractC0810f7.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "stretch")) {
            return new AbstractC0810f7.d(((Oc.c) this.f6025a.u7().getValue()).deserialize(context, (Pc) (abstractC0810f7 != null ? abstractC0810f7.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0810f7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0810f7.c) {
            return ((H4.c) this.f6025a.H2().getValue()).serialize(context, ((AbstractC0810f7.c) value).c());
        }
        if (value instanceof AbstractC0810f7.d) {
            return ((Oc.c) this.f6025a.u7().getValue()).serialize(context, ((AbstractC0810f7.d) value).c());
        }
        throw new W1.m();
    }
}
