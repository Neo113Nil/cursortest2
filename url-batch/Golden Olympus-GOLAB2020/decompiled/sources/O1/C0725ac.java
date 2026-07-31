package O1;

import O1.AbstractC0761cc;
import O1.K8;
import O1.U5;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0725ac implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5749a;

    public C0725ac(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5749a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0761cc deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0761cc abstractC0761cc = entityTemplate instanceof AbstractC0761cc ? (AbstractC0761cc) entityTemplate : null;
        if (abstractC0761cc != null && (a4 = abstractC0761cc.a()) != null) {
            readString = a4;
        }
        int hashCode = readString.hashCode();
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && readString.equals("match_parent")) {
                    return new AbstractC0761cc.d(((K8.c) this.f5749a.W4().getValue()).deserialize(context, (L8) (abstractC0761cc != null ? abstractC0761cc.b() : null), data));
                }
            } else if (readString.equals("wrap_content")) {
                return new AbstractC0761cc.e(((C0837gg) this.f5749a.x9().getValue()).deserialize(context, (C0872ig) (abstractC0761cc != null ? abstractC0761cc.b() : null), data));
            }
        } else if (readString.equals("fixed")) {
            return new AbstractC0761cc.c(((U5.d) this.f5749a.u3().getValue()).deserialize(context, (V5) (abstractC0761cc != null ? abstractC0761cc.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0761cc value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0761cc.c) {
            return ((U5.d) this.f5749a.u3().getValue()).serialize(context, ((AbstractC0761cc.c) value).c());
        }
        if (value instanceof AbstractC0761cc.d) {
            return ((K8.c) this.f5749a.W4().getValue()).serialize(context, ((AbstractC0761cc.d) value).c());
        }
        if (value instanceof AbstractC0761cc.e) {
            return ((C0837gg) this.f5749a.x9().getValue()).serialize(context, ((AbstractC0761cc.e) value).c());
        }
        throw new W1.m();
    }
}
