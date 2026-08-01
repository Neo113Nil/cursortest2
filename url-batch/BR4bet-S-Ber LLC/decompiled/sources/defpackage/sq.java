package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class sq {
    static {
        l9 l9Var = l9.i;
        ej.h("\"\\");
        ej.h("\t ,=");
    }

    public static final boolean a(n30 n30Var) {
        if (kr.b(n30Var.f.b, "HEAD")) {
            return false;
        }
        int i = n30Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && cb0.h(n30Var) == -1 && !"chunked".equalsIgnoreCase(n30.f(n30Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0200, code lost:
    
        if (((java.util.regex.Pattern) r9.g).matcher(r0).matches() == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ej ejVar, uq uqVar, kp kpVar) {
        List list;
        me meVar;
        uq uqVar2;
        me meVar2;
        String str;
        ejVar.getClass();
        uqVar.getClass();
        kpVar.getClass();
        if (ejVar == ej.i) {
            return;
        }
        Pattern pattern = me.j;
        int size = kpVar.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(kpVar.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kpVar.d(i));
            }
        }
        List list2 = ik.f;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = (String) list.get(i2);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = cb0.a;
            char c = ';';
            int e = cb0.e(str2, ';', 0, str2.length());
            char c2 = '=';
            int e2 = cb0.e(str2, '=', 0, e);
            if (e2 != e) {
                int k = cb0.k(str2, 0, e2);
                String substring = str2.substring(k, cb0.l(str2, k, e2));
                if (substring.length() != 0 && cb0.j(substring) == -1) {
                    int k2 = cb0.k(str2, e2 + 1, e);
                    String substring2 = str2.substring(k2, cb0.l(str2, k2, e));
                    if (cb0.j(substring2) == -1) {
                        int i3 = e + 1;
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
                                int e3 = cb0.e(str2, c, i3, length);
                                int e4 = cb0.e(str2, c2, i3, e3);
                                int k3 = cb0.k(str2, i3, e4);
                                String substring3 = str2.substring(k3, cb0.l(str2, k3, e4));
                                if (e4 < e3) {
                                    int k4 = cb0.k(str2, e4 + 1, e3);
                                    str = str2.substring(k4, cb0.l(str2, k4, e3));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = mz.C(str, str.length());
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(str);
                                        j3 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e5) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        compile.getClass();
                                        if (!compile.matcher(str).matches()) {
                                            throw e5;
                                        }
                                        j3 = n70.U(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (str.endsWith(".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String e0 = la0.e0(f70.d0(str, "."));
                                        if (e0 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = e0;
                                        z4 = false;
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str4 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j3 == Long.MIN_VALUE) {
                                    uqVar2 = uqVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        uqVar2 = uqVar;
                                    } else {
                                        uqVar2 = uqVar;
                                        j = j4;
                                    }
                                } else {
                                    uqVar2 = uqVar;
                                    j = j2;
                                }
                                String str5 = uqVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!kr.b(str5, str3)) {
                                    if (n70.Q(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        t20 t20Var = cb0.f;
                                        t20Var.getClass();
                                    }
                                    meVar2 = null;
                                    meVar = meVar2;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !n70.U(str4, "/", false)) {
                                        String b = uqVar2.b();
                                        int c0 = f70.c0(b, '/', 0, 6);
                                        str4 = c0 != 0 ? b.substring(0, c0) : "/";
                                    }
                                    meVar2 = new me(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                    meVar = meVar2;
                                }
                                meVar2 = null;
                                meVar = meVar2;
                            }
                        }
                    }
                }
            }
            meVar = null;
            if (meVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(meVar);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        }
        list2.isEmpty();
    }
}
