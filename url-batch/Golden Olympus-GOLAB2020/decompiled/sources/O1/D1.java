package O1;

import O1.A1;
import O1.AbstractC1016qg;
import O1.E1;
import O1.Pg;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2433a;

    public D1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2433a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public A1 resolve(ParsingContext context, E1 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof E1.e) {
            return new A1.e(((Pg.d) this.f2433a.T9().getValue()).resolve(context, ((E1.e) template).c(), data));
        }
        if (template instanceof E1.d) {
            return new A1.d(((AbstractC1016qg.d) this.f2433a.E9().getValue()).resolve(context, ((E1.d) template).c(), data));
        }
        if (template instanceof E1.f) {
            return new A1.f(((Vg) this.f2433a.W9().getValue()).resolve(context, ((E1.f) template).c(), data));
        }
        if (template instanceof E1.c) {
            return new A1.c(((C0944mg) this.f2433a.B9().getValue()).resolve(context, ((E1.c) template).c(), data));
        }
        throw new W1.m();
    }
}
