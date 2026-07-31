package O1;

import O1.AbstractC0932m4;
import O1.J5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0896k4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6807a;

    public C0896k4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6807a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0932m4 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0932m4 abstractC0932m4 = entityTemplate instanceof AbstractC0932m4 ? (AbstractC0932m4) entityTemplate : null;
        if (abstractC0932m4 != null && (a4 = abstractC0932m4.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "infinity")) {
            return new AbstractC0932m4.d(((C1007q7) this.f6807a.e4().getValue()).deserialize(context, (C1042s7) (abstractC0932m4 != null ? abstractC0932m4.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new AbstractC0932m4.c(((J5.c) this.f6807a.l3().getValue()).deserialize(context, (K5) (abstractC0932m4 != null ? abstractC0932m4.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0932m4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0932m4.d) {
            return ((C1007q7) this.f6807a.e4().getValue()).serialize(context, ((AbstractC0932m4.d) value).c());
        }
        if (value instanceof AbstractC0932m4.c) {
            return ((J5.c) this.f6807a.l3().getValue()).serialize(context, ((AbstractC0932m4.c) value).c());
        }
        throw new W1.m();
    }
}
