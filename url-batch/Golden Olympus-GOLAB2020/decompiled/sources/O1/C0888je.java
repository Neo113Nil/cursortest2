package O1;

import O1.AbstractC0924le;
import O1.F3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.je, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0888je implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6733a;

    public C0888je(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6733a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0924le deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0924le abstractC0924le = entityTemplate instanceof AbstractC0924le ? (AbstractC0924le) entityTemplate : null;
        if (abstractC0924le != null && (a4 = abstractC0924le.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new AbstractC0924le.d(((C1155yc) this.f6733a.l7().getValue()).deserialize(context, (Ac) (abstractC0924le != null ? abstractC0924le.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "cloud")) {
            return new AbstractC0924le.a(((F3.c) this.f6733a.Y1().getValue()).deserialize(context, (G3) (abstractC0924le != null ? abstractC0924le.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0924le value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0924le.d) {
            return ((C1155yc) this.f6733a.l7().getValue()).serialize(context, ((AbstractC0924le.d) value).c());
        }
        if (value instanceof AbstractC0924le.a) {
            return ((F3.c) this.f6733a.Y1().getValue()).serialize(context, ((AbstractC0924le.a) value).c());
        }
        throw new W1.m();
    }
}
