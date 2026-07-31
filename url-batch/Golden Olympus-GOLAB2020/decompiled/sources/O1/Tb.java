package O1;

import O1.AbstractC0760cb;
import O1.B3;
import O1.Nb;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Tb implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4873a;

    public Tb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4873a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nb deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "rounded_rectangle")) {
            return new Nb.d(((AbstractC0760cb.b) this.f4873a.u6().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "circle")) {
            return new Nb.a(((B3.b) this.f4873a.U1().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Wb wb = orThrow instanceof Wb ? (Wb) orThrow : null;
        if (wb != null) {
            return ((Vb) this.f4873a.U6().getValue()).resolve(context, wb, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Nb value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Nb.d) {
            return ((AbstractC0760cb.b) this.f4873a.u6().getValue()).serialize(context, ((Nb.d) value).c());
        }
        if (value instanceof Nb.a) {
            return ((B3.b) this.f4873a.U1().getValue()).serialize(context, ((Nb.a) value).c());
        }
        throw new W1.m();
    }
}
