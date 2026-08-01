package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n1 implements Iterable, f5, b5 {

    /* renamed from: d, reason: collision with root package name */
    public final TreeMap f2557d;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f2558e;

    public n1(List list) {
        this();
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                s(i3, (f5) list.get(i3));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final f5 c(String str) {
        f5 f5Var;
        return "length".equals(str) ? new l3(Double.valueOf(q())) : (!h(str) || (f5Var = (f5) this.f2558e.get(str)) == null) ? f5.f2280b : f5Var;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return new n0(this, this.f2557d.keySet().iterator(), this.f2558e.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (q() != n1Var.q()) {
            return false;
        }
        TreeMap treeMap = this.f2557d;
        if (treeMap.isEmpty()) {
            return n1Var.f2557d.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!r(intValue).equals(n1Var.r(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        TreeMap treeMap = this.f2557d;
        return treeMap.size() == 1 ? r(0).g() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final boolean h(String str) {
        return "length".equals(str) || this.f2558e.containsKey(str);
    }

    public final int hashCode() {
        return this.f2557d.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dc, code lost:
    
        if (com.google.android.gms.internal.measurement.h.f(r7, r2, (com.google.android.gms.internal.measurement.e5) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).q() == r7.q()) goto L168;
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
    /* JADX WARN: Removed duplicated region for block: B:351:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // com.google.android.gms.internal.measurement.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        e7 e7Var2;
        String str5;
        Object obj2;
        n1 n1Var;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d10;
        String str6;
        e4 e4Var;
        String str7 = "toString";
        String str8 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
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
                            return b5.m(this, new i5(str), e7Var, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        n1Var = this;
                        e7Var2 = e7Var;
                    }
                }
            }
            obj = "unshift";
            e7Var2 = e7Var;
            arrayList2 = arrayList;
            str5 = "forEach";
            n1Var = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = n1Var.f2557d;
            f5 f5Var = f5.f2280b;
            TreeMap treeMap3 = treeMap2;
            double d11 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        ia.c(str9, arrayList2, 0);
                        return new i5(n1Var.v(","));
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        n1 n1Var2 = (n1) n1Var.n();
                        if (!arrayList2.isEmpty()) {
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList2.get(i3);
                                i3++;
                                f5 e2 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) obj3);
                                if (e2 instanceof t2) {
                                    kotlin.collections.i0.l("Failed evaluation of arguments");
                                    return null;
                                }
                                int q3 = n1Var2.q();
                                if (e2 instanceof n1) {
                                    n1 n1Var3 = (n1) e2;
                                    Iterator p4 = n1Var3.p();
                                    while (p4.hasNext()) {
                                        Integer num = (Integer) p4.next();
                                        n1Var2.s(num.intValue() + q3, n1Var3.r(num.intValue()));
                                    }
                                } else {
                                    n1Var2.s(q3, e2);
                                }
                            }
                        }
                        return n1Var2;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        ia.c(str10, arrayList2, 1);
                        f5 e9 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        if (!(e9 instanceof e5)) {
                            te.a1.e("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() == 0) {
                            return new n1();
                        }
                        n1 n1Var4 = (n1) n1Var.n();
                        n1 f3 = h.f(n1Var, e7Var2, (e5) e9, null, Boolean.TRUE);
                        n1 n1Var5 = new n1();
                        Iterator p10 = f3.p();
                        while (p10.hasNext()) {
                            n1Var5.s(n1Var5.q(), n1Var4.r(((Integer) p10.next()).intValue()));
                        }
                        return n1Var5;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return h.d(n1Var, e7Var2, arrayList2, true);
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new n1();
                        }
                        f5 f5Var2 = (f5) arrayList2.get(0);
                        l5 l5Var = (l5) e7Var2.f2260i;
                        l5 l5Var2 = (l5) e7Var2.f2260i;
                        int r9 = (int) ia.r(l5Var.e(e7Var2, f5Var2).g().doubleValue());
                        if (r9 < 0) {
                            r9 = Math.max(0, n1Var.q() + r9);
                        } else if (r9 > n1Var.q()) {
                            r9 = n1Var.q();
                        }
                        int q7 = n1Var.q();
                        n1 n1Var6 = new n1();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) ia.r(l5Var2.e(e7Var2, (f5) arrayList2.get(1)).g().doubleValue()));
                            if (max > 0) {
                                for (int i10 = r9; i10 < Math.min(q7, r9 + max); i10++) {
                                    n1Var6.s(n1Var6.q(), n1Var.r(r9));
                                    n1Var.u(r9);
                                }
                            }
                            int i11 = 2;
                            if (arrayList2.size() > 2) {
                                while (i11 < arrayList2.size()) {
                                    f5 e10 = l5Var2.e(e7Var2, (f5) arrayList2.get(i11));
                                    if (e10 instanceof t2) {
                                        te.a1.e("Failed to parse elements to add");
                                        return null;
                                    }
                                    int i12 = (r9 + i11) - 2;
                                    if (i12 < 0) {
                                        te.a1.e(v4.a.n(new StringBuilder(String.valueOf(i12).length() + 21), "Invalid value index: ", i12));
                                        return null;
                                    }
                                    if (i12 >= n1Var.q()) {
                                        n1Var.s(i12, e10);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i12) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            f5 f5Var3 = (f5) treeMap4.get(valueOf2);
                                            if (f5Var3 != null) {
                                                n1Var.s(intValue + 1, f5Var3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        n1Var.s(i12, e10);
                                    }
                                    i11++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (r9 < q7) {
                                n1Var6.s(n1Var6.q(), n1Var.r(r9));
                                n1Var.s(r9, null);
                                r9++;
                            }
                        }
                        return n1Var6;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        ia.c(str11, arrayList2, 1);
                        f5 e11 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        if (!(e11 instanceof e5)) {
                            te.a1.e("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() != 0) {
                            h.f(n1Var, e7Var2, (e5) e11, null, null);
                            return f5Var;
                        }
                        return f5Var;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        ia.h(str12, 2, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            f5Var = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        }
                        f5 f5Var4 = f5Var;
                        int q10 = n1Var.q() - 1;
                        if (arrayList2.size() > 1) {
                            f5 e12 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(1));
                            d10 = Double.isNaN(e12.g().doubleValue()) ? n1Var.q() - 1 : ia.r(e12.g().doubleValue());
                            if (d10 < 0.0d) {
                                d10 += n1Var.q();
                            }
                        } else {
                            d10 = q10;
                        }
                        if (d10 < 0.0d) {
                            return new l3(valueOf);
                        }
                        for (int min = (int) Math.min(n1Var.q(), d10); min >= 0; min--) {
                            if (n1Var.t(min) && ia.o(n1Var.r(min), f5Var4)) {
                                return new l3(Double.valueOf(min));
                            }
                        }
                        return new l3(valueOf);
                    }
                    te.a1.e("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            n1 n1Var7 = new n1();
                            int size2 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = arrayList2.get(i13);
                                i13++;
                                f5 e13 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) obj4);
                                if (e13 instanceof t2) {
                                    kotlin.collections.i0.l("Argument evaluation failed");
                                    return null;
                                }
                                n1Var7.s(n1Var7.q(), e13);
                            }
                            int q11 = n1Var7.q();
                            Iterator p11 = n1Var.p();
                            while (p11.hasNext()) {
                                Integer num2 = (Integer) p11.next();
                                n1Var7.s(num2.intValue() + q11, n1Var.r(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator p12 = n1Var7.p();
                            while (p12.hasNext()) {
                                Integer num3 = (Integer) p12.next();
                                n1Var.s(num3.intValue(), n1Var7.r(num3.intValue()));
                            }
                        }
                        return new l3(Double.valueOf(n1Var.q()));
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        ia.c("map", arrayList2, 1);
                        f5 e14 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        if (e14 instanceof e5) {
                            return n1Var.q() == 0 ? new n1() : h.f(n1Var, e7Var2, (e5) e14, null, null);
                        }
                        te.a1.e("Callback should be a method");
                        return null;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        ia.c("pop", arrayList2, 0);
                        int q12 = n1Var.q();
                        if (q12 != 0) {
                            int i14 = q12 - 1;
                            f5 r10 = n1Var.r(i14);
                            n1Var.u(i14);
                            return r10;
                        }
                        return f5Var;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        ia.h("join", 1, arrayList2);
                        if (n1Var.q() == 0) {
                            return f5.f2285l;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            f5 e15 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                            str6 = ((e15 instanceof d5) || (e15 instanceof j5)) ? "" : e15.f();
                        }
                        return new i5(n1Var.v(str6));
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size3) {
                                Object obj5 = arrayList2.get(i15);
                                i15++;
                                n1Var.s(n1Var.q(), ((l5) e7Var2.f2260i).e(e7Var2, (f5) obj5));
                            }
                        }
                        return new l3(Double.valueOf(n1Var.q()));
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        ia.c("some", arrayList2, 1);
                        f5 e16 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        if (!(e16 instanceof e4)) {
                            te.a1.e("Callback should be a method");
                            return null;
                        }
                        if (n1Var.q() != 0) {
                            e4 e4Var2 = (e4) e16;
                            Iterator p13 = n1Var.p();
                            while (p13.hasNext()) {
                                int intValue2 = ((Integer) p13.next()).intValue();
                                if (n1Var.t(intValue2) && e4Var2.a(e7Var2, Arrays.asList(n1Var.r(intValue2), new l3(Double.valueOf(intValue2)), n1Var)).b().booleanValue()) {
                                    return f5.j;
                                }
                            }
                        }
                        return f5.f2284k;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        ia.h(str4, 1, arrayList2);
                        if (n1Var.q() >= 2) {
                            List o6 = n1Var.o();
                            if (arrayList2.isEmpty()) {
                                e4Var = null;
                            } else {
                                f5 e17 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                                if (!(e17 instanceof e4)) {
                                    te.a1.e("Comparator should be a method");
                                    return null;
                                }
                                e4Var = (e4) e17;
                            }
                            Collections.sort(o6, new m5(e4Var, e7Var2));
                            treeMap3.clear();
                            ArrayList arrayList3 = (ArrayList) o6;
                            int size4 = arrayList3.size();
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < size4) {
                                Object obj6 = arrayList3.get(i16);
                                i16++;
                                n1Var.s(i17, (f5) obj6);
                                i17++;
                            }
                        }
                        return n1Var;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        ia.c("every", arrayList2, 1);
                        f5 e18 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        if (!(e18 instanceof e5)) {
                            te.a1.e("Callback should be a method");
                            return null;
                        }
                        if (n1Var.q() != 0) {
                            break;
                        }
                        return f5.j;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        ia.c("shift", arrayList2, 0);
                        if (n1Var.q() != 0) {
                            f5 r11 = n1Var.r(0);
                            n1Var.u(0);
                            return r11;
                        }
                        return f5Var;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        ia.h("slice", 2, arrayList2);
                        if (arrayList2.isEmpty()) {
                            return n1Var.n();
                        }
                        double q13 = n1Var.q();
                        double r12 = ia.r(((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0)).g().doubleValue());
                        double max2 = r12 < 0.0d ? Math.max(r12 + q13, 0.0d) : Math.min(r12, q13);
                        if (arrayList2.size() == 2) {
                            double r13 = ia.r(((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(1)).g().doubleValue());
                            q13 = r13 < 0.0d ? Math.max(q13 + r13, 0.0d) : Math.min(q13, r13);
                        }
                        n1 n1Var8 = new n1();
                        for (int i18 = (int) max2; i18 < q13; i18++) {
                            n1Var8.s(n1Var8.q(), n1Var.r(i18));
                        }
                        return n1Var8;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return h.d(n1Var, e7Var2, arrayList2, false);
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        ia.c("reverse", arrayList2, 0);
                        int q14 = n1Var.q();
                        if (q14 != 0) {
                            for (int i19 = 0; i19 < q14 / 2; i19++) {
                                if (n1Var.t(i19)) {
                                    f5 r14 = n1Var.r(i19);
                                    n1Var.s(i19, null);
                                    int i20 = (q14 - 1) - i19;
                                    if (n1Var.t(i20)) {
                                        n1Var.s(i19, n1Var.r(i20));
                                    }
                                    n1Var.s(i20, r14);
                                }
                            }
                        }
                        return n1Var;
                    }
                    te.a1.e("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        ia.h("indexOf", 2, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            f5Var = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(0));
                        }
                        f5 f5Var5 = f5Var;
                        if (arrayList2.size() > 1) {
                            double r15 = ia.r(((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList2.get(1)).g().doubleValue());
                            if (r15 >= n1Var.q()) {
                                return new l3(valueOf);
                            }
                            d11 = r15 < 0.0d ? n1Var.q() + r15 : r15;
                        }
                        Iterator p14 = n1Var.p();
                        while (p14.hasNext()) {
                            int intValue3 = ((Integer) p14.next()).intValue();
                            double d12 = intValue3;
                            if (d12 >= d11 && ia.o(n1Var.r(intValue3), f5Var5)) {
                                return new l3(Double.valueOf(d12));
                            }
                        }
                        return new l3(valueOf);
                    }
                    te.a1.e("Command not supported");
                    return null;
                default:
                    te.a1.e("Command not supported");
                    return null;
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        e7Var2 = e7Var;
        str5 = "forEach";
        obj2 = "reduce";
        n1Var = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = n1Var.f2557d;
        f5 f5Var6 = f5.f2280b;
        TreeMap treeMap32 = treeMap22;
        double d112 = 0.0d;
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

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h5(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final void k(String str, f5 f5Var) {
        TreeMap treeMap = this.f2558e;
        if (f5Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, f5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        n1 n1Var = new n1();
        for (Map.Entry entry : this.f2557d.entrySet()) {
            boolean z10 = entry.getValue() instanceof b5;
            TreeMap treeMap = n1Var.f2557d;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (f5) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((f5) entry.getValue()).n());
            }
        }
        return n1Var;
    }

    public final List o() {
        ArrayList arrayList = new ArrayList(q());
        for (int i3 = 0; i3 < q(); i3++) {
            arrayList.add(r(i3));
        }
        return arrayList;
    }

    public final Iterator p() {
        return this.f2557d.keySet().iterator();
    }

    public final int q() {
        TreeMap treeMap = this.f2557d;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final f5 r(int i3) {
        f5 f5Var;
        if (i3 < q()) {
            return (!t(i3) || (f5Var = (f5) this.f2557d.get(Integer.valueOf(i3))) == null) ? f5.f2280b : f5Var;
        }
        kotlin.collections.i0.g("Attempting to get element outside of current array");
        return null;
    }

    public final void s(int i3, f5 f5Var) {
        if (i3 > 32468) {
            kotlin.collections.i0.l("Array too large");
            return;
        }
        if (i3 < 0) {
            kotlin.collections.i0.g(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 21), "Out of bounds index: ", i3));
            return;
        }
        TreeMap treeMap = this.f2557d;
        if (f5Var == null) {
            treeMap.remove(Integer.valueOf(i3));
        } else {
            treeMap.put(Integer.valueOf(i3), f5Var);
        }
    }

    public final boolean t(int i3) {
        if (i3 >= 0) {
            TreeMap treeMap = this.f2557d;
            if (i3 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i3));
            }
        }
        kotlin.collections.i0.g(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 21), "Out of bounds index: ", i3));
        return false;
    }

    public final String toString() {
        return v(",");
    }

    public final void u(int i3) {
        TreeMap treeMap = this.f2557d;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i3 > intValue || i3 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i3));
        if (i3 == intValue) {
            int i10 = i3 - 1;
            Integer valueOf = Integer.valueOf(i10);
            if (treeMap.containsKey(valueOf) || i10 < 0) {
                return;
            }
            treeMap.put(valueOf, f5.f2280b);
            return;
        }
        while (true) {
            i3++;
            if (i3 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i3);
            f5 f5Var = (f5) treeMap.get(valueOf2);
            if (f5Var != null) {
                treeMap.put(Integer.valueOf(i3 - 1), f5Var);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String v(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f2557d.isEmpty()) {
            int i3 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i3 >= q()) {
                    break;
                }
                f5 r9 = r(i3);
                sb2.append(str2);
                if (!(r9 instanceof j5) && !(r9 instanceof d5)) {
                    sb2.append(r9.f());
                }
                i3++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public n1() {
        this.f2557d = new TreeMap();
        this.f2558e = new TreeMap();
    }
}
