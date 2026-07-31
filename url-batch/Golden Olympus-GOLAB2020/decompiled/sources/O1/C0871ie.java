package O1;

import O1.AbstractC0853he;
import O1.F3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0871ie implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6508a;

    public C0871ie(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6508a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0853he deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "solid")) {
            return new AbstractC0853he.d(((C1137xc) this.f6508a.k7().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "cloud")) {
            return new AbstractC0853he.a(((F3.b) this.f6508a.X1().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0924le abstractC0924le = orThrow instanceof AbstractC0924le ? (AbstractC0924le) orThrow : null;
        if (abstractC0924le != null) {
            return ((C0906ke) this.f6508a.o8().getValue()).resolve(context, abstractC0924le, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0853he value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0853he.d) {
            return ((C1137xc) this.f6508a.k7().getValue()).serialize(context, ((AbstractC0853he.d) value).c());
        }
        if (value instanceof AbstractC0853he.a) {
            return ((F3.b) this.f6508a.X1().getValue()).serialize(context, ((AbstractC0853he.a) value).c());
        }
        throw new W1.m();
    }
}
