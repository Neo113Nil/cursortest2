package O1;

import O1.P9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4148a;

    public N9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4148a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public P9 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        P9 p9 = entityTemplate instanceof P9 ? (P9) entityTemplate : null;
        if (p9 != null && (a4 = p9.a()) != null) {
            readString = a4;
        }
        int hashCode = readString.hashCode();
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && readString.equals("wrap_content")) {
                    return new P9.d(((C0776d9) this.f4148a.i5().getValue()).deserialize(context, (C0812f9) (p9 != null ? p9.b() : null), data));
                }
            } else if (readString.equals("fixed")) {
                return new P9.c(((O8) this.f4148a.Z4().getValue()).deserialize(context, (Q8) (p9 != null ? p9.b() : null), data));
            }
        } else if (readString.equals("percentage")) {
            return new P9.e(((C0866i9) this.f4148a.l5().getValue()).deserialize(context, (C0901k9) (p9 != null ? p9.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, P9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof P9.e) {
            return ((C0866i9) this.f4148a.l5().getValue()).serialize(context, ((P9.e) value).c());
        }
        if (value instanceof P9.c) {
            return ((O8) this.f4148a.Z4().getValue()).serialize(context, ((P9.c) value).c());
        }
        if (value instanceof P9.d) {
            return ((C0776d9) this.f4148a.i5().getValue()).serialize(context, ((P9.d) value).c());
        }
        throw new W1.m();
    }
}
