package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ek implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ek(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0441  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        Pair pair;
        o30 o30Var;
        so2 h13Var;
        Object invoke;
        Object obj2;
        Typeface a;
        Object obj3;
        switch (this.m) {
            case 0:
                hk hkVar = (hk) this.n;
                jk jkVar = (jk) this.o;
                nc2 nc2Var = (nc2) obj;
                nc2Var.getClass();
                uc2 M = nc2Var.M("SELECT * FROM atlas_entry WHERE kind = ? ORDER BY nameEn");
                try {
                    u30 u30Var = hkVar.c;
                    jkVar.getClass();
                    M.w(1, jkVar.name());
                    int t = bd3.t(M, "slug");
                    int t2 = bd3.t(M, "kind");
                    int t3 = bd3.t(M, "nameRu");
                    int t4 = bd3.t(M, "nameEn");
                    int t5 = bd3.t(M, "formula");
                    int t6 = bd3.t(M, "colorRu");
                    int t7 = bd3.t(M, "colorEn");
                    int t8 = bd3.t(M, "mohsMin");
                    int t9 = bd3.t(M, "mohsMax");
                    int t10 = bd3.t(M, "lustreRu");
                    int t11 = bd3.t(M, "lustreEn");
                    int t12 = bd3.t(M, "originRu");
                    int t13 = bd3.t(M, "originEn");
                    int t14 = bd3.t(M, "symbolismRu");
                    int t15 = bd3.t(M, "symbolismEn");
                    int t16 = bd3.t(M, "careRu");
                    int t17 = bd3.t(M, "careEn");
                    int t18 = bd3.t(M, "factsRu");
                    int t19 = bd3.t(M, "factsEn");
                    int t20 = bd3.t(M, "birthMonth");
                    int t21 = bd3.t(M, "zodiac");
                    int t22 = bd3.t(M, "sources");
                    ArrayList arrayList = new ArrayList();
                    while (M.E()) {
                        String j = M.j(t);
                        jk r = u30.r(M.j(t2));
                        String j2 = M.j(t3);
                        String j3 = M.j(t4);
                        String j4 = M.isNull(t5) ? null : M.j(t5);
                        String j5 = M.j(t6);
                        String j6 = M.j(t7);
                        Double valueOf2 = M.isNull(t8) ? null : Double.valueOf(M.getDouble(t8));
                        Double valueOf3 = M.isNull(t9) ? null : Double.valueOf(M.getDouble(t9));
                        String j7 = M.j(t10);
                        String j8 = M.j(t11);
                        String j9 = M.j(t12);
                        String j10 = M.j(t13);
                        String j11 = M.j(t14);
                        int i3 = t;
                        int i4 = t15;
                        String j12 = M.j(i4);
                        t15 = i4;
                        int i5 = t16;
                        String j13 = M.j(i5);
                        t16 = i5;
                        int i6 = t17;
                        String j14 = M.j(i6);
                        t17 = i6;
                        int i7 = t18;
                        List n = u30.n(M.j(i7));
                        t18 = i7;
                        int i8 = t19;
                        List n2 = u30.n(M.j(i8));
                        t19 = i8;
                        int i9 = t20;
                        if (M.isNull(i9)) {
                            i = t2;
                            i2 = t3;
                            valueOf = null;
                        } else {
                            i = t2;
                            i2 = t3;
                            valueOf = Integer.valueOf((int) M.getLong(i9));
                        }
                        int i10 = t21;
                        int i11 = t22;
                        arrayList.add(new ik(j, r, j2, j3, j4, j5, j6, valueOf2, valueOf3, j7, j8, j9, j10, j11, j12, j13, j14, n, n2, valueOf, M.isNull(i10) ? null : M.j(i10), u30.n(M.j(i11))));
                        t21 = i10;
                        t2 = i;
                        t20 = i9;
                        t22 = i11;
                        t = i3;
                        t3 = i2;
                    }
                    return arrayList;
                } finally {
                    M.close();
                }
            case 1:
                hk hkVar2 = (hk) this.n;
                kk kkVar = (kk) this.o;
                nc2 nc2Var2 = (nc2) obj;
                nc2Var2.getClass();
                hkVar2.d.L(nc2Var2, kkVar);
                return Unit.a;
            case 2:
                jp0 jp0Var = (jp0) this.n;
                g13 g13Var = (g13) this.o;
                Function1 function1 = (Function1) obj;
                op0 op0Var = jp0Var.d;
                u9 u9Var = jp0Var.a;
                a0 a0Var = jp0Var.f;
                op0Var.getClass();
                ip0 ip0Var = g13Var.a;
                if (ip0Var instanceof mp0) {
                    List list = ((mp0) ip0Var).o;
                    jq0 jq0Var = g13Var.b;
                    int i12 = g13Var.c;
                    ArrayList arrayList2 = new ArrayList(list.size());
                    int size = list.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Object obj4 = list.get(i13);
                        if (Intrinsics.b(((m92) obj4).b, jq0Var) && i12 == 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            Object obj5 = list.get(i14);
                            ((m92) obj5).getClass();
                            if (i12 == 0) {
                                arrayList3.add(obj5);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list = arrayList3;
                        }
                        int compareTo = jq0Var.compareTo(jq0.n);
                        int i15 = jq0Var.m;
                        if (compareTo < 0) {
                            int size3 = list.size();
                            jq0 jq0Var2 = null;
                            jq0 jq0Var3 = null;
                            int i16 = 0;
                            while (true) {
                                if (i16 < size3) {
                                    jq0 jq0Var4 = ((m92) list.get(i16)).b;
                                    int i17 = jq0Var4.m;
                                    if (Intrinsics.c(i17, i15) < 0) {
                                        if (jq0Var2 == null || Intrinsics.c(i17, jq0Var2.m) > 0) {
                                            jq0Var2 = jq0Var4;
                                        }
                                    } else if (Intrinsics.c(i17, i15) <= 0) {
                                        jq0Var2 = jq0Var4;
                                        jq0Var3 = jq0Var2;
                                    } else if (jq0Var3 == null || Intrinsics.c(i17, jq0Var3.m) < 0) {
                                        jq0Var3 = jq0Var4;
                                    }
                                    i16++;
                                }
                            }
                            if (jq0Var2 == null) {
                                jq0Var2 = jq0Var3;
                            }
                            ArrayList arrayList4 = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object obj6 = list.get(i18);
                                if (Intrinsics.b(((m92) obj6).b, jq0Var2)) {
                                    arrayList4.add(obj6);
                                }
                            }
                            arrayList2 = arrayList4;
                        } else {
                            jq0 jq0Var5 = jq0.o;
                            if (jq0Var.compareTo(jq0Var5) > 0) {
                                int size5 = list.size();
                                jq0 jq0Var6 = null;
                                jq0 jq0Var7 = null;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < size5) {
                                        jq0 jq0Var8 = ((m92) list.get(i19)).b;
                                        int i20 = jq0Var8.m;
                                        if (Intrinsics.c(i20, i15) < 0) {
                                            if (jq0Var6 == null || Intrinsics.c(i20, jq0Var6.m) > 0) {
                                                jq0Var6 = jq0Var8;
                                            }
                                        } else if (Intrinsics.c(i20, i15) <= 0) {
                                            jq0Var6 = jq0Var8;
                                            jq0Var7 = jq0Var6;
                                        } else if (jq0Var7 == null || Intrinsics.c(i20, jq0Var7.m) < 0) {
                                            jq0Var7 = jq0Var8;
                                        }
                                        i19++;
                                    }
                                }
                                if (jq0Var7 != null) {
                                    jq0Var6 = jq0Var7;
                                }
                                arrayList2 = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i21 = 0; i21 < size6; i21++) {
                                    Object obj7 = list.get(i21);
                                    if (Intrinsics.b(((m92) obj7).b, jq0Var6)) {
                                        arrayList2.add(obj7);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                jq0 jq0Var9 = null;
                                jq0 jq0Var10 = null;
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size7) {
                                        jq0 jq0Var11 = ((m92) list.get(i22)).b;
                                        if (Intrinsics.c(jq0Var11.m, jq0Var5.m) <= 0) {
                                            int i23 = jq0Var11.m;
                                            if (Intrinsics.c(i23, i15) < 0) {
                                                if (jq0Var9 == null || Intrinsics.c(i23, jq0Var9.m) > 0) {
                                                    jq0Var9 = jq0Var11;
                                                }
                                            } else if (Intrinsics.c(i23, i15) <= 0) {
                                                jq0Var9 = jq0Var11;
                                                jq0Var10 = jq0Var9;
                                            } else if (jq0Var10 == null || Intrinsics.c(i23, jq0Var10.m) < 0) {
                                                jq0Var10 = jq0Var11;
                                            }
                                        }
                                        i22++;
                                    }
                                }
                                if (jq0Var10 != null) {
                                    jq0Var9 = jq0Var10;
                                }
                                arrayList2 = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i24 = 0; i24 < size8; i24++) {
                                    Object obj8 = list.get(i24);
                                    if (Intrinsics.b(((m92) obj8).b, jq0Var9)) {
                                        arrayList2.add(obj8);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    jq0 jq0Var12 = jq0.o;
                                    int size9 = list.size();
                                    jq0 jq0Var13 = null;
                                    jq0 jq0Var14 = null;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < size9) {
                                            jq0 jq0Var15 = ((m92) list.get(i25)).b;
                                            if (jq0Var12 == null || Intrinsics.c(jq0Var15.m, jq0Var12.m) >= 0) {
                                                int i26 = jq0Var15.m;
                                                if (Intrinsics.c(i26, i15) < 0) {
                                                    if (jq0Var13 == null || Intrinsics.c(i26, jq0Var13.m) > 0) {
                                                        jq0Var13 = jq0Var15;
                                                    }
                                                } else if (Intrinsics.c(i26, i15) <= 0) {
                                                    jq0Var13 = jq0Var15;
                                                    jq0Var14 = jq0Var13;
                                                } else if (jq0Var14 == null || Intrinsics.c(i26, jq0Var14.m) < 0) {
                                                    jq0Var14 = jq0Var15;
                                                }
                                            }
                                            i25++;
                                        }
                                    }
                                    if (jq0Var14 != null) {
                                        jq0Var13 = jq0Var14;
                                    }
                                    arrayList2 = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i27 = 0; i27 < size10; i27++) {
                                        Object obj9 = list.get(i27);
                                        if (Intrinsics.b(((m92) obj9).b, jq0Var13)) {
                                            arrayList2.add(obj9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    mh mhVar = op0Var.a;
                    if (arrayList2.size() > 0) {
                        m92 m92Var = (m92) arrayList2.get(0);
                        m92Var.getClass();
                        synchronized (((dq2) mhVar.p)) {
                            try {
                                u9Var.getClass();
                                tj tjVar = new tj(m92Var);
                                sj sjVar = (sj) ((yg1) mhVar.n).c(tjVar);
                                if (sjVar == null) {
                                    sjVar = (sj) ((tn1) mhVar.o).g(tjVar);
                                }
                                if (sjVar != null) {
                                    obj2 = sjVar.a;
                                } else {
                                    Unit unit = Unit.a;
                                    try {
                                        Context context = u9Var.m;
                                        if (m92Var instanceof m92) {
                                            Typeface n3 = ap.n(m92Var, context);
                                            invoke = Build.VERSION.SDK_INT >= 26 ? z03.a(n3, m92Var.c, context) : n3;
                                        } else {
                                            invoke = null;
                                        }
                                    } catch (Exception unused) {
                                        invoke = a0Var.invoke(g13Var);
                                    }
                                    mhVar.getClass();
                                    u9Var.getClass();
                                    tj tjVar2 = new tj(m92Var);
                                    synchronized (((dq2) mhVar.p)) {
                                        try {
                                            if (invoke == null) {
                                                ((tn1) mhVar.o).m(tjVar2, new sj(null));
                                                Unit unit2 = Unit.a;
                                            } else {
                                                ((yg1) mhVar.n).d(tjVar2, new sj(invoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = a0Var.invoke(g13Var);
                        }
                        pair = new Pair(null, z71.R(g13Var.d, obj2, m92Var, g13Var.b, g13Var.c));
                    } else {
                        pair = new Pair(null, a0Var.invoke(g13Var));
                    }
                    List list2 = (List) pair.m;
                    Object obj10 = pair.n;
                    if (list2 == null) {
                        h13Var = new i13(obj10, true);
                        o30Var = null;
                    } else {
                        ui uiVar = new ui(list2, obj10, g13Var, op0Var.a, function1, u9Var);
                        m30 m30Var = op0Var.b;
                        d50 d50Var = d50.m;
                        o30Var = null;
                        z71.H(m30Var, null, new fj(3, o30Var, uiVar), 1);
                        h13Var = new h13(uiVar);
                    }
                } else {
                    h13Var = null;
                    o30Var = null;
                }
                if (h13Var != null) {
                    return h13Var;
                }
                l22 l22Var = (l22) jp0Var.e.m;
                ip0 ip0Var2 = g13Var.a;
                int i28 = g13Var.c;
                jq0 jq0Var16 = g13Var.b;
                if (ip0Var2 == null || (ip0Var2 instanceof c80)) {
                    a = l22Var.a(i28, jq0Var16);
                } else {
                    if (!(ip0Var2 instanceof xu0)) {
                        obj3 = o30Var;
                        if (obj3 == null) {
                            return obj3;
                        }
                        lh.g("Could not load font");
                        return o30Var;
                    }
                    a = l22Var.c((xu0) ip0Var2, jq0Var16, i28);
                }
                obj3 = new i13(a, true);
                if (obj3 == null) {
                }
                break;
            case 3:
                ((bx0) this.n).o.removeCallbacks((iu0) this.o);
                return Unit.a;
            case 4:
                z51 z51Var = (z51) this.n;
                h51 h51Var = (h51) this.o;
                nc2 nc2Var3 = (nc2) obj;
                nc2Var3.getClass();
                z51Var.c.L(nc2Var3, h51Var);
                return Unit.a;
            case 5:
                um umVar = (um) this.n;
                iz izVar = (iz) this.o;
                tq1 tq1Var = umVar.a;
                if (tq1Var != null) {
                    tq1.a(tq1Var, izVar.b);
                } else {
                    ru1 ru1Var = umVar.b;
                    if (ru1Var == null) {
                        lh.g("Unreachable");
                        return null;
                    }
                    tm tmVar = izVar.a;
                    tmVar.getClass();
                    mu1 mu1Var = new mu1(tmVar, new nu1(tmVar, null));
                    tmVar.a.add(mu1Var);
                    tq1.a(ru1Var.b().c, mu1Var);
                }
                return new o8(5, umVar, izVar);
            case 6:
                k00 k00Var = (k00) this.n;
                un1 un1Var = (un1) this.o;
                k00Var.z(obj);
                if (un1Var != null) {
                    un1Var.a(obj);
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                r72 r72Var = (r72) this.n;
                Throwable th3 = (Throwable) this.o;
                Throwable th4 = (Throwable) obj;
                synchronized (r72Var.b) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                wi0.a(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    r72Var.d = th3;
                    vo2 vo2Var = r72Var.t;
                    o72 o72Var = o72.m;
                    vo2Var.getClass();
                    vo2Var.j(null, o72Var);
                }
                return Unit.a;
            default:
                tt1 tt1Var = (tt1) this.n;
                g13 g13Var2 = (g13) this.o;
                j13 j13Var = (j13) obj;
                synchronized (((dq2) tt1Var.n)) {
                    try {
                        boolean c = j13Var.c();
                        yg1 yg1Var = (yg1) tt1Var.o;
                        if (c) {
                        }
                    } finally {
                    }
                }
                return Unit.a;
        }
    }
}
