package O1;

import O1.AbstractC0852hd;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0726ad implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5750a;

    public C0726ad(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5750a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0852hd deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0852hd abstractC0852hd = entityTemplate instanceof AbstractC0852hd ? (AbstractC0852hd) entityTemplate : null;
        if (abstractC0852hd != null && (a4 = abstractC0852hd.a()) != null) {
            readString = a4;
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new AbstractC0852hd.d(((C0798ed) this.f5750a.G7().getValue()).deserialize(context, (C0834gd) (abstractC0852hd != null ? abstractC0852hd.b() : null), data));
        }
        if (Intrinsics.areEqual(readString, "dashed")) {
            return new AbstractC0852hd.c(((Wc) this.f5750a.A7().getValue()).deserialize(context, (Yc) (abstractC0852hd != null ? abstractC0852hd.b() : null), data));
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0852hd value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0852hd.d) {
            return ((C0798ed) this.f5750a.G7().getValue()).serialize(context, ((AbstractC0852hd.d) value).c());
        }
        if (value instanceof AbstractC0852hd.c) {
            return ((Wc) this.f5750a.A7().getValue()).serialize(context, ((AbstractC0852hd.c) value).c());
        }
        throw new W1.m();
    }
}
