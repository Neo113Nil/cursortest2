package O1;

import O1.AbstractC0736b5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5470a;

    public Z4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5470a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0736b5 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0736b5 abstractC0736b5 = entityTemplate instanceof AbstractC0736b5 ? (AbstractC0736b5) entityTemplate : null;
        if (abstractC0736b5 != null && (a4 = abstractC0736b5.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "shape_drawable")) {
            return new AbstractC0736b5.c(((Qb) this.f5470a.Q6().getValue()).deserialize(context, (Sb) (abstractC0736b5 != null ? abstractC0736b5.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0736b5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0736b5.c) {
            return ((Qb) this.f5470a.Q6().getValue()).serialize(context, ((AbstractC0736b5.c) value).c());
        }
        throw new W1.m();
    }
}
