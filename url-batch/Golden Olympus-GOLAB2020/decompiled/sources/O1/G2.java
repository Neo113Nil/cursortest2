package O1;

import O1.E2;
import O1.P3;
import O1.Z8;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2813a;

    public G2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2813a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public E2 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "color_animator")) {
            return new E2.a(((P3.d) this.f2813a.g2().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "number_animator")) {
            return new E2.d(((Z8.d) this.f2813a.e5().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        J2 j22 = orThrow instanceof J2 ? (J2) orThrow : null;
        if (j22 != null) {
            return ((I2) this.f2813a.s1().getValue()).resolve(context, j22, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, E2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof E2.a) {
            return ((P3.d) this.f2813a.g2().getValue()).serialize(context, ((E2.a) value).c());
        }
        if (value instanceof E2.d) {
            return ((Z8.d) this.f2813a.e5().getValue()).serialize(context, ((E2.d) value).c());
        }
        throw new W1.m();
    }
}
