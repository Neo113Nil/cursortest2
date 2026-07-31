package F;

import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r.InterfaceC0849K;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;

/* renamed from: F.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083a1 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1467i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1468j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1469k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1471m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1472n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1473o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0086b1 f1474p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f1475q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083a1(int i3, int i4, AbstractC0893O abstractC0893O, AbstractC0893O abstractC0893O2, AbstractC0893O abstractC0893O3, AbstractC0893O abstractC0893O4, AbstractC0893O abstractC0893O5, AbstractC0893O abstractC0893O6, AbstractC0893O abstractC0893O7, AbstractC0893O abstractC0893O8, AbstractC0893O abstractC0893O9, C0086b1 c0086b1, InterfaceC0887I interfaceC0887I) {
        super(1);
        this.f1463e = i3;
        this.f1464f = i4;
        this.f1465g = abstractC0893O;
        this.f1466h = abstractC0893O2;
        this.f1467i = abstractC0893O3;
        this.f1468j = abstractC0893O4;
        this.f1469k = abstractC0893O5;
        this.f1470l = abstractC0893O6;
        this.f1471m = abstractC0893O7;
        this.f1472n = abstractC0893O8;
        this.f1473o = abstractC0893O9;
        this.f1474p = c0086b1;
        this.f1475q = interfaceC0887I;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int i3;
        float f3;
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        C0086b1 c0086b1 = this.f1474p;
        float f4 = c0086b1.f1483c;
        InterfaceC0887I interfaceC0887I = this.f1475q;
        float a3 = interfaceC0887I.a();
        O0.k layoutDirection = interfaceC0887I.getLayoutDirection();
        float f5 = Z0.f1459a;
        AbstractC0892N.e(abstractC0892N, this.f1472n, 0L);
        AbstractC0893O abstractC0893O = this.f1473o;
        int e3 = this.f1463e - G.z.e(abstractC0893O);
        InterfaceC0849K interfaceC0849K = c0086b1.f1484d;
        int Q3 = AbstractC0508a.Q(interfaceC0849K.d() * a3);
        int Q4 = AbstractC0508a.Q(androidx.compose.foundation.layout.b.d(interfaceC0849K, layoutDirection) * a3);
        float f6 = G.z.f2065c * a3;
        AbstractC0893O abstractC0893O2 = this.f1465g;
        if (abstractC0893O2 != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O2, 0, Math.round((1 + 0.0f) * ((e3 - abstractC0893O2.f8127e) / 2.0f)));
        }
        boolean z3 = c0086b1.f1482b;
        AbstractC0893O abstractC0893O3 = this.f1470l;
        if (abstractC0893O3 != null) {
            if (z3) {
                i3 = Math.round((1 + 0.0f) * ((e3 - abstractC0893O3.f8127e) / 2.0f));
            } else {
                i3 = Q3;
            }
            int H3 = l0.c.H(f4, i3, -(abstractC0893O3.f8127e / 2));
            if (abstractC0893O2 == null) {
                f3 = 0.0f;
            } else {
                f3 = (1 - f4) * (G.z.f(abstractC0893O2) - f6);
            }
            AbstractC0892N.f(abstractC0892N, abstractC0893O3, AbstractC0508a.Q(f3) + Q4, H3);
        }
        AbstractC0893O abstractC0893O4 = this.f1467i;
        if (abstractC0893O4 != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O4, G.z.f(abstractC0893O2), Z0.e(z3, e3, Q3, abstractC0893O3, abstractC0893O4));
        }
        int f7 = G.z.f(abstractC0893O4) + G.z.f(abstractC0893O2);
        AbstractC0893O abstractC0893O5 = this.f1469k;
        AbstractC0892N.f(abstractC0892N, abstractC0893O5, f7, Z0.e(z3, e3, Q3, abstractC0893O3, abstractC0893O5));
        AbstractC0893O abstractC0893O6 = this.f1471m;
        if (abstractC0893O6 != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O6, f7, Z0.e(z3, e3, Q3, abstractC0893O3, abstractC0893O6));
        }
        int i4 = this.f1464f;
        AbstractC0893O abstractC0893O7 = this.f1466h;
        AbstractC0893O abstractC0893O8 = this.f1468j;
        if (abstractC0893O8 != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O8, (i4 - G.z.f(abstractC0893O7)) - abstractC0893O8.f8126d, Z0.e(z3, e3, Q3, abstractC0893O3, abstractC0893O8));
        }
        if (abstractC0893O7 != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O7, i4 - abstractC0893O7.f8126d, Math.round((1 + 0.0f) * ((e3 - abstractC0893O7.f8127e) / 2.0f)));
        }
        if (abstractC0893O != null) {
            AbstractC0892N.f(abstractC0892N, abstractC0893O, 0, e3);
        }
        return R1.y.f4171a;
    }
}
