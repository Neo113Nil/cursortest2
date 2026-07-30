package defpackage;

import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sc3 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public sc3(int i) {
        this.b = i;
    }

    public static ic3 c(js0 js0Var, List list) {
        ld3 ld3Var = ld3.ADD;
        ak2.n("FN", 2, list);
        kc3 x = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0));
        kc3 x2 = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(1));
        if (!(x2 instanceof qb3)) {
            lh.e(q40.l("FN requires an ArrayValue of parameter names found ", x2.getClass().getCanonicalName()));
            return null;
        }
        List l = ((qb3) x2).l();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new ic3(x.zzc(), (ArrayList) l, arrayList, js0Var);
    }

    public static boolean d(kc3 kc3Var, kc3 kc3Var2) {
        if (kc3Var instanceof cc3) {
            kc3Var = new pc3(kc3Var.zzc());
        }
        if (kc3Var2 instanceof cc3) {
            kc3Var2 = new pc3(kc3Var2.zzc());
        }
        if ((kc3Var instanceof pc3) && (kc3Var2 instanceof pc3)) {
            return ((pc3) kc3Var).m.compareTo(((pc3) kc3Var2).m) < 0;
        }
        double doubleValue = kc3Var.f().doubleValue();
        double doubleValue2 = kc3Var2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static kc3 e(hd3 hd3Var, kc3 kc3Var, kc3 kc3Var2) {
        if (kc3Var instanceof Iterable) {
            return g(hd3Var, ((Iterable) kc3Var).iterator(), kc3Var2);
        }
        lh.e("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(kc3 kc3Var, kc3 kc3Var2) {
        if (kc3Var.getClass().equals(kc3Var2.getClass())) {
            if ((kc3Var instanceof qc3) || (kc3Var instanceof hc3)) {
                return true;
            }
            return kc3Var instanceof xb3 ? (Double.isNaN(kc3Var.f().doubleValue()) || Double.isNaN(kc3Var2.f().doubleValue()) || kc3Var.f().doubleValue() != kc3Var2.f().doubleValue()) ? false : true : kc3Var instanceof pc3 ? kc3Var.zzc().equals(kc3Var2.zzc()) : kc3Var instanceof sb3 ? kc3Var.a().equals(kc3Var2.a()) : kc3Var == kc3Var2;
        }
        if (((kc3Var instanceof qc3) || (kc3Var instanceof hc3)) && ((kc3Var2 instanceof qc3) || (kc3Var2 instanceof hc3))) {
            return true;
        }
        boolean z = kc3Var instanceof xb3;
        if (z && (kc3Var2 instanceof pc3)) {
            return f(kc3Var, new xb3(kc3Var2.f()));
        }
        boolean z2 = kc3Var instanceof pc3;
        if (z2 && (kc3Var2 instanceof xb3)) {
            return f(new xb3(kc3Var.f()), kc3Var2);
        }
        if (kc3Var instanceof sb3) {
            return f(new xb3(kc3Var.f()), kc3Var2);
        }
        if (kc3Var2 instanceof sb3) {
            return f(kc3Var, new xb3(kc3Var2.f()));
        }
        if ((z2 || z) && (kc3Var2 instanceof cc3)) {
            return f(kc3Var, new pc3(kc3Var2.zzc()));
        }
        if ((kc3Var instanceof cc3) && ((kc3Var2 instanceof pc3) || (kc3Var2 instanceof xb3))) {
            return f(new pc3(kc3Var.zzc()), kc3Var2);
        }
        return false;
    }

    public static kc3 g(hd3 hd3Var, Iterator it, kc3 kc3Var) {
        js0 L;
        if (it != null) {
            while (it.hasNext()) {
                kc3 kc3Var2 = (kc3) it.next();
                switch (hd3Var.a) {
                    case 0:
                        L = hd3Var.b.L();
                        String str = hd3Var.c;
                        L.O(str, kc3Var2);
                        ((HashMap) L.o).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        L = hd3Var.b.L();
                        L.O(hd3Var.c, kc3Var2);
                        break;
                    default:
                        L = hd3Var.b;
                        L.O(hd3Var.c, kc3Var2);
                        break;
                }
                kc3 J = L.J((qb3) kc3Var);
                if (J instanceof vb3) {
                    vb3 vb3Var = (vb3) J;
                    String str2 = vb3Var.n;
                    if ("break".equals(str2)) {
                        return kc3.e;
                    }
                    if ("return".equals(str2)) {
                        return vb3Var;
                    }
                }
            }
        }
        return kc3.e;
    }

    public static boolean h(kc3 kc3Var, kc3 kc3Var2) {
        if (kc3Var instanceof cc3) {
            kc3Var = new pc3(kc3Var.zzc());
        }
        if (kc3Var2 instanceof cc3) {
            kc3Var2 = new pc3(kc3Var2.zzc());
        }
        return (((kc3Var instanceof pc3) && (kc3Var2 instanceof pc3)) || !(Double.isNaN(kc3Var.f().doubleValue()) || Double.isNaN(kc3Var2.f().doubleValue()))) && !d(kc3Var2, kc3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100, types: [kc3] */
    /* JADX WARN: Type inference failed for: r10v103, types: [kc3] */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [qb3] */
    /* JADX WARN: Type inference failed for: r10v347, types: [fc3] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [js0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc3 a(String str, js0 js0Var, ArrayList arrayList) {
        boolean f;
        boolean f2;
        qc3 qc3Var;
        qc3 qc3Var2;
        qc3 qc3Var3;
        vb3 vb3Var;
        kc3 pc3Var;
        kc3 kc3Var;
        String str2;
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        switch (this.b) {
            case 0:
                ld3 ld3Var = ld3.ADD;
                switch (ak2.q(str).ordinal()) {
                    case 4:
                        ak2.m("BITWISE_AND", 2, arrayList);
                        return new xb3(Double.valueOf(ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) & ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue())));
                    case 5:
                        ak2.m("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new xb3(Double.valueOf(ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) << ((int) (ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) & 31))));
                    case 6:
                        ak2.m("BITWISE_NOT", 1, arrayList);
                        return new xb3(Double.valueOf(~ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue())));
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        ak2.m("BITWISE_OR", 2, arrayList);
                        return new xb3(Double.valueOf(ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) | ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue())));
                    case 8:
                        ak2.m("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new xb3(Double.valueOf(ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) >> ((int) (ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) & 31))));
                    case 9:
                        ak2.m("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new xb3(Double.valueOf((ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) & 4294967295L) >>> ((int) (ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) & 31))));
                    case 10:
                        ak2.m("BITWISE_XOR", 2, arrayList);
                        return new xb3(Double.valueOf(ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) ^ ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                ak2.m(ak2.q(str).name(), 2, arrayList);
                kc3 x = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                kc3 x2 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                int ordinal = ak2.q(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f2 = f(x, x2);
                    } else if (ordinal == 42) {
                        f = d(x, x2);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                f = d(x2, x);
                                break;
                            case 38:
                                f = h(x2, x);
                                break;
                            case 39:
                                f = ak2.r(x, x2);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                f2 = ak2.r(x, x2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f = h(x, x2);
                    }
                    f = !f2;
                } else {
                    f = f(x, x2);
                }
                return f ? kc3.j : kc3.k;
            case 2:
                ld3 ld3Var2 = ld3.ADD;
                int ordinal2 = ak2.q(str).ordinal();
                if (ordinal2 == 2) {
                    ak2.m("APPLY", 3, arrayList);
                    kc3 kc3Var2 = (kc3) arrayList.get(0);
                    tt1 tt1Var = (tt1) js0Var.p;
                    tt1 tt1Var2 = (tt1) js0Var.p;
                    kc3 x3 = tt1Var.x(js0Var, kc3Var2);
                    String zzc = tt1Var2.x(js0Var, (kc3) arrayList.get(1)).zzc();
                    kc3 x4 = tt1Var2.x(js0Var, (kc3) arrayList.get(2));
                    if (!(x4 instanceof qb3)) {
                        lh.e(q40.l("Function arguments for Apply are not a list found ", x4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!zzc.isEmpty()) {
                        return x3.j(zzc, js0Var, (ArrayList) ((qb3) x4).l());
                    }
                    lh.e("Function name for apply is undefined");
                    return null;
                }
                if (ordinal2 == 15) {
                    ak2.m("BREAK", 0, arrayList);
                    return kc3.g;
                }
                if (ordinal2 == 25) {
                    return c(js0Var, arrayList);
                }
                if (ordinal2 != 41) {
                    if (ordinal2 == 54) {
                        return new qb3(arrayList);
                    }
                    if (ordinal2 == 57) {
                        if (arrayList.isEmpty()) {
                            return kc3.i;
                        }
                        ak2.m("RETURN", 1, arrayList);
                        return new vb3("return", ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)));
                    }
                    if (ordinal2 != 19) {
                        if (ordinal2 == 20) {
                            ak2.n("DEFINE_FUNCTION", 2, arrayList);
                            ic3 c = c(js0Var, arrayList);
                            String str3 = c.m;
                            if (str3 == null) {
                                js0Var.N(BuildConfig.FLAVOR, c);
                                return c;
                            }
                            js0Var.N(str3, c);
                            return c;
                        }
                        if (ordinal2 == 60) {
                            ak2.m("SWITCH", 3, arrayList);
                            kc3 kc3Var3 = (kc3) arrayList.get(0);
                            tt1 tt1Var3 = (tt1) js0Var.p;
                            tt1 tt1Var4 = (tt1) js0Var.p;
                            kc3 x5 = tt1Var3.x(js0Var, kc3Var3);
                            kc3 x6 = tt1Var4.x(js0Var, (kc3) arrayList.get(1));
                            kc3 x7 = tt1Var4.x(js0Var, (kc3) arrayList.get(2));
                            if (!(x6 instanceof qb3)) {
                                lh.e("Malformed SWITCH statement, cases are not a list");
                                return null;
                            }
                            if (!(x7 instanceof qb3)) {
                                lh.e("Malformed SWITCH statement, case statements are not a list");
                                return null;
                            }
                            qb3 qb3Var = (qb3) x6;
                            qb3 qb3Var2 = (qb3) x7;
                            boolean z = false;
                            for (int i4 = 0; i4 < qb3Var.n(); i4++) {
                                if (z || x5.equals(tt1Var4.x(js0Var, qb3Var.o(i4)))) {
                                    kc3 x8 = tt1Var4.x(js0Var, qb3Var2.o(i4));
                                    if (x8 instanceof vb3) {
                                        return ((vb3) x8).n.equals("break") ? kc3.e : x8;
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (qb3Var.n() + 1 == qb3Var2.n()) {
                                kc3 x9 = tt1Var4.x(js0Var, qb3Var2.o(qb3Var.n()));
                                if (x9 instanceof vb3) {
                                    String str4 = ((vb3) x9).n;
                                    if (str4.equals("return") || str4.equals("continue")) {
                                        return x9;
                                    }
                                }
                            }
                            return kc3.e;
                        }
                        if (ordinal2 == 61) {
                            ak2.m("TERNARY", 3, arrayList);
                            kc3 kc3Var4 = (kc3) arrayList.get(0);
                            tt1 tt1Var5 = (tt1) js0Var.p;
                            tt1 tt1Var6 = (tt1) js0Var.p;
                            return tt1Var5.x(js0Var, kc3Var4).a().booleanValue() ? tt1Var6.x(js0Var, (kc3) arrayList.get(1)) : tt1Var6.x(js0Var, (kc3) arrayList.get(2));
                        }
                        switch (ordinal2) {
                            case 11:
                                return js0Var.L().J(new qb3(arrayList));
                            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                                ak2.m("BREAK", 0, arrayList);
                                return kc3.h;
                            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return kc3.e;
                    }
                    kc3 x10 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    return x10 instanceof qb3 ? js0Var.J((qb3) x10) : kc3.e;
                }
                ak2.n("IF", 2, arrayList);
                kc3 kc3Var5 = (kc3) arrayList.get(0);
                tt1 tt1Var7 = (tt1) js0Var.p;
                tt1 tt1Var8 = (tt1) js0Var.p;
                kc3 x11 = tt1Var7.x(js0Var, kc3Var5);
                kc3 x12 = tt1Var8.x(js0Var, (kc3) arrayList.get(1));
                kc3 x13 = arrayList.size() > 2 ? tt1Var8.x(js0Var, (kc3) arrayList.get(2)) : null;
                qc3 qc3Var4 = kc3.e;
                if (x11.a().booleanValue()) {
                    qc3Var2 = js0Var.J((qb3) x12);
                } else {
                    if (x13 == null) {
                        qc3Var = qc3Var4;
                        return true == (qc3Var instanceof vb3) ? qc3Var4 : qc3Var;
                    }
                    qc3Var2 = js0Var.J((qb3) x13);
                }
                qc3Var = qc3Var2;
                if (true == (qc3Var instanceof vb3)) {
                }
                break;
            case 3:
                ld3 ld3Var3 = ld3.ADD;
                int ordinal3 = ak2.q(str).ordinal();
                if (ordinal3 == 1) {
                    ak2.m("AND", 2, arrayList);
                    kc3 x14 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    if (x14.a().booleanValue()) {
                        return ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                    }
                    return x14;
                }
                if (ordinal3 == 47) {
                    ak2.m("NOT", 1, arrayList);
                    return new sb3(Boolean.valueOf(!((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).a().booleanValue()));
                }
                if (ordinal3 != 50) {
                    b(str);
                    throw null;
                }
                ak2.m("OR", 2, arrayList);
                kc3 x15 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                if (x15.a().booleanValue()) {
                    return x15;
                }
                return ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
            case 4:
                ld3 ld3Var4 = ld3.ADD;
                int ordinal4 = ak2.q(str).ordinal();
                if (ordinal4 == 65) {
                    ak2.m("WHILE", 4, arrayList);
                    kc3 kc3Var6 = (kc3) arrayList.get(0);
                    kc3 kc3Var7 = (kc3) arrayList.get(1);
                    kc3 kc3Var8 = (kc3) arrayList.get(2);
                    kc3 kc3Var9 = (kc3) arrayList.get(3);
                    tt1 tt1Var9 = (tt1) js0Var.p;
                    tt1 tt1Var10 = (tt1) js0Var.p;
                    kc3 x16 = tt1Var9.x(js0Var, kc3Var9);
                    if (tt1Var10.x(js0Var, kc3Var8).a().booleanValue()) {
                        kc3 J = js0Var.J((qb3) x16);
                        if (J instanceof vb3) {
                            vb3 vb3Var2 = (vb3) J;
                            String str5 = vb3Var2.n;
                            if ("break".equals(str5)) {
                                return kc3.e;
                            }
                            if ("return".equals(str5)) {
                                return vb3Var2;
                            }
                        }
                    }
                    while (tt1Var10.x(js0Var, kc3Var6).a().booleanValue()) {
                        kc3 J2 = js0Var.J((qb3) x16);
                        if (J2 instanceof vb3) {
                            vb3 vb3Var3 = (vb3) J2;
                            String str6 = vb3Var3.n;
                            if ("break".equals(str6)) {
                                return kc3.e;
                            }
                            if ("return".equals(str6)) {
                                return vb3Var3;
                            }
                        }
                        js0Var.I(kc3Var7);
                    }
                    return kc3.e;
                }
                switch (ordinal4) {
                    case 26:
                        ak2.m("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof pc3)) {
                            lh.e("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String zzc2 = ((kc3) arrayList.get(0)).zzc();
                        kc3 x17 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                        kc3 x18 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2));
                        Iterator e = x17.e();
                        if (e != null) {
                            while (e.hasNext()) {
                                js0Var.O(zzc2, (kc3) e.next());
                                kc3 J3 = js0Var.J((qb3) x18);
                                if (J3 instanceof vb3) {
                                    vb3Var = (vb3) J3;
                                    String str7 = vb3Var.n;
                                    if ("break".equals(str7)) {
                                        qc3Var3 = kc3.e;
                                        return qc3Var3;
                                    }
                                    if ("return".equals(str7)) {
                                        return vb3Var;
                                    }
                                }
                            }
                        }
                        qc3Var3 = kc3.e;
                        return qc3Var3;
                    case 27:
                        ak2.m("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof pc3) {
                            return g(new hd3(js0Var, ((kc3) arrayList.get(0)).zzc(), i3), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).e(), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2)));
                        }
                        lh.e("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        ak2.m("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof pc3)) {
                            lh.e("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String zzc3 = ((kc3) arrayList.get(0)).zzc();
                        kc3 x19 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                        kc3 x20 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2));
                        Iterator e2 = x19.e();
                        if (e2 != null) {
                            while (e2.hasNext()) {
                                kc3 kc3Var10 = (kc3) e2.next();
                                js0 L = js0Var.L();
                                L.O(zzc3, kc3Var10);
                                kc3 J4 = L.J((qb3) x20);
                                if (J4 instanceof vb3) {
                                    vb3Var = (vb3) J4;
                                    String str8 = vb3Var.n;
                                    if ("break".equals(str8)) {
                                        qc3Var3 = kc3.e;
                                        return qc3Var3;
                                    }
                                    if ("return".equals(str8)) {
                                        return vb3Var;
                                    }
                                }
                            }
                        }
                        qc3Var3 = kc3.e;
                        return qc3Var3;
                    case 29:
                        ak2.m("FOR_LET", 4, arrayList);
                        kc3 kc3Var11 = (kc3) arrayList.get(0);
                        tt1 tt1Var11 = (tt1) js0Var.p;
                        tt1 tt1Var12 = (tt1) js0Var.p;
                        kc3 x21 = tt1Var11.x(js0Var, kc3Var11);
                        if (!(x21 instanceof qb3)) {
                            lh.e("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        qb3 qb3Var3 = (qb3) x21;
                        kc3 kc3Var12 = (kc3) arrayList.get(1);
                        kc3 kc3Var13 = (kc3) arrayList.get(2);
                        kc3 x22 = tt1Var12.x(js0Var, (kc3) arrayList.get(3));
                        js0 L2 = js0Var.L();
                        for (int i5 = 0; i5 < qb3Var3.n(); i5++) {
                            String zzc4 = qb3Var3.o(i5).zzc();
                            L2.N(zzc4, js0Var.P(zzc4));
                        }
                        while (tt1Var12.x(js0Var, kc3Var12).a().booleanValue()) {
                            kc3 J5 = js0Var.J((qb3) x22);
                            if (J5 instanceof vb3) {
                                vb3 vb3Var4 = (vb3) J5;
                                String str9 = vb3Var4.n;
                                if ("break".equals(str9)) {
                                    return kc3.e;
                                }
                                if ("return".equals(str9)) {
                                    return vb3Var4;
                                }
                            }
                            js0 L3 = js0Var.L();
                            for (int i6 = 0; i6 < qb3Var3.n(); i6++) {
                                String zzc5 = qb3Var3.o(i6).zzc();
                                L3.N(zzc5, L2.P(zzc5));
                            }
                            L3.I(kc3Var13);
                            L2 = L3;
                        }
                        return kc3.e;
                    case 30:
                        ak2.m("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof pc3) {
                            return e(new hd3(js0Var, ((kc3) arrayList.get(0)).zzc(), i2), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2)));
                        }
                        lh.e("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        ak2.m("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof pc3) {
                            return e(new hd3(js0Var, ((kc3) arrayList.get(0)).zzc(), i3), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2)));
                        }
                        lh.e("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        ak2.m("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof pc3) {
                            return e(new hd3(js0Var, ((kc3) arrayList.get(0)).zzc(), i), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)), ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(2)));
                        }
                        lh.e("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case 5:
                ld3 ld3Var5 = ld3.ADD;
                int ordinal5 = ak2.q(str).ordinal();
                if (ordinal5 == 0) {
                    ak2.m("ADD", 2, arrayList);
                    kc3 x23 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    kc3 x24 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                    pc3Var = ((x23 instanceof cc3) || (x23 instanceof pc3) || (x24 instanceof cc3) || (x24 instanceof pc3)) ? new pc3(String.valueOf(x23.zzc()).concat(String.valueOf(x24.zzc()))) : new xb3(Double.valueOf(x24.f().doubleValue() + x23.f().doubleValue()));
                } else if (ordinal5 == 21) {
                    ak2.m("DIVIDE", 2, arrayList);
                    pc3Var = new xb3(Double.valueOf(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue() / ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()));
                } else {
                    if (ordinal5 == 59) {
                        ak2.m("SUBTRACT", 2, arrayList);
                        return new xb3(Double.valueOf(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue() + (-((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        ak2.m(str, 2, arrayList);
                        kc3 x25 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                        js0Var.I((kc3) arrayList.get(1));
                        return x25;
                    }
                    if (ordinal5 == 55 || ordinal5 == 56) {
                        ak2.m(str, 1, arrayList);
                        return ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    }
                    switch (ordinal5) {
                        case 44:
                            ak2.m("MODULUS", 2, arrayList);
                            pc3Var = new xb3(Double.valueOf(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue() % ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()));
                            break;
                        case 45:
                            ak2.m("MULTIPLY", 2, arrayList);
                            return new xb3(Double.valueOf(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue() * ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()));
                        case 46:
                            ak2.m("NEGATE", 1, arrayList);
                            return new xb3(Double.valueOf(-((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return pc3Var;
            case 6:
                if (str == null || str.isEmpty() || !js0Var.M(str)) {
                    lh.e(q40.l("Command not found: ", str));
                    return null;
                }
                kc3 P = js0Var.P(str);
                if (P instanceof zb3) {
                    return ((zb3) P).h(js0Var, arrayList);
                }
                lh.e(q40.m("Function ", str, " is not defined"));
                return null;
            default:
                ld3 ld3Var6 = ld3.ADD;
                int ordinal6 = ak2.q(str).ordinal();
                if (ordinal6 == 3) {
                    ak2.m("ASSIGN", 2, arrayList);
                    kc3 x26 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    if (!(x26 instanceof pc3)) {
                        lh.e(q40.l("Expected string for assign var. got ", x26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((pc3) x26).m;
                    if (!js0Var.M(str10)) {
                        lh.e(q40.l("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    kc3 x27 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                    js0Var.N(str10, x27);
                    return x27;
                }
                if (ordinal6 == 14) {
                    ak2.n("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        lh.e(in1.k(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i3 < arrayList.size() - 1) {
                        kc3 x28 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i3));
                        if (!(x28 instanceof pc3)) {
                            lh.e(q40.l("Expected string for const name. got ", x28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((pc3) x28).m;
                        js0Var.O(str11, ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i3 + 1)));
                        ((HashMap) js0Var.o).put(str11, Boolean.TRUE);
                        i3 += 2;
                    }
                    return kc3.e;
                }
                if (ordinal6 == 24) {
                    ak2.n("EXPRESSION_LIST", 1, arrayList);
                    kc3Var = kc3.e;
                    while (i3 < arrayList.size()) {
                        kc3 x29 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i3));
                        if (x29 instanceof vb3) {
                            lh.g("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i3++;
                        kc3Var = x29;
                    }
                } else {
                    if (ordinal6 == 33) {
                        ak2.m("GET", 1, arrayList);
                        kc3 x30 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                        if (x30 instanceof pc3) {
                            return js0Var.P(((pc3) x30).m);
                        }
                        lh.e(q40.l("Expected string for get var. got ", x30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (ordinal6 == 49) {
                        ak2.m("NULL", 0, arrayList);
                        return kc3.f;
                    }
                    if (ordinal6 == 58) {
                        ak2.m("SET_PROPERTY", 3, arrayList);
                        kc3 kc3Var14 = (kc3) arrayList.get(0);
                        tt1 tt1Var13 = (tt1) js0Var.p;
                        tt1 tt1Var14 = (tt1) js0Var.p;
                        kc3 x31 = tt1Var13.x(js0Var, kc3Var14);
                        kc3 x32 = tt1Var14.x(js0Var, (kc3) arrayList.get(1));
                        kc3 x33 = tt1Var14.x(js0Var, (kc3) arrayList.get(2));
                        if (x31 == kc3.e || x31 == kc3.f) {
                            throw new IllegalStateException("Can't set property " + x32.zzc() + " of " + x31.zzc());
                        }
                        if ((x31 instanceof qb3) && (x32 instanceof xb3)) {
                            ((qb3) x31).p(((xb3) x32).m.intValue(), x33);
                            return x33;
                        }
                        if (!(x31 instanceof cc3)) {
                            return x33;
                        }
                        ((cc3) x31).b(x32.zzc(), x33);
                        return x33;
                    }
                    if (ordinal6 != 17) {
                        if (ordinal6 != 18) {
                            if (ordinal6 == 35 || ordinal6 == 36) {
                                ak2.m("GET_PROPERTY", 2, arrayList);
                                kc3 x34 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                                kc3 x35 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                                if ((x34 instanceof qb3) && ak2.p(x35)) {
                                    return ((qb3) x34).o(x35.f().intValue());
                                }
                                if (x34 instanceof cc3) {
                                    return ((cc3) x34).c(x35.zzc());
                                }
                                if (x34 instanceof pc3) {
                                    if ("length".equals(x35.zzc())) {
                                        return new xb3(Double.valueOf(((pc3) x34).m.length()));
                                    }
                                    if (ak2.p(x35)) {
                                        double doubleValue = x35.f().doubleValue();
                                        String str12 = ((pc3) x34).m;
                                        if (doubleValue < str12.length()) {
                                            return new pc3(String.valueOf(str12.charAt(x35.f().intValue())));
                                        }
                                    }
                                }
                                return kc3.e;
                            }
                            switch (ordinal6) {
                                case 62:
                                    ak2.m("TYPEOF", 1, arrayList);
                                    kc3 x36 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                                    if (x36 instanceof qc3) {
                                        str2 = "undefined";
                                    } else if (x36 instanceof sb3) {
                                        str2 = "boolean";
                                    } else if (x36 instanceof xb3) {
                                        str2 = "number";
                                    } else if (x36 instanceof pc3) {
                                        str2 = "string";
                                    } else if (x36 instanceof ic3) {
                                        str2 = "function";
                                    } else {
                                        if ((x36 instanceof lc3) || (x36 instanceof vb3)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", x36));
                                        }
                                        str2 = "object";
                                    }
                                    return new pc3(str2);
                                case 63:
                                    ak2.m("UNDEFINED", 0, arrayList);
                                    return kc3.e;
                                case 64:
                                    ak2.n("VAR", 1, arrayList);
                                    int size = arrayList.size();
                                    while (i3 < size) {
                                        Object obj = arrayList.get(i3);
                                        i3++;
                                        kc3 x37 = ((tt1) js0Var.p).x(js0Var, (kc3) obj);
                                        if (!(x37 instanceof pc3)) {
                                            lh.e(q40.l("Expected string for var name. got ", x37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        js0Var.O(((pc3) x37).m, kc3.e);
                                    }
                                    return kc3.e;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new fc3();
                        }
                        if (arrayList.size() % 2 != 0) {
                            lh.e(in1.k(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        kc3Var = new fc3();
                        while (i3 < arrayList.size() - 1) {
                            kc3 x38 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i3));
                            kc3 x39 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i3 + 1));
                            if ((x38 instanceof vb3) || (x39 instanceof vb3)) {
                                lh.g("Failed to evaluate map entry");
                                return null;
                            }
                            kc3Var.b(x38.zzc(), x39);
                            i3 += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new qb3();
                        }
                        kc3Var = new qb3();
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            kc3 x40 = ((tt1) js0Var.p).x(js0Var, (kc3) obj2);
                            if (x40 instanceof vb3) {
                                lh.g("Failed to evaluate array element");
                                return null;
                            }
                            kc3Var.p(i3, x40);
                            i3++;
                        }
                    }
                }
                return kc3Var;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(ak2.q(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
