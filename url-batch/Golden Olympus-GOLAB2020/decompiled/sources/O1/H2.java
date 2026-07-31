package O1;

import O1.J2;
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
public final class H2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2943a;

    public H2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2943a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public J2 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        J2 j22 = entityTemplate instanceof J2 ? (J2) entityTemplate : null;
        if (j22 != null && (a4 = j22.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "color_animator")) {
            return new J2.a(((P3.e) this.f2943a.h2().getValue()).deserialize(context, (Q3) (j22 != null ? j22.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "number_animator")) {
            return new J2.d(((Z8.e) this.f2943a.f5().getValue()).deserialize(context, (C0722a9) (j22 != null ? j22.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, J2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof J2.a) {
            return ((P3.e) this.f2943a.h2().getValue()).serialize(context, ((J2.a) value).c());
        }
        if (value instanceof J2.d) {
            return ((Z8.e) this.f2943a.f5().getValue()).serialize(context, ((J2.d) value).c());
        }
        throw new W1.m();
    }
}
