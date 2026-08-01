package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class mu {
    static {
        y9 y9Var = y9.i;
        sl.h("\"\\");
        sl.h("\t ,=");
    }

    public static final boolean a(v90 v90Var) {
        if (mv.c((String) v90Var.f.c, "HEAD")) {
            return false;
        }
        int i = v90Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && zk0.h(v90Var) == -1 && !"chunked".equalsIgnoreCase(v90.i(v90Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0201, code lost:
    
        if (r9.f.matcher(r0).matches() == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(sl slVar, ou ouVar, bt btVar) {
        List list;
        fg fgVar;
        ou ouVar2;
        fg fgVar2;
        String str;
        slVar.getClass();
        ouVar.getClass();
        btVar.getClass();
        if (slVar == sl.h) {
            return;
        }
        Pattern pattern = fg.j;
        int size = btVar.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(btVar.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(btVar.d(i));
            }
        }
        List list2 = wm.f;
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
            byte[] bArr = zk0.a;
            char c = ';';
            int e = zk0.e(str2, ';', 0, str2.length());
            char c2 = '=';
            int e2 = zk0.e(str2, '=', 0, e);
            if (e2 != e) {
                int k = zk0.k(str2, 0, e2);
                String substring = str2.substring(k, zk0.l(str2, k, e2));
                if (substring.length() != 0 && zk0.j(substring) == -1) {
                    int k2 = zk0.k(str2, e2 + 1, e);
                    String substring2 = str2.substring(k2, zk0.l(str2, k2, e));
                    if (zk0.j(substring2) == -1) {
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
                                int e3 = zk0.e(str2, c, i3, length);
                                int e4 = zk0.e(str2, c2, i3, e3);
                                int k3 = zk0.k(str2, i3, e4);
                                String substring3 = str2.substring(k3, zk0.l(str2, k3, e4));
                                if (e4 < e3) {
                                    int k4 = zk0.k(str2, e4 + 1, e3);
                                    str = str2.substring(k4, zk0.l(str2, k4, e3));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = gk0.B(str, str.length());
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
                                        j3 = uf0.r(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
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
                                        String c0 = bi.c0(mf0.B(str, "."));
                                        if (c0 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = c0;
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
                                    ouVar2 = ouVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        ouVar2 = ouVar;
                                    } else {
                                        ouVar2 = ouVar;
                                        j = j4;
                                    }
                                } else {
                                    ouVar2 = ouVar;
                                    j = j2;
                                }
                                String str5 = ouVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!mv.c(str5, str3)) {
                                    str5.getClass();
                                    if (str5.endsWith(str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        d90 d90Var = zk0.f;
                                        d90Var.getClass();
                                    }
                                    fgVar2 = null;
                                    fgVar = fgVar2;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !uf0.r(str4, "/", false)) {
                                        String b = ouVar2.b();
                                        int z5 = mf0.z(b, '/', 0, 6);
                                        str4 = z5 != 0 ? b.substring(0, z5) : "/";
                                    }
                                    fgVar2 = new fg(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                    fgVar = fgVar2;
                                }
                                fgVar2 = null;
                                fgVar = fgVar2;
                            }
                        }
                    }
                }
            }
            fgVar = null;
            if (fgVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(fgVar);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        }
        list2.isEmpty();
    }
}
