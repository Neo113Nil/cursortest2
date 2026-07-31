package O1;

import O1.AbstractC1078u7;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class A7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1308a;

    public A7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1308a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1078u7 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "regex")) {
            return new AbstractC1078u7.d(((E7) this.f1308a.m4().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new AbstractC1078u7.c(((C1114w7) this.f1308a.g4().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        I7 i7 = orThrow instanceof I7 ? (I7) orThrow : null;
        if (i7 != null) {
            return ((C7) this.f1308a.l4().getValue()).resolve(context, i7, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1078u7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1078u7.d) {
            return ((E7) this.f1308a.m4().getValue()).serialize(context, ((AbstractC1078u7.d) value).c());
        }
        if (value instanceof AbstractC1078u7.c) {
            return ((C1114w7) this.f1308a.g4().getValue()).serialize(context, ((AbstractC1078u7.c) value).c());
        }
        throw new W1.m();
    }
}
