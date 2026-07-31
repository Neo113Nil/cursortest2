package b6;

import j0.n2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1369d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1371f;

    public /* synthetic */ k0(int i, x0 x0Var) {
        this.f1370e = i;
        this.f1371f = x0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar;
        switch (this.f1369d) {
            case 0:
                int i = ((x0) this.f1371f).f1506h;
                m0.s sVar2 = (m0.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar2.N(intValue & 1, (intValue & 3) != 2)) {
                    x.q a8 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar2, 48);
                    int hashCode = Long.hashCode(sVar2.T);
                    m0.o1 l3 = sVar2.l();
                    y0.j jVar = y0.j.f8705a;
                    y0.m a02 = r2.o.a0(sVar2, jVar);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a8, sVar2, w1.h.f7678e);
                    m0.b.u(l3, sVar2, w1.h.f7677d);
                    w1.g gVar = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar2, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar2, w1.h.f7676c);
                    StringBuilder sb = new StringBuilder("You completed Level ");
                    int i8 = this.f1370e;
                    sb.append(i8);
                    sb.append("!");
                    String sb2 = sb.toString();
                    long Q = r2.o.Q(18);
                    j2.k kVar = j2.k.f3997h;
                    n2.b(sb2, null, 0L, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262062);
                    x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 8));
                    n2.b("Mistakes: " + i, null, f1.p.c(i == 0 ? 4283215696L : 4294198070L), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262122);
                    if (i8 < 20) {
                        sVar2.V(-93289727);
                        x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 16));
                        n2.b("Ready for the next challenge?", null, 0L, r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24582, 0, 262126);
                        sVar = sVar2;
                        sVar.p(false);
                    } else {
                        sVar2.V(-93047524);
                        x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 16));
                        n2.b("🎊 Congratulations! You've completed all 20 levels! 🎊", null, 0L, r2.o.Q(16), null, kVar, 0L, new q2.k(3), 0L, 0, false, 0, 0, null, sVar2, 1597446, 0, 261038);
                        sVar = sVar2;
                        sVar.p(false);
                    }
                    sVar.p(true);
                } else {
                    sVar2.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k.k((w) this.f1371f, this.f1370e, y0.j.f8705a, (m0.s) obj, m0.b.w(1));
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ k0(w wVar, int i, int i8) {
        this.f1371f = wVar;
        this.f1370e = i;
    }
}
