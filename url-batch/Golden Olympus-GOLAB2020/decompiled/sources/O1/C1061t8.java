package O1;

import O1.AbstractC0835ge;
import O1.AbstractC0935m7;
import O1.AbstractC0976oc;
import O1.AbstractC0977od;
import O1.AbstractC1100vb;
import O1.AbstractC1129x4;
import O1.AbstractC1131x6;
import O1.Ad;
import O1.E6;
import O1.Gb;
import O1.Hc;
import O1.Jd;
import O1.K9;
import O1.Kf;
import O1.M6;
import O1.S7;
import O1.W3;
import O1.X6;
import O1.Z;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.t8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1061t8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8103a;

    public C1061t8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8103a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Z resolve(ParsingContext context, Jd template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Jd.h) {
            return new Z.h(((X6.k) this.f8103a.W3().getValue()).resolve(context, ((Jd.h) template).c(), data));
        }
        if (template instanceof Jd.f) {
            return new Z.f(((E6.j) this.f8103a.N3().getValue()).resolve(context, ((Jd.f) template).c(), data));
        }
        if (template instanceof Jd.r) {
            return new Z.r(((AbstractC0835ge.n) this.f8103a.l8().getValue()).resolve(context, ((Jd.r) template).c(), data));
        }
        if (template instanceof Jd.m) {
            return new Z.m(((Gb.g) this.f8103a.L6().getValue()).resolve(context, ((Jd.m) template).c(), data));
        }
        if (template instanceof Jd.c) {
            return new Z.c(((W3.k) this.f8103a.l2().getValue()).resolve(context, ((Jd.c) template).c(), data));
        }
        if (template instanceof Jd.g) {
            return new Z.g(((M6.i) this.f8103a.Q3().getValue()).resolve(context, ((Jd.g) template).c(), data));
        }
        if (template instanceof Jd.e) {
            return new Z.e(((AbstractC1131x6.k) this.f8103a.K3().getValue()).resolve(context, ((Jd.e) template).c(), data));
        }
        if (template instanceof Jd.k) {
            return new Z.k(((K9.j) this.f8103a.y5().getValue()).resolve(context, ((Jd.k) template).c(), data));
        }
        if (template instanceof Jd.q) {
            return new Z.q(((Ad.g) this.f8103a.Q7().getValue()).resolve(context, ((Jd.q) template).c(), data));
        }
        if (template instanceof Jd.o) {
            return new Z.o(((Hc.h) this.f8103a.p7().getValue()).resolve(context, ((Jd.o) template).c(), data));
        }
        if (template instanceof Jd.d) {
            return new Z.d(((AbstractC1129x4.g) this.f8103a.A2().getValue()).resolve(context, ((Jd.d) template).c(), data));
        }
        if (template instanceof Jd.i) {
            return new Z.i(((AbstractC0935m7.h) this.f8103a.c4().getValue()).resolve(context, ((Jd.i) template).c(), data));
        }
        if (template instanceof Jd.n) {
            return new Z.n(((AbstractC0976oc.g) this.f8103a.d7().getValue()).resolve(context, ((Jd.n) template).c(), data));
        }
        if (template instanceof Jd.p) {
            return new Z.p(((AbstractC0977od.g) this.f8103a.K7().getValue()).resolve(context, ((Jd.p) template).c(), data));
        }
        if (template instanceof Jd.j) {
            return new Z.j(((S7.n) this.f8103a.r4().getValue()).resolve(context, ((Jd.j) template).c(), data));
        }
        if (template instanceof Jd.l) {
            return new Z.l(((AbstractC1100vb.i) this.f8103a.C6().getValue()).resolve(context, ((Jd.l) template).c(), data));
        }
        if (template instanceof Jd.s) {
            return new Z.s(((Kf.h) this.f8103a.j9().getValue()).resolve(context, ((Jd.s) template).c(), data));
        }
        throw new W1.m();
    }
}
