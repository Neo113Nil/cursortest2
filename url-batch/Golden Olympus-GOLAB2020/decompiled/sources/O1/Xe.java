package O1;

import O1.AbstractC0889jf;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xe implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5284a;

    public Xe(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5284a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0889jf deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0889jf abstractC0889jf = entityTemplate instanceof AbstractC0889jf ? (AbstractC0889jf) entityTemplate : null;
        if (abstractC0889jf != null && (a4 = abstractC0889jf.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "non_modal")) {
            return new AbstractC0889jf.d(((C0836gf) this.f5284a.T8().getValue()).deserialize(context, (Cif) (abstractC0889jf != null ? abstractC0889jf.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "modal")) {
            return new AbstractC0889jf.c(((C0746bf) this.f5284a.Q8().getValue()).deserialize(context, (C0782df) (abstractC0889jf != null ? abstractC0889jf.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0889jf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0889jf.d) {
            return ((C0836gf) this.f5284a.T8().getValue()).serialize(context, ((AbstractC0889jf.d) value).c());
        }
        if (value instanceof AbstractC0889jf.c) {
            return ((C0746bf) this.f5284a.Q8().getValue()).serialize(context, ((AbstractC0889jf.c) value).c());
        }
        throw new W1.m();
    }
}
