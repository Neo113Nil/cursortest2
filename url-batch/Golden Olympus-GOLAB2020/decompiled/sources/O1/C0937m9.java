package O1;

import O1.AbstractC0919l9;
import O1.AbstractC1080u9;
import O1.B9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.m9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0937m9 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7027a;

    public C0937m9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7027a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0919l9 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        if (Intrinsics.areEqual(readString, "slide")) {
            return new AbstractC0919l9.d(((B9.c) this.f7027a.t5().getValue()).deserialize(context, data));
        }
        if (Intrinsics.areEqual(readString, "overlap")) {
            return new AbstractC0919l9.c(((AbstractC1080u9.c) this.f7027a.q5().getValue()).deserialize(context, data));
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        D9 d9 = orThrow instanceof D9 ? (D9) orThrow : null;
        if (d9 != null) {
            return ((C0973o9) this.f7027a.p5().getValue()).resolve(context, d9, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0919l9 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0919l9.d) {
            return ((B9.c) this.f7027a.t5().getValue()).serialize(context, ((AbstractC0919l9.d) value).c());
        }
        if (value instanceof AbstractC0919l9.c) {
            return ((AbstractC1080u9.c) this.f7027a.q5().getValue()).serialize(context, ((AbstractC0919l9.c) value).c());
        }
        throw new W1.m();
    }
}
