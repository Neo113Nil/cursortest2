package O1;

import O1.AbstractC1139xe;
import O1.Ge;
import O1.Je;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Be implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1547a;

    public Be(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1547a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1139xe deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "particles")) {
            return new AbstractC1139xe.c(((Ge.b) this.f1547a.A8().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new AbstractC1139xe.d(((Je.b) this.f1547a.D8().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Le le = orThrow instanceof Le ? (Le) orThrow : null;
        if (le != null) {
            return ((De) this.f1547a.z8().getValue()).resolve(context, le, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1139xe value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1139xe.c) {
            return ((Ge.b) this.f1547a.A8().getValue()).serialize(context, ((AbstractC1139xe.c) value).c());
        }
        if (value instanceof AbstractC1139xe.d) {
            return ((Je.b) this.f1547a.D8().getValue()).serialize(context, ((AbstractC1139xe.d) value).c());
        }
        throw new W1.m();
    }
}
