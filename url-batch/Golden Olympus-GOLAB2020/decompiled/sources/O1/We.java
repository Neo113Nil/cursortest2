package O1;

import O1.Ve;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class We implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5170a;

    public We(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5170a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ve deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "non_modal")) {
            return new Ve.d(((C0818ff) this.f5170a.S8().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "modal")) {
            return new Ve.c(((C0728af) this.f5170a.P8().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0889jf abstractC0889jf = orThrow instanceof AbstractC0889jf ? (AbstractC0889jf) orThrow : null;
        if (abstractC0889jf != null) {
            return ((Ye) this.f5170a.O8().getValue()).resolve(context, abstractC0889jf, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Ve value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Ve.d) {
            return ((C0818ff) this.f5170a.S8().getValue()).serialize(context, ((Ve.d) value).c());
        }
        if (value instanceof Ve.c) {
            return ((C0728af) this.f5170a.P8().getValue()).serialize(context, ((Ve.c) value).c());
        }
        throw new W1.m();
    }
}
