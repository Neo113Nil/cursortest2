package O1;

import O1.G8;
import O1.Ma;
import O1.Pd;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Qd implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4482a;

    public Qd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4482a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pd deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "gradient")) {
            return new Pd.c(((G8.b) this.f4482a.S4().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "radial_gradient")) {
            return new Pd.d(((Ma.b) this.f4482a.i6().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Td td = orThrow instanceof Td ? (Td) orThrow : null;
        if (td != null) {
            return ((Sd) this.f4482a.c8().getValue()).resolve(context, td, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Pd value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Pd.c) {
            return ((G8.b) this.f4482a.S4().getValue()).serialize(context, ((Pd.c) value).c());
        }
        if (value instanceof Pd.d) {
            return ((Ma.b) this.f4482a.i6().getValue()).serialize(context, ((Pd.d) value).c());
        }
        throw new W1.m();
    }
}
