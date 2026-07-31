package B;

import C0.C0031g;
import I.C0174t;
import I.C0176u;
import I.InterfaceC0142c0;
import a0.C0238c;
import a0.C0239d;
import android.content.Context;
import android.view.KeyEvent;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import j.C0519A;
import java.io.File;
import k1.C0566b;
import n.C0670M;
import r.AbstractC0856c;
import r0.AbstractC0891M;
import r0.AbstractC0892N;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.l0;
import t0.o0;
import t1.C1028h;
import u0.C1123s;
import u0.H0;
import u0.J0;
import x.EnumC1187E;
import x.p0;

/* loaded from: classes.dex */
public final class f0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f395g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, int i3, Object obj2) {
        super(0);
        this.f393e = i3;
        this.f394f = obj;
        this.f395g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (f2.j.a(r11.f3099c, ((I0.z) r10.getValue()).f3099c) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r1v47, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v20, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v23, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0422a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        long j3;
        p0 d3;
        x.Q q3;
        C0031g c0031g;
        AbstractC0892N placementScope;
        boolean dispatchKeyEvent;
        A0.p pVar;
        t0.E e3;
        int i3 = 0;
        R1.y yVar = R1.y.f4171a;
        Object obj = this.f395g;
        Object obj2 = this.f394f;
        switch (this.f393e) {
            case 0:
                long j4 = ((O0.j) ((InterfaceC0142c0) obj).getValue()).f3740a;
                a0 a0Var = (a0) obj2;
                C0238c g3 = a0Var.g();
                long j5 = 9205357640488583168L;
                if (g3 != null) {
                    x.Q q4 = a0Var.f345d;
                    C0031g c0031g2 = q4 != null ? q4.f9975a.f10039a : null;
                    if (c0031g2 != null && c0031g2.f596a.length() != 0) {
                        EnumC1187E enumC1187E = (EnumC1187E) a0Var.f356o.getValue();
                        int i4 = enumC1187E == null ? -1 : d0.f379a[enumC1187E.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                long j6 = a0Var.j().f3098b;
                                int i5 = C0.J.f568c;
                                j3 = j6 >> 32;
                            } else {
                                if (i4 != 3) {
                                    throw new C1.c();
                                }
                                long j7 = a0Var.j().f3098b;
                                int i6 = C0.J.f568c;
                                j3 = j7 & 4294967295L;
                            }
                            int i7 = (int) j3;
                            x.Q q5 = a0Var.f345d;
                            if (q5 != null && (d3 = q5.d()) != null && (q3 = a0Var.f345d) != null && (c0031g = q3.f9975a.f10039a) != null) {
                                int y3 = O2.d.y(a0Var.f343b.b(i7), 0, c0031g.f596a.length());
                                float d4 = C0238c.d(d3.d(g3.f4722a));
                                C0.H h3 = d3.f10230a;
                                int e4 = h3.e(y3);
                                float f3 = h3.f(e4);
                                float g4 = h3.g(e4);
                                float x3 = O2.d.x(d4, Math.min(f3, g4), Math.max(f3, g4));
                                if (O0.j.a(j4, 0L) || Math.abs(d4 - x3) <= ((int) (j4 >> 32)) / 2) {
                                    C0.o oVar = h3.f558b;
                                    float d5 = oVar.d(e4);
                                    j5 = l0.c.e(x3, ((oVar.b(e4) - d5) / 2) + d5);
                                }
                            }
                        }
                    }
                }
                return new C0238c(j5);
            case 1:
                C0519A c0519a = (C0519A) obj2;
                Object[] objArr = c0519a.f6248b;
                long[] jArr = c0519a.f6247a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = i3; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    ((C0176u) obj).x(objArr[(i8 << 3) + i10]);
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                            }
                        }
                        if (i8 != length) {
                            i8++;
                            i3 = 0;
                        }
                    }
                }
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Y.b) obj2).f4650s.n((Y.c) obj);
                return yVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((f2.u) obj2).f5832d = ((Z.t) obj).y0();
                return yVar;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((C0566b) obj).getClass();
                String concat = "prefs_main".concat(".preferences_pb");
                f2.j.f(concat, "fileName");
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case 5:
                ((s2.k) obj2).p(obj);
                return yVar;
            case 6:
                ((f2.u) obj2).f5832d = AbstractC0993f.i((C0670M) obj, AbstractC0891M.f8124a);
                return yVar;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0174t c0174t = ((t0.E) obj2).f8561y;
                if ((((U.p) c0174t.f2915f).f4492g & 8) != 0) {
                    for (U.p pVar2 = (t0.p0) c0174t.f2914e; pVar2 != null; pVar2 = pVar2.f4493h) {
                        if ((pVar2.f4491f & 8) != 0) {
                            AbstractC1000m abstractC1000m = pVar2;
                            ?? r4 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof o0) {
                                    o0 o0Var = (o0) abstractC1000m;
                                    f2.u uVar = (f2.u) obj;
                                    if (o0Var.O()) {
                                        A0.i iVar = new A0.i();
                                        uVar.f5832d = iVar;
                                        iVar.f131f = true;
                                    }
                                    if (o0Var.R()) {
                                        ((A0.i) uVar.f5832d).f130e = true;
                                    }
                                    o0Var.j((A0.i) uVar.f5832d);
                                } else if ((abstractC1000m.f4491f & 8) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar3 = abstractC1000m.f8771r;
                                    int i11 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r4 = r4;
                                    while (pVar3 != null) {
                                        if ((pVar3.f4491f & 8) != 0) {
                                            i11++;
                                            r4 = r4;
                                            if (i11 == 1) {
                                                abstractC1000m = pVar3;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r4.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r4.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r4 = r4;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r4);
                            }
                        }
                    }
                }
                return yVar;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                t0.M m3 = (t0.M) obj2;
                t0.b0 b0Var = m3.a().f8713q;
                if (b0Var == null || (placementScope = b0Var.f8655l) == null) {
                    placementScope = ((C1123s) t0.H.a(m3.f8625a)).getPlacementScope();
                }
                t0.K k3 = (t0.K) obj;
                InterfaceC0424c interfaceC0424c = k3.D;
                if (interfaceC0424c == null) {
                    t0.b0 a3 = m3.a();
                    long j9 = k3.f8600E;
                    float f4 = k3.f8601F;
                    placementScope.getClass();
                    AbstractC0892N.a(placementScope, a3);
                    a3.f0(O0.h.c(j9, a3.f8130h), f4, null);
                } else {
                    t0.b0 a4 = m3.a();
                    long j10 = k3.f8600E;
                    float f5 = k3.f8601F;
                    placementScope.getClass();
                    AbstractC0892N.a(placementScope, a4);
                    a4.f0(O0.h.c(j10, a4.f8130h), f5, interfaceC0424c);
                }
                return yVar;
            case AbstractC0856c.f8037c /* 9 */:
                InterfaceC0424c k4 = ((l0) obj2).f8768d.k();
                if (k4 != null) {
                    t0.P p3 = (t0.P) obj;
                    p3.getClass();
                    k4.n(new t0.O(p3));
                }
                return yVar;
            case AbstractC0856c.f8039e /* 10 */:
                C0239d c0239d = (C0239d) obj2;
                if (c0239d != null) {
                    return c0239d;
                }
                t0.b0 b0Var2 = (t0.b0) obj;
                if (!b0Var2.K0().f4501p) {
                    b0Var2 = null;
                }
                if (b0Var2 != null) {
                    return O2.d.g(0L, O2.d.f0(b0Var2.f8128f));
                }
                return null;
            case 11:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 12:
                H0 h02 = (H0) obj2;
                A0.g gVar = h02.f9196h;
                A0.g gVar2 = h02.f9197i;
                Float f6 = h02.f9194f;
                Float f7 = h02.f9195g;
                float floatValue = (gVar == null || f6 == null) ? 0.0f : ((Number) gVar.f99a.b()).floatValue() - f6.floatValue();
                float floatValue2 = (gVar2 == null || f7 == null) ? 0.0f : ((Number) gVar2.f99a.b()).floatValue() - f7.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    u0.E e5 = (u0.E) obj;
                    int w2 = e5.w(h02.f9192d);
                    J0 j02 = (J0) e5.l().f(e5.f9161n);
                    if (j02 != null) {
                        try {
                            d1.h hVar = e5.f9162o;
                            if (hVar != null) {
                                hVar.f5672a.setBoundsInScreen(e5.c(j02));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    e5.f9151d.invalidate();
                    J0 j03 = (J0) e5.l().f(w2);
                    if (j03 != null && (pVar = j03.f9202a) != null && (e3 = pVar.f141c) != null) {
                        if (gVar != null) {
                            e5.f9164q.i(w2, gVar);
                        }
                        if (gVar2 != null) {
                            e5.f9165r.i(w2, gVar2);
                        }
                        e5.s(e3);
                    }
                }
                if (gVar != null) {
                    h02.f9194f = (Float) gVar.f99a.b();
                }
                if (gVar2 != null) {
                    h02.f9195g = (Float) gVar2.f99a.b();
                }
                return yVar;
            case 13:
                ((u1.p) obj2).e((C1028h) obj, false);
                return yVar;
            case 14:
                I0.z zVar = (I0.z) obj2;
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) obj;
                if (C0.J.a(zVar.f3098b, ((I0.z) interfaceC0142c0.getValue()).f3098b)) {
                    break;
                }
                interfaceC0142c0.setValue(zVar);
                return yVar;
            default:
                ((x.Q) obj2).f9995u.n(new I0.l(((I0.m) obj).f3076e));
                return Boolean.TRUE;
        }
    }
}
