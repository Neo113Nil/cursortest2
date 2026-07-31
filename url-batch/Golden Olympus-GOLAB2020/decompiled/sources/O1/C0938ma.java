package O1;

import O1.AbstractC0884ja;
import O1.AbstractC1063ta;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ma, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0938ma implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7028a;

    public C0938ma(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7028a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1063ta deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readOptionalString = JsonPropertyParser.readOptionalString(context, data, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readOptionalString);
        AbstractC1063ta abstractC1063ta = entityTemplate instanceof AbstractC1063ta ? (AbstractC1063ta) entityTemplate : null;
        if (abstractC1063ta != null && (a4 = abstractC1063ta.a()) != null) {
            readOptionalString = a4;
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-fixed")) {
            return new AbstractC1063ta.c(((AbstractC0884ja.d) this.f7028a.O5().getValue()).deserialize(context, (C0902ka) (abstractC1063ta != null ? abstractC1063ta.b() : null), data));
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-percentage")) {
            return new AbstractC1063ta.d(((C1010qa) this.f7028a.U5().getValue()).deserialize(context, (C1045sa) (abstractC1063ta != null ? abstractC1063ta.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readOptionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1063ta value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1063ta.c) {
            return ((AbstractC0884ja.d) this.f7028a.O5().getValue()).serialize(context, ((AbstractC1063ta.c) value).c());
        }
        if (value instanceof AbstractC1063ta.d) {
            return ((C1010qa) this.f7028a.U5().getValue()).serialize(context, ((AbstractC1063ta.d) value).c());
        }
        throw new W1.m();
    }
}
