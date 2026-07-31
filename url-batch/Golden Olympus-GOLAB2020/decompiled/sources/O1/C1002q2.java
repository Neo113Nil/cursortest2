package O1;

import O1.AbstractC0912l2;
import O1.AbstractC0948n2;
import O1.AbstractC0964o0;
import O1.AbstractC1019r2;
import O1.AbstractC1055t2;
import O1.AbstractC1144y1;
import O1.G1;
import O1.J1;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1002q2 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7557a;

    public C1002q2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7557a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0948n2 resolve(ParsingContext context, AbstractC1019r2 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC1019r2.a) {
            return new AbstractC0948n2.a(((AbstractC0964o0.f) this.f7557a.M().getValue()).resolve(context, ((AbstractC1019r2.a) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.b) {
            return new AbstractC0948n2.b(((C1053t0) this.f7557a.P().getValue()).resolve(context, ((AbstractC1019r2.b) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.c) {
            return new AbstractC0948n2.c(((C1143y0) this.f7557a.S().getValue()).resolve(context, ((AbstractC1019r2.c) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.d) {
            return new AbstractC0948n2.d(((D0) this.f7557a.V().getValue()).resolve(context, ((AbstractC1019r2.d) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.e) {
            return new AbstractC0948n2.e(((I0) this.f7557a.Y().getValue()).resolve(context, ((AbstractC1019r2.e) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.f) {
            return new AbstractC0948n2.f(((N0) this.f7557a.b0().getValue()).resolve(context, ((AbstractC1019r2.f) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.i) {
            return new AbstractC0948n2.i(((X0) this.f7557a.h0().getValue()).resolve(context, ((AbstractC1019r2.i) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.j) {
            return new AbstractC0948n2.j(((C0750c1) this.f7557a.k0().getValue()).resolve(context, ((AbstractC1019r2.j) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.k) {
            return new AbstractC0948n2.k(((C0840h1) this.f7557a.n0().getValue()).resolve(context, ((AbstractC1019r2.k) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.l) {
            return new AbstractC0948n2.l(((C0929m1) this.f7557a.q0().getValue()).resolve(context, ((AbstractC1019r2.l) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.m) {
            return new AbstractC0948n2.m(((C1018r1) this.f7557a.t0().getValue()).resolve(context, ((AbstractC1019r2.m) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.n) {
            return new AbstractC0948n2.n(((AbstractC1144y1.e) this.f7557a.C0().getValue()).resolve(context, ((AbstractC1019r2.n) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.o) {
            return new AbstractC0948n2.o(((G1.d) this.f7557a.I0().getValue()).resolve(context, ((AbstractC1019r2.o) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.p) {
            return new AbstractC0948n2.p(((J1.d) this.f7557a.L0().getValue()).resolve(context, ((AbstractC1019r2.p) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.q) {
            return new AbstractC0948n2.q(((O1) this.f7557a.O0().getValue()).resolve(context, ((AbstractC1019r2.q) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.r) {
            return new AbstractC0948n2.r(((T1) this.f7557a.R0().getValue()).resolve(context, ((AbstractC1019r2.r) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.s) {
            return new AbstractC0948n2.s(((Y1) this.f7557a.U0().getValue()).resolve(context, ((AbstractC1019r2.s) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.t) {
            return new AbstractC0948n2.t(((C0769d2) this.f7557a.X0().getValue()).resolve(context, ((AbstractC1019r2.t) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.u) {
            return new AbstractC0948n2.u(((AbstractC0912l2.e) this.f7557a.g1().getValue()).resolve(context, ((AbstractC1019r2.u) template).c(), data));
        }
        if (template instanceof AbstractC1019r2.v) {
            return new AbstractC0948n2.v(((AbstractC1055t2.e) this.f7557a.m1().getValue()).resolve(context, ((AbstractC1019r2.v) template).c(), data));
        }
        throw new W1.m();
    }
}
