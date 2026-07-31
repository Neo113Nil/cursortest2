package O1;

import O1.N5;
import O1.Y7;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5115a;

    public W7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5115a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y7 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Y7 y7 = entityTemplate instanceof Y7 ? (Y7) entityTemplate : null;
        if (y7 != null && (a4 = y7.a()) != null) {
            readString = a4;
        }
        int hashCode = readString.hashCode();
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && readString.equals("currency")) {
                    return new Y7.c(((C0986p4) this.f5115a.w2().getValue()).deserialize(context, (C1021r4) (y7 != null ? y7.b() : null), data));
                }
            } else if (readString.equals("fixed_length")) {
                return new Y7.d(((N5.c) this.f5115a.o3().getValue()).deserialize(context, (R5) (y7 != null ? y7.b() : null), data));
            }
        } else if (readString.equals("phone")) {
            return new Y7.e(((C0795ea) this.f5115a.L5().getValue()).deserialize(context, (C0831ga) (y7 != null ? y7.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Y7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Y7.d) {
            return ((N5.c) this.f5115a.o3().getValue()).serialize(context, ((Y7.d) value).c());
        }
        if (value instanceof Y7.c) {
            return ((C0986p4) this.f5115a.w2().getValue()).serialize(context, ((Y7.c) value).c());
        }
        if (value instanceof Y7.e) {
            return ((C0795ea) this.f5115a.L5().getValue()).serialize(context, ((Y7.e) value).c());
        }
        throw new W1.m();
    }
}
