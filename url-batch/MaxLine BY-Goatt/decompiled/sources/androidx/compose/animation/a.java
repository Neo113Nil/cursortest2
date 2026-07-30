package androidx.compose.animation;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import defpackage.a00;
import defpackage.ad;
import defpackage.ai0;
import defpackage.ao1;
import defpackage.ap;
import defpackage.bd;
import defpackage.bd3;
import defpackage.bn2;
import defpackage.bz2;
import defpackage.ed;
import defpackage.fk0;
import defpackage.fz2;
import defpackage.gd;
import defpackage.gz2;
import defpackage.ih2;
import defpackage.ij2;
import defpackage.iv1;
import defpackage.jz2;
import defpackage.k03;
import defpackage.l41;
import defpackage.lz1;
import defpackage.my;
import defpackage.n72;
import defpackage.o00;
import defpackage.o30;
import defpackage.oz;
import defpackage.pz;
import defpackage.q40;
import defpackage.rp3;
import defpackage.sc;
import defpackage.sl1;
import defpackage.sz;
import defpackage.th0;
import defpackage.uh0;
import defpackage.uj0;
import defpackage.uj2;
import defpackage.v02;
import defpackage.v33;
import defpackage.vl1;
import defpackage.wh0;
import defpackage.xh0;
import defpackage.y91;
import defpackage.zn1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:120:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(fz2 fz2Var, Function1 function1, vl1 vl1Var, ai0 ai0Var, uj0 uj0Var, Function2 function2, my myVar, a00 a00Var, int i) {
        rp3 rp3Var;
        ai0 ai0Var2;
        boolean f;
        Object M;
        uj0 uj0Var2;
        gz2 gz2Var;
        gz2 gz2Var2;
        boolean z;
        bz2 bz2Var;
        boolean h;
        Object M2;
        ai0 ai0Var3;
        uj0 uj0Var3;
        boolean g;
        Object M3;
        boolean z2;
        Object M4;
        int D;
        my myVar2;
        boolean z3;
        n72 s;
        a00Var.Z(-891967166);
        int i2 = i | (a00Var.f(fz2Var) ? 4 : 2) | (a00Var.h(function1) ? 32 : 16) | (a00Var.f(vl1Var) ? 256 : 128) | (a00Var.f(ai0Var) ? 2048 : 1024) | (a00Var.f(uj0Var) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (a00Var.h(function2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) | 1572864;
        if ((4793491 & i2) == 4793490 && a00Var.B()) {
            a00Var.S();
        } else {
            lz1 lz1Var = fz2Var.d;
            rp3 rp3Var2 = fz2Var.a;
            if (((Boolean) function1.invoke(lz1Var.getValue())).booleanValue() || ((Boolean) function1.invoke(rp3Var2.j())).booleanValue() || fz2Var.g() || fz2Var.d()) {
                a00Var.X(1787977937);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z4 = ((i5 ^ 6) > 4 && a00Var.f(fz2Var)) || (i4 & 6) == 4;
                Object M5 = a00Var.M();
                Object obj = sz.a;
                if (z4 || M5 == obj) {
                    M5 = rp3Var2.j();
                    a00Var.i0(M5);
                }
                if (fz2Var.g()) {
                    M5 = rp3Var2.j();
                }
                a00Var.X(-466616829);
                th0 b = b(fz2Var, function1, M5, a00Var);
                a00Var.q(false);
                Object value = fz2Var.d.getValue();
                a00Var.X(-466616829);
                th0 b2 = b(fz2Var, function1, value, a00Var);
                a00Var.q(false);
                int i6 = i5 | 3072;
                y91 y91Var = jz2.a;
                int i7 = (i6 & 14) ^ 6;
                boolean z5 = (i7 > 4 && a00Var.f(fz2Var)) || (i6 & 6) == 4;
                Object M6 = a00Var.M();
                if (z5 || M6 == obj) {
                    M6 = new fz2(new ao1(b), fz2Var, fz2Var.c.concat(" > EnterExitTransition"));
                    a00Var.i0(M6);
                }
                fz2 fz2Var2 = (fz2) M6;
                boolean f2 = ((i7 > 4 && a00Var.f(fz2Var)) || (i6 & 6) == 4) | a00Var.f(fz2Var2);
                Object M7 = a00Var.M();
                if (f2 || M7 == obj) {
                    M7 = new ih2(9, fz2Var, fz2Var2);
                    a00Var.i0(M7);
                }
                l41.f(fz2Var2, (Function1) M7, a00Var);
                if (fz2Var.g()) {
                    fz2Var2.l(b, b2);
                } else {
                    fz2Var2.q(b2);
                    fz2Var2.k.setValue(Boolean.FALSE);
                }
                Object k = ij2.k(function2, a00Var);
                rp3 rp3Var3 = fz2Var2.a;
                rp3 rp3Var4 = fz2Var2.a;
                lz1 lz1Var2 = fz2Var2.d;
                Object invoke = function2.invoke(rp3Var3.j(), lz1Var2.getValue());
                boolean f3 = a00Var.f(fz2Var2) | a00Var.f(k);
                Object M8 = a00Var.M();
                if (f3 || M8 == obj) {
                    M8 = new ed(fz2Var2, k, (o30) null, 0);
                    a00Var.i0(M8);
                }
                Function2 function22 = (Function2) M8;
                Object M9 = a00Var.M();
                if (M9 == obj) {
                    M9 = ij2.j(invoke);
                    a00Var.i0(M9);
                }
                zn1 zn1Var = (zn1) M9;
                Unit unit = Unit.a;
                boolean h2 = a00Var.h(function22);
                Object M10 = a00Var.M();
                if (h2 || M10 == obj) {
                    M10 = new bn2(function22, zn1Var, null, 0);
                    a00Var.i0(M10);
                }
                l41.h(a00Var, unit, (Function2) M10);
                Object j = rp3Var4.j();
                th0 th0Var = th0.o;
                if (j == th0Var && lz1Var2.getValue() == th0Var && ((Boolean) zn1Var.getValue()).booleanValue()) {
                    a00Var.X(1790256282);
                    z3 = false;
                    a00Var.q(false);
                    myVar2 = myVar;
                } else {
                    a00Var.X(1788869559);
                    boolean z6 = i3 == 4;
                    Object M11 = a00Var.M();
                    if (z6 || M11 == obj) {
                        M11 = new gd();
                        a00Var.i0(M11);
                    }
                    gd gdVar = (gd) M11;
                    k03 k03Var = xh0.a;
                    o00 o00Var = o00.w;
                    boolean f4 = a00Var.f(fz2Var2);
                    Object M12 = a00Var.M();
                    if (f4 || M12 == obj) {
                        M12 = ij2.j(ai0Var);
                        a00Var.i0(M12);
                    }
                    zn1 zn1Var2 = (zn1) M12;
                    Object j2 = rp3Var4.j();
                    Object value2 = lz1Var2.getValue();
                    th0 th0Var2 = th0.n;
                    if (j2 == value2 && rp3Var4.j() == th0Var2) {
                        if (fz2Var2.g()) {
                            zn1Var2.setValue(ai0Var);
                        } else {
                            zn1Var2.setValue(ai0.b);
                        }
                    } else if (lz1Var2.getValue() == th0Var2) {
                        gz2 gz2Var3 = ((ai0) zn1Var2.getValue()).a;
                        gz2 gz2Var4 = ai0Var.a;
                        fk0 fk0Var = gz2Var4.a;
                        if (fk0Var == null) {
                            fk0Var = gz2Var3.a;
                        }
                        Map map = gz2Var3.c;
                        Map map2 = gz2Var4.c;
                        map.getClass();
                        map2.getClass();
                        rp3Var = rp3Var4;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(map2);
                        zn1Var2.setValue(new ai0(new gz2(fk0Var, (ap) null, linkedHashMap, 16)));
                        ai0Var2 = (ai0) zn1Var2.getValue();
                        f = a00Var.f(fz2Var2);
                        M = a00Var.M();
                        if (!f || M == obj) {
                            M = ij2.j(uj0Var);
                            a00Var.i0(M);
                        }
                        zn1 zn1Var3 = (zn1) M;
                        if (rp3Var.j() == lz1Var2.getValue() || rp3Var.j() != th0Var2) {
                            if (lz1Var2.getValue() != th0Var2) {
                                gz2 gz2Var5 = ((uj0) zn1Var3.getValue()).a;
                                gz2 gz2Var6 = uj0Var.a;
                                fk0 fk0Var2 = gz2Var6.a;
                                if (fk0Var2 == null) {
                                    fk0Var2 = gz2Var5.a;
                                }
                                boolean z7 = gz2Var6.b || gz2Var5.b;
                                Map map3 = gz2Var5.c;
                                Map map4 = gz2Var6.c;
                                map3.getClass();
                                map4.getClass();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                linkedHashMap2.putAll(map4);
                                zn1Var3.setValue(new uj0(new gz2(fk0Var2, (ap) null, z7, linkedHashMap2)));
                            }
                        } else if (fz2Var2.g()) {
                            zn1Var3.setValue(uj0Var);
                        } else {
                            zn1Var3.setValue(uj0.b);
                        }
                        uj0Var2 = (uj0) zn1Var3.getValue();
                        gz2Var = ai0Var2.a;
                        gz2Var2 = uj0Var2.a;
                        a00Var.X(-821278096);
                        a00Var.q(false);
                        a00Var.X(-821099041);
                        a00Var.q(false);
                        a00Var.X(-820883777);
                        a00Var.q(false);
                        if (gz2Var.a == null || gz2Var2.a != null) {
                            z = false;
                            a00Var.X(-675252433);
                            a00Var.q(false);
                            bz2Var = null;
                        } else {
                            a00Var.X(-675389204);
                            k03 k03Var2 = v33.a;
                            Object M13 = a00Var.M();
                            if (M13 == obj) {
                                M13 = "Built-in alpha";
                                a00Var.i0("Built-in alpha");
                            }
                            bz2Var = jz2.a(fz2Var2, k03Var2, (String) M13, a00Var, 384, 0);
                            z = false;
                            a00Var.q(false);
                        }
                        a00Var.X(-675057009);
                        a00Var.q(z);
                        a00Var.X(-674835793);
                        a00Var.q(z);
                        h = a00Var.h(bz2Var) | a00Var.f(ai0Var2) | a00Var.f(uj0Var2) | a00Var.h(null) | a00Var.f(fz2Var2) | a00Var.h(null);
                        M2 = a00Var.M();
                        if (!h || M2 == obj) {
                            ai0Var3 = ai0Var2;
                            M2 = new uh0(bz2Var, null, fz2Var2, ai0Var3, uj0Var2, null);
                            uj0Var3 = uj0Var2;
                            a00Var.i0(M2);
                        } else {
                            ai0Var3 = ai0Var2;
                            uj0Var3 = uj0Var2;
                        }
                        uh0 uh0Var = (uh0) M2;
                        g = a00Var.g(true) | a00Var.f(o00Var);
                        M3 = a00Var.M();
                        if (!g || M3 == obj) {
                            z2 = false;
                            M3 = new wh0(true, o00Var, 0);
                            a00Var.i0(M3);
                        } else {
                            z2 = false;
                        }
                        sl1 sl1Var = sl1.a;
                        vl1 k2 = androidx.compose.ui.graphics.a.a(sl1Var, (Function1) M3).k(new EnterExitTransitionElement(fz2Var2, ai0Var3, uj0Var3, o00Var, uh0Var));
                        a00Var.X(1581766416);
                        a00Var.q(z2);
                        vl1 k3 = vl1Var.k(k2.k(sl1Var));
                        M4 = a00Var.M();
                        if (M4 == obj) {
                            M4 = new ad(gdVar);
                            a00Var.i0(M4);
                        }
                        ad adVar = (ad) M4;
                        D = iv1.D(a00Var);
                        v02 l = a00Var.l();
                        vl1 E = bd3.E(a00Var, k3);
                        pz.b.getClass();
                        Function0 function0 = oz.b;
                        a00Var.b0();
                        if (a00Var.S) {
                            a00Var.l0();
                        } else {
                            a00Var.k(function0);
                        }
                        uj2.e(a00Var, adVar, oz.f);
                        uj2.e(a00Var, l, oz.e);
                        sc scVar = oz.g;
                        if (!a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                            q40.r(D, a00Var, D, scVar);
                        }
                        uj2.e(a00Var, E, oz.d);
                        myVar2 = myVar;
                        myVar2.a(gdVar, a00Var, 48);
                        a00Var.q(true);
                        z3 = false;
                        a00Var.q(false);
                    }
                    rp3Var = rp3Var4;
                    ai0Var2 = (ai0) zn1Var2.getValue();
                    f = a00Var.f(fz2Var2);
                    M = a00Var.M();
                    if (!f) {
                    }
                    M = ij2.j(uj0Var);
                    a00Var.i0(M);
                    zn1 zn1Var32 = (zn1) M;
                    if (rp3Var.j() == lz1Var2.getValue()) {
                    }
                    if (lz1Var2.getValue() != th0Var2) {
                    }
                    uj0Var2 = (uj0) zn1Var32.getValue();
                    gz2Var = ai0Var2.a;
                    gz2Var2 = uj0Var2.a;
                    a00Var.X(-821278096);
                    a00Var.q(false);
                    a00Var.X(-821099041);
                    a00Var.q(false);
                    a00Var.X(-820883777);
                    a00Var.q(false);
                    if (gz2Var.a == null || gz2Var2.a != null) {
                    }
                    a00Var.X(-675057009);
                    a00Var.q(z);
                    a00Var.X(-674835793);
                    a00Var.q(z);
                    h = a00Var.h(bz2Var) | a00Var.f(ai0Var2) | a00Var.f(uj0Var2) | a00Var.h(null) | a00Var.f(fz2Var2) | a00Var.h(null);
                    M2 = a00Var.M();
                    if (h) {
                    }
                    ai0Var3 = ai0Var2;
                    M2 = new uh0(bz2Var, null, fz2Var2, ai0Var3, uj0Var2, null);
                    uj0Var3 = uj0Var2;
                    a00Var.i0(M2);
                    uh0 uh0Var2 = (uh0) M2;
                    g = a00Var.g(true) | a00Var.f(o00Var);
                    M3 = a00Var.M();
                    if (g) {
                    }
                    z2 = false;
                    M3 = new wh0(true, o00Var, 0);
                    a00Var.i0(M3);
                    sl1 sl1Var2 = sl1.a;
                    vl1 k22 = androidx.compose.ui.graphics.a.a(sl1Var2, (Function1) M3).k(new EnterExitTransitionElement(fz2Var2, ai0Var3, uj0Var3, o00Var, uh0Var2));
                    a00Var.X(1581766416);
                    a00Var.q(z2);
                    vl1 k32 = vl1Var.k(k22.k(sl1Var2));
                    M4 = a00Var.M();
                    if (M4 == obj) {
                    }
                    ad adVar2 = (ad) M4;
                    D = iv1.D(a00Var);
                    v02 l2 = a00Var.l();
                    vl1 E2 = bd3.E(a00Var, k32);
                    pz.b.getClass();
                    Function0 function02 = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                    }
                    uj2.e(a00Var, adVar2, oz.f);
                    uj2.e(a00Var, l2, oz.e);
                    sc scVar2 = oz.g;
                    if (!a00Var.S) {
                    }
                    q40.r(D, a00Var, D, scVar2);
                    uj2.e(a00Var, E2, oz.d);
                    myVar2 = myVar;
                    myVar2.a(gdVar, a00Var, 48);
                    a00Var.q(true);
                    z3 = false;
                    a00Var.q(false);
                }
                a00Var.q(z3);
                s = a00Var.s();
                if (s == null) {
                    s.d = new bd(fz2Var, function1, vl1Var, ai0Var, uj0Var, function2, myVar2, i);
                    return;
                }
                return;
            }
            a00Var.X(1790262234);
            a00Var.q(false);
        }
        myVar2 = myVar;
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final th0 b(fz2 fz2Var, Function1 function1, Object obj, a00 a00Var) {
        a00Var.T(-902048200, 0, fz2Var, null);
        boolean g = fz2Var.g();
        rp3 rp3Var = fz2Var.a;
        th0 th0Var = th0.m;
        th0 th0Var2 = th0.o;
        th0 th0Var3 = th0.n;
        if (g) {
            a00Var.X(2101296683);
            a00Var.q(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                th0Var = th0Var3;
            } else if (((Boolean) function1.invoke(rp3Var.j())).booleanValue()) {
                th0Var = th0Var2;
            }
        } else {
            a00Var.X(2101530516);
            Object M = a00Var.M();
            if (M == sz.a) {
                M = ij2.j(Boolean.FALSE);
                a00Var.i0(M);
            }
            zn1 zn1Var = (zn1) M;
            if (((Boolean) function1.invoke(rp3Var.j())).booleanValue()) {
                zn1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                th0Var = th0Var3;
            } else if (((Boolean) zn1Var.getValue()).booleanValue()) {
                th0Var = th0Var2;
            }
            a00Var.q(false);
        }
        a00Var.q(false);
        return th0Var;
    }
}
