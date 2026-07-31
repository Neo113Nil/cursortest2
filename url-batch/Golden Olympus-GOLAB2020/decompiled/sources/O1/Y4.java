package O1;

import O1.X4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5378a;

    public Y4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5378a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public X4 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "shape_drawable")) {
            return new X4.c(((Pb) this.f5378a.P6().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0736b5 abstractC0736b5 = orThrow instanceof AbstractC0736b5 ? (AbstractC0736b5) orThrow : null;
        if (abstractC0736b5 != null) {
            return ((C0718a5) this.f5378a.U2().getValue()).resolve(context, abstractC0736b5, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, X4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof X4.c) {
            return ((Pb) this.f5378a.P6().getValue()).serialize(context, ((X4.c) value).c());
        }
        throw new W1.m();
    }
}
