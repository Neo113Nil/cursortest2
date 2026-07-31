package O1;

import O1.I7;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class B7 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1458a;

    public B7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1458a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public I7 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        I7 i7 = entityTemplate instanceof I7 ? (I7) entityTemplate : null;
        if (i7 != null && (a4 = i7.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "regex")) {
            return new I7.d(((F7) this.f1458a.n4().getValue()).deserialize(context, (H7) (i7 != null ? i7.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new I7.c(((C1132x7) this.f1458a.h4().getValue()).deserialize(context, (C1168z7) (i7 != null ? i7.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, I7 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof I7.d) {
            return ((F7) this.f1458a.n4().getValue()).serialize(context, ((I7.d) value).c());
        }
        if (value instanceof I7.c) {
            return ((C1132x7) this.f1458a.h4().getValue()).serialize(context, ((I7.c) value).c());
        }
        throw new W1.m();
    }
}
