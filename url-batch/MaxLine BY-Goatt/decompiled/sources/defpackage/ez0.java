package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ez0 {
    static {
        dr drVar = dr.p;
        nj.j("\"\\");
        nj.j("\t ,=");
    }

    public static final boolean a(w92 w92Var) {
        if (Intrinsics.b((String) w92Var.m.o, "HEAD")) {
            return false;
        }
        int i = w92Var.p;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && n33.h(w92Var) == -1 && !"chunked".equalsIgnoreCase(w92.b(w92Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ec, code lost:
    
        if (defpackage.n33.e.a(r0) == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(qb2 qb2Var, kz0 kz0Var, mx0 mx0Var) {
        List list;
        List list2;
        v30 v30Var;
        kz0 kz0Var2;
        String str;
        qb2Var.getClass();
        kz0Var.getClass();
        mx0Var.getClass();
        if (qb2Var == qb2.L) {
            return;
        }
        Pattern pattern = v30.j;
        int size = mx0Var.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(mx0Var.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mx0Var.d(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        } else {
            list = ah0.m;
        }
        List list3 = list;
        int size2 = list3.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = (String) list3.get(i2);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = n33.a;
            char c = ';';
            int d = n33.d(str2, ';', 0, str2.length());
            char c2 = '=';
            int d2 = n33.d(str2, '=', 0, d);
            if (d2 != d) {
                int k = n33.k(str2, 0, d2);
                String substring = str2.substring(k, n33.l(str2, k, d2));
                if (substring.length() != 0 && n33.j(substring) == -1) {
                    int k2 = n33.k(str2, d2 + 1, d);
                    String substring2 = str2.substring(k2, n33.l(str2, k2, d));
                    if (n33.j(substring2) == -1) {
                        int i3 = d + 1;
                        int length = str2.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j2 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        long j3 = -1;
                        boolean z4 = true;
                        while (true) {
                            if (i3 < length) {
                                int d3 = n33.d(str2, c, i3, length);
                                int d4 = n33.d(str2, c2, i3, d3);
                                int k3 = n33.k(str2, i3, d4);
                                String substring3 = str2.substring(k3, n33.l(str2, k3, d4));
                                if (d4 < d3) {
                                    int k4 = n33.k(str2, d4 + 1, d3);
                                    str = str2.substring(k4, n33.l(str2, k4, d3));
                                } else {
                                    str = BuildConfig.FLAVOR;
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = s03.E(str.length(), str);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i3 = d3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j3 = Long.parseLong(str);
                                        if (j3 <= 0) {
                                            j3 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e) {
                                        if (!new Regex("-?\\d+").a(str)) {
                                            throw e;
                                        }
                                        j3 = tp2.o(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                    i3 = d3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (tp2.h(str, ".", false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String h0 = tk3.h0(up2.C(str, "."));
                                        if (h0 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = h0;
                                        z4 = false;
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str4 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i3 = d3 + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j3 == Long.MIN_VALUE) {
                                    kz0Var2 = kz0Var;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        kz0Var2 = kz0Var;
                                    } else {
                                        kz0Var2 = kz0Var;
                                        j = j4;
                                    }
                                } else {
                                    kz0Var2 = kz0Var;
                                    j = j2;
                                }
                                String str5 = kz0Var2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!Intrinsics.b(str5, str3)) {
                                    if (tp2.h(str5, str3, false)) {
                                        if (str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        }
                                    }
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !tp2.o(str4, "/", false)) {
                                        String b = kz0Var2.b();
                                        int z5 = up2.z(b, '/', 0, 6);
                                        str4 = z5 != 0 ? b.substring(0, z5) : "/";
                                    }
                                    v30Var = new v30(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                }
                            }
                        }
                    }
                }
            }
            v30Var = null;
            if (v30Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(v30Var);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        } else {
            list2 = ah0.m;
        }
        list2.isEmpty();
    }
}
