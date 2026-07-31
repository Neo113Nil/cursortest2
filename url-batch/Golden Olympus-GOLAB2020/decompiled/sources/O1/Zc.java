package O1;

import O1.Tc;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Zc implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5563a;

    public Zc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5563a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tc deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "solid")) {
            return new Tc.d(((C0780dd) this.f5563a.F7().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "dashed")) {
            return new Tc.c(((Vc) this.f5563a.z7().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0852hd abstractC0852hd = orThrow instanceof AbstractC0852hd ? (AbstractC0852hd) orThrow : null;
        if (abstractC0852hd != null) {
            return ((C0744bd) this.f5563a.E7().getValue()).resolve(context, abstractC0852hd, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Tc value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Tc.d) {
            return ((C0780dd) this.f5563a.F7().getValue()).serialize(context, ((Tc.d) value).c());
        }
        if (value instanceof Tc.c) {
            return ((Vc) this.f5563a.z7().getValue()).serialize(context, ((Tc.c) value).c());
        }
        throw new W1.m();
    }
}
