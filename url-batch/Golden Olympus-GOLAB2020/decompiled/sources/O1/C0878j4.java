package O1;

import O1.AbstractC0861i4;
import O1.J5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0878j4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6569a;

    public C0878j4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6569a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0861i4 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "infinity")) {
            return new AbstractC0861i4.d(((C0989p7) this.f6569a.d4().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new AbstractC0861i4.c(((J5.b) this.f6569a.k3().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0932m4 abstractC0932m4 = orThrow instanceof AbstractC0932m4 ? (AbstractC0932m4) orThrow : null;
        if (abstractC0932m4 != null) {
            return ((C0914l4) this.f6569a.u2().getValue()).resolve(context, abstractC0932m4, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0861i4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0861i4.d) {
            return ((C0989p7) this.f6569a.d4().getValue()).serialize(context, ((AbstractC0861i4.d) value).c());
        }
        if (value instanceof AbstractC0861i4.c) {
            return ((J5.b) this.f6569a.k3().getValue()).serialize(context, ((AbstractC0861i4.c) value).c());
        }
        throw new W1.m();
    }
}
