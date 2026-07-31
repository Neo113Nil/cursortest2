package O1;

import O1.N5;
import O1.T7;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class V7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5026a;

    public V7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5026a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T7 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        int hashCode = readString.hashCode();
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && readString.equals("currency")) {
                    return new T7.c(((C0968o4) this.f5026a.v2().getValue()).deserialize(context, data));
                }
            } else if (readString.equals("fixed_length")) {
                return new T7.d(((N5.b) this.f5026a.n3().getValue()).deserialize(context, data));
            }
        } else if (readString.equals("phone")) {
            return new T7.e(((C0777da) this.f5026a.K5().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Y7 y7 = orThrow instanceof Y7 ? (Y7) orThrow : null;
        if (y7 != null) {
            return ((X7) this.f5026a.u4().getValue()).resolve(context, y7, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, T7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof T7.d) {
            return ((N5.b) this.f5026a.n3().getValue()).serialize(context, ((T7.d) value).c());
        }
        if (value instanceof T7.c) {
            return ((C0968o4) this.f5026a.v2().getValue()).serialize(context, ((T7.c) value).c());
        }
        if (value instanceof T7.e) {
            return ((C0777da) this.f5026a.K5().getValue()).serialize(context, ((T7.e) value).c());
        }
        throw new W1.m();
    }
}
