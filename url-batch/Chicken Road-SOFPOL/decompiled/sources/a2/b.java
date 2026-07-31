package a2;

import a4.i;
import android.view.KeyEvent;
import c6.m;
import d2.h;
import d2.n;
import d2.o;
import e1.c;
import o0.e;
import q6.j;
import q6.s;
import w1.b1;
import w1.d0;
import w1.d1;
import w1.f;
import w1.f0;
import w1.g0;
import w1.j0;
import w1.o0;
import w1.q;
import w1.s0;
import w1.s1;
import x1.a0;
import x1.o1;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(0);
        this.f222e = i;
        this.f223f = obj;
        this.f224g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    @Override // p6.a
    public final Object b() {
        c cVar;
        boolean dispatchKeyEvent;
        n nVar;
        f0 f0Var;
        switch (this.f222e) {
            case 0:
                p6.a aVar = (p6.a) this.f223f;
                if (aVar != null && (cVar = (c) aVar.b()) != null) {
                    return cVar;
                }
                d1 d1Var = (d1) this.f224g;
                if (!d1Var.E0().f8718q) {
                    d1Var = null;
                }
                if (d1Var != null) {
                    return a.a.b(0L, m.a.R(d1Var.f7232f));
                }
                return null;
            case 1:
                ((c1.b) this.f223f).f1560t.i((c1.c) this.f224g);
                return m.f1757a;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                ((s) this.f223f).f6205d = ((d1.n) this.f224g).s0();
                return m.f1757a;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                ((q1.b) this.f223f).d((l) this.f224g);
                return m.f1757a;
            case i.LONG_FIELD_NUMBER /* 4 */:
                b1 b1Var = ((f0) this.f223f).F;
                s sVar = (s) this.f224g;
                if ((b1Var.f7600f.f8709g & 8) != 0) {
                    for (l lVar = b1Var.f7599e; lVar != null; lVar = lVar.f8710h) {
                        if ((lVar.f8708f & 8) != 0) {
                            w1.l lVar2 = lVar;
                            ?? r42 = 0;
                            while (lVar2 != 0) {
                                if (lVar2 instanceof s1) {
                                    s1 s1Var = (s1) lVar2;
                                    if (s1Var.T()) {
                                        d2.j jVar = new d2.j();
                                        sVar.f6205d = jVar;
                                        jVar.f2153g = true;
                                    }
                                    if (s1Var.U()) {
                                        ((d2.j) sVar.f6205d).f2152f = true;
                                    }
                                    s1Var.q((d2.j) sVar.f6205d);
                                } else if ((lVar2.f8708f & 8) != 0 && (lVar2 instanceof w1.l)) {
                                    l lVar3 = lVar2.f7707s;
                                    int i = 0;
                                    lVar2 = lVar2;
                                    r42 = r42;
                                    while (lVar3 != null) {
                                        if ((lVar3.f8708f & 8) != 0) {
                                            i++;
                                            r42 = r42;
                                            if (i == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new e(new l[16]);
                                                }
                                                if (lVar2 != 0) {
                                                    r42.b(lVar2);
                                                    lVar2 = 0;
                                                }
                                                r42.b(lVar3);
                                            }
                                        }
                                        lVar3 = lVar3.i;
                                        lVar2 = lVar2;
                                        r42 = r42;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar2 = f.f(r42);
                            }
                        }
                    }
                }
                return m.f1757a;
            case 5:
                s0 s0Var = (s0) this.f223f;
                j0 j0Var = s0Var.i;
                j0Var.f7693h = 0;
                e x7 = j0Var.f7686a.x();
                Object[] objArr = x7.f5578d;
                int i8 = x7.f5580f;
                for (int i9 = 0; i9 < i8; i9++) {
                    s0 s0Var2 = ((f0) objArr[i9]).G.f7701q;
                    q6.i.b(s0Var2);
                    s0Var2.f7763k = s0Var2.f7764l;
                    s0Var2.f7764l = Integer.MAX_VALUE;
                    if (s0Var2.f7765m == d0.f7611e) {
                        s0Var2.f7765m = d0.f7612f;
                    }
                }
                f0 f0Var2 = j0Var.f7686a;
                f0 f0Var3 = j0Var.f7686a;
                e x8 = f0Var2.x();
                Object[] objArr2 = x8.f5578d;
                int i10 = x8.f5580f;
                for (int i11 = 0; i11 < i10; i11++) {
                    s0 s0Var3 = ((f0) objArr2[i11]).G.f7701q;
                    q6.i.b(s0Var3);
                    s0Var3.f7772t.getClass();
                }
                q qVar = s0Var.m().R;
                if (qVar != null) {
                    boolean z3 = qVar.f7730n;
                    o0.b bVar = (o0.b) f0Var3.m();
                    int i12 = bVar.f5572d.f5580f;
                    for (int i13 = 0; i13 < i12; i13++) {
                        o0 C0 = ((f0) bVar.get(i13)).F.f7598d.C0();
                        if (C0 != null) {
                            C0.f7730n = z3;
                        }
                    }
                }
                ((o0) this.f224g).m0().b();
                if (s0Var.m().R != null) {
                    o0.b bVar2 = (o0.b) f0Var3.m();
                    int i14 = bVar2.f5572d.f5580f;
                    for (int i15 = 0; i15 < i14; i15++) {
                        o0 C02 = ((f0) bVar2.get(i15)).F.f7598d.C0();
                        if (C02 != null) {
                            C02.f7730n = false;
                        }
                    }
                }
                e x9 = f0Var3.x();
                Object[] objArr3 = x9.f5578d;
                int i16 = x9.f5580f;
                for (int i17 = 0; i17 < i16; i17++) {
                    s0 s0Var4 = ((f0) objArr3[i17]).G.f7701q;
                    q6.i.b(s0Var4);
                    int i18 = s0Var4.f7763k;
                    int i19 = s0Var4.f7764l;
                    if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                        s0Var4.Z(true);
                    }
                }
                e x10 = f0Var3.x();
                Object[] objArr4 = x10.f5578d;
                int i20 = x10.f5580f;
                for (int i21 = 0; i21 < i20; i21++) {
                    s0 s0Var5 = ((f0) objArr4[i21]).G.f7701q;
                    q6.i.b(s0Var5);
                    g0 g0Var = s0Var5.f7772t;
                    g0Var.getClass();
                    g0Var.f7667c = false;
                }
                return m.f1757a;
            case 6:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f224g);
                return Boolean.valueOf(dispatchKeyEvent);
            default:
                a0 a0Var = (a0) this.f224g;
                o1 o1Var = (o1) this.f223f;
                h hVar = o1Var.f8523h;
                h hVar2 = o1Var.i;
                Float f6 = o1Var.f8521f;
                Float f8 = o1Var.f8522g;
                float floatValue = (hVar == null || f6 == null) ? 0.0f : ((Number) hVar.f2123a.b()).floatValue() - f6.floatValue();
                float floatValue2 = (hVar2 == null || f8 == null) ? 0.0f : ((Number) hVar2.f2123a.b()).floatValue() - f8.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int A = a0Var.A(o1Var.f8519d);
                    o oVar = (o) a0Var.t().b(a0Var.f8339n);
                    if (oVar != null) {
                        try {
                            r3.f fVar = a0Var.f8341p;
                            if (fVar != null) {
                                fVar.f6557a.setBoundsInScreen(a0Var.k(oVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    o oVar2 = (o) a0Var.t().b(a0Var.f8340o);
                    if (oVar2 != null) {
                        try {
                            r3.f fVar2 = a0Var.f8342q;
                            if (fVar2 != null) {
                                fVar2.f6557a.setBoundsInScreen(a0Var.k(oVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    a0Var.f8330d.invalidate();
                    o oVar3 = (o) a0Var.t().b(A);
                    if (oVar3 != null && (nVar = oVar3.f2163a) != null && (f0Var = nVar.f2158c) != null) {
                        if (hVar != null) {
                            a0Var.f8344s.g(A, hVar);
                        }
                        if (hVar2 != null) {
                            a0Var.f8345t.g(A, hVar2);
                        }
                        a0Var.w(f0Var);
                    }
                }
                if (hVar != null) {
                    o1Var.f8521f = (Float) hVar.f2123a.b();
                }
                if (hVar2 != null) {
                    o1Var.f8522g = (Float) hVar2.f2123a.b();
                }
                return m.f1757a;
        }
    }
}
