package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class wo {
    static {
        t8 t8Var = t8.i;
        vg.j("\"\\");
        vg.j("\t ,=");
    }

    public static final boolean a(y00 y00Var) {
        if (op.d((String) y00Var.f.c, "HEAD")) {
            return false;
        }
        int i = y00Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && y70.h(y00Var) == -1 && !"chunked".equalsIgnoreCase(y00.m(y00Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0200, code lost:
    
        if (((java.util.regex.Pattern) r9.g).matcher(r0).matches() == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(vg vgVar, yo yoVar, nn nnVar) {
        List list;
        pd pdVar;
        yo yoVar2;
        pd pdVar2;
        String str;
        vgVar.getClass();
        yoVar.getClass();
        nnVar.getClass();
        if (vgVar == vg.h) {
            return;
        }
        Pattern pattern = pd.j;
        int size = nnVar.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(nnVar.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(nnVar.d(i));
            }
        }
        List list2 = vh.f;
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
            byte[] bArr = y70.a;
            char c = ';';
            int e = y70.e(str2, ';', 0, str2.length());
            char c2 = '=';
            int e2 = y70.e(str2, '=', 0, e);
            if (e2 != e) {
                int k = y70.k(str2, 0, e2);
                String substring = str2.substring(k, y70.l(str2, k, e2));
                if (substring.length() != 0 && y70.j(substring) == -1) {
                    int k2 = y70.k(str2, e2 + 1, e);
                    String substring2 = str2.substring(k2, y70.l(str2, k2, e));
                    if (y70.j(substring2) == -1) {
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
                                int e3 = y70.e(str2, c, i3, length);
                                int e4 = y70.e(str2, c2, i3, e3);
                                int k3 = y70.k(str2, i3, e4);
                                String substring3 = str2.substring(k3, y70.l(str2, k3, e4));
                                if (e4 < e3) {
                                    int k4 = y70.k(str2, e4 + 1, e3);
                                    str = str2.substring(k4, y70.l(str2, k4, e3));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = j8.I(str, str.length());
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
                                        j3 = t40.e0(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
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
                                        String U = op.U(l40.n0(str, "."));
                                        if (U == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = U;
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
                                    yoVar2 = yoVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        yoVar2 = yoVar;
                                    } else {
                                        yoVar2 = yoVar;
                                        j = j4;
                                    }
                                } else {
                                    yoVar2 = yoVar;
                                    j = j2;
                                }
                                String str5 = yoVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!op.d(str5, str3)) {
                                    if (t40.a0(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        f00 f00Var = y70.f;
                                        f00Var.getClass();
                                    }
                                    pdVar2 = null;
                                    pdVar = pdVar2;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !t40.e0(str4, "/", false)) {
                                        String b = yoVar2.b();
                                        int m0 = l40.m0(b, '/', 0, 6);
                                        str4 = m0 != 0 ? b.substring(0, m0) : "/";
                                    }
                                    pdVar2 = new pd(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                    pdVar = pdVar2;
                                }
                                pdVar2 = null;
                                pdVar = pdVar2;
                            }
                        }
                    }
                }
            }
            pdVar = null;
            if (pdVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(pdVar);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        }
        list2.isEmpty();
    }
}
