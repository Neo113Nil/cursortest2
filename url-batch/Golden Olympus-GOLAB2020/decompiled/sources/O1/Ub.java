package O1;

import O1.AbstractC0760cb;
import O1.B3;
import O1.Wb;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ub implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4926a;

    public Ub(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4926a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Wb deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Wb wb = entityTemplate instanceof Wb ? (Wb) entityTemplate : null;
        if (wb != null && (a4 = wb.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "rounded_rectangle")) {
            return new Wb.d(((AbstractC0760cb.c) this.f4926a.v6().getValue()).deserialize(context, (C0778db) (wb != null ? wb.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "circle")) {
            return new Wb.a(((B3.c) this.f4926a.V1().getValue()).deserialize(context, (C3) (wb != null ? wb.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Wb value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Wb.d) {
            return ((AbstractC0760cb.c) this.f4926a.v6().getValue()).serialize(context, ((Wb.d) value).c());
        }
        if (value instanceof Wb.a) {
            return ((B3.c) this.f4926a.V1().getValue()).serialize(context, ((Wb.a) value).c());
        }
        throw new W1.m();
    }
}
