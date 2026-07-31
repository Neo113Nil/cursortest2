package O1;

import O1.AbstractC0865i8;
import O1.AbstractC0972o8;
import O1.AbstractC1008q8;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.l8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0918l8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6922a;

    public C0918l8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6922a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1008q8 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC1008q8 abstractC1008q8 = entityTemplate instanceof AbstractC1008q8 ? (AbstractC1008q8) entityTemplate : null;
        if (abstractC1008q8 != null && (a4 = abstractC1008q8.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "regex")) {
            return new AbstractC1008q8.d(((AbstractC0972o8.c) this.f6922a.H4().getValue()).deserialize(context, (C0990p8) (abstractC1008q8 != null ? abstractC1008q8.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new AbstractC1008q8.c(((AbstractC0865i8.c) this.f6922a.B4().getValue()).deserialize(context, (C0882j8) (abstractC1008q8 != null ? abstractC1008q8.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1008q8 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1008q8.d) {
            return ((AbstractC0972o8.c) this.f6922a.H4().getValue()).serialize(context, ((AbstractC1008q8.d) value).c());
        }
        if (value instanceof AbstractC1008q8.c) {
            return ((AbstractC0865i8.c) this.f6922a.B4().getValue()).serialize(context, ((AbstractC1008q8.c) value).c());
        }
        throw new W1.m();
    }
}
