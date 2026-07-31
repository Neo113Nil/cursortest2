package O1;

import O1.AbstractC0824g3;
import O1.G5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1166z5 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8725a;

    public C1166z5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8725a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public G5 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        G5 g5 = entityTemplate instanceof G5 ? (G5) entityTemplate : null;
        if (g5 != null && (a4 = g5.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "blur")) {
            return new G5.a(((AbstractC0824g3.c) this.f8725a.G1().getValue()).deserialize(context, (C0842h3) (g5 != null ? g5.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "rtl_mirror")) {
            return new G5.d(((D5) this.f8725a.i3().getValue()).deserialize(context, (F5) (g5 != null ? g5.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, G5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof G5.a) {
            return ((AbstractC0824g3.c) this.f8725a.G1().getValue()).serialize(context, ((G5.a) value).c());
        }
        if (value instanceof G5.d) {
            return ((D5) this.f8725a.i3().getValue()).serialize(context, ((G5.d) value).c());
        }
        throw new W1.m();
    }
}
