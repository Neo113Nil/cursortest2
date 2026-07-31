package O1;

import O1.AbstractC0738b7;
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

/* renamed from: O1.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0756c7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5860a;

    public C0756c7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5860a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0738b7 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "default")) {
            return new AbstractC0738b7.c(((H4.b) this.f5860a.G2().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "stretch")) {
            return new AbstractC0738b7.d(((Oc.b) this.f5860a.t7().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0810f7 abstractC0810f7 = orThrow instanceof AbstractC0810f7 ? (AbstractC0810f7) orThrow : null;
        if (abstractC0810f7 != null) {
            return ((C0792e7) this.f5860a.Z3().getValue()).resolve(context, abstractC0810f7, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0738b7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0738b7.c) {
            return ((H4.b) this.f5860a.G2().getValue()).serialize(context, ((AbstractC0738b7.c) value).c());
        }
        if (value instanceof AbstractC0738b7.d) {
            return ((Oc.b) this.f5860a.t7().getValue()).serialize(context, ((AbstractC0738b7.d) value).c());
        }
        throw new W1.m();
    }
}
