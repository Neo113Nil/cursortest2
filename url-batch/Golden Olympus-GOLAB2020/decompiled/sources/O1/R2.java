package O1;

import O1.AbstractC0851hc;
import O1.AbstractC0903kb;
import O1.AbstractC1094v5;
import O1.M2;
import O1.O2;
import O1.S2;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class R2 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4496a;

    public R2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4496a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O2 resolve(ParsingContext context, S2 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof S2.e) {
            return new O2.e(((M2.d) this.f4496a.v1().getValue()).resolve(context, ((S2.e) template).c(), data));
        }
        if (template instanceof S2.c) {
            return new O2.c(((AbstractC1094v5.e) this.f4496a.d3().getValue()).resolve(context, ((S2.c) template).c(), data));
        }
        if (template instanceof S2.d) {
            return new O2.d(((AbstractC0903kb.e) this.f4496a.z6().getValue()).resolve(context, ((S2.d) template).c(), data));
        }
        if (template instanceof S2.f) {
            return new O2.f(((AbstractC0851hc.f) this.f4496a.a7().getValue()).resolve(context, ((S2.f) template).c(), data));
        }
        throw new W1.m();
    }
}
