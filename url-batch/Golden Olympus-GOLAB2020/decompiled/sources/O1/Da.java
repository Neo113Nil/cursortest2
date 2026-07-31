package O1;

import O1.Aa;
import O1.Ea;
import O1.Ia;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Da implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2468a;

    public Da(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2468a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Aa resolve(ParsingContext context, Ea template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Ea.c) {
            return new Aa.c(((Ia.e) this.f2468a.h6().getValue()).resolve(context, ((Ea.c) template).c(), data));
        }
        if (template instanceof Ea.d) {
            return new Aa.d(((Va) this.f2468a.q6().getValue()).resolve(context, ((Ea.d) template).c(), data));
        }
        throw new W1.m();
    }
}
