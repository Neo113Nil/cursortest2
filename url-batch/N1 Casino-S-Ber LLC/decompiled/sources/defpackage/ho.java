package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class ho {
    static {
        y8 y8Var = y8.i;
        dh.i("\"\\");
        dh.i("\t ,=");
    }

    public static final boolean a(i00 i00Var) {
        if (zo.b(i00Var.f.b, "HEAD")) {
            return false;
        }
        int i = i00Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && r70.h(i00Var) == -1 && !"chunked".equalsIgnoreCase(i00.m(i00Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0200, code lost:
    
        if (((java.util.regex.Pattern) r9.g).matcher(r0).matches() == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(dh dhVar, jo joVar, ym ymVar) {
        List list;
        ld ldVar;
        jo joVar2;
        ld ldVar2;
        String str;
        dhVar.getClass();
        joVar.getClass();
        ymVar.getClass();
        if (dhVar == dh.h) {
            return;
        }
        Pattern pattern = ld.j;
        int size = ymVar.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(ymVar.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(ymVar.d(i));
            }
        }
        List list2 = di.f;
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
            byte[] bArr = r70.a;
            char c = ';';
            int e = r70.e(str2, ';', 0, str2.length());
            char c2 = '=';
            int e2 = r70.e(str2, '=', 0, e);
            if (e2 != e) {
                int k = r70.k(str2, 0, e2);
                String substring = str2.substring(k, r70.l(str2, k, e2));
                if (substring.length() != 0 && r70.j(substring) == -1) {
                    int k2 = r70.k(str2, e2 + 1, e);
                    String substring2 = str2.substring(k2, r70.l(str2, k2, e));
                    if (r70.j(substring2) == -1) {
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
                                int e3 = r70.e(str2, c, i3, length);
                                int e4 = r70.e(str2, c2, i3, e3);
                                int k3 = r70.k(str2, i3, e4);
                                String substring3 = str2.substring(k3, r70.l(str2, k3, e4));
                                if (e4 < e3) {
                                    int k4 = r70.k(str2, e4 + 1, e3);
                                    str = str2.substring(k4, r70.l(str2, k4, e3));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = zo.F(str, str.length());
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
                                        j3 = k40.m0(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
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
                                        String S = e70.S(c40.v0(str, "."));
                                        if (S == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = S;
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
                                    joVar2 = joVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        joVar2 = joVar;
                                    } else {
                                        joVar2 = joVar;
                                        j = j4;
                                    }
                                } else {
                                    joVar2 = joVar;
                                    j = j2;
                                }
                                String str5 = joVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!zo.b(str5, str3)) {
                                    if (k40.i0(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        qz qzVar = r70.f;
                                        qzVar.getClass();
                                    }
                                    ldVar2 = null;
                                    ldVar = ldVar2;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !k40.m0(str4, "/", false)) {
                                        String b = joVar2.b();
                                        int u0 = c40.u0(b, '/', 0, 6);
                                        str4 = u0 != 0 ? b.substring(0, u0) : "/";
                                    }
                                    ldVar2 = new ld(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                    ldVar = ldVar2;
                                }
                                ldVar2 = null;
                                ldVar = ldVar2;
                            }
                        }
                    }
                }
            }
            ldVar = null;
            if (ldVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(ldVar);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        }
        list2.isEmpty();
    }
}
