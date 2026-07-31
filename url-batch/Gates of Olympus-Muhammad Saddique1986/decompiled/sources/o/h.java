package o;

import B.a0;
import C0.C0031g;
import C0.J;
import I.C0167p;
import I0.t;
import I0.z;
import R1.y;
import U.q;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;
import n2.AbstractC0730j;
import x.C1196i;
import x.F;
import x.Q;

/* loaded from: classes.dex */
public final class h extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7396e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7400i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7401j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, boolean z3, z zVar, a0 a0Var, Q q3) {
        super(3);
        this.f7398g = tVar;
        this.f7397f = z3;
        this.f7399h = zVar;
        this.f7400i = a0Var;
        this.f7401j = q3;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.f7401j;
        Object obj5 = this.f7400i;
        Object obj6 = this.f7399h;
        boolean z3 = false;
        Object obj7 = this.f7398g;
        switch (this.f7396e) {
            case 0:
                C0740b c0740b = (C0740b) obj;
                C0167p c0167p = (C0167p) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0167p.f(c0740b) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0167p.x()) {
                    c0167p.L();
                } else {
                    String str = (String) ((C1196i) obj7).h(c0167p, 0);
                    if (AbstractC0730j.K(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    p.b(str, this.f7397f, c0740b, (q) obj6, (InterfaceC0427f) obj5, (f2.k) obj4, c0167p, (intValue << 6) & 896);
                }
                return y.f4171a;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                t tVar = (t) obj7;
                if (!booleanValue) {
                    intValue2 = tVar.a(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = tVar.a(intValue3);
                }
                if (this.f7397f) {
                    z zVar = (z) obj6;
                    int i3 = J.f568c;
                    long j3 = zVar.f3098b;
                    if (intValue2 != ((int) (j3 >> 32)) || intValue3 != ((int) (j3 & 4294967295L))) {
                        int min = Math.min(intValue2, intValue3);
                        a0 a0Var = (a0) obj5;
                        F f3 = F.f9944d;
                        if (min >= 0) {
                            int max = Math.max(intValue2, intValue3);
                            C0031g c0031g = zVar.f3097a;
                            if (max <= c0031g.f596a.length()) {
                                if (booleanValue || intValue2 == intValue3) {
                                    a0Var.p(false);
                                    a0Var.n(f3);
                                } else {
                                    a0Var.f(true);
                                }
                                ((Q) obj4).f9994t.n(new z(c0031g, O2.l.J(intValue2, intValue3), (J) null));
                                z3 = true;
                            }
                        }
                        a0Var.p(false);
                        a0Var.n(f3);
                    }
                }
                return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(C1196i c1196i, boolean z3, q qVar, InterfaceC0427f interfaceC0427f, InterfaceC0422a interfaceC0422a) {
        super(3);
        this.f7398g = c1196i;
        this.f7397f = z3;
        this.f7399h = qVar;
        this.f7400i = interfaceC0427f;
        this.f7401j = (f2.k) interfaceC0422a;
    }
}
