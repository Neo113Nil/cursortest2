package G;

import A0.C0036g;
import D.C0174u0;
import G0.C0237a;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import q.AbstractC1024c;
import w.C1265e;
import z2.C1440x;

/* renamed from: G.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220r0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2896e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0220r0(int i2, int i4, Object obj, Object obj2) {
        super(1);
        this.f2895d = i4;
        this.f2897i = obj;
        this.f2896e = i2;
        this.f2898j = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x05b3  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        InterfaceC0218q interfaceC0218q;
        int i2;
        InterfaceC0218q interfaceC0218q2;
        int i4;
        Integer e4;
        Integer d4;
        Integer d5;
        Integer e5;
        A0.I i5;
        A0.I i6;
        w.o0 o0Var;
        w.o0 o0Var2;
        A0.I i7;
        A0.I i8;
        w.o0 o0Var3;
        w.o0 o0Var4;
        Integer d6;
        Integer e6;
        Integer e7;
        Integer d7;
        l2.g gVar;
        int i9 = 15;
        Object obj2 = this.f2898j;
        Object obj3 = this.f2897i;
        int i10 = 0;
        int i11 = this.f2896e;
        int i12 = 1;
        switch (this.f2895d) {
            case 0:
                InterfaceC0218q interfaceC0218q3 = (InterfaceC0218q) obj;
                C0222s0 c0222s0 = (C0222s0) obj3;
                if (c0222s0.f2904e == i11) {
                    i.v vVar = (i.v) obj2;
                    if (Intrinsics.a(vVar, c0222s0.f2905f) && (interfaceC0218q3 instanceof C0225u)) {
                        long[] jArr = vVar.f6968a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j4 = jArr[i13];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8;
                                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                                    int i16 = i10;
                                    while (i16 < i15) {
                                        if ((255 & j4) < 128) {
                                            int i17 = (i13 << 3) + i16;
                                            Object obj4 = vVar.f6969b[i17];
                                            boolean z4 = vVar.f6970c[i17] != i11;
                                            if (z4) {
                                                C0225u c0225u = (C0225u) interfaceC0218q3;
                                                c0225u.f2929m.l(obj4, c0222s0);
                                                if (obj4 instanceof F) {
                                                    F f4 = (F) obj4;
                                                    interfaceC0218q2 = interfaceC0218q3;
                                                    if (!((i.y) c0225u.f2929m.f11388d).b(f4)) {
                                                        c0225u.f2932p.m(f4);
                                                    }
                                                    i.y yVar = c0222s0.f2906g;
                                                    if (yVar != null) {
                                                        yVar.g(obj4);
                                                    }
                                                    if (z4) {
                                                        vVar.e(i17);
                                                    }
                                                    i4 = 8;
                                                }
                                            }
                                            interfaceC0218q2 = interfaceC0218q3;
                                            if (z4) {
                                            }
                                            i4 = 8;
                                        } else {
                                            interfaceC0218q2 = interfaceC0218q3;
                                            i4 = i14;
                                        }
                                        j4 >>= i4;
                                        i16++;
                                        i14 = i4;
                                        i12 = 1;
                                        interfaceC0218q3 = interfaceC0218q2;
                                    }
                                    interfaceC0218q = interfaceC0218q3;
                                    i2 = i12;
                                    if (i15 != i14) {
                                    }
                                } else {
                                    interfaceC0218q = interfaceC0218q3;
                                    i2 = i12;
                                }
                                if (i13 != length) {
                                    i13 += i2;
                                    i12 = i2;
                                    interfaceC0218q3 = interfaceC0218q;
                                    i10 = 0;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                m.v0 v0Var = (m.v0) obj3;
                int e8 = kotlin.ranges.b.e(v0Var.f8206t.f8194a.d(), 0, i11);
                int i18 = v0Var.f8207u ? e8 - i11 : -e8;
                boolean z5 = v0Var.f8208v;
                int i19 = z5 ? 0 : i18;
                if (!z5) {
                    i18 = 0;
                }
                C0174u0 c0174u0 = new C0174u0((AbstractC0954O) obj2, i19, i18, i12);
                abstractC0953N.f9004a = true;
                c0174u0.invoke(abstractC0953N);
                abstractC0953N.f9004a = false;
                break;
            default:
                A.W w4 = (A.W) obj;
                G0.y yVar2 = null;
                w.c0 c0Var = (w.c0) obj3;
                switch (AbstractC0784j.d(i11)) {
                    case 0:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!A0.K.b(w4.f69f)) {
                                if (!w4.f()) {
                                    int d8 = A0.K.d(w4.f69f);
                                    w4.p(d8, d8);
                                    break;
                                } else {
                                    int e9 = A0.K.e(w4.f69f);
                                    w4.p(e9, e9);
                                    break;
                                }
                            } else {
                                w4.i();
                                Unit unit = Unit.f7487a;
                                break;
                            }
                        }
                        break;
                    case 1:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!A0.K.b(w4.f69f)) {
                                if (!w4.f()) {
                                    int e10 = A0.K.e(w4.f69f);
                                    w4.p(e10, e10);
                                    break;
                                } else {
                                    int d9 = A0.K.d(w4.f69f);
                                    w4.p(d9, d9);
                                    break;
                                }
                            } else {
                                w4.l();
                                Unit unit2 = Unit.f7487a;
                                break;
                            }
                        }
                        break;
                    case 2:
                        A.j0 j0Var = w4.f68e;
                        j0Var.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!w4.f()) {
                                j0Var.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (e4 = w4.e()) != null) {
                                    int intValue = e4.intValue();
                                    w4.p(intValue, intValue);
                                    break;
                                }
                            } else {
                                j0Var.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (d4 = w4.d()) != null) {
                                    int intValue2 = d4.intValue();
                                    w4.p(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        A.j0 j0Var2 = w4.f68e;
                        j0Var2.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!w4.f()) {
                                j0Var2.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (d5 = w4.d()) != null) {
                                    int intValue3 = d5.intValue();
                                    w4.p(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                j0Var2.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (e5 = w4.e()) != null) {
                                    int intValue4 = e5.intValue();
                                    w4.p(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        w4.j();
                        break;
                    case 5:
                        w4.k();
                        break;
                    case 6:
                        w4.n();
                        break;
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        w4.m();
                        break;
                    case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!w4.f()) {
                                w4.m();
                                break;
                            } else {
                                w4.n();
                                break;
                            }
                        }
                        break;
                    case AbstractC1024c.f9242c /* 9 */:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (!w4.f()) {
                                w4.n();
                                break;
                            } else {
                                w4.m();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (w4.f70g.f328a.length() > 0 && (i5 = w4.f66c) != null) {
                            int g4 = w4.g(i5, -1);
                            w4.p(g4, g4);
                            break;
                        }
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (w4.f70g.f328a.length() > 0 && (i6 = w4.f66c) != null) {
                            int g5 = w4.g(i6, 1);
                            w4.p(g5, g5);
                            break;
                        }
                        break;
                    case 12:
                        if (w4.f70g.f328a.length() > 0 && (o0Var = w4.f72i) != null) {
                            int h4 = w4.h(o0Var, -1);
                            w4.p(h4, h4);
                            break;
                        }
                        break;
                    case 13:
                        if (w4.f70g.f328a.length() > 0 && (o0Var2 = w4.f72i) != null) {
                            int h5 = w4.h(o0Var2, 1);
                            w4.p(h5, h5);
                            break;
                        }
                        break;
                    case 14:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            w4.p(0, 0);
                            break;
                        }
                        break;
                    case AbstractC1024c.f9246g /* 15 */:
                        w4.f68e.f159a = null;
                        C0036g c0036g = w4.f70g;
                        if (c0036g.f328a.length() > 0) {
                            int length2 = c0036g.f328a.length();
                            w4.p(length2, length2);
                            break;
                        }
                        break;
                    case 16:
                        c0Var.f11140b.b(false);
                        break;
                    case 17:
                        c0Var.f11140b.l();
                        break;
                    case 18:
                        c0Var.f11140b.d();
                        break;
                    case 19:
                        List a4 = w4.a(C1265e.f11167m);
                        if (a4 != null) {
                            c0Var.a(a4);
                            break;
                        }
                        break;
                    case 20:
                        List a5 = w4.a(C1265e.f11168n);
                        if (a5 != null) {
                            c0Var.a(a5);
                            break;
                        }
                        break;
                    case 21:
                        List a6 = w4.a(C1265e.f11169o);
                        if (a6 != null) {
                            c0Var.a(a6);
                            break;
                        }
                        break;
                    case 22:
                        List a7 = w4.a(C1265e.f11170p);
                        if (a7 != null) {
                            c0Var.a(a7);
                            break;
                        }
                        break;
                    case 23:
                        List a8 = w4.a(C1265e.f11171q);
                        if (a8 != null) {
                            c0Var.a(a8);
                            break;
                        }
                        break;
                    case 24:
                        List a9 = w4.a(C1265e.f11172r);
                        if (a9 != null) {
                            c0Var.a(a9);
                            break;
                        }
                        break;
                    case 25:
                        w4.f68e.f159a = null;
                        C0036g c0036g2 = w4.f70g;
                        if (c0036g2.f328a.length() > 0) {
                            w4.p(0, c0036g2.f328a.length());
                            break;
                        }
                        break;
                    case 26:
                        w4.i();
                        w4.o();
                        break;
                    case 27:
                        w4.l();
                        w4.o();
                        break;
                    case 28:
                        if (w4.f70g.f328a.length() > 0 && (i7 = w4.f66c) != null) {
                            int g6 = w4.g(i7, -1);
                            w4.p(g6, g6);
                        }
                        w4.o();
                        break;
                    case 29:
                        if (w4.f70g.f328a.length() > 0 && (i8 = w4.f66c) != null) {
                            int g7 = w4.g(i8, 1);
                            w4.p(g7, g7);
                        }
                        w4.o();
                        break;
                    case 30:
                        if (w4.f70g.f328a.length() > 0 && (o0Var3 = w4.f72i) != null) {
                            int h6 = w4.h(o0Var3, -1);
                            w4.p(h6, h6);
                        }
                        w4.o();
                        break;
                    case 31:
                        if (w4.f70g.f328a.length() > 0 && (o0Var4 = w4.f72i) != null) {
                            int h7 = w4.h(o0Var4, 1);
                            w4.p(h7, h7);
                        }
                        w4.o();
                        break;
                    case 32:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            w4.p(0, 0);
                        }
                        w4.o();
                        break;
                    case 33:
                        w4.f68e.f159a = null;
                        C0036g c0036g3 = w4.f70g;
                        if (c0036g3.f328a.length() > 0) {
                            int length3 = c0036g3.f328a.length();
                            w4.p(length3, length3);
                        }
                        w4.o();
                        break;
                    case 34:
                        A.j0 j0Var3 = w4.f68e;
                        j0Var3.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (w4.f()) {
                                j0Var3.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (e6 = w4.e()) != null) {
                                    int intValue5 = e6.intValue();
                                    w4.p(intValue5, intValue5);
                                }
                            } else {
                                j0Var3.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (d6 = w4.d()) != null) {
                                    int intValue6 = d6.intValue();
                                    w4.p(intValue6, intValue6);
                                }
                            }
                        }
                        w4.o();
                        break;
                    case 35:
                        A.j0 j0Var4 = w4.f68e;
                        j0Var4.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (w4.f()) {
                                j0Var4.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (d7 = w4.d()) != null) {
                                    int intValue7 = d7.intValue();
                                    w4.p(intValue7, intValue7);
                                }
                            } else {
                                j0Var4.f159a = null;
                                if (w4.f70g.f328a.length() > 0 && (e7 = w4.e()) != null) {
                                    int intValue8 = e7.intValue();
                                    w4.p(intValue8, intValue8);
                                }
                            }
                        }
                        w4.o();
                        break;
                    case 36:
                        w4.j();
                        w4.o();
                        break;
                    case 37:
                        w4.k();
                        w4.o();
                        break;
                    case 38:
                        w4.n();
                        w4.o();
                        break;
                    case 39:
                        w4.m();
                        w4.o();
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (w4.f()) {
                                w4.n();
                            } else {
                                w4.m();
                            }
                        }
                        w4.o();
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            if (w4.f()) {
                                w4.m();
                            } else {
                                w4.n();
                            }
                        }
                        w4.o();
                        break;
                    case 42:
                        w4.f68e.f159a = null;
                        if (w4.f70g.f328a.length() > 0) {
                            long j5 = w4.f69f;
                            int i20 = A0.K.f300c;
                            int i21 = (int) (j5 & 4294967295L);
                            w4.p(i21, i21);
                            break;
                        }
                        break;
                    case 43:
                        if (!c0Var.f11143e) {
                            c0Var.a(C1440x.a(new C0237a("\n", 1)));
                            break;
                        } else {
                            c0Var.f11139a.f11074u.invoke(new G0.l(c0Var.f11150l));
                            break;
                        }
                    case 44:
                        if (!c0Var.f11143e) {
                            c0Var.a(C1440x.a(new C0237a("\t", 1)));
                            break;
                        } else {
                            ((M2.A) obj2).f3576d = false;
                            break;
                        }
                    case 45:
                        w.p0 p0Var = c0Var.f11146h;
                        if (p0Var != null) {
                            p0Var.a(G0.y.a(w4.f71h, w4.f70g, w4.f69f, 4));
                        }
                        w.p0 p0Var2 = c0Var.f11146h;
                        if (p0Var2 != null) {
                            l2.g gVar2 = p0Var2.f11313b;
                            if (gVar2 != null && (gVar = (l2.g) gVar2.f7976b) != null) {
                                p0Var2.f11313b = gVar;
                                p0Var2.f11315d -= ((G0.y) gVar2.f7977c).f3093a.f328a.length();
                                p0Var2.f11314c = new l2.g(p0Var2.f11314c, i9, (G0.y) gVar2.f7977c);
                                yVar2 = (G0.y) gVar.f7977c;
                            }
                            if (yVar2 != null) {
                                c0Var.f11149k.invoke(yVar2);
                                break;
                            }
                        }
                        break;
                    case 46:
                        w.p0 p0Var3 = c0Var.f11146h;
                        if (p0Var3 != null) {
                            l2.g gVar3 = p0Var3.f11314c;
                            if (gVar3 != null) {
                                p0Var3.f11314c = (l2.g) gVar3.f7976b;
                                G0.y yVar3 = (G0.y) gVar3.f7977c;
                                p0Var3.f11313b = new l2.g(p0Var3.f11313b, i9, yVar3);
                                p0Var3.f11315d = yVar3.f3093a.f328a.length() + p0Var3.f11315d;
                                yVar2 = (G0.y) gVar3.f7977c;
                            }
                            if (yVar2 != null) {
                                c0Var.f11149k.invoke(yVar2);
                                break;
                            }
                        }
                        break;
                }
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220r0(int i2, w.c0 c0Var, M2.A a4) {
        super(1);
        this.f2895d = 2;
        this.f2896e = i2;
        this.f2897i = c0Var;
        this.f2898j = a4;
    }
}
