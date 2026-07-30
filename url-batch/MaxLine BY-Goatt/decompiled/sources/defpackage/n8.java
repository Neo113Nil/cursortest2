package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n8 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(y20 y20Var, ih2 ih2Var) {
        super(2);
        this.m = 7;
        this.n = y20Var;
        this.o = ih2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        hc2 hc2Var = hc2.a;
        int i2 = 6;
        nj njVar = sz.a;
        sl1 sl1Var = sl1.a;
        int i3 = 0;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((t7) obj4, (Function2) obj3, (a00) obj, s03.R(1));
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                ai2 ai2Var = (ai2) obj2;
                v8 v8Var = (v8) obj3;
                if (!((bi2) obj4).b.b(ai2Var.g)) {
                    v8Var.k(intValue, ai2Var);
                    v8Var.t.d(Unit.a);
                }
                break;
            case 2:
                a00 a00Var = (a00) obj;
                int intValue2 = ((Number) obj2).intValue();
                m32 m32Var = (m32) obj4;
                if (a00Var.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object M = a00Var.M();
                    if (M == njVar) {
                        M = o3.w;
                        a00Var.i0(M);
                    }
                    vl1 a = wh2.a(sl1Var, (Function1) M);
                    boolean h = a00Var.h(m32Var);
                    Object M2 = a00Var.M();
                    if (h || M2 == njVar) {
                        M2 = new ya(m32Var, 1);
                        a00Var.i0(M2);
                    }
                    vl1 e = a.e(a, (Function1) M2);
                    float f = m32Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        e = androidx.compose.ui.graphics.a.c(e, f, null, 520187);
                    }
                    Function2 function2 = (Function2) ((zn1) obj3).getValue();
                    Object M3 = a00Var.M();
                    if (M3 == njVar) {
                        M3 = k9.c;
                        a00Var.i0(M3);
                    }
                    oj1 oj1Var = (oj1) M3;
                    int hashCode = Long.hashCode(a00Var.T);
                    v02 l = a00Var.l();
                    vl1 E = bd3.E(a00Var, e);
                    pz.b.getClass();
                    o00 o00Var = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                        a00Var.k(o00Var);
                    } else {
                        a00Var.l0();
                    }
                    uj2.e(a00Var, oj1Var, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(hashCode))) {
                        q40.r(hashCode, a00Var, hashCode, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    function2.invoke(a00Var, 0);
                    a00Var.q(true);
                } else {
                    a00Var.S();
                }
                break;
            case 3:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    vl1 g = androidx.compose.foundation.layout.a.g(b.a(sl1Var, uq.b, uq.c), (yx1) obj4);
                    my myVar = (my) obj3;
                    fc2 a2 = ec2.a(s93.d, qb2.z, a00Var2, 54);
                    int D = iv1.D(a00Var2);
                    v02 l2 = a00Var2.l();
                    vl1 E2 = bd3.E(a00Var2, g);
                    pz.b.getClass();
                    o00 o00Var2 = oz.b;
                    a00Var2.b0();
                    if (a00Var2.S) {
                        a00Var2.k(o00Var2);
                    } else {
                        a00Var2.l0();
                    }
                    uj2.e(a00Var2, a2, oz.f);
                    uj2.e(a00Var2, l2, oz.e);
                    sc scVar2 = oz.g;
                    if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var2, D, scVar2);
                    }
                    uj2.e(a00Var2, E2, oz.d);
                    myVar.a(hc2Var, a00Var2, 6);
                    a00Var2.q(true);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                j8.a(s03.R(7), (a00) obj, (vl1) obj4, (Function1) obj3);
                break;
            case 5:
                ((Number) obj2).intValue();
                ((b30) obj4).a((y20) obj3, (a00) obj, s03.R(1));
                break;
            case 6:
                ((Number) obj2).intValue();
                k30.a((y20) obj4, (my) obj3, (a00) obj, s03.R(385));
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                a00 a00Var3 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var3.B()) {
                    a00Var3.S();
                } else {
                    y20 y20Var = (y20) obj4;
                    k30.a(y20Var, yj1.H(1156688164, new j30(i3, (ih2) obj3, y20Var), a00Var3), a00Var3, 384);
                }
                break;
            case 8:
                a00 a00Var4 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var4.B()) {
                    a00Var4.S();
                } else {
                    ((za0) obj4).w.a((cp1) obj3, a00Var4, 0);
                }
                break;
            case 9:
                ((Number) obj2).intValue();
                yk3.j((List) obj4, (Collection) obj3, (a00) obj, s03.R(1));
                break;
            case 10:
                long j = ((au1) obj2).a;
                ph2.c((i43) obj4, (t22) obj);
                lq lqVar = ((tf2) obj3).G;
                if (lqVar != null) {
                    lqVar.d(new xc0(j));
                }
                break;
            case 11:
                a00 a00Var5 = (a00) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (a00Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Boolean bool = (Boolean) ((o91) obj4).f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function22 = (Function2) obj3;
                    a00Var5.a0(bool);
                    boolean g2 = a00Var5.g(booleanValue);
                    if (booleanValue) {
                        function22.invoke(a00Var5, 0);
                    } else {
                        a00Var5.n(g2);
                    }
                    a00Var5.t();
                } else {
                    a00Var5.S();
                }
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                a00 a00Var6 = (a00) obj;
                kb1 kb1Var = (kb1) obj4;
                jb1 jb1Var = (jb1) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var6.B()) {
                    a00Var6.S();
                } else {
                    mb1 mb1Var = (mb1) kb1Var.b.invoke();
                    int i4 = jb1Var.c;
                    Object obj5 = jb1Var.a;
                    if ((i4 >= mb1Var.b() || !mb1Var.d(i4).equals(obj5)) && (i4 = mb1Var.a(obj5)) != -1) {
                        jb1Var.c = i4;
                    }
                    int i5 = i4;
                    boolean z = i5 != -1;
                    a00Var6.a0(Boolean.valueOf(z));
                    boolean g3 = a00Var6.g(z);
                    a00Var6.X(-869707859);
                    if (z) {
                        a00Var6.X(-2120139493);
                        s93.t(mb1Var, kb1Var.a, i5, jb1Var.a, a00Var6, 0);
                        a00Var6.q(false);
                    } else {
                        a00Var6.n(g3);
                    }
                    a00Var6.q(false);
                    a00Var6.t();
                    boolean h2 = a00Var6.h(jb1Var);
                    Object M4 = a00Var6.M();
                    if (h2 || M4 == njVar) {
                        M4 = new j6(22, jb1Var);
                        a00Var6.i0(M4);
                    }
                    l41.f(obj5, (Function1) M4, a00Var6);
                }
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                a00 a00Var7 = (a00) obj;
                gc1 gc1Var = (gc1) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var7.B()) {
                    a00Var7.S();
                } else {
                    gc1Var.n.setValue(ll3.S(a00Var7));
                    ((my) obj3).a(gc1Var, a00Var7, 0);
                }
                break;
            case 15:
                a00 a00Var8 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var8.B()) {
                    a00Var8.S();
                } else {
                    yv2.a(((l13) obj4).j, (my) obj3, a00Var8, 0);
                }
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                a00 a00Var9 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var9.B()) {
                    a00Var9.S();
                } else {
                    tk3.s((jd2) obj4, (my) obj3, a00Var9, 0);
                }
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                a00 a00Var10 = (a00) obj;
                cp1 cp1Var = (cp1) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var10.B()) {
                    a00Var10.S();
                } else {
                    op1 op1Var = cp1Var.n;
                    op1Var.getClass();
                    ((dz) op1Var).v.b((vc) obj3, cp1Var, a00Var10, 0);
                }
                break;
            case 18:
                a00 a00Var11 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var11.B()) {
                    a00Var11.S();
                } else {
                    vl1 c = b.c(sl1Var, 1.0f);
                    u52 u52Var = j83.a;
                    vl1 a3 = wh2.a(b.a(bd3.n(c, new mc(i2, (z63) obj4)), Float.NaN, 80.0f), gs1.F);
                    my myVar2 = (my) obj3;
                    fc2 a4 = ec2.a(new yh(8.0f, true, sc.o), qb2.z, a00Var11, 54);
                    int D2 = iv1.D(a00Var11);
                    v02 l3 = a00Var11.l();
                    vl1 E3 = bd3.E(a00Var11, a3);
                    pz.b.getClass();
                    o00 o00Var3 = oz.b;
                    a00Var11.b0();
                    if (a00Var11.S) {
                        a00Var11.k(o00Var3);
                    } else {
                        a00Var11.l0();
                    }
                    uj2.e(a00Var11, a4, oz.f);
                    uj2.e(a00Var11, l3, oz.e);
                    sc scVar3 = oz.g;
                    if (a00Var11.S || !Intrinsics.b(a00Var11.M(), Integer.valueOf(D2))) {
                        q40.r(D2, a00Var11, D2, scVar3);
                    }
                    uj2.e(a00Var11, E3, oz.d);
                    myVar2.a(hc2Var, a00Var11, 6);
                    a00Var11.q(true);
                }
                break;
            case 19:
                a00 a00Var12 = (a00) obj;
                so2 so2Var = (so2) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var12.B()) {
                    a00Var12.S();
                } else {
                    vl1 c2 = a.c(sl1Var, "indicator");
                    boolean f2 = a00Var12.f(so2Var);
                    Object M5 = a00Var12.M();
                    if (f2 || M5 == njVar) {
                        M5 = new lq1(so2Var, 0);
                        a00Var12.i0(M5);
                    }
                    fp.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(c2, (Function1) M5), ((jq1) obj3).c, kk2.a(5, a00Var12)), a00Var12, 0);
                }
                break;
            case 20:
                ls lsVar = (ls) obj;
                dw0 dw0Var = (dw0) obj2;
                ks1 ks1Var = (ks1) obj4;
                i91 i91Var = ks1Var.A;
                if (i91Var.J()) {
                    ks1Var.Q = lsVar;
                    ks1Var.P = dw0Var;
                    tx1 snapshotObserver = ((t7) l91.a(i91Var)).getSnapshotObserver();
                    ia2 ia2Var = ks1.V;
                    snapshotObserver.a(ks1Var, bl0.Q, (hs1) obj3);
                    ks1Var.T = false;
                } else {
                    ks1Var.T = true;
                }
                break;
            case 21:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                z72 z72Var = (z72) obj4;
                z72Var.m += ((ff2) obj3).a(floatValue - z72Var.m);
                break;
            case 22:
                ((Number) obj2).intValue();
                j8.e((vl1) obj4, (Function2) obj3, (a00) obj, s03.R(1));
                break;
            default:
                ((Number) obj2).intValue();
                yv2.a((pw2) obj4, (my) obj3, (a00) obj, s03.R(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(int i, Object obj, Object obj2) {
        super(2);
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.m = i2;
        this.n = obj;
        this.o = obj2;
    }
}
