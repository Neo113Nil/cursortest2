package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3818j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(int i7, int i8, Object obj, Object obj2) {
        super(1);
        this.f3815g = i8;
        this.f3817i = obj;
        this.f3816h = i7;
        this.f3818j = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q6.c
    public final Object f(Object obj) {
        q qVar;
        d6.z zVar;
        q qVar2;
        d6.z zVar2;
        int i7;
        Integer d8;
        Integer c4;
        Integer c6;
        Integer d9;
        a2.h0 h0Var;
        a2.h0 h0Var2;
        w.z0 z0Var;
        w.z0 z0Var2;
        a2.h0 h0Var3;
        a2.h0 h0Var4;
        w.z0 z0Var3;
        w.z0 z0Var4;
        Integer c9;
        Integer d10;
        Integer d11;
        Integer c10;
        q5.g gVar;
        int i8 = this.f3815g;
        d6.z zVar3 = d6.z.f2639a;
        Object obj2 = this.f3818j;
        int i9 = this.f3816h;
        Object obj3 = this.f3817i;
        int i10 = 0;
        switch (i8) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar3 = (q) obj;
                i.u uVar = (i.u) obj2;
                p1 p1Var = (p1) obj3;
                if (p1Var.f3854e == i9 && r6.k.a(uVar, p1Var.f3855f) && (qVar3 instanceof u)) {
                    long[] jArr = uVar.f4798a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j8 = jArr[i11];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = i10;
                                while (i14 < i13) {
                                    if ((j8 & 255) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        Object obj4 = uVar.f4799b[i15];
                                        i7 = i12;
                                        boolean z8 = uVar.f4800c[i15] != i9;
                                        if (z8) {
                                            u uVar2 = (u) qVar3;
                                            qVar2 = qVar3;
                                            b6.c cVar = uVar2.f3934l;
                                            cVar.w(obj4, p1Var);
                                            zVar2 = zVar3;
                                            if (obj4 instanceof e0) {
                                                e0 e0Var = (e0) obj4;
                                                if (!((i.x) cVar.f1394g).b(e0Var)) {
                                                    uVar2.f3937o.x(e0Var);
                                                }
                                                i.x xVar = p1Var.f3856g;
                                                if (xVar != null) {
                                                    xVar.g(obj4);
                                                }
                                            }
                                        } else {
                                            qVar2 = qVar3;
                                            zVar2 = zVar3;
                                        }
                                        if (z8) {
                                            uVar.e(i15);
                                        }
                                    } else {
                                        qVar2 = qVar3;
                                        zVar2 = zVar3;
                                        i7 = i12;
                                    }
                                    j8 >>= i7;
                                    i14++;
                                    i12 = i7;
                                    qVar3 = qVar2;
                                    zVar3 = zVar2;
                                }
                                qVar = qVar3;
                                zVar = zVar3;
                                if (i13 != i12) {
                                    break;
                                }
                            } else {
                                qVar = qVar3;
                                zVar = zVar3;
                            }
                            if (i11 == length) {
                                break;
                            } else {
                                i11++;
                                qVar3 = qVar;
                                zVar3 = zVar;
                                i10 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                p1.m0 m0Var = (p1.m0) obj;
                m.h1 h1Var = (m.h1) obj3;
                int i16 = -v1.g.e(h1Var.f6171s.f6159a.e(), 0, i9);
                boolean z9 = h1Var.f6172t;
                int i17 = z9 ? 0 : i16;
                if (!z9) {
                    i16 = 0;
                }
                m0Var.f7059a = true;
                p1.m0.g(m0Var, (p1.n0) obj2, i17, i16);
                m0Var.f7059a = false;
                break;
            default:
                a0.t0 t0Var = (a0.t0) obj;
                w.q0 q0Var = (w.q0) obj3;
                int i18 = 14;
                g2.w wVar = null;
                switch (l.h.d(i9)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (!a2.j0.b(t0Var.f151f)) {
                                if (!t0Var.e()) {
                                    int d12 = a2.j0.d(t0Var.f151f);
                                    t0Var.o(d12, d12);
                                    break;
                                } else {
                                    int e9 = a2.j0.e(t0Var.f151f);
                                    t0Var.o(e9, e9);
                                    break;
                                }
                            } else {
                                t0Var.h();
                                break;
                            }
                        }
                        break;
                    case 1:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (!a2.j0.b(t0Var.f151f)) {
                                if (!t0Var.e()) {
                                    int e10 = a2.j0.e(t0Var.f151f);
                                    t0Var.o(e10, e10);
                                    break;
                                } else {
                                    int d13 = a2.j0.d(t0Var.f151f);
                                    t0Var.o(d13, d13);
                                    break;
                                }
                            } else {
                                t0Var.k();
                                break;
                            }
                        }
                        break;
                    case 2:
                        a0.f1 f1Var = t0Var.f150e;
                        f1Var.f64a = null;
                        a2.g gVar2 = t0Var.f152g;
                        String str = gVar2.f373f;
                        String str2 = gVar2.f373f;
                        if (str.length() > 0) {
                            if (!t0Var.e()) {
                                f1Var.f64a = null;
                                if (str2.length() > 0 && (d8 = t0Var.d()) != null) {
                                    int intValue = d8.intValue();
                                    t0Var.o(intValue, intValue);
                                    break;
                                }
                            } else {
                                f1Var.f64a = null;
                                if (str2.length() > 0 && (c4 = t0Var.c()) != null) {
                                    int intValue2 = c4.intValue();
                                    t0Var.o(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        a0.f1 f1Var2 = t0Var.f150e;
                        f1Var2.f64a = null;
                        a2.g gVar3 = t0Var.f152g;
                        String str3 = gVar3.f373f;
                        String str4 = gVar3.f373f;
                        if (str3.length() > 0) {
                            if (!t0Var.e()) {
                                f1Var2.f64a = null;
                                if (str4.length() > 0 && (c6 = t0Var.c()) != null) {
                                    int intValue3 = c6.intValue();
                                    t0Var.o(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                f1Var2.f64a = null;
                                if (str4.length() > 0 && (d9 = t0Var.d()) != null) {
                                    int intValue4 = d9.intValue();
                                    t0Var.o(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        t0Var.i();
                        break;
                    case 5:
                        t0Var.j();
                        break;
                    case 6:
                        t0Var.m();
                        break;
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        t0Var.l();
                        break;
                    case 8:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (!t0Var.e()) {
                                t0Var.l();
                                break;
                            } else {
                                t0Var.m();
                                break;
                            }
                        }
                        break;
                    case q.c.f7259c /* 9 */:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (!t0Var.e()) {
                                t0Var.m();
                                break;
                            } else {
                                t0Var.l();
                                break;
                            }
                        }
                        break;
                    case q.c.f7261e /* 10 */:
                        if (t0Var.f152g.f373f.length() > 0 && (h0Var = t0Var.f148c) != null) {
                            int f9 = t0Var.f(h0Var, -1);
                            t0Var.o(f9, f9);
                            break;
                        }
                        break;
                    case 11:
                        if (t0Var.f152g.f373f.length() > 0 && (h0Var2 = t0Var.f148c) != null) {
                            int f10 = t0Var.f(h0Var2, 1);
                            t0Var.o(f10, f10);
                            break;
                        }
                        break;
                    case 12:
                        if (t0Var.f152g.f373f.length() > 0 && (z0Var = t0Var.f154i) != null) {
                            int g9 = t0Var.g(z0Var, -1);
                            t0Var.o(g9, g9);
                            break;
                        }
                        break;
                    case 13:
                        if (t0Var.f152g.f373f.length() > 0 && (z0Var2 = t0Var.f154i) != null) {
                            int g10 = t0Var.g(z0Var2, 1);
                            t0Var.o(g10, g10);
                            break;
                        }
                        break;
                    case 14:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            t0Var.o(0, 0);
                            break;
                        }
                        break;
                    case q.c.f7263g /* 15 */:
                        t0Var.f150e.f64a = null;
                        a2.g gVar4 = t0Var.f152g;
                        if (gVar4.f373f.length() > 0) {
                            int length2 = gVar4.f373f.length();
                            t0Var.o(length2, length2);
                            break;
                        }
                        break;
                    case 16:
                        q0Var.f9389b.b(false);
                        break;
                    case 17:
                        q0Var.f9389b.l();
                        break;
                    case 18:
                        q0Var.f9389b.d();
                        break;
                    case 19:
                        List a3 = t0Var.a(w.e.f9213l);
                        if (a3 != null) {
                            q0Var.a(a3);
                            break;
                        }
                        break;
                    case 20:
                        List a9 = t0Var.a(w.e.f9214m);
                        if (a9 != null) {
                            q0Var.a(a9);
                            break;
                        }
                        break;
                    case 21:
                        List a10 = t0Var.a(w.e.f9215n);
                        if (a10 != null) {
                            q0Var.a(a10);
                            break;
                        }
                        break;
                    case 22:
                        List a11 = t0Var.a(w.e.f9216o);
                        if (a11 != null) {
                            q0Var.a(a11);
                            break;
                        }
                        break;
                    case 23:
                        List a12 = t0Var.a(w.e.f9217p);
                        if (a12 != null) {
                            q0Var.a(a12);
                            break;
                        }
                        break;
                    case 24:
                        List a13 = t0Var.a(w.e.f9218q);
                        if (a13 != null) {
                            q0Var.a(a13);
                            break;
                        }
                        break;
                    case 25:
                        t0Var.f150e.f64a = null;
                        a2.g gVar5 = t0Var.f152g;
                        if (gVar5.f373f.length() > 0) {
                            t0Var.o(0, gVar5.f373f.length());
                            break;
                        }
                        break;
                    case 26:
                        t0Var.h();
                        t0Var.n();
                        break;
                    case 27:
                        t0Var.k();
                        t0Var.n();
                        break;
                    case 28:
                        if (t0Var.f152g.f373f.length() > 0 && (h0Var3 = t0Var.f148c) != null) {
                            int f11 = t0Var.f(h0Var3, -1);
                            t0Var.o(f11, f11);
                        }
                        t0Var.n();
                        break;
                    case 29:
                        if (t0Var.f152g.f373f.length() > 0 && (h0Var4 = t0Var.f148c) != null) {
                            int f12 = t0Var.f(h0Var4, 1);
                            t0Var.o(f12, f12);
                        }
                        t0Var.n();
                        break;
                    case 30:
                        if (t0Var.f152g.f373f.length() > 0 && (z0Var3 = t0Var.f154i) != null) {
                            int g11 = t0Var.g(z0Var3, -1);
                            t0Var.o(g11, g11);
                        }
                        t0Var.n();
                        break;
                    case 31:
                        if (t0Var.f152g.f373f.length() > 0 && (z0Var4 = t0Var.f154i) != null) {
                            int g12 = t0Var.g(z0Var4, 1);
                            t0Var.o(g12, g12);
                        }
                        t0Var.n();
                        break;
                    case 32:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            t0Var.o(0, 0);
                        }
                        t0Var.n();
                        break;
                    case 33:
                        t0Var.f150e.f64a = null;
                        a2.g gVar6 = t0Var.f152g;
                        if (gVar6.f373f.length() > 0) {
                            int length3 = gVar6.f373f.length();
                            t0Var.o(length3, length3);
                        }
                        t0Var.n();
                        break;
                    case 34:
                        a0.f1 f1Var3 = t0Var.f150e;
                        f1Var3.f64a = null;
                        a2.g gVar7 = t0Var.f152g;
                        String str5 = gVar7.f373f;
                        String str6 = gVar7.f373f;
                        if (str5.length() > 0) {
                            if (t0Var.e()) {
                                f1Var3.f64a = null;
                                if (str6.length() > 0 && (d10 = t0Var.d()) != null) {
                                    int intValue5 = d10.intValue();
                                    t0Var.o(intValue5, intValue5);
                                }
                            } else {
                                f1Var3.f64a = null;
                                if (str6.length() > 0 && (c9 = t0Var.c()) != null) {
                                    int intValue6 = c9.intValue();
                                    t0Var.o(intValue6, intValue6);
                                }
                            }
                        }
                        t0Var.n();
                        break;
                    case 35:
                        a0.f1 f1Var4 = t0Var.f150e;
                        f1Var4.f64a = null;
                        a2.g gVar8 = t0Var.f152g;
                        String str7 = gVar8.f373f;
                        String str8 = gVar8.f373f;
                        if (str7.length() > 0) {
                            if (t0Var.e()) {
                                f1Var4.f64a = null;
                                if (str8.length() > 0 && (c10 = t0Var.c()) != null) {
                                    int intValue7 = c10.intValue();
                                    t0Var.o(intValue7, intValue7);
                                }
                            } else {
                                f1Var4.f64a = null;
                                if (str8.length() > 0 && (d11 = t0Var.d()) != null) {
                                    int intValue8 = d11.intValue();
                                    t0Var.o(intValue8, intValue8);
                                }
                            }
                        }
                        t0Var.n();
                        break;
                    case 36:
                        t0Var.i();
                        t0Var.n();
                        break;
                    case 37:
                        t0Var.j();
                        t0Var.n();
                        break;
                    case 38:
                        t0Var.m();
                        t0Var.n();
                        break;
                    case 39:
                        t0Var.l();
                        t0Var.n();
                        break;
                    case 40:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (t0Var.e()) {
                                t0Var.m();
                            } else {
                                t0Var.l();
                            }
                        }
                        t0Var.n();
                        break;
                    case 41:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            if (t0Var.e()) {
                                t0Var.l();
                            } else {
                                t0Var.m();
                            }
                        }
                        t0Var.n();
                        break;
                    case 42:
                        t0Var.f150e.f64a = null;
                        if (t0Var.f152g.f373f.length() > 0) {
                            long j9 = t0Var.f151f;
                            int i19 = a2.j0.f407c;
                            int i20 = (int) (j9 & 4294967295L);
                            t0Var.o(i20, i20);
                            break;
                        }
                        break;
                    case 43:
                        if (!q0Var.f9392e) {
                            q0Var.a(t6.a.F(new g2.a("\n", 1)));
                            break;
                        } else {
                            q0Var.f9388a.f9275u.f(new g2.l(q0Var.f9399l));
                            break;
                        }
                    case 44:
                        if (!q0Var.f9392e) {
                            q0Var.a(t6.a.F(new g2.a("\t", 1)));
                            break;
                        } else {
                            ((r6.r) obj2).f7964f = false;
                            break;
                        }
                    case 45:
                        w.a1 a1Var = q0Var.f9395h;
                        if (a1Var != null) {
                            a1Var.a(g2.w.a(t0Var.f153h, t0Var.f152g, t0Var.f151f, 4));
                        }
                        w.a1 a1Var2 = q0Var.f9395h;
                        if (a1Var2 != null) {
                            q5.g gVar9 = a1Var2.f9187a;
                            if (gVar9 != null && (gVar = (q5.g) gVar9.f7527g) != null) {
                                a1Var2.f9187a = gVar;
                                a1Var2.f9189c -= ((g2.w) gVar9.f7528h).f4065a.f373f.length();
                                a1Var2.f9188b = new q5.g(a1Var2.f9188b, i18, (g2.w) gVar9.f7528h);
                                wVar = (g2.w) gVar.f7528h;
                            }
                            if (wVar != null) {
                                q0Var.f9398k.f(wVar);
                                break;
                            }
                        }
                        break;
                    case 46:
                        w.a1 a1Var3 = q0Var.f9395h;
                        if (a1Var3 != null) {
                            q5.g gVar10 = a1Var3.f9188b;
                            if (gVar10 != null) {
                                a1Var3.f9188b = (q5.g) gVar10.f7527g;
                                g2.w wVar2 = (g2.w) gVar10.f7528h;
                                a1Var3.f9187a = new q5.g(a1Var3.f9187a, i18, wVar2);
                                a1Var3.f9189c = wVar2.f4065a.f373f.length() + a1Var3.f9189c;
                                wVar = (g2.w) gVar10.f7528h;
                            }
                            if (wVar != null) {
                                q0Var.f9398k.f(wVar);
                                break;
                            }
                        }
                        break;
                }
        }
        return zVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i7, w.q0 q0Var, r6.r rVar) {
        super(1);
        this.f3815g = 2;
        this.f3816h = i7;
        this.f3817i = q0Var;
        this.f3818j = rVar;
    }
}
