package I;

import a.AbstractC0157a;
import android.content.Context;
import android.view.KeyEvent;
import e2.C0380d;
import f.AbstractC0382a;
import h1.C0431b;
import h1.C0438i;
import j.C0475A;
import java.io.File;
import n.C0640K;
import q1.C0784h;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import u0.C0959F;
import u0.C0997t;
import u0.C1006x0;
import u0.C1010z0;

/* renamed from: I.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125v0 extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0125v0(Object obj, int i3, Object obj2) {
        super(0);
        this.f2387e = i3;
        this.f2388f = obj;
        this.f2389g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r1v43, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [U.k] */
    /* JADX WARN: Type inference failed for: r3v10, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v24, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v14, types: [Y1.a, Z1.j] */
    @Override // Y1.a
    public final Object b() {
        r0.G placementScope;
        boolean dispatchKeyEvent;
        z0.n nVar;
        t0.D d3;
        switch (this.f2387e) {
            case 0:
                C0475A c0475a = (C0475A) this.f2388f;
                Object[] objArr = c0475a.f5130b;
                long[] jArr = c0475a.f5129a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j3) < 128) {
                                    ((C0122u) this.f2389g).x(objArr[(i3 << 3) + i5]);
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                return L1.z.f2729a;
            case 1:
                ((Y.b) this.f2388f).f3394s.j((Y.c) this.f2389g);
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Z1.t) this.f2388f).f3480d = ((Z.q) this.f2389g).v0();
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                Context context = (Context) this.f2388f;
                ((C0431b) this.f2389g).getClass();
                String concat = "runtime_state".concat(".preferences_pb");
                Z1.i.f(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((m2.i) this.f2388f).g(this.f2389g);
                return L1.z.f2729a;
            case 5:
                ((Z1.t) this.f2388f).f3480d = AbstractC0898f.i((C0640K) this.f2389g, r0.F.f7112a);
                return L1.z.f2729a;
            case 6:
                ((r1.p) this.f2388f).e((C0784h) this.f2389g, false);
                return L1.z.f2729a;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                t.g gVar = (t.g) ((G) this.f2388f).getValue();
                t.y yVar = (t.y) this.f2389g;
                return new t.h(yVar, gVar, new F2.h((C0380d) yVar.f7689b.f7456f.getValue(), gVar));
            case 8:
                C0120t c0120t = ((t0.D) this.f2388f).f7735x;
                if ((((U.k) c0120t.f2356f).f3306g & 8) != 0) {
                    for (U.k kVar = (t0.o0) c0120t.f2355e; kVar != null; kVar = kVar.f3307h) {
                        if ((kVar.f3305f & 8) != 0) {
                            AbstractC0905m abstractC0905m = kVar;
                            ?? r3 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof t0.n0) {
                                    t0.n0 n0Var = (t0.n0) abstractC0905m;
                                    boolean L2 = n0Var.L();
                                    Z1.t tVar = (Z1.t) this.f2389g;
                                    if (L2) {
                                        z0.i iVar = new z0.i();
                                        tVar.f3480d = iVar;
                                        iVar.f8984f = true;
                                    }
                                    if (n0Var.O()) {
                                        ((z0.i) tVar.f3480d).f8983e = true;
                                    }
                                    n0Var.h((z0.i) tVar.f3480d);
                                } else if ((abstractC0905m.f3305f & 8) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar2 = abstractC0905m.f7937r;
                                    int i6 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r3 = r3;
                                    while (kVar2 != null) {
                                        if ((kVar2.f3305f & 8) != 0) {
                                            i6++;
                                            r3 = r3;
                                            if (i6 == 1) {
                                                abstractC0905m = kVar2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m != 0) {
                                                    r3.b(abstractC0905m);
                                                    abstractC0905m = 0;
                                                }
                                                r3.b(kVar2);
                                            }
                                        }
                                        kVar2 = kVar2.f3308i;
                                        abstractC0905m = abstractC0905m;
                                        r3 = r3;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r3);
                            }
                        }
                    }
                }
                return L1.z.f2729a;
            case AbstractC0382a.f4777a /* 9 */:
                t0.L l3 = (t0.L) this.f2388f;
                t0.a0 a0Var = l3.a().f7878q;
                if (a0Var == null || (placementScope = a0Var.f7826l) == null) {
                    placementScope = ((C0997t) t0.G.a(l3.f7797a)).getPlacementScope();
                }
                t0.J j4 = (t0.J) this.f2389g;
                Y1.c cVar = j4.D;
                if (cVar == null) {
                    t0.a0 a3 = l3.a();
                    long j5 = j4.f7773E;
                    float f3 = j4.f7774F;
                    placementScope.getClass();
                    r0.G.a(placementScope, a3);
                    a3.Q(M0.g.c(j5, a3.f7118h), f3, null);
                } else {
                    t0.a0 a4 = l3.a();
                    long j6 = j4.f7773E;
                    float f4 = j4.f7774F;
                    placementScope.getClass();
                    r0.G.a(placementScope, a4);
                    a4.Q(M0.g.c(j6, a4.f7118h), f4, cVar);
                }
                return L1.z.f2729a;
            case AbstractC0382a.f4779c /* 10 */:
                Y1.c k3 = ((t0.k0) this.f2388f).f7934d.k();
                if (k3 != null) {
                    t0.O o3 = (t0.O) this.f2389g;
                    o3.getClass();
                    k3.j(new t0.N(o3));
                }
                return L1.z.f2729a;
            case 11:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f2389g);
                return Boolean.valueOf(dispatchKeyEvent);
            case 12:
                C1006x0 c1006x0 = (C1006x0) this.f2388f;
                z0.g gVar2 = c1006x0.f8499h;
                z0.g gVar3 = c1006x0.f8500i;
                Float f5 = c1006x0.f8497f;
                Float f6 = c1006x0.f8498g;
                float floatValue = (gVar2 == null || f5 == null) ? 0.0f : ((Number) gVar2.f8954a.b()).floatValue() - f5.floatValue();
                float floatValue2 = (gVar3 == null || f6 == null) ? 0.0f : ((Number) gVar3.f8954a.b()).floatValue() - f6.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int i7 = c1006x0.f8495d;
                    C0959F c0959f = (C0959F) this.f2389g;
                    int w3 = c0959f.w(i7);
                    C1010z0 c1010z0 = (C1010z0) c0959f.l().f(c0959f.f8146n);
                    if (c1010z0 != null) {
                        try {
                            b1.h hVar = c0959f.f8147o;
                            if (hVar != null) {
                                hVar.f4317a.setBoundsInScreen(c0959f.c(c1010z0));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    c0959f.f8136d.invalidate();
                    C1010z0 c1010z02 = (C1010z0) c0959f.l().f(w3);
                    if (c1010z02 != null && (nVar = c1010z02.f8507a) != null && (d3 = nVar.f8990c) != null) {
                        if (gVar2 != null) {
                            c0959f.f8148q.i(w3, gVar2);
                        }
                        if (gVar3 != null) {
                            c0959f.f8149r.i(w3, gVar3);
                        }
                        c0959f.s(d3);
                    }
                }
                if (gVar2 != null) {
                    c1006x0.f8497f = (Float) gVar2.f8954a.b();
                }
                if (gVar3 != null) {
                    c1006x0.f8498g = (Float) gVar3.f8954a.b();
                }
                return L1.z.f2729a;
            default:
                a0.d dVar = (a0.d) this.f2388f;
                if (dVar != null) {
                    return dVar;
                }
                t0.a0 a0Var2 = (t0.a0) this.f2389g;
                if (!a0Var2.B0().p) {
                    a0Var2 = null;
                }
                if (a0Var2 != null) {
                    return AbstractC0157a.f(0L, I2.l.R(a0Var2.f7116f));
                }
                return null;
        }
    }
}
