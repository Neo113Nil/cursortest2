package j2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import c2.g0;
import c2.i1;
import c2.x1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import s.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.c f4992a = new j1.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final m a(g0 g0Var, boolean z10) {
        d1.k kVar = (d1.k) g0Var.S.g;
        c2.i iVar = null;
        if ((kVar.f3308r & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f3307i & 8) != 0) {
                    d1.k kVar2 = kVar;
                    o0.e eVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof x1) {
                            iVar = kVar2;
                            break loop0;
                        }
                        if ((kVar2.f3307i & 8) != 0 && (kVar2 instanceof c2.j)) {
                            int i3 = 0;
                            for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                if ((kVar3.f3307i & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar2 != null) {
                                            eVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        eVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = c2.k.e(eVar);
                    }
                }
                if ((kVar.f3308r & 8) == 0) {
                    break;
                }
                kVar = kVar.f3310t;
            }
        }
        iVar.getClass();
        d1.k kVar4 = ((d1.k) ((x1) iVar)).f3305d;
        j u2 = g0Var.u();
        if (u2 == null) {
            u2 = new j();
        }
        return new m(kVar4, z10, g0Var, u2);
    }

    public static final s.w b(o oVar, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            m a9 = oVar.a();
            g0 g0Var = a9.f4982c;
            if (g0Var.F() && g0Var.E()) {
                j1.c g = a9.g();
                s.w wVar = new s.w(48);
                d9.c cVar = new d9.c(27);
                cVar.t(z2.b.b(g));
                e(new d9.c(27), cVar, a9, a9, function1, wVar);
                return wVar;
            }
            s.w wVar2 = s.l.f8343a;
            wVar2.getClass();
            return wVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(d9.c cVar, d9.c cVar2, m mVar, m mVar2, Function1 function1, s.w wVar) {
        d9.c cVar3 = cVar;
        Region region = (Region) cVar3.f3701e;
        d9.c cVar4 = cVar2;
        Region region2 = (Region) cVar4.f3701e;
        g0 g0Var = mVar2.f4982c;
        g0 g0Var2 = mVar2.f4982c;
        if (!g0Var.F() || !g0Var2.E() || region2.isEmpty()) {
            if (mVar2.o()) {
                d(wVar, mVar, mVar2);
                return;
            }
            return;
        }
        j1.c m10 = mVar2.m();
        if ((m10.f4916a >= m10.f4918c) | (m10.f4917b >= m10.f4919d)) {
            c2.i f3 = mVar2.f();
            if (f3 == null) {
                c2.q qVar = (c2.q) g0Var2.S.f1493d;
                m10 = a2.q.h(qVar).p(qVar, false);
            } else {
                d1.k kVar = ((d1.k) f3).f3305d;
                Object g = mVar2.f4983d.f4975d.g(i.f4952b);
                if (g == null) {
                    g = null;
                }
                m10 = c2.k.i(kVar, g != null, false);
            }
        }
        x2.j b10 = z2.b.b(m10);
        cVar3.t(b10);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i3 = mVar2.f4985f;
            if (i3 == mVar.f4985f) {
                i3 = -1;
            }
            Rect bounds = region.getBounds();
            wVar.h(i3, new n(mVar2, new x2.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List j = m.j(4, mVar2);
            int size = j.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(j.get(size))).booleanValue()) {
                    c(cVar3, cVar4, mVar, (m) j.get(size), function1, wVar);
                }
                size--;
                cVar3 = cVar;
                cVar4 = cVar2;
            }
            if (h(mVar2)) {
                region2.op(b10.f10325a, b10.f10326b, b10.f10327c, b10.f10328d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void d(s.w wVar, m mVar, m mVar2) {
        g0 g0Var;
        m l10 = mVar2.l();
        j1.c g = (l10 == null || (g0Var = l10.f4982c) == null || !g0Var.F()) ? f4992a : l10.g();
        int i3 = mVar2.f4985f;
        if (i3 == mVar.f4985f) {
            i3 = -1;
        }
        wVar.h(i3, new n(mVar2, z2.b.b(g)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(d9.c cVar, d9.c cVar2, m mVar, m mVar2, Function1 function1, s.w wVar) {
        boolean z10;
        j1.c i3;
        boolean z11;
        Function1 function12 = function1;
        s.w wVar2 = wVar;
        int i10 = mVar.f4985f;
        Region region = (Region) cVar.f3701e;
        d9.c cVar3 = cVar2;
        Region region2 = (Region) cVar3.f3701e;
        g0 g0Var = mVar2.f4982c;
        j jVar = mVar2.f4983d;
        g0 g0Var2 = mVar2.f4982c;
        int i11 = mVar2.f4985f;
        boolean z12 = (g0Var.F() && g0Var2.E()) ? false : true;
        if (region2.isEmpty() && i11 != i10) {
            return;
        }
        if (z12 && !mVar2.o()) {
            return;
        }
        x2.j b10 = z2.b.b(mVar2.m());
        cVar.t(b10);
        if (i11 == i10) {
            i11 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (mVar2.o()) {
                d(wVar2, mVar, mVar2);
                return;
            } else {
                if (i11 == -1) {
                    Rect bounds = region.getBounds();
                    wVar2.h(i11, new n(mVar2, new x2.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        wVar2.h(i11, new n(mVar2, new x2.j(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List j = m.j(4, mVar2);
        if (jVar.f4977i) {
            m l10 = mVar2.l();
            while (true) {
                if (l10 == null) {
                    l10 = null;
                    break;
                }
                h0 h0Var = l10.f4983d.f4975d;
                if (h0Var.c(q.f5012v) || h0Var.c(q.f5011u)) {
                    break;
                } else {
                    l10 = l10.l();
                }
            }
            if (l10 != null) {
                i1 d10 = mVar2.d();
                if (d10 != null) {
                    if (!d10.D0().B) {
                        d10 = null;
                    }
                }
                d10 = null;
                i1 d11 = l10.d();
                if (d11 != null) {
                    if (!d11.D0().B) {
                        d11 = null;
                    }
                }
                d11 = null;
                if (d10 != null && d11 != null) {
                    j1.c p4 = d11.p(d10, false);
                    z11 = !p4.equals(p4.c(cf.c.k(0L, z4.m.b(d11.f133i))));
                    if (z11) {
                        z10 = true;
                        if (z10) {
                            int size = j.size() - 1;
                            while (-1 < size) {
                                if (!((Boolean) function12.invoke(j.get(size))).booleanValue()) {
                                    e(cVar, cVar3, mVar, (m) j.get(size), function12, wVar);
                                }
                                size--;
                                cVar3 = cVar2;
                                function12 = function1;
                            }
                        } else {
                            d9.c cVar4 = new d9.c(27);
                            c2.i f3 = mVar2.f();
                            if (f3 == null) {
                                c2.q qVar = (c2.q) g0Var2.S.f1493d;
                                i3 = a2.q.h(qVar).p(qVar, false);
                            } else {
                                d1.k kVar = ((d1.k) f3).f3305d;
                                Object g = jVar.f4975d.g(i.f4952b);
                                i3 = c2.k.i(kVar, (g == null ? null : g) != null, false);
                            }
                            cVar4.t(z2.b.b(i3));
                            int size2 = j.size() - 1;
                            while (-1 < size2) {
                                if (!((Boolean) function12.invoke(j.get(size2))).booleanValue()) {
                                    c(new d9.c(27), cVar4, mVar, (m) j.get(size2), function12, wVar2);
                                }
                                size2--;
                                wVar2 = wVar;
                            }
                        }
                        if (h(mVar2)) {
                            return;
                        }
                        region2.op(b10.f10325a, b10.f10326b, b10.f10327c, b10.f10328d, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
        }
        z10 = false;
        if (z10) {
        }
        if (h(mVar2)) {
        }
    }

    public static final Object f(j jVar, t tVar) {
        Object g = jVar.f4975d.g(tVar);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final boolean g(m mVar) {
        i1 d10 = mVar.d();
        h0 h0Var = mVar.f4983d.f4975d;
        return (d10 != null ? d10.L0() : false) || h0Var.c(q.f5006p) || h0Var.c(q.f5005o);
    }

    public static final boolean h(m mVar) {
        if (!g(mVar)) {
            j jVar = mVar.f4983d;
            if (jVar.f4977i) {
                return true;
            }
            h0 h0Var = jVar.f4975d;
            Object[] objArr = h0Var.f8313b;
            Object[] objArr2 = h0Var.f8314c;
            long[] jArr = h0Var.f8312a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                int i12 = (i3 << 3) + i11;
                                Object obj = objArr[i12];
                                Object obj2 = objArr2[i12];
                                if (((t) obj).f5022c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return false;
    }
}
