package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pc3 implements Iterable, kc3 {
    public final String m;

    public pc3(String str) {
        if (str != null) {
            this.m = str;
        } else {
            lh.e("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.valueOf(!this.m.isEmpty());
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return new mc3(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pc3) {
            return this.m.equals(((pc3) obj).m);
        }
        return false;
    }

    @Override // defpackage.kc3
    public final Double f() {
        String str = this.m;
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
        return this.m.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mc3(1, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02eb, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        js0 js0Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || InAppPurchaseConstants.METHOD_TO_STRING.equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                lh.e(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        str4 = "undefined";
        String str5 = this.m;
        r8 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    ak2.m(str6, 1, arrayList);
                    kc3 x = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    boolean equals = "length".equals(x.zzc());
                    sb3 sb3Var = kc3.j;
                    if (equals) {
                        return sb3Var;
                    }
                    double doubleValue = x.f().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) ? kc3.k : sb3Var;
                }
                lh.e("Command not supported");
                return null;
            case -1776922004:
                if (str.equals(InAppPurchaseConstants.METHOD_TO_STRING)) {
                    ak2.m(InAppPurchaseConstants.METHOD_TO_STRING, 0, arrayList);
                    return this;
                }
                lh.e("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    ak2.m("toLocaleLowerCase", 0, arrayList);
                    return new pc3(str5.toLowerCase());
                }
                lh.e("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    ak2.o(1, "charAt", arrayList);
                    int t = arrayList.isEmpty() ? 0 : (int) ak2.t(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue());
                    return (t < 0 || t >= str5.length()) ? kc3.l : new pc3(String.valueOf(str5.charAt(t)));
                }
                lh.e("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(i4)).zzc());
                        }
                        return new pc3(sb.toString());
                    }
                    return this;
                }
                lh.e("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    ak2.m("toLowerCase", 0, arrayList);
                    return new pc3(str5.toLowerCase(Locale.ENGLISH));
                }
                lh.e("Command not supported");
                return null;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    ak2.o(1, FirebaseAnalytics.Event.SEARCH, arrayList);
                    return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc()).matcher(str5).find() ? new xb3(Double.valueOf(r0.start())) : new xb3(Double.valueOf(-1.0d));
                }
                lh.e("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    ak2.m("toLocaleUpperCase", 0, arrayList);
                    return new pc3(str5.toUpperCase());
                }
                lh.e("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    ak2.o(2, "lastIndexOf", arrayList);
                    String zzc = arrayList.size() > 0 ? ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc() : "undefined";
                    return new xb3(Double.valueOf(str5.lastIndexOf(zzc, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) ? Double.POSITIVE_INFINITY : ak2.t(r1)))));
                }
                lh.e("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    ak2.m("toUpperCase", 0, arrayList);
                    return new pc3(str5.toUpperCase(Locale.ENGLISH));
                }
                lh.e("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    ak2.m("toUpperCase", 0, arrayList);
                    return new pc3(str5.trim());
                }
                lh.e("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    ak2.o(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? BuildConfig.FLAVOR : ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc()).matcher(str5);
                    return matcher.find() ? new qb3(Arrays.asList(new pc3(matcher.group()))) : kc3.f;
                }
                lh.e("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    ak2.o(2, "slice", arrayList);
                    double t2 = ak2.t(!arrayList.isEmpty() ? ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue() : 0.0d);
                    double max = t2 < 0.0d ? Math.max(str5.length() + t2, 0.0d) : Math.min(t2, str5.length());
                    double t3 = ak2.t(arrayList.size() > 1 ? ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue() : str5.length());
                    int i5 = (int) max;
                    return new pc3(str5.substring(i5, Math.max(0, ((int) (t3 < 0.0d ? Math.max(str5.length() + t3, 0.0d) : Math.min(t3, str5.length()))) - i5) + i5));
                }
                lh.e("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    ak2.o(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new qb3(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String zzc2 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc();
                        long s = arrayList.size() > 1 ? ak2.s(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) & 4294967295L : 2147483647L;
                        if (s == 0) {
                            return new qb3();
                        }
                        String[] split = str5.split(Pattern.quote(zzc2), ((int) s) + 1);
                        int length = split.length;
                        if (zzc2.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length;
                        i3 = z;
                        if (length > s) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new pc3(split[i3]));
                            i3++;
                        }
                    }
                    return new qb3(arrayList2);
                }
                lh.e("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    ak2.o(2, "substring", arrayList);
                    int t4 = !arrayList.isEmpty() ? (int) ak2.t(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).f().doubleValue()) : 0;
                    int t5 = arrayList.size() > 1 ? (int) ak2.t(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1)).f().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(t4, 0), str5.length());
                    int min2 = Math.min(Math.max(t5, 0), str5.length());
                    return new pc3(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                lh.e("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    ak2.o(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    kc3 kc3Var = kc3.e;
                    if (!isEmpty2) {
                        str4 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            kc3Var = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                        }
                    }
                    String str7 = str4;
                    int indexOf = str5.indexOf(str7);
                    if (indexOf >= 0) {
                        if (kc3Var instanceof zb3) {
                            kc3Var = ((zb3) kc3Var).h(js0Var, Arrays.asList(new pc3(str7), new xb3(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String zzc3 = kc3Var.zzc();
                        String substring2 = str5.substring(str7.length() + indexOf);
                        StringBuilder sb2 = new StringBuilder(substring.length() + String.valueOf(zzc3).length() + substring2.length());
                        sb2.append(substring);
                        sb2.append(zzc3);
                        sb2.append(substring2);
                        return new pc3(sb2.toString());
                    }
                    return this;
                }
                lh.e("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    ak2.o(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        js0Var2 = js0Var;
                    } else {
                        js0Var2 = js0Var;
                        str4 = ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList.get(0)).zzc();
                    }
                    return new xb3(Double.valueOf(str5.indexOf(str4, (int) ak2.t(arrayList.size() < 2 ? 0.0d : ((tt1) js0Var2.p).x(js0Var2, (kc3) arrayList.get(1)).f().doubleValue()))));
                }
                lh.e("Command not supported");
                return null;
            default:
                lh.e("Command not supported");
                return null;
        }
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return new pc3(this.m);
    }

    public final String toString() {
        String str = this.m;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return this.m;
    }
}
