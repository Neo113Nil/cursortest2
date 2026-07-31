package O1;

import O1.Ge;
import O1.Je;
import O1.Le;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ce implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1600a;

    public Ce(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1600a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Le deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Le le = entityTemplate instanceof Le ? (Le) entityTemplate : null;
        if (le != null && (a4 = le.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "particles")) {
            return new Le.c(((Ge.c) this.f1600a.B8().getValue()).deserialize(context, (He) (le != null ? le.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new Le.d(((Je.c) this.f1600a.E8().getValue()).deserialize(context, (Ke) (le != null ? le.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Le value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Le.c) {
            return ((Ge.c) this.f1600a.B8().getValue()).serialize(context, ((Le.c) value).c());
        }
        if (value instanceof Le.d) {
            return ((Je.c) this.f1600a.E8().getValue()).serialize(context, ((Le.d) value).c());
        }
        throw new W1.m();
    }
}
