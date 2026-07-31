package O1;

import O1.L9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3876a;

    public M9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3876a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public L9 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        int hashCode = readString.hashCode();
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && readString.equals("wrap_content")) {
                    return new L9.d(((C0758c9) this.f3876a.h5().getValue()).deserialize(context, data));
                }
            } else if (readString.equals("fixed")) {
                return new L9.c(((N8) this.f3876a.Y4().getValue()).deserialize(context, data));
            }
        } else if (readString.equals("percentage")) {
            return new L9.e(((C0848h9) this.f3876a.k5().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        P9 p9 = orThrow instanceof P9 ? (P9) orThrow : null;
        if (p9 != null) {
            return ((O9) this.f3876a.B5().getValue()).resolve(context, p9, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, L9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof L9.e) {
            return ((C0848h9) this.f3876a.k5().getValue()).serialize(context, ((L9.e) value).c());
        }
        if (value instanceof L9.c) {
            return ((N8) this.f3876a.Y4().getValue()).serialize(context, ((L9.c) value).c());
        }
        if (value instanceof L9.d) {
            return ((C0758c9) this.f3876a.h5().getValue()).serialize(context, ((L9.d) value).c());
        }
        throw new W1.m();
    }
}
