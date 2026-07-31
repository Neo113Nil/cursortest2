package O1;

import O1.AbstractC0985p3;
import O1.AbstractC1056t3;
import O1.AbstractC1164z3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1128x3 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8426a;

    public C1128x3(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8426a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1164z3 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC1164z3 abstractC1164z3 = entityTemplate instanceof AbstractC1164z3 ? (AbstractC1164z3) entityTemplate : null;
        if (abstractC1164z3 != null && (a4 = abstractC1164z3.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "set")) {
            return new AbstractC1164z3.d(((AbstractC1056t3.c) this.f8426a.P1().getValue()).deserialize(context, (C1074u3) (abstractC1164z3 != null ? abstractC1164z3.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "change_bounds")) {
            return new AbstractC1164z3.a(((AbstractC0985p3.d) this.f8426a.M1().getValue()).deserialize(context, (C1003q3) (abstractC1164z3 != null ? abstractC1164z3.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1164z3 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1164z3.d) {
            return ((AbstractC1056t3.c) this.f8426a.P1().getValue()).serialize(context, ((AbstractC1164z3.d) value).c());
        }
        if (value instanceof AbstractC1164z3.a) {
            return ((AbstractC0985p3.d) this.f8426a.M1().getValue()).serialize(context, ((AbstractC1164z3.a) value).c());
        }
        throw new W1.m();
    }
}
