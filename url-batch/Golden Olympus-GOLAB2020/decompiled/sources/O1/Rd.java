package O1;

import O1.G8;
import O1.Ma;
import O1.Td;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Rd implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4682a;

    public Rd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4682a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Td deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Td td = entityTemplate instanceof Td ? (Td) entityTemplate : null;
        if (td != null && (a4 = td.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "gradient")) {
            return new Td.c(((G8.c) this.f4682a.T4().getValue()).deserialize(context, (H8) (td != null ? td.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "radial_gradient")) {
            return new Td.d(((Ma.c) this.f4682a.j6().getValue()).deserialize(context, (C0724ab) (td != null ? td.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Td value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Td.c) {
            return ((G8.c) this.f4682a.T4().getValue()).serialize(context, ((Td.c) value).c());
        }
        if (value instanceof Td.d) {
            return ((Ma.c) this.f4682a.j6().getValue()).serialize(context, ((Td.d) value).c());
        }
        throw new W1.m();
    }
}
