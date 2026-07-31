package O1;

import O1.AbstractC0985p3;
import O1.AbstractC1056t3;
import O1.AbstractC1092v3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1110w3 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8309a;

    public C1110w3(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8309a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1092v3 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "set")) {
            return new AbstractC1092v3.d(((AbstractC1056t3.b) this.f8309a.O1().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "change_bounds")) {
            return new AbstractC1092v3.a(((AbstractC0985p3.c) this.f8309a.L1().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC1164z3 abstractC1164z3 = orThrow instanceof AbstractC1164z3 ? (AbstractC1164z3) orThrow : null;
        if (abstractC1164z3 != null) {
            return ((C1146y3) this.f8309a.T1().getValue()).resolve(context, abstractC1164z3, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1092v3 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1092v3.d) {
            return ((AbstractC1056t3.b) this.f8309a.O1().getValue()).serialize(context, ((AbstractC1092v3.d) value).c());
        }
        if (value instanceof AbstractC1092v3.a) {
            return ((AbstractC0985p3.c) this.f8309a.L1().getValue()).serialize(context, ((AbstractC1092v3.a) value).c());
        }
        throw new W1.m();
    }
}
