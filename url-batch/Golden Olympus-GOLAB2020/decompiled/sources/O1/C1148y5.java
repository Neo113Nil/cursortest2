package O1;

import O1.AbstractC0824g3;
import O1.AbstractC1130x5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1148y5 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8575a;

    public C1148y5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8575a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1130x5 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "blur")) {
            return new AbstractC1130x5.a(((AbstractC0824g3.b) this.f8575a.F1().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "rtl_mirror")) {
            return new AbstractC1130x5.d(((C5) this.f8575a.h3().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        G5 g5 = orThrow instanceof G5 ? (G5) orThrow : null;
        if (g5 != null) {
            return ((A5) this.f8575a.g3().getValue()).resolve(context, g5, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1130x5 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1130x5.a) {
            return ((AbstractC0824g3.b) this.f8575a.F1().getValue()).serialize(context, ((AbstractC1130x5.a) value).c());
        }
        if (value instanceof AbstractC1130x5.d) {
            return ((C5) this.f8575a.h3().getValue()).serialize(context, ((AbstractC1130x5.d) value).c());
        }
        throw new W1.m();
    }
}
