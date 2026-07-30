package defpackage;

import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vf2 extends o81 implements Function1 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf2(wf2 wf2Var, int i, n12 n12Var) {
        super(1);
        this.o = wf2Var;
        this.n = i;
        this.p = n12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer d;
        Integer c;
        Integer c2;
        Integer d2;
        bw2 bw2Var;
        bw2 bw2Var2;
        cw2 cw2Var;
        cw2 cw2Var2;
        bw2 bw2Var3;
        bw2 bw2Var4;
        cw2 cw2Var3;
        cw2 cw2Var4;
        Integer c3;
        Integer d3;
        Integer d4;
        Integer c4;
        tt1 tt1Var;
        int i = this.m;
        Object obj2 = this.p;
        int i2 = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                wf2 wf2Var = (wf2) obj3;
                int i3 = -d.c(wf2Var.A.a.h(), 0, i2);
                boolean z = wf2Var.B;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                c31 c31Var = new c31((n12) obj2, i4, i3, 2);
                m12Var.m = true;
                c31Var.invoke(m12Var);
                m12Var.m = false;
                break;
            default:
                xu2 xu2Var = (xu2) obj;
                qu2 qu2Var = (qu2) obj3;
                int u = q40.u(i2);
                int i5 = 14;
                nv2 nv2Var = null;
                switch (u) {
                    case 0:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (!jw2.b(xu2Var.f)) {
                                boolean e = xu2Var.e();
                                long j = xu2Var.f;
                                if (!e) {
                                    int d5 = jw2.d(j);
                                    xu2Var.o(d5, d5);
                                    break;
                                } else {
                                    int e2 = jw2.e(j);
                                    xu2Var.o(e2, e2);
                                    break;
                                }
                            } else {
                                xu2Var.h();
                                Unit unit = Unit.a;
                                break;
                            }
                        }
                        break;
                    case 1:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (!jw2.b(xu2Var.f)) {
                                boolean e3 = xu2Var.e();
                                long j2 = xu2Var.f;
                                if (!e3) {
                                    int e4 = jw2.e(j2);
                                    xu2Var.o(e4, e4);
                                    break;
                                } else {
                                    int d6 = jw2.d(j2);
                                    xu2Var.o(d6, d6);
                                    break;
                                }
                            } else {
                                xu2Var.k();
                                Unit unit2 = Unit.a;
                                break;
                            }
                        }
                        break;
                    case 2:
                        iw2 iw2Var = xu2Var.e;
                        iw2Var.a = null;
                        yd ydVar = xu2Var.g;
                        String str = ydVar.n;
                        String str2 = ydVar.n;
                        if (str.length() > 0) {
                            if (!xu2Var.e()) {
                                iw2Var.a = null;
                                if (str2.length() > 0 && (d = xu2Var.d()) != null) {
                                    int intValue = d.intValue();
                                    xu2Var.o(intValue, intValue);
                                    break;
                                }
                            } else {
                                iw2Var.a = null;
                                if (str2.length() > 0 && (c = xu2Var.c()) != null) {
                                    int intValue2 = c.intValue();
                                    xu2Var.o(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        iw2 iw2Var2 = xu2Var.e;
                        iw2Var2.a = null;
                        yd ydVar2 = xu2Var.g;
                        String str3 = ydVar2.n;
                        String str4 = ydVar2.n;
                        if (str3.length() > 0) {
                            if (!xu2Var.e()) {
                                iw2Var2.a = null;
                                if (str4.length() > 0 && (c2 = xu2Var.c()) != null) {
                                    int intValue3 = c2.intValue();
                                    xu2Var.o(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                iw2Var2.a = null;
                                if (str4.length() > 0 && (d2 = xu2Var.d()) != null) {
                                    int intValue4 = d2.intValue();
                                    xu2Var.o(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        xu2Var.i();
                        break;
                    case 5:
                        xu2Var.j();
                        break;
                    case 6:
                        xu2Var.m();
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        xu2Var.l();
                        break;
                    case 8:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (!xu2Var.e()) {
                                xu2Var.l();
                                break;
                            } else {
                                xu2Var.m();
                                break;
                            }
                        }
                        break;
                    case 9:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (!xu2Var.e()) {
                                xu2Var.m();
                                break;
                            } else {
                                xu2Var.l();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (xu2Var.g.n.length() > 0 && (bw2Var = xu2Var.c) != null) {
                            int f = xu2Var.f(bw2Var, -1);
                            xu2Var.o(f, f);
                            break;
                        }
                        break;
                    case 11:
                        if (xu2Var.g.n.length() > 0 && (bw2Var2 = xu2Var.c) != null) {
                            int f2 = xu2Var.f(bw2Var2, 1);
                            xu2Var.o(f2, f2);
                            break;
                        }
                        break;
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                        if (xu2Var.g.n.length() > 0 && (cw2Var = xu2Var.i) != null) {
                            int g = xu2Var.g(cw2Var, -1);
                            xu2Var.o(g, g);
                            break;
                        }
                        break;
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        if (xu2Var.g.n.length() > 0 && (cw2Var2 = xu2Var.i) != null) {
                            int g2 = xu2Var.g(cw2Var2, 1);
                            xu2Var.o(g2, g2);
                            break;
                        }
                        break;
                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            xu2Var.o(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        xu2Var.e.a = null;
                        yd ydVar3 = xu2Var.g;
                        if (ydVar3.n.length() > 0) {
                            int length = ydVar3.n.length();
                            xu2Var.o(length, length);
                            break;
                        }
                        break;
                    case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                        qu2Var.b.b(false);
                        break;
                    case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                        qu2Var.b.l();
                        break;
                    case 18:
                        qu2Var.b.d();
                        break;
                    case 19:
                        List a = xu2Var.a(gs1.L);
                        if (a != null) {
                            qu2Var.a(a);
                            break;
                        }
                        break;
                    case 20:
                        List a2 = xu2Var.a(gs1.M);
                        if (a2 != null) {
                            qu2Var.a(a2);
                            break;
                        }
                        break;
                    case 21:
                        List a3 = xu2Var.a(gs1.N);
                        if (a3 != null) {
                            qu2Var.a(a3);
                            break;
                        }
                        break;
                    case 22:
                        List a4 = xu2Var.a(gs1.O);
                        if (a4 != null) {
                            qu2Var.a(a4);
                            break;
                        }
                        break;
                    case 23:
                        List a5 = xu2Var.a(gs1.P);
                        if (a5 != null) {
                            qu2Var.a(a5);
                            break;
                        }
                        break;
                    case 24:
                        List a6 = xu2Var.a(gs1.Q);
                        if (a6 != null) {
                            qu2Var.a(a6);
                            break;
                        }
                        break;
                    case Constants.MAX_TREE_DEPTH /* 25 */:
                        xu2Var.e.a = null;
                        yd ydVar4 = xu2Var.g;
                        if (ydVar4.n.length() > 0) {
                            xu2Var.o(0, ydVar4.n.length());
                            break;
                        }
                        break;
                    case 26:
                        xu2Var.h();
                        xu2Var.n();
                        break;
                    case 27:
                        xu2Var.k();
                        xu2Var.n();
                        break;
                    case 28:
                        if (xu2Var.g.n.length() > 0 && (bw2Var3 = xu2Var.c) != null) {
                            int f3 = xu2Var.f(bw2Var3, -1);
                            xu2Var.o(f3, f3);
                        }
                        xu2Var.n();
                        break;
                    case 29:
                        if (xu2Var.g.n.length() > 0 && (bw2Var4 = xu2Var.c) != null) {
                            int f4 = xu2Var.f(bw2Var4, 1);
                            xu2Var.o(f4, f4);
                        }
                        xu2Var.n();
                        break;
                    case 30:
                        if (xu2Var.g.n.length() > 0 && (cw2Var3 = xu2Var.i) != null) {
                            int g3 = xu2Var.g(cw2Var3, -1);
                            xu2Var.o(g3, g3);
                        }
                        xu2Var.n();
                        break;
                    case 31:
                        if (xu2Var.g.n.length() > 0 && (cw2Var4 = xu2Var.i) != null) {
                            int g4 = xu2Var.g(cw2Var4, 1);
                            xu2Var.o(g4, g4);
                        }
                        xu2Var.n();
                        break;
                    case 32:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            xu2Var.o(0, 0);
                        }
                        xu2Var.n();
                        break;
                    case 33:
                        xu2Var.e.a = null;
                        yd ydVar5 = xu2Var.g;
                        if (ydVar5.n.length() > 0) {
                            int length2 = ydVar5.n.length();
                            xu2Var.o(length2, length2);
                        }
                        xu2Var.n();
                        break;
                    case 34:
                        iw2 iw2Var3 = xu2Var.e;
                        iw2Var3.a = null;
                        yd ydVar6 = xu2Var.g;
                        String str5 = ydVar6.n;
                        String str6 = ydVar6.n;
                        if (str5.length() > 0) {
                            if (xu2Var.e()) {
                                iw2Var3.a = null;
                                if (str6.length() > 0 && (d3 = xu2Var.d()) != null) {
                                    int intValue5 = d3.intValue();
                                    xu2Var.o(intValue5, intValue5);
                                }
                            } else {
                                iw2Var3.a = null;
                                if (str6.length() > 0 && (c3 = xu2Var.c()) != null) {
                                    int intValue6 = c3.intValue();
                                    xu2Var.o(intValue6, intValue6);
                                }
                            }
                        }
                        xu2Var.n();
                        break;
                    case 35:
                        iw2 iw2Var4 = xu2Var.e;
                        iw2Var4.a = null;
                        yd ydVar7 = xu2Var.g;
                        String str7 = ydVar7.n;
                        String str8 = ydVar7.n;
                        if (str7.length() > 0) {
                            if (xu2Var.e()) {
                                iw2Var4.a = null;
                                if (str8.length() > 0 && (c4 = xu2Var.c()) != null) {
                                    int intValue7 = c4.intValue();
                                    xu2Var.o(intValue7, intValue7);
                                }
                            } else {
                                iw2Var4.a = null;
                                if (str8.length() > 0 && (d4 = xu2Var.d()) != null) {
                                    int intValue8 = d4.intValue();
                                    xu2Var.o(intValue8, intValue8);
                                }
                            }
                        }
                        xu2Var.n();
                        break;
                    case 36:
                        xu2Var.i();
                        xu2Var.n();
                        break;
                    case 37:
                        xu2Var.j();
                        xu2Var.n();
                        break;
                    case 38:
                        xu2Var.m();
                        xu2Var.n();
                        break;
                    case 39:
                        xu2Var.l();
                        xu2Var.n();
                        break;
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (xu2Var.e()) {
                                xu2Var.m();
                            } else {
                                xu2Var.l();
                            }
                        }
                        xu2Var.n();
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            if (xu2Var.e()) {
                                xu2Var.l();
                            } else {
                                xu2Var.m();
                            }
                        }
                        xu2Var.n();
                        break;
                    case 42:
                        xu2Var.e.a = null;
                        if (xu2Var.g.n.length() > 0) {
                            long j3 = xu2Var.f;
                            int i6 = jw2.c;
                            int i7 = (int) (j3 & 4294967295L);
                            xu2Var.o(i7, i7);
                            break;
                        }
                        break;
                    case 43:
                        if (!qu2Var.e) {
                            qu2Var.a(pv.c(new yw("\n", 1)));
                            break;
                        } else {
                            qu2Var.a.u.invoke(new b11(qu2Var.l));
                            break;
                        }
                    case 44:
                        if (!qu2Var.e) {
                            qu2Var.a(pv.c(new yw("\t", 1)));
                            break;
                        } else {
                            ((y72) obj2).m = false;
                            break;
                        }
                    case 45:
                        z13 z13Var = qu2Var.h;
                        if (z13Var != null) {
                            z13Var.a(nv2.a(xu2Var.h, xu2Var.g, xu2Var.f, 4));
                        }
                        z13 z13Var2 = qu2Var.h;
                        if (z13Var2 != null) {
                            tt1 tt1Var2 = z13Var2.a;
                            if (tt1Var2 != null && (tt1Var = (tt1) tt1Var2.n) != null) {
                                z13Var2.a = tt1Var;
                                z13Var2.c -= ((nv2) tt1Var2.o).a.n.length();
                                z13Var2.b = new tt1(i5, z13Var2.b, (nv2) tt1Var2.o);
                                nv2Var = (nv2) tt1Var.o;
                            }
                            if (nv2Var != null) {
                                qu2Var.k.invoke(nv2Var);
                                break;
                            }
                        }
                        break;
                    case 46:
                        z13 z13Var3 = qu2Var.h;
                        if (z13Var3 != null) {
                            tt1 tt1Var3 = z13Var3.b;
                            if (tt1Var3 != null) {
                                z13Var3.b = (tt1) tt1Var3.n;
                                nv2 nv2Var2 = (nv2) tt1Var3.o;
                                z13Var3.a = new tt1(i5, z13Var3.a, nv2Var2);
                                z13Var3.c = nv2Var2.a.n.length() + z13Var3.c;
                                nv2Var = (nv2) tt1Var3.o;
                            }
                            if (nv2Var != null) {
                                qu2Var.k.invoke(nv2Var);
                                break;
                            }
                        }
                        break;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf2(int i, qu2 qu2Var, y72 y72Var) {
        super(1);
        this.n = i;
        this.o = qu2Var;
        this.p = y72Var;
    }
}
