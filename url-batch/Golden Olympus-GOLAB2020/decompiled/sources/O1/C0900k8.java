package O1;

import O1.AbstractC0775d8;
import O1.AbstractC0865i8;
import O1.AbstractC0972o8;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.k8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0900k8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6828a;

    public C0900k8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6828a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0775d8 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "regex")) {
            return new AbstractC0775d8.d(((AbstractC0972o8.b) this.f6828a.G4().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new AbstractC0775d8.c(((AbstractC0865i8.b) this.f6828a.A4().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC1008q8 abstractC1008q8 = orThrow instanceof AbstractC1008q8 ? (AbstractC1008q8) orThrow : null;
        if (abstractC1008q8 != null) {
            return ((C0936m8) this.f6828a.F4().getValue()).resolve(context, abstractC1008q8, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0775d8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0775d8.d) {
            return ((AbstractC0972o8.b) this.f6828a.G4().getValue()).serialize(context, ((AbstractC0775d8.d) value).c());
        }
        if (value instanceof AbstractC0775d8.c) {
            return ((AbstractC0865i8.b) this.f6828a.A4().getValue()).serialize(context, ((AbstractC0775d8.c) value).c());
        }
        throw new W1.m();
    }
}
