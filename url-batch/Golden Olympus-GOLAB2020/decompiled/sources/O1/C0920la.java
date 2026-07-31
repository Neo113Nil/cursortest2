package O1;

import O1.AbstractC0849ha;
import O1.AbstractC0884ja;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.la, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0920la implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6929a;

    public C0920la(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6929a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0849ha deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readOptionalString = JsonPropertyParser.readOptionalString(context, data, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-fixed")) {
            return new AbstractC0849ha.c(((AbstractC0884ja.c) this.f6929a.N5().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-percentage")) {
            return new AbstractC0849ha.d(((C0992pa) this.f6929a.T5().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readOptionalString, data);
        AbstractC1063ta abstractC1063ta = orThrow instanceof AbstractC1063ta ? (AbstractC1063ta) orThrow : null;
        if (abstractC1063ta != null) {
            return ((C0956na) this.f6929a.S5().getValue()).resolve(context, abstractC1063ta, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readOptionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0849ha value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0849ha.c) {
            return ((AbstractC0884ja.c) this.f6929a.N5().getValue()).serialize(context, ((AbstractC0849ha.c) value).c());
        }
        if (value instanceof AbstractC0849ha.d) {
            return ((C0992pa) this.f6929a.T5().getValue()).serialize(context, ((AbstractC0849ha.d) value).c());
        }
        throw new W1.m();
    }
}
