package O1;

import O1.AbstractC1080u9;
import O1.B9;
import O1.D9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.n9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0955n9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7223a;

    public C0955n9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7223a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public D9 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        D9 d9 = entityTemplate instanceof D9 ? (D9) entityTemplate : null;
        if (d9 != null && (a4 = d9.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "slide")) {
            return new D9.d(((B9.d) this.f7223a.u5().getValue()).deserialize(context, (C9) (d9 != null ? d9.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "overlap")) {
            return new D9.c(((AbstractC1080u9.d) this.f7223a.r5().getValue()).deserialize(context, (C1098v9) (d9 != null ? d9.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, D9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof D9.d) {
            return ((B9.d) this.f7223a.u5().getValue()).serialize(context, ((D9.d) value).c());
        }
        if (value instanceof D9.c) {
            return ((AbstractC1080u9.d) this.f7223a.r5().getValue()).serialize(context, ((D9.c) value).c());
        }
        throw new W1.m();
    }
}
