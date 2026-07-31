package d2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import o.j0;
import u1.s0;
import w1.d1;
import w1.f0;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final e1.c f2169a = new e1.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final n a(f0 f0Var, boolean z3) {
        y0.l lVar = f0Var.F.f7600f;
        w1.k kVar = null;
        if ((lVar.f8709g & 8) != 0) {
            loop0: while (true) {
                if (lVar == null) {
                    break;
                }
                if ((lVar.f8708f & 8) != 0) {
                    y0.l lVar2 = lVar;
                    o0.e eVar = null;
                    while (lVar2 != null) {
                        if (lVar2 instanceof s1) {
                            kVar = lVar2;
                            break loop0;
                        }
                        if ((lVar2.f8708f & 8) != 0 && (lVar2 instanceof w1.l)) {
                            int i = 0;
                            for (y0.l lVar3 = ((w1.l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                if ((lVar3.f8708f & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar.b(lVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lVar2 = w1.f.f(eVar);
                    }
                }
                if ((lVar.f8709g & 8) == 0) {
                    break;
                }
                lVar = lVar.i;
            }
        }
        q6.i.b(kVar);
        y0.l lVar4 = ((y0.l) ((s1) kVar)).f8706d;
        j u7 = f0Var.u();
        if (u7 == null) {
            u7 = new j();
        }
        return new n(lVar4, z3, f0Var, u7);
    }

    public static final o.x b(p pVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            n a8 = pVar.a();
            f0 f0Var = a8.f2158c;
            if (f0Var.H() && f0Var.G()) {
                o.x xVar = new o.x(48);
                b1.b bVar = new b1.b(5);
                r2.j V = h0.a.V(a8.g());
                ((Region) bVar.f1050e).set(V.f6524a, V.f6525b, V.f6526c, V.f6527d);
                c(bVar, a8, xVar, a8, new b1.b(5));
                return xVar;
            }
            o.x xVar2 = o.m.f5510a;
            q6.i.c(xVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return xVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(b1.b bVar, n nVar, o.x xVar, n nVar2, b1.b bVar2) {
        e1.c a12;
        f0 f0Var;
        int i = nVar.f2162g;
        Region region = (Region) bVar2.f1050e;
        f0 f0Var2 = nVar2.f2158c;
        int i8 = nVar2.f2162g;
        boolean z3 = (f0Var2.H() && f0Var2.G()) ? false : true;
        Region region2 = (Region) bVar.f1050e;
        if (!region2.isEmpty() || i8 == i) {
            if (!z3 || nVar2.f2160e) {
                w1.k f6 = nVar2.f();
                if (f6 == null) {
                    a12 = f0Var2.F.f7597c.a1();
                } else {
                    y0.l lVar = ((y0.l) f6).f8706d;
                    Object g3 = nVar2.f2159d.f2150d.g(i.f2126b);
                    if (g3 == null) {
                        g3 = null;
                    }
                    boolean z7 = g3 != null;
                    if (!lVar.f8706d.f8718q) {
                        a12 = e1.c.f2456e;
                    } else if (z7) {
                        a12 = w1.f.s(lVar, 8).a1();
                    } else {
                        d1 s5 = w1.f.s(lVar, 8);
                        a12 = s0.g(s5).K(s5, true);
                    }
                }
                r2.j V = h0.a.V(a12);
                region.set(V.f6524a, V.f6525b, V.f6526c, V.f6527d);
                if (i8 == i) {
                    i8 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (nVar2.f2160e) {
                        n l3 = nVar2.l();
                        xVar.g(i8, new o(nVar2, h0.a.V((l3 == null || (f0Var = l3.f2158c) == null || !f0Var.H()) ? f2169a : l3.g())));
                        return;
                    } else {
                        if (i8 == -1) {
                            Rect bounds = region.getBounds();
                            xVar.g(i8, new o(nVar2, new r2.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                xVar.g(i8, new o(nVar2, new r2.j(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j7 = n.j(4, nVar2);
                for (int size = j7.size() - 1; -1 < size; size--) {
                    if (!((n) j7.get(size)).k().f2150d.c(s.f2211y)) {
                        c(bVar, nVar, xVar, (n) j7.get(size), bVar2);
                    }
                }
                if (f(nVar2)) {
                    region2.op(V.f6524a, V.f6525b, V.f6526c, V.f6527d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(j jVar, v vVar) {
        Object g3 = jVar.f2150d.g(vVar);
        if (g3 == null) {
            return null;
        }
        return g3;
    }

    public static final boolean e(n nVar) {
        d1 d8 = nVar.d();
        j jVar = nVar.f2159d;
        if (d8 != null ? d8.M0() : false) {
            return true;
        }
        v vVar = s.f2188a;
        if (jVar.f2150d.c(s.f2202p)) {
            return true;
        }
        return jVar.f2150d.c(s.f2201o);
    }

    public static final boolean f(n nVar) {
        if (!e(nVar)) {
            j jVar = nVar.f2159d;
            if (jVar.f2152f) {
                return true;
            }
            j0 j0Var = jVar.f2150d;
            Object[] objArr = j0Var.f5483b;
            Object[] objArr2 = j0Var.f5484c;
            long[] jArr = j0Var.f5482a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j7 = jArr[i];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j7) < 128) {
                                int i10 = (i << 3) + i9;
                                Object obj = objArr[i10];
                                Object obj2 = objArr2[i10];
                                if (((v) obj).f2218c) {
                                    return true;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
