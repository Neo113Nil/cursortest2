package w;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f9282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6.c f9283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2.w f9284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.q f9285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2.b f9286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9287f;

    public l(j0 j0Var, q6.c cVar, g2.w wVar, g2.q qVar, m2.b bVar, int i7) {
        this.f9282a = j0Var;
        this.f9283b = cVar;
        this.f9284c = wVar;
        this.f9285d = qVar;
        this.f9286e = bVar;
        this.f9287f = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    @Override // p1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        long j9;
        j0 j0Var;
        a2.h0 h0Var2;
        a2.h0 h0Var3;
        z0 z0Var;
        int i7;
        a2.h0 h0Var4;
        l lVar;
        j0 j0Var2;
        int i8;
        int i9;
        int j10;
        int h3;
        a2.q qVar;
        j0 j0Var3 = this.f9282a;
        q0.g c4 = q0.r.c();
        q6.c f9 = c4 != null ? c4.f() : null;
        q0.g d8 = q0.r.d(c4);
        try {
            z0 d9 = j0Var3.d();
            a2.h0 h0Var5 = d9 != null ? d9.f9471a : null;
            m0 m0Var = j0Var3.f9255a;
            m2.k layoutDirection = h0Var.getLayoutDirection();
            int i10 = m0Var.f9334f;
            boolean z8 = m0Var.f9333e;
            int i11 = m0Var.f9331c;
            if (h0Var5 != null) {
                a2.o oVar = h0Var5.f389b;
                a2.g0 g0Var = h0Var5.f388a;
                a2.g gVar = m0Var.f9329a;
                a2.k0 k0Var = m0Var.f9330b;
                List list2 = m0Var.f9337i;
                m2.b bVar = m0Var.f9335g;
                f2.d dVar = m0Var.f9336h;
                a2.h0 h0Var6 = h0Var5;
                if (oVar.f424a.b()) {
                    j9 = j8;
                    j0Var = j0Var3;
                } else {
                    a2.g gVar2 = g0Var.f377a;
                    j0Var = j0Var3;
                    long j11 = g0Var.f386j;
                    if (r6.k.a(gVar2, gVar) && g0Var.f378b.c(k0Var) && r6.k.a(g0Var.f379c, list2) && g0Var.f380d == i11 && g0Var.f381e == z8 && g0Var.f382f == i10 && r6.k.a(g0Var.f383g, bVar) && g0Var.f384h == layoutDirection && r6.k.a(g0Var.f385i, dVar) && m2.a.j(j8) == m2.a.j(j11)) {
                        if ((!z8 && i10 != 2) || (m2.a.h(j8) == m2.a.h(j11) && m2.a.g(j8) == m2.a.g(j11))) {
                            i7 = 2;
                            h0Var4 = new a2.h0(new a2.g0(g0Var.f377a, m0Var.f9330b, g0Var.f379c, g0Var.f380d, g0Var.f381e, g0Var.f382f, g0Var.f383g, g0Var.f384h, g0Var.f385i, j8), oVar, r4.a.t(j8, j1.c.G(g0.k(oVar.f427d), g0.k(oVar.f428e))));
                            h0Var3 = h0Var6;
                            z0Var = d9;
                            long j12 = h0Var4.f390c;
                            Integer valueOf = Integer.valueOf((int) (j12 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j12 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (r6.k.a(h0Var3, h0Var4)) {
                            }
                            j0Var2.f9261g.setValue(new m2.e(lVar.f9286e.k0(lVar.f9287f != 1 ? g0.k(h0Var4.f389b.b(i8)) : i8)));
                            d6.j[] jVarArr = {new d6.j(p1.c.f7034a, Integer.valueOf(Math.round(h0Var4.f391d))), new d6.j(p1.c.f7035b, Integer.valueOf(Math.round(h0Var4.f392e)))};
                            LinkedHashMap linkedHashMap = new LinkedHashMap(e6.d0.h0(i7));
                            e6.c0.j0(linkedHashMap, jVarArr);
                            return h0Var.C(intValue, intValue2, linkedHashMap, e.f9210i);
                        }
                        j9 = j8;
                        i9 = 2;
                        h0Var2 = h0Var6;
                        m0Var.a(layoutDirection);
                        j10 = m2.a.j(j9);
                        h3 = ((!z8 || i10 == i9) && m2.a.d(j9)) ? m2.a.h(j9) : Integer.MAX_VALUE;
                        int i12 = (z8 && i10 == i9) ? 1 : i11;
                        if (j10 != h3) {
                            a2.q qVar2 = m0Var.f9338j;
                            if (qVar2 == null) {
                                throw new IllegalStateException("layoutIntrinsics must be called first");
                            }
                            h3 = v1.g.e(g0.k(qVar2.c()), j10, h3);
                        }
                        qVar = m0Var.f9338j;
                        if (qVar != null) {
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                        int g9 = m2.a.g(j9);
                        int min = Math.min(0, 262142);
                        int min2 = h3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h3, 262142);
                        int l8 = r4.a.l(min2 == Integer.MAX_VALUE ? min : min2);
                        a2.o oVar2 = new a2.o(qVar, r4.a.b(min, min2, Math.min(l8, 0), g9 != Integer.MAX_VALUE ? Math.min(l8, g9) : Integer.MAX_VALUE), i12, i10 == i9);
                        i7 = i9;
                        h0Var3 = h0Var2;
                        z0Var = d9;
                        h0Var4 = new a2.h0(new a2.g0(m0Var.f9329a, m0Var.f9330b, m0Var.f9337i, m0Var.f9331c, m0Var.f9333e, m0Var.f9334f, m0Var.f9335g, layoutDirection, m0Var.f9336h, j9), oVar2, r4.a.t(j9, j1.c.G(g0.k(oVar2.f427d), g0.k(oVar2.f428e))));
                        long j122 = h0Var4.f390c;
                        Integer valueOf3 = Integer.valueOf((int) (j122 >> 32));
                        Integer valueOf22 = Integer.valueOf((int) (j122 & 4294967295L));
                        int intValue3 = valueOf3.intValue();
                        int intValue22 = valueOf22.intValue();
                        if (r6.k.a(h0Var3, h0Var4)) {
                            j0Var2 = j0Var;
                            j0Var2.f9263i.setValue(new z0(h0Var4, z0Var != null ? z0Var.f9473c : null));
                            i8 = 0;
                            j0Var2.f9270p = false;
                            lVar = this;
                            lVar.f9283b.f(h0Var4);
                            g0.q(j0Var2, lVar.f9284c, lVar.f9285d);
                        } else {
                            lVar = this;
                            j0Var2 = j0Var;
                            i8 = 0;
                        }
                        j0Var2.f9261g.setValue(new m2.e(lVar.f9286e.k0(lVar.f9287f != 1 ? g0.k(h0Var4.f389b.b(i8)) : i8)));
                        d6.j[] jVarArr2 = {new d6.j(p1.c.f7034a, Integer.valueOf(Math.round(h0Var4.f391d))), new d6.j(p1.c.f7035b, Integer.valueOf(Math.round(h0Var4.f392e)))};
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e6.d0.h0(i7));
                        e6.c0.j0(linkedHashMap2, jVarArr2);
                        return h0Var.C(intValue3, intValue22, linkedHashMap2, e.f9210i);
                    }
                    j9 = j8;
                }
                h0Var2 = h0Var6;
            } else {
                j9 = j8;
                j0Var = j0Var3;
                h0Var2 = h0Var5;
            }
            i9 = 2;
            m0Var.a(layoutDirection);
            j10 = m2.a.j(j9);
            if (z8) {
            }
            if (z8) {
            }
            if (j10 != h3) {
            }
            qVar = m0Var.f9338j;
            if (qVar != null) {
            }
        } finally {
            q0.r.f(c4, d8, f9);
        }
    }

    @Override // p1.f0
    public final int e(p1.m mVar, List list, int i7) {
        j0 j0Var = this.f9282a;
        j0Var.f9255a.a(mVar.getLayoutDirection());
        a2.q qVar = j0Var.f9255a.f9338j;
        if (qVar != null) {
            return g0.k(qVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
