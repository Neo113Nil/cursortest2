package a0;

import android.content.Context;
import android.view.KeyEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import r1.k1;
import r1.n1;
import r1.o1;
import s1.e2;
import s1.g2;
import s1.h2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f23i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, int i7, Object obj2) {
        super(0);
        this.f21g = i7;
        this.f22h = obj;
        this.f23i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r1v58, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r3v20, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v19, types: [q6.a, r6.l] */
    @Override // q6.a
    public final Object a() {
        long j8;
        long j9;
        w.z0 d8;
        w.j0 j0Var;
        a2.g gVar;
        p1.m0 placementScope;
        boolean dispatchKeyEvent;
        y1.m mVar;
        r1.d0 d0Var;
        int i7 = this.f21g;
        d6.z zVar = d6.z.f2639a;
        Object obj = this.f23i;
        Object obj2 = this.f22h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = (x0) obj2;
                long j10 = ((m2.j) ((g0.z0) obj).getValue()).f6321a;
                y0.c g9 = x0Var.g();
                if (g9 != null) {
                    long j11 = g9.f9778a;
                    w.j0 j0Var2 = x0Var.f178d;
                    a2.g gVar2 = j0Var2 != null ? j0Var2.f9255a.f9329a : null;
                    if (gVar2 != null && gVar2.f373f.length() != 0) {
                        w.z zVar2 = (w.z) x0Var.f189o.getValue();
                        int i8 = zVar2 == null ? -1 : z0.f207a[zVar2.ordinal()];
                        if (i8 != -1) {
                            if (i8 == 1 || i8 == 2) {
                                long j12 = x0Var.j().f4066b;
                                int i9 = a2.j0.f407c;
                                j9 = j12 >> 32;
                            } else {
                                if (i8 != 3) {
                                    throw new b4.c();
                                }
                                long j13 = x0Var.j().f4066b;
                                int i10 = a2.j0.f407c;
                                j9 = j13 & 4294967295L;
                            }
                            int i11 = (int) j9;
                            w.j0 j0Var3 = x0Var.f178d;
                            if (j0Var3 != null && (d8 = j0Var3.d()) != null && (j0Var = x0Var.f178d) != null && (gVar = j0Var.f9255a.f9329a) != null) {
                                int e9 = v1.g.e(x0Var.f176b.b(i11), 0, gVar.f373f.length());
                                float d9 = y0.c.d(d8.d(j11));
                                a2.h0 h0Var = d8.f9471a;
                                int e10 = h0Var.e(e9);
                                a2.o oVar = h0Var.f389b;
                                float f9 = h0Var.f(e10);
                                float g10 = h0Var.g(e10);
                                float d10 = v1.g.d(d9, Math.min(f9, g10), Math.max(f9, g10));
                                if (m2.j.a(j10, 0L) || Math.abs(d9 - d10) <= ((int) (j10 >> 32)) / 2) {
                                    float d11 = oVar.d(e10);
                                    j8 = u3.r.a(d10, ((oVar.b(e10) - d11) / 2) + d11);
                                    return new y0.c(j8);
                                }
                            }
                        }
                    }
                }
                j8 = 9205357640488583168L;
                return new y0.c(j8);
            case 1:
                i.b0 b0Var = (i.b0) obj2;
                g0.u uVar = (g0.u) obj;
                Object[] objArr = b0Var.f4722b;
                long[] jArr = b0Var.f4721a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j14 = jArr[i12];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((255 & j14) < 128) {
                                    uVar.w(objArr[(i12 << 3) + i14]);
                                }
                                j14 >>= 8;
                            }
                            if (i13 != 8) {
                            }
                        }
                        if (i12 != length) {
                            i12++;
                        }
                    }
                }
                return zVar;
            case 2:
                ((j3.b) obj).getClass();
                String concat = "local_store".concat(".preferences_pb");
                r6.k.f(concat, "fileName");
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case 3:
                ((e7.i) obj2).e(obj);
                return zVar;
            case 4:
                ((r6.v) obj2).f7968f = r1.f.i((m.a0) obj, p1.l0.f7058a);
                return zVar;
            case 5:
                g0.t tVar = ((r1.d0) obj2).A;
                r6.v vVar = (r6.v) obj;
                if ((((s0.n) tVar.f3895f).f8107i & 8) != 0) {
                    for (s0.n nVar = (o1) tVar.f3894e; nVar != null; nVar = nVar.f8108j) {
                        if ((nVar.f8106h & 8) != 0) {
                            r1.m mVar2 = nVar;
                            ?? r42 = 0;
                            while (mVar2 != 0) {
                                if (mVar2 instanceof n1) {
                                    n1 n1Var = (n1) mVar2;
                                    if (n1Var.b0()) {
                                        y1.i iVar = new y1.i();
                                        vVar.f7968f = iVar;
                                        iVar.f9834h = true;
                                    }
                                    if (n1Var.e0()) {
                                        ((y1.i) vVar.f7968f).f9833g = true;
                                    }
                                    n1Var.S((y1.i) vVar.f7968f);
                                } else if ((mVar2.f8106h & 8) != 0 && (mVar2 instanceof r1.m)) {
                                    s0.n nVar2 = mVar2.f7853t;
                                    int i15 = 0;
                                    mVar2 = mVar2;
                                    r42 = r42;
                                    while (nVar2 != null) {
                                        if ((nVar2.f8106h & 8) != 0) {
                                            i15++;
                                            r42 = r42;
                                            if (i15 == 1) {
                                                mVar2 = nVar2;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new i0.d(new s0.n[16]);
                                                }
                                                if (mVar2 != 0) {
                                                    r42.b(mVar2);
                                                    mVar2 = 0;
                                                }
                                                r42.b(nVar2);
                                            }
                                        }
                                        nVar2 = nVar2.f8109k;
                                        mVar2 = mVar2;
                                        r42 = r42;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                mVar2 = r1.f.f(r42);
                            }
                        }
                    }
                }
                return zVar;
            case 6:
                r1.l0 l0Var = (r1.l0) obj2;
                r1.a1 a1Var = l0Var.a().f7702s;
                if (a1Var == null || (placementScope = a1Var.f7866n) == null) {
                    placementScope = ((s1.r) r1.g0.a(l0Var.f7831a)).getPlacementScope();
                }
                r1.j0 j0Var4 = (r1.j0) obj;
                q6.c cVar = j0Var4.F;
                if (cVar == null) {
                    r1.a1 a3 = l0Var.a();
                    long j15 = j0Var4.G;
                    float f10 = j0Var4.H;
                    placementScope.getClass();
                    p1.m0.a(placementScope, a3);
                    a3.j0(m2.h.c(j15, a3.f7067j), f10, null);
                } else {
                    r1.a1 a9 = l0Var.a();
                    long j16 = j0Var4.G;
                    float f11 = j0Var4.H;
                    placementScope.getClass();
                    p1.m0.a(placementScope, a9);
                    a9.j0(m2.h.c(j16, a9.f7067j), f11, cVar);
                }
                return zVar;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                q6.c q8 = ((k1) obj2).f7829f.q();
                if (q8 != null) {
                    q8.f(new r1.n0((r1.o0) obj));
                }
                return zVar;
            case 8:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case q.c.f7259c /* 9 */:
                s1.c0 c0Var = (s1.c0) obj;
                e2 e2Var = (e2) obj2;
                y1.g gVar3 = e2Var.f8208j;
                y1.g gVar4 = e2Var.f8209k;
                Float f12 = e2Var.f8206h;
                Float f13 = e2Var.f8207i;
                float floatValue = (gVar3 == null || f12 == null) ? 0.0f : ((Number) gVar3.f9804a.a()).floatValue() - f12.floatValue();
                float floatValue2 = (gVar4 == null || f13 == null) ? 0.0f : ((Number) gVar4.f9804a.a()).floatValue() - f13.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int v5 = c0Var.v(e2Var.f8204f);
                    g2 g2Var = (g2) c0Var.l().f(c0Var.f8170n);
                    if (g2Var != null) {
                        try {
                            c3.i iVar2 = c0Var.f8171o;
                            if (iVar2 != null) {
                                iVar2.f1655a.setBoundsInScreen(c0Var.c(g2Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    c0Var.f8160d.invalidate();
                    g2 g2Var2 = (g2) c0Var.l().f(v5);
                    if (g2Var2 != null && (mVar = g2Var2.f8236a) != null && (d0Var = mVar.f9839c) != null) {
                        if (gVar3 != null) {
                            c0Var.f8173q.i(v5, gVar3);
                        }
                        if (gVar4 != null) {
                            c0Var.f8174r.i(v5, gVar4);
                        }
                        c0Var.r(d0Var);
                    }
                }
                if (gVar3 != null) {
                    e2Var.f8206h = (Float) gVar3.f9804a.a();
                }
                if (gVar4 != null) {
                    e2Var.f8207i = (Float) gVar4.f9804a.a();
                }
                return zVar;
            case q.c.f7261e /* 10 */:
                y0.d dVar = (y0.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                r1.a1 a1Var2 = (r1.a1) obj;
                if (!a1Var2.M0().f8116r) {
                    a1Var2 = null;
                }
                if (a1Var2 != null) {
                    return u3.t.a(0L, j1.c.o0(a1Var2.f7065h));
                }
                return null;
            case 11:
                ((u3.p) obj2).e((t3.h) obj, false);
                return zVar;
            case 12:
                g2.w wVar = (g2.w) obj2;
                g0.z0 z0Var = (g0.z0) obj;
                if (!a2.j0.a(wVar.f4066b, ((g2.w) z0Var.getValue()).f4066b) || !r6.k.a(wVar.f4067c, ((g2.w) z0Var.getValue()).f4067c)) {
                    z0Var.setValue(wVar);
                }
                return zVar;
            case 13:
                ((w.j0) obj2).f9275u.f(new g2.l(((g2.m) obj).f4046e));
                return Boolean.TRUE;
            case 14:
                w.j0 j0Var5 = (w.j0) obj2;
                x0.n nVar3 = (x0.n) obj;
                if (j0Var5.b()) {
                    h2 h2Var = j0Var5.f9257c;
                    if (h2Var != null) {
                        ((s1.g1) h2Var).b();
                    }
                } else {
                    nVar3.a(x0.h.f9609k);
                }
                return Boolean.TRUE;
            case q.c.f7263g /* 15 */:
                ((w0.b) obj2).f9476u.f((w0.c) obj);
                return zVar;
            default:
                ((r6.v) obj2).f7968f = ((x0.r) obj).A0();
                return zVar;
        }
    }
}
