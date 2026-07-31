package j0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k2 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0.m f3746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.i0 f3747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f3749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t.t f3750h;
    public final /* synthetic */ v.j i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f3751j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p6.a f3752k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f3753l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0.c f3754m;

    public k2(y0.m mVar, f1.i0 i0Var, long j7, float f6, t.t tVar, v.j jVar, boolean z3, p6.a aVar, float f8, u0.c cVar) {
        this.f3746d = mVar;
        this.f3747e = i0Var;
        this.f3748f = j7;
        this.f3749g = f6;
        this.f3750h = tVar;
        this.i = jVar;
        this.f3751j = z3;
        this.f3752k = aVar;
        this.f3753l = f8;
        this.f3754m = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            u1.k kVar = x0.f3942a;
            y0.m d8 = androidx.compose.foundation.a.c(l2.c(this.f3746d.d(MinimumInteractiveModifier.f537a), this.f3747e, l2.d(this.f3748f, this.f3749g, sVar), this.f3750h, ((r2.c) sVar.j(x1.b1.f8370h)).u(this.f3753l)), this.i, w1.a(), this.f3751j, null, this.f3752k, 24).d(new ChildSemanticsNodeElement(new l(2)));
            u1.e0 d9 = x.k.d(y0.b.f8681d, true);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, d8);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d9, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            this.f3754m.g(sVar, 0);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
