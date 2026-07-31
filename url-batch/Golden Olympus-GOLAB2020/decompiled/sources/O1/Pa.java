package O1;

import O1.Ra;
import O1.U5;
import O1.Ya;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Pa implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4337a;

    public Pa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4337a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ra deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Ra ra = entityTemplate instanceof Ra ? (Ra) entityTemplate : null;
        if (ra != null && (a4 = ra.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new Ra.c(((U5.d) this.f4337a.u3().getValue()).deserialize(context, (V5) (ra != null ? ra.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "relative")) {
            return new Ra.d(((Ya.d) this.f4337a.s6().getValue()).deserialize(context, (Za) (ra != null ? ra.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Ra value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Ra.c) {
            return ((U5.d) this.f4337a.u3().getValue()).serialize(context, ((Ra.c) value).c());
        }
        if (value instanceof Ra.d) {
            return ((Ya.d) this.f4337a.s6().getValue()).serialize(context, ((Ra.d) value).c());
        }
        throw new W1.m();
    }
}
