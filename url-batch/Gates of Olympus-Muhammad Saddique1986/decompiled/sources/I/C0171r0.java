package I;

import C0.C0031g;
import I0.C0188a;
import e2.InterfaceC0424c;
import j.C0547u;
import j.C0550x;
import java.util.List;
import m.AbstractC0625j;
import r.AbstractC0856c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import x.C1192e;
import z.C1256t;

/* renamed from: I.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171r0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0171r0(int i3, int i4, Object obj, Object obj2) {
        super(1);
        this.f2898e = i4;
        this.f2900g = obj;
        this.f2899f = i3;
        this.f2901h = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05b0  */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        InterfaceC0169q interfaceC0169q;
        int i3;
        int i4;
        InterfaceC0169q interfaceC0169q2;
        int i5;
        int i6;
        Integer e3;
        Integer d3;
        Integer d4;
        Integer e4;
        C0.H h3;
        C0.H h4;
        x.p0 p0Var;
        x.p0 p0Var2;
        C0.H h5;
        C0.H h6;
        x.p0 p0Var3;
        x.p0 p0Var4;
        Integer d5;
        Integer e5;
        Integer e6;
        Integer d6;
        C1256t c1256t;
        int i7 = 20;
        R1.y yVar = R1.y.f4171a;
        Object obj2 = this.f2901h;
        Object obj3 = this.f2900g;
        int i8 = 0;
        int i9 = this.f2899f;
        int i10 = 1;
        switch (this.f2898e) {
            case 0:
                InterfaceC0169q interfaceC0169q3 = (InterfaceC0169q) obj;
                C0173s0 c0173s0 = (C0173s0) obj3;
                if (c0173s0.f2907e == i9) {
                    C0547u c0547u = (C0547u) obj2;
                    if (f2.j.a(c0547u, c0173s0.f2908f) && (interfaceC0169q3 instanceof C0176u)) {
                        long[] jArr = c0547u.f6330a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j3 = jArr[i11];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8;
                                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                                    int i14 = i8;
                                    while (i14 < i13) {
                                        if ((j3 & 255) < 128) {
                                            int i15 = (i11 << 3) + i14;
                                            Object obj4 = c0547u.f6331b[i15];
                                            boolean z3 = c0547u.f6332c[i15] != i9;
                                            if (z3) {
                                                C0176u c0176u = (C0176u) interfaceC0169q3;
                                                interfaceC0169q2 = interfaceC0169q3;
                                                c0176u.f2932j.m(obj4, c0173s0);
                                                if (obj4 instanceof F) {
                                                    F f3 = (F) obj4;
                                                    i5 = i9;
                                                    if (!((C0550x) c0176u.f2932j.f334d).b(f3)) {
                                                        c0176u.f2935m.n(f3);
                                                    }
                                                    C0550x c0550x = c0173s0.f2909g;
                                                    if (c0550x != null) {
                                                        c0550x.g(obj4);
                                                    }
                                                    if (z3) {
                                                        c0547u.e(i15);
                                                    }
                                                    i6 = 8;
                                                }
                                            } else {
                                                interfaceC0169q2 = interfaceC0169q3;
                                            }
                                            i5 = i9;
                                            if (z3) {
                                            }
                                            i6 = 8;
                                        } else {
                                            interfaceC0169q2 = interfaceC0169q3;
                                            i5 = i9;
                                            i6 = i12;
                                        }
                                        j3 >>= i6;
                                        i14++;
                                        i12 = i6;
                                        i10 = 1;
                                        interfaceC0169q3 = interfaceC0169q2;
                                        i9 = i5;
                                    }
                                    interfaceC0169q = interfaceC0169q3;
                                    i3 = i9;
                                    i4 = i10;
                                    if (i13 != i12) {
                                        break;
                                    }
                                } else {
                                    interfaceC0169q = interfaceC0169q3;
                                    i3 = i9;
                                    i4 = i10;
                                }
                                if (i11 == length) {
                                    break;
                                } else {
                                    i11 += i4;
                                    i10 = i4;
                                    interfaceC0169q3 = interfaceC0169q;
                                    i9 = i3;
                                    i8 = 0;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                n.A0 a02 = (n.A0) obj3;
                int y3 = O2.d.y(a02.f7016q.f7242a.g(), 0, i9);
                int i16 = a02.f7017r ? y3 - i9 : -y3;
                boolean z4 = a02.f7018s;
                int i17 = z4 ? 0 : i16;
                if (!z4) {
                    i16 = 0;
                }
                abstractC0892N.f8125a = true;
                AbstractC0892N.g(abstractC0892N, (AbstractC0893O) obj2, i17, i16);
                abstractC0892N.f8125a = false;
                break;
            default:
                B.V v3 = (B.V) obj;
                I0.z zVar = null;
                x.d0 d0Var = (x.d0) obj3;
                switch (AbstractC0625j.b(i9)) {
                    case 0:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!C0.J.b(v3.f326f)) {
                                if (!v3.f()) {
                                    int d7 = C0.J.d(v3.f326f);
                                    v3.p(d7, d7);
                                    break;
                                } else {
                                    int e7 = C0.J.e(v3.f326f);
                                    v3.p(e7, e7);
                                    break;
                                }
                            } else {
                                v3.i();
                                break;
                            }
                        }
                        break;
                    case 1:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!C0.J.b(v3.f326f)) {
                                if (!v3.f()) {
                                    int e8 = C0.J.e(v3.f326f);
                                    v3.p(e8, e8);
                                    break;
                                } else {
                                    int d8 = C0.J.d(v3.f326f);
                                    v3.p(d8, d8);
                                    break;
                                }
                            } else {
                                v3.l();
                                break;
                            }
                        }
                        break;
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        B.i0 i0Var = v3.f325e;
                        i0Var.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!v3.f()) {
                                i0Var.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (e3 = v3.e()) != null) {
                                    int intValue = e3.intValue();
                                    v3.p(intValue, intValue);
                                    break;
                                }
                            } else {
                                i0Var.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (d3 = v3.d()) != null) {
                                    int intValue2 = d3.intValue();
                                    v3.p(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        B.i0 i0Var2 = v3.f325e;
                        i0Var2.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!v3.f()) {
                                i0Var2.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (d4 = v3.d()) != null) {
                                    int intValue3 = d4.intValue();
                                    v3.p(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                i0Var2.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (e4 = v3.e()) != null) {
                                    int intValue4 = e4.intValue();
                                    v3.p(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        v3.j();
                        break;
                    case 5:
                        v3.k();
                        break;
                    case 6:
                        v3.n();
                        break;
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        v3.m();
                        break;
                    case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!v3.f()) {
                                v3.m();
                                break;
                            } else {
                                v3.n();
                                break;
                            }
                        }
                        break;
                    case AbstractC0856c.f8037c /* 9 */:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (!v3.f()) {
                                v3.n();
                                break;
                            } else {
                                v3.m();
                                break;
                            }
                        }
                        break;
                    case AbstractC0856c.f8039e /* 10 */:
                        if (v3.f327g.f596a.length() > 0 && (h3 = v3.f323c) != null) {
                            int g3 = v3.g(h3, -1);
                            v3.p(g3, g3);
                            break;
                        }
                        break;
                    case 11:
                        if (v3.f327g.f596a.length() > 0 && (h4 = v3.f323c) != null) {
                            int g4 = v3.g(h4, 1);
                            v3.p(g4, g4);
                            break;
                        }
                        break;
                    case 12:
                        if (v3.f327g.f596a.length() > 0 && (p0Var = v3.f329i) != null) {
                            int h7 = v3.h(p0Var, -1);
                            v3.p(h7, h7);
                            break;
                        }
                        break;
                    case 13:
                        if (v3.f327g.f596a.length() > 0 && (p0Var2 = v3.f329i) != null) {
                            int h8 = v3.h(p0Var2, 1);
                            v3.p(h8, h8);
                            break;
                        }
                        break;
                    case 14:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            v3.p(0, 0);
                            break;
                        }
                        break;
                    case AbstractC0856c.f8041g /* 15 */:
                        v3.f325e.f413a = null;
                        C0031g c0031g = v3.f327g;
                        if (c0031g.f596a.length() > 0) {
                            int length2 = c0031g.f596a.length();
                            v3.p(length2, length2);
                            break;
                        }
                        break;
                    case 16:
                        d0Var.f10063b.b(false);
                        break;
                    case 17:
                        d0Var.f10063b.l();
                        break;
                    case 18:
                        d0Var.f10063b.d();
                        break;
                    case 19:
                        List a3 = v3.a(C1192e.f10079k);
                        if (a3 != null) {
                            d0Var.a(a3);
                            break;
                        }
                        break;
                    case 20:
                        List a4 = v3.a(C1192e.f10080l);
                        if (a4 != null) {
                            d0Var.a(a4);
                            break;
                        }
                        break;
                    case 21:
                        List a5 = v3.a(C1192e.f10081m);
                        if (a5 != null) {
                            d0Var.a(a5);
                            break;
                        }
                        break;
                    case 22:
                        List a6 = v3.a(C1192e.f10082n);
                        if (a6 != null) {
                            d0Var.a(a6);
                            break;
                        }
                        break;
                    case 23:
                        List a7 = v3.a(C1192e.f10083o);
                        if (a7 != null) {
                            d0Var.a(a7);
                            break;
                        }
                        break;
                    case 24:
                        List a8 = v3.a(C1192e.f10084p);
                        if (a8 != null) {
                            d0Var.a(a8);
                            break;
                        }
                        break;
                    case 25:
                        v3.f325e.f413a = null;
                        C0031g c0031g2 = v3.f327g;
                        if (c0031g2.f596a.length() > 0) {
                            v3.p(0, c0031g2.f596a.length());
                            break;
                        }
                        break;
                    case 26:
                        v3.i();
                        v3.o();
                        break;
                    case 27:
                        v3.l();
                        v3.o();
                        break;
                    case 28:
                        if (v3.f327g.f596a.length() > 0 && (h5 = v3.f323c) != null) {
                            int g5 = v3.g(h5, -1);
                            v3.p(g5, g5);
                        }
                        v3.o();
                        break;
                    case 29:
                        if (v3.f327g.f596a.length() > 0 && (h6 = v3.f323c) != null) {
                            int g6 = v3.g(h6, 1);
                            v3.p(g6, g6);
                        }
                        v3.o();
                        break;
                    case 30:
                        if (v3.f327g.f596a.length() > 0 && (p0Var3 = v3.f329i) != null) {
                            int h9 = v3.h(p0Var3, -1);
                            v3.p(h9, h9);
                        }
                        v3.o();
                        break;
                    case 31:
                        if (v3.f327g.f596a.length() > 0 && (p0Var4 = v3.f329i) != null) {
                            int h10 = v3.h(p0Var4, 1);
                            v3.p(h10, h10);
                        }
                        v3.o();
                        break;
                    case 32:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            v3.p(0, 0);
                        }
                        v3.o();
                        break;
                    case 33:
                        v3.f325e.f413a = null;
                        C0031g c0031g3 = v3.f327g;
                        if (c0031g3.f596a.length() > 0) {
                            int length3 = c0031g3.f596a.length();
                            v3.p(length3, length3);
                        }
                        v3.o();
                        break;
                    case 34:
                        B.i0 i0Var3 = v3.f325e;
                        i0Var3.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (v3.f()) {
                                i0Var3.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (e5 = v3.e()) != null) {
                                    int intValue5 = e5.intValue();
                                    v3.p(intValue5, intValue5);
                                }
                            } else {
                                i0Var3.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (d5 = v3.d()) != null) {
                                    int intValue6 = d5.intValue();
                                    v3.p(intValue6, intValue6);
                                }
                            }
                        }
                        v3.o();
                        break;
                    case 35:
                        B.i0 i0Var4 = v3.f325e;
                        i0Var4.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (v3.f()) {
                                i0Var4.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (d6 = v3.d()) != null) {
                                    int intValue7 = d6.intValue();
                                    v3.p(intValue7, intValue7);
                                }
                            } else {
                                i0Var4.f413a = null;
                                if (v3.f327g.f596a.length() > 0 && (e6 = v3.e()) != null) {
                                    int intValue8 = e6.intValue();
                                    v3.p(intValue8, intValue8);
                                }
                            }
                        }
                        v3.o();
                        break;
                    case 36:
                        v3.j();
                        v3.o();
                        break;
                    case 37:
                        v3.k();
                        v3.o();
                        break;
                    case 38:
                        v3.n();
                        v3.o();
                        break;
                    case 39:
                        v3.m();
                        v3.o();
                        break;
                    case 40:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (v3.f()) {
                                v3.n();
                            } else {
                                v3.m();
                            }
                        }
                        v3.o();
                        break;
                    case 41:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            if (v3.f()) {
                                v3.m();
                            } else {
                                v3.n();
                            }
                        }
                        v3.o();
                        break;
                    case 42:
                        v3.f325e.f413a = null;
                        if (v3.f327g.f596a.length() > 0) {
                            long j4 = v3.f326f;
                            int i18 = C0.J.f568c;
                            int i19 = (int) (j4 & 4294967295L);
                            v3.p(i19, i19);
                            break;
                        }
                        break;
                    case 43:
                        if (!d0Var.f10066e) {
                            d0Var.a(O2.l.l0(new C0188a("\n", 1)));
                            break;
                        } else {
                            d0Var.f10062a.f9995u.n(new I0.l(d0Var.f10073l));
                            break;
                        }
                    case 44:
                        if (!d0Var.f10066e) {
                            d0Var.a(O2.l.l0(new C0188a("\t", 1)));
                            break;
                        } else {
                            ((f2.q) obj2).f5828d = false;
                            break;
                        }
                    case 45:
                        x.q0 q0Var = d0Var.f10069h;
                        if (q0Var != null) {
                            q0Var.a(I0.z.a(v3.f328h, v3.f327g, v3.f326f, 4));
                        }
                        x.q0 q0Var2 = d0Var.f10069h;
                        if (q0Var2 != null) {
                            C1256t c1256t2 = q0Var2.f10236b;
                            if (c1256t2 != null && (c1256t = (C1256t) c1256t2.f10466e) != null) {
                                q0Var2.f10236b = c1256t;
                                q0Var2.f10238d -= ((I0.z) c1256t2.f10467f).f3097a.f596a.length();
                                q0Var2.f10237c = new C1256t(q0Var2.f10237c, i7, (I0.z) c1256t2.f10467f);
                                zVar = (I0.z) c1256t.f10467f;
                            }
                            if (zVar != null) {
                                d0Var.f10072k.n(zVar);
                                break;
                            }
                        }
                        break;
                    case 46:
                        x.q0 q0Var3 = d0Var.f10069h;
                        if (q0Var3 != null) {
                            C1256t c1256t3 = q0Var3.f10237c;
                            if (c1256t3 != null) {
                                q0Var3.f10237c = (C1256t) c1256t3.f10466e;
                                I0.z zVar2 = (I0.z) c1256t3.f10467f;
                                q0Var3.f10236b = new C1256t(q0Var3.f10236b, i7, zVar2);
                                q0Var3.f10238d = zVar2.f3097a.f596a.length() + q0Var3.f10238d;
                                zVar = (I0.z) c1256t3.f10467f;
                            }
                            if (zVar != null) {
                                d0Var.f10072k.n(zVar);
                                break;
                            }
                        }
                        break;
                }
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171r0(int i3, x.d0 d0Var, f2.q qVar) {
        super(1);
        this.f2898e = 2;
        this.f2899f = i3;
        this.f2900g = d0Var;
        this.f2901h = qVar;
    }
}
