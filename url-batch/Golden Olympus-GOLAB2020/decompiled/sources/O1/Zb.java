package O1;

import O1.K8;
import O1.U5;
import O1.Yb;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Zb implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5562a;

    public Zb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5562a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Yb deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        int hashCode = readString.hashCode();
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && readString.equals("match_parent")) {
                    return new Yb.d(((K8.b) this.f5562a.V4().getValue()).deserialize(context, data));
                }
            } else if (readString.equals("wrap_content")) {
                return new Yb.e(((C0819fg) this.f5562a.w9().getValue()).deserialize(context, data));
            }
        } else if (readString.equals("fixed")) {
            return new Yb.c(((U5.c) this.f5562a.t3().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0761cc abstractC0761cc = orThrow instanceof AbstractC0761cc ? (AbstractC0761cc) orThrow : null;
        if (abstractC0761cc != null) {
            return ((C0743bc) this.f5562a.X6().getValue()).resolve(context, abstractC0761cc, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Yb value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Yb.c) {
            return ((U5.c) this.f5562a.t3().getValue()).serialize(context, ((Yb.c) value).c());
        }
        if (value instanceof Yb.d) {
            return ((K8.b) this.f5562a.V4().getValue()).serialize(context, ((Yb.d) value).c());
        }
        if (value instanceof Yb.e) {
            return ((C0819fg) this.f5562a.w9().getValue()).serialize(context, ((Yb.e) value).c());
        }
        throw new W1.m();
    }
}
