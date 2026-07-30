package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qb3 implements Iterable, kc3, cc3 {
    public final TreeMap m;
    public final TreeMap n;

    public qb3(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                p(i, (kc3) list.get(i));
            }
        }
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.cc3
    public final void b(String str, kc3 kc3Var) {
        TreeMap treeMap = this.n;
        if (kc3Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, kc3Var);
        }
    }

    @Override // defpackage.cc3
    public final kc3 c(String str) {
        kc3 kc3Var;
        return "length".equals(str) ? new xb3(Double.valueOf(n())) : (!d(str) || (kc3Var = (kc3) this.n.get(str)) == null) ? kc3.e : kc3Var;
    }

    @Override // defpackage.cc3
    public final boolean d(String str) {
        return "length".equals(str) || this.n.containsKey(str);
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return new lb3(this, this.m.keySet().iterator(), this.n.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qb3)) {
            return false;
        }
        qb3 qb3Var = (qb3) obj;
        if (n() != qb3Var.n()) {
            return false;
        }
        TreeMap treeMap = this.m;
        if (treeMap.isEmpty()) {
            return qb3Var.m.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!o(intValue).equals(qb3Var.o(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kc3
    public final Double f() {
        TreeMap treeMap = this.m;
        return treeMap.size() == 1 ? o(0).f() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.m.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mc3(2, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dc, code lost:
    
        if (defpackage.ti2.p(r7, r2, (defpackage.ic3) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).n() == r7.n()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // defpackage.kc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        js0 js0Var2;
        String str5;
        Object obj2;
        qb3 qb3Var;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d;
        String str6;
        zb3 zb3Var;
        boolean equals = "concat".equals(str);
        String str7 = InAppPurchaseConstants.METHOD_TO_STRING;
        String str8 = "splice";
        if (!equals && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str3 = "filter";
            str4 = "sort";
            if (str4.equals(str)) {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if (!"unshift".equals(str)) {
                            return cc3.g(this, new pc3(str), js0Var, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        qb3Var = this;
                        js0Var2 = js0Var;
                    }
                }
            }
            obj = "unshift";
            js0Var2 = js0Var;
            arrayList2 = arrayList;
            str5 = "forEach";
            qb3Var = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = qb3Var.m;
            kc3 kc3Var = kc3.e;
            TreeMap treeMap3 = treeMap2;
            double d2 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        ak2.m(str9, 0, arrayList2);
                        return new pc3(qb3Var.s(","));
                    }
                    lh.e("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        qb3 qb3Var2 = (qb3) qb3Var.k();
                        if (!arrayList2.isEmpty()) {
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = arrayList2.get(i);
                                i++;
                                kc3 x = ((tt1) js0Var2.p).x(js0Var2, (kc3) obj3);
                                if (x instanceof vb3) {
                                    lh.g("Failed evaluation of arguments");
                                    return null;
                                }
                                int n = qb3Var2.n();
                                if (x instanceof qb3) {
                                    qb3 qb3Var3 = (qb3) x;
                                    Iterator m = qb3Var3.m();
                                    while (m.hasNext()) {
                                        Integer num = (Integer) m.next();
                                        qb3Var2.p(num.intValue() + n, qb3Var3.o(num.intValue()));
                                    }
                                } else {
                                    qb3Var2.p(n, x);
                                }
                            }
                        }
                        return qb3Var2;
                    }
                    lh.e("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        ak2.m(str10, 1, arrayList2);
                        kc3 x2 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        if (!(x2 instanceof ic3)) {
                            lh.e("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() == 0) {
                            return new qb3();
                        }
                        qb3 qb3Var4 = (qb3) qb3Var.k();
                        qb3 p = ti2.p(qb3Var, js0Var2, (ic3) x2, null, Boolean.TRUE);
                        qb3 qb3Var5 = new qb3();
                        Iterator m2 = p.m();
                        while (m2.hasNext()) {
                            qb3Var5.p(qb3Var5.n(), qb3Var4.o(((Integer) m2.next()).intValue()));
                        }
                        return qb3Var5;
                    }
                    lh.e("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return ti2.o(qb3Var, js0Var2, arrayList2, true);
                    }
                    lh.e("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new qb3();
                        }
                        kc3 kc3Var2 = (kc3) arrayList2.get(0);
                        tt1 tt1Var = (tt1) js0Var2.p;
                        tt1 tt1Var2 = (tt1) js0Var2.p;
                        int t = (int) ak2.t(tt1Var.x(js0Var2, kc3Var2).f().doubleValue());
                        if (t < 0) {
                            t = Math.max(0, qb3Var.n() + t);
                        } else if (t > qb3Var.n()) {
                            t = qb3Var.n();
                        }
                        int n2 = qb3Var.n();
                        qb3 qb3Var6 = new qb3();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) ak2.t(tt1Var2.x(js0Var2, (kc3) arrayList2.get(1)).f().doubleValue()));
                            if (max > 0) {
                                for (int i2 = t; i2 < Math.min(n2, t + max); i2++) {
                                    qb3Var6.p(qb3Var6.n(), qb3Var.o(t));
                                    qb3Var.r(t);
                                }
                            }
                            int i3 = 2;
                            if (arrayList2.size() > 2) {
                                while (i3 < arrayList2.size()) {
                                    kc3 x3 = tt1Var2.x(js0Var2, (kc3) arrayList2.get(i3));
                                    if (x3 instanceof vb3) {
                                        lh.e("Failed to parse elements to add");
                                        return null;
                                    }
                                    int i4 = (t + i3) - 2;
                                    if (i4 < 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                                        sb.append("Invalid value index: ");
                                        sb.append(i4);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    if (i4 >= qb3Var.n()) {
                                        qb3Var.p(i4, x3);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i4) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            kc3 kc3Var3 = (kc3) treeMap4.get(valueOf2);
                                            if (kc3Var3 != null) {
                                                qb3Var.p(intValue + 1, kc3Var3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        qb3Var.p(i4, x3);
                                    }
                                    i3++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (t < n2) {
                                qb3Var6.p(qb3Var6.n(), qb3Var.o(t));
                                qb3Var.p(t, null);
                                t++;
                            }
                        }
                        return qb3Var6;
                    }
                    lh.e("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        ak2.m(str11, 1, arrayList2);
                        kc3 x4 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        if (!(x4 instanceof ic3)) {
                            lh.e("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() != 0) {
                            ti2.p(qb3Var, js0Var2, (ic3) x4, null, null);
                            return kc3Var;
                        }
                        return kc3Var;
                    }
                    lh.e("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        ak2.o(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            kc3Var = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        }
                        kc3 kc3Var4 = kc3Var;
                        int n3 = qb3Var.n() - 1;
                        if (arrayList2.size() > 1) {
                            kc3 x5 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(1));
                            d = Double.isNaN(x5.f().doubleValue()) ? qb3Var.n() - 1 : ak2.t(x5.f().doubleValue());
                            if (d < 0.0d) {
                                d += qb3Var.n();
                            }
                        } else {
                            d = n3;
                        }
                        if (d < 0.0d) {
                            return new xb3(valueOf);
                        }
                        for (int min = (int) Math.min(qb3Var.n(), d); min >= 0; min--) {
                            if (qb3Var.q(min) && ak2.r(qb3Var.o(min), kc3Var4)) {
                                return new xb3(Double.valueOf(min));
                            }
                        }
                        return new xb3(valueOf);
                    }
                    lh.e("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            qb3 qb3Var7 = new qb3();
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj4 = arrayList2.get(i5);
                                i5++;
                                kc3 x6 = ((tt1) js0Var2.p).x(js0Var2, (kc3) obj4);
                                if (x6 instanceof vb3) {
                                    lh.g("Argument evaluation failed");
                                    return null;
                                }
                                qb3Var7.p(qb3Var7.n(), x6);
                            }
                            int n4 = qb3Var7.n();
                            Iterator m3 = qb3Var.m();
                            while (m3.hasNext()) {
                                Integer num2 = (Integer) m3.next();
                                qb3Var7.p(num2.intValue() + n4, qb3Var.o(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator m4 = qb3Var7.m();
                            while (m4.hasNext()) {
                                Integer num3 = (Integer) m4.next();
                                qb3Var.p(num3.intValue(), qb3Var7.o(num3.intValue()));
                            }
                        }
                        return new xb3(Double.valueOf(qb3Var.n()));
                    }
                    lh.e("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        ak2.m("map", 1, arrayList2);
                        kc3 x7 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        if (x7 instanceof ic3) {
                            return qb3Var.n() == 0 ? new qb3() : ti2.p(qb3Var, js0Var2, (ic3) x7, null, null);
                        }
                        lh.e("Callback should be a method");
                        return null;
                    }
                    lh.e("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        ak2.m("pop", 0, arrayList2);
                        int n5 = qb3Var.n();
                        if (n5 != 0) {
                            int i6 = n5 - 1;
                            kc3 o = qb3Var.o(i6);
                            qb3Var.r(i6);
                            return o;
                        }
                        return kc3Var;
                    }
                    lh.e("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        ak2.o(1, "join", arrayList2);
                        if (qb3Var.n() == 0) {
                            return kc3.l;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            kc3 x8 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                            str6 = ((x8 instanceof hc3) || (x8 instanceof qc3)) ? BuildConfig.FLAVOR : x8.zzc();
                        }
                        return new pc3(qb3Var.s(str6));
                    }
                    lh.e("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size3) {
                                Object obj5 = arrayList2.get(i7);
                                i7++;
                                qb3Var.p(qb3Var.n(), ((tt1) js0Var2.p).x(js0Var2, (kc3) obj5));
                            }
                        }
                        return new xb3(Double.valueOf(qb3Var.n()));
                    }
                    lh.e("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        ak2.m("some", 1, arrayList2);
                        kc3 x9 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        if (!(x9 instanceof zb3)) {
                            lh.e("Callback should be a method");
                            return null;
                        }
                        if (qb3Var.n() != 0) {
                            zb3 zb3Var2 = (zb3) x9;
                            Iterator m5 = qb3Var.m();
                            while (m5.hasNext()) {
                                int intValue2 = ((Integer) m5.next()).intValue();
                                if (qb3Var.q(intValue2) && zb3Var2.h(js0Var2, Arrays.asList(qb3Var.o(intValue2), new xb3(Double.valueOf(intValue2)), qb3Var)).a().booleanValue()) {
                                    return kc3.j;
                                }
                            }
                        }
                        return kc3.k;
                    }
                    lh.e("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        ak2.o(1, str4, arrayList2);
                        if (qb3Var.n() >= 2) {
                            List l = qb3Var.l();
                            if (arrayList2.isEmpty()) {
                                zb3Var = null;
                            } else {
                                kc3 x10 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                                if (!(x10 instanceof zb3)) {
                                    lh.e("Comparator should be a method");
                                    return null;
                                }
                                zb3Var = (zb3) x10;
                            }
                            Collections.sort(l, new wc3(zb3Var, js0Var2));
                            treeMap3.clear();
                            ArrayList arrayList3 = (ArrayList) l;
                            int size4 = arrayList3.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size4) {
                                Object obj6 = arrayList3.get(i8);
                                i8++;
                                qb3Var.p(i9, (kc3) obj6);
                                i9++;
                            }
                        }
                        return qb3Var;
                    }
                    lh.e("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        ak2.m("every", 1, arrayList2);
                        kc3 x11 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        if (!(x11 instanceof ic3)) {
                            lh.e("Callback should be a method");
                            return null;
                        }
                        if (qb3Var.n() != 0) {
                            break;
                        }
                        return kc3.j;
                    }
                    lh.e("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        ak2.m("shift", 0, arrayList2);
                        if (qb3Var.n() != 0) {
                            kc3 o2 = qb3Var.o(0);
                            qb3Var.r(0);
                            return o2;
                        }
                        return kc3Var;
                    }
                    lh.e("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        ak2.o(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return qb3Var.k();
                        }
                        double n6 = qb3Var.n();
                        double t2 = ak2.t(((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0)).f().doubleValue());
                        double max2 = t2 < 0.0d ? Math.max(t2 + n6, 0.0d) : Math.min(t2, n6);
                        if (arrayList2.size() == 2) {
                            double t3 = ak2.t(((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(1)).f().doubleValue());
                            n6 = t3 < 0.0d ? Math.max(n6 + t3, 0.0d) : Math.min(n6, t3);
                        }
                        qb3 qb3Var8 = new qb3();
                        for (int i10 = (int) max2; i10 < n6; i10++) {
                            qb3Var8.p(qb3Var8.n(), qb3Var.o(i10));
                        }
                        return qb3Var8;
                    }
                    lh.e("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return ti2.o(qb3Var, js0Var2, arrayList2, false);
                    }
                    lh.e("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        ak2.m("reverse", 0, arrayList2);
                        int n7 = qb3Var.n();
                        if (n7 != 0) {
                            for (int i11 = 0; i11 < n7 / 2; i11++) {
                                if (qb3Var.q(i11)) {
                                    kc3 o3 = qb3Var.o(i11);
                                    qb3Var.p(i11, null);
                                    int i12 = (n7 - 1) - i11;
                                    if (qb3Var.q(i12)) {
                                        qb3Var.p(i11, qb3Var.o(i12));
                                    }
                                    qb3Var.p(i12, o3);
                                }
                            }
                        }
                        return qb3Var;
                    }
                    lh.e("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        ak2.o(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            kc3Var = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(0));
                        }
                        kc3 kc3Var5 = kc3Var;
                        if (arrayList2.size() > 1) {
                            double t4 = ak2.t(((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList2.get(1)).f().doubleValue());
                            if (t4 >= qb3Var.n()) {
                                return new xb3(valueOf);
                            }
                            d2 = t4 < 0.0d ? qb3Var.n() + t4 : t4;
                        }
                        Iterator m6 = qb3Var.m();
                        while (m6.hasNext()) {
                            int intValue3 = ((Integer) m6.next()).intValue();
                            double d3 = intValue3;
                            if (d3 >= d2 && ak2.r(qb3Var.o(intValue3), kc3Var5)) {
                                return new xb3(Double.valueOf(d3));
                            }
                        }
                        return new xb3(valueOf);
                    }
                    lh.e("Command not supported");
                    return null;
                default:
                    lh.e("Command not supported");
                    return null;
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        js0Var2 = js0Var;
        str5 = "forEach";
        obj2 = "reduce";
        qb3Var = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = qb3Var.m;
        kc3 kc3Var6 = kc3.e;
        TreeMap treeMap32 = treeMap22;
        double d22 = 0.0d;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        qb3 qb3Var = new qb3();
        for (Map.Entry entry : this.m.entrySet()) {
            boolean z = entry.getValue() instanceof cc3;
            TreeMap treeMap = qb3Var.m;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (kc3) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((kc3) entry.getValue()).k());
            }
        }
        return qb3Var;
    }

    public final List l() {
        ArrayList arrayList = new ArrayList(n());
        for (int i = 0; i < n(); i++) {
            arrayList.add(o(i));
        }
        return arrayList;
    }

    public final Iterator m() {
        return this.m.keySet().iterator();
    }

    public final int n() {
        TreeMap treeMap = this.m;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final kc3 o(int i) {
        kc3 kc3Var;
        if (i < n()) {
            return (!q(i) || (kc3Var = (kc3) this.m.get(Integer.valueOf(i))) == null) ? kc3.e : kc3Var;
        }
        a.c("Attempting to get element outside of current array");
        return null;
    }

    public final void p(int i, kc3 kc3Var) {
        if (i > 32468) {
            lh.g("Array too large");
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.m;
        if (kc3Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), kc3Var);
        }
    }

    public final boolean q(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.m;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void r(int i) {
        TreeMap treeMap = this.m;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, kc3.e);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            kc3 kc3Var = (kc3) treeMap.get(valueOf2);
            if (kc3Var != null) {
                treeMap.put(Integer.valueOf(i - 1), kc3Var);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String s(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.m.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? BuildConfig.FLAVOR : str;
                if (i >= n()) {
                    break;
                }
                kc3 o = o(i);
                sb.append(str2);
                if (!(o instanceof qc3) && !(o instanceof hc3)) {
                    sb.append(o.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return s(",");
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return s(",");
    }

    public qb3() {
        this.m = new TreeMap();
        this.n = new TreeMap();
    }
}
