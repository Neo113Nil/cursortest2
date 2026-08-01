package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i5 implements Iterable, f5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f2395d;

    public i5(String str) {
        if (str != null) {
            this.f2395d = str;
        } else {
            te.a1.e("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.valueOf(!this.f2395d.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return new h5(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i5) {
            return this.f2395d.equals(((i5) obj).f2395d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return this.f2395d;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        String str = this.f2395d;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f2395d.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        int i3;
        int i10;
        int i11;
        e7 e7Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                te.a1.e(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        str4 = "undefined";
        String str5 = this.f2395d;
        r8 = false;
        boolean z10 = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    ia.c(str6, arrayList, 1);
                    f5 e2 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    boolean equals = "length".equals(e2.f());
                    d2 d2Var = f5.j;
                    if (equals) {
                        return d2Var;
                    }
                    double doubleValue = e2.g().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i3 = (int) doubleValue) < 0 || i3 >= str5.length()) ? f5.f2284k : d2Var;
                }
                te.a1.e("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    ia.c("toString", arrayList, 0);
                    return this;
                }
                te.a1.e("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    ia.c("toLocaleLowerCase", arrayList, 0);
                    return new i5(str5.toLowerCase());
                }
                te.a1.e("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    ia.h("charAt", 1, arrayList);
                    int r9 = arrayList.isEmpty() ? 0 : (int) ia.r(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue());
                    return (r9 < 0 || r9 >= str5.length()) ? f5.f2285l : new i5(String.valueOf(str5.charAt(r9)));
                }
                te.a1.e("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(str5);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            sb2.append(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(i12)).f());
                        }
                        return new i5(sb2.toString());
                    }
                    return this;
                }
                te.a1.e("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    ia.c("toLowerCase", arrayList, 0);
                    return new i5(str5.toLowerCase(Locale.ENGLISH));
                }
                te.a1.e("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    ia.h("search", 1, arrayList);
                    return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f()).matcher(str5).find() ? new l3(Double.valueOf(r0.start())) : new l3(Double.valueOf(-1.0d));
                }
                te.a1.e("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    ia.c("toLocaleUpperCase", arrayList, 0);
                    return new i5(str5.toUpperCase());
                }
                te.a1.e("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    ia.h("lastIndexOf", 2, arrayList);
                    String f3 = arrayList.size() > 0 ? ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f() : "undefined";
                    return new l3(Double.valueOf(str5.lastIndexOf(f3, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) ? Double.POSITIVE_INFINITY : ia.r(r1)))));
                }
                te.a1.e("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    ia.c("toUpperCase", arrayList, 0);
                    return new i5(str5.toUpperCase(Locale.ENGLISH));
                }
                te.a1.e("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    ia.c("toUpperCase", arrayList, 0);
                    return new i5(str5.trim());
                }
                te.a1.e("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    ia.h("match", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f()).matcher(str5);
                    return matcher.find() ? new n1(Arrays.asList(new i5(matcher.group()))) : f5.f2281c;
                }
                te.a1.e("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    ia.h("slice", 2, arrayList);
                    double r10 = ia.r(!arrayList.isEmpty() ? ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue() : 0.0d);
                    double max = r10 < 0.0d ? Math.max(str5.length() + r10, 0.0d) : Math.min(r10, str5.length());
                    double r11 = ia.r(arrayList.size() > 1 ? ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue() : str5.length());
                    int i13 = (int) max;
                    return new i5(str5.substring(i13, Math.max(0, ((int) (r11 < 0.0d ? Math.max(str5.length() + r11, 0.0d) : Math.min(r11, str5.length()))) - i13) + i13));
                }
                te.a1.e("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    ia.h("split", 2, arrayList);
                    if (str5.length() == 0) {
                        return new n1(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String f10 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f();
                        long p4 = arrayList.size() > 1 ? ia.p(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) & 4294967295L : 2147483647L;
                        if (p4 == 0) {
                            return new n1();
                        }
                        String[] split = str5.split(Pattern.quote(f10), ((int) p4) + 1);
                        int length = split.length;
                        if (f10.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i10 = length - 1;
                            i11 = isEmpty;
                            z10 = isEmpty;
                            break;
                        }
                        i10 = length;
                        i11 = z10;
                        if (length > p4) {
                            i10--;
                        }
                        while (i11 < i10) {
                            arrayList2.add(new i5(split[i11]));
                            i11++;
                        }
                    }
                    return new n1(arrayList2);
                }
                te.a1.e("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    ia.h("substring", 2, arrayList);
                    int r12 = !arrayList.isEmpty() ? (int) ia.r(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).g().doubleValue()) : 0;
                    int r13 = arrayList.size() > 1 ? (int) ia.r(((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1)).g().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(r12, 0), str5.length());
                    int min2 = Math.min(Math.max(r13, 0), str5.length());
                    return new i5(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                te.a1.e("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    ia.h("replace", 2, arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    f5 f5Var = f5.f2280b;
                    if (!isEmpty2) {
                        str4 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f();
                        if (arrayList.size() > 1) {
                            f5Var = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                        }
                    }
                    String str7 = str4;
                    int indexOf = str5.indexOf(str7);
                    if (indexOf >= 0) {
                        if (f5Var instanceof e4) {
                            f5Var = ((e4) f5Var).a(e7Var, Arrays.asList(new i5(str7), new l3(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String f11 = f5Var.f();
                        String substring2 = str5.substring(str7.length() + indexOf);
                        return new i5(v4.a.p(new StringBuilder(substring.length() + String.valueOf(f11).length() + substring2.length()), substring, f11, substring2));
                    }
                    return this;
                }
                te.a1.e("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    ia.h("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        e7Var2 = e7Var;
                    } else {
                        e7Var2 = e7Var;
                        str4 = ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList.get(0)).f();
                    }
                    return new l3(Double.valueOf(str5.indexOf(str4, (int) ia.r(arrayList.size() < 2 ? 0.0d : ((l5) e7Var2.f2260i).e(e7Var2, (f5) arrayList.get(1)).g().doubleValue()))));
                }
                te.a1.e("Command not supported");
                return null;
            default:
                te.a1.e("Command not supported");
                return null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h5(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return new i5(this.f2395d);
    }

    public final String toString() {
        String str = this.f2395d;
        return v4.a.p(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
