package x7;

import e6.u;
import f8.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r6.k;
import s7.l;
import s7.s;
import z6.h;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e {
    static {
        i iVar = i.f3600i;
        m4.f.j("\"\\");
        m4.f.j("\t ,=");
    }

    public static final boolean a(s sVar) {
        if (k.a((String) sVar.f8683f.f437d, "HEAD")) {
            return false;
        }
        int i7 = sVar.f8686i;
        return (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && t7.b.i(sVar) == -1 && !"chunked".equalsIgnoreCase(s.b("Transfer-Encoding", sVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e9, code lost:
    
        if (r3.f10131f.matcher(r0).matches() == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(s7.b bVar, l lVar, s7.k kVar) {
        List list;
        int i7;
        s7.i iVar;
        long j8;
        k.f(bVar, "<this>");
        k.f(lVar, "url");
        k.f(kVar, "headers");
        if (bVar == s7.b.f8540b) {
            return;
        }
        Pattern pattern = s7.i.f8589j;
        int size = kVar.size();
        int i8 = 0;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if ("Set-Cookie".equalsIgnoreCase(kVar.g(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kVar.w(i9));
            }
        }
        List list2 = u.f2826f;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            k.e(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i10 = 0;
        ArrayList arrayList2 = null;
        while (i10 < size2) {
            String str = (String) list.get(i10);
            k.f(str, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = t7.b.f8932a;
            char c4 = ';';
            int f9 = t7.b.f(str, ';', i8, str.length());
            char c6 = '=';
            int f10 = t7.b.f(str, '=', i8, f9);
            if (f10 != f9) {
                String x8 = t7.b.x(i8, f10, str);
                if (x8.length() != 0 && t7.b.k(x8) == -1) {
                    String x9 = t7.b.x(f10 + 1, f9, str);
                    if (t7.b.k(x9) == -1) {
                        int i11 = f9 + 1;
                        int length = str.length();
                        int i12 = i8;
                        int i13 = i12;
                        int i14 = i13;
                        long j9 = -1;
                        long j10 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z8 = true;
                        while (true) {
                            if (i11 < length) {
                                int f11 = t7.b.f(str, c4, i11, length);
                                int f12 = t7.b.f(str, c6, i11, f11);
                                String x10 = t7.b.x(i11, f12, str);
                                String x11 = f12 < f11 ? t7.b.x(f12 + 1, f11, str) : "";
                                if (x10.equalsIgnoreCase("expires")) {
                                    try {
                                        j10 = t6.a.H(x11, x11.length());
                                        i13 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i11 = f11 + 1;
                                    c4 = ';';
                                    c6 = '=';
                                } else if (x10.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x11);
                                        j9 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e9) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        k.e(compile, "compile(...)");
                                        if (!compile.matcher(x11).matches()) {
                                            throw e9;
                                        }
                                        j9 = o.v(x11, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i13 = 1;
                                    i11 = f11 + 1;
                                    c4 = ';';
                                    c6 = '=';
                                } else {
                                    if (x10.equalsIgnoreCase("domain")) {
                                        if (o.o(false, x11, ".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String S = r4.a.S(h.N(x11, "."));
                                        if (S == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = S;
                                        z8 = false;
                                    } else if (x10.equalsIgnoreCase("path")) {
                                        str2 = x11;
                                    } else if (x10.equalsIgnoreCase("secure")) {
                                        i14 = 1;
                                    } else if (x10.equalsIgnoreCase("httponly")) {
                                        i12 = 1;
                                    }
                                    i11 = f11 + 1;
                                    c4 = ';';
                                    c6 = '=';
                                }
                            } else {
                                if (j9 == Long.MIN_VALUE) {
                                    j8 = Long.MIN_VALUE;
                                } else if (j9 != -1) {
                                    long j11 = currentTimeMillis + (j9 <= 9223372036854775L ? j9 * 1000 : Long.MAX_VALUE);
                                    j8 = (j11 < currentTimeMillis || j11 > 253402300799999L) ? 253402300799999L : j11;
                                } else {
                                    j8 = j10;
                                }
                                String str4 = lVar.f8611d;
                                if (str3 == null) {
                                    str3 = str4;
                                } else if (!k.a(str4, str3)) {
                                    if (o.o(false, str4, str3) && str4.charAt((str4.length() - str3.length()) - 1) == '.') {
                                        z6.g gVar = t7.b.f8937f;
                                        gVar.getClass();
                                    }
                                    i7 = 0;
                                }
                                if (str4.length() == str3.length() || PublicSuffixDatabase.f6967g.a(str3) != null) {
                                    String str5 = "/";
                                    if (str2 == null || !o.v(str2, "/")) {
                                        String b9 = lVar.b();
                                        i7 = 0;
                                        int J = h.J(b9, '/', 0, 6);
                                        if (J != 0) {
                                            str5 = b9.substring(0, J);
                                            k.e(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str2 = str5;
                                    } else {
                                        i7 = 0;
                                    }
                                    iVar = new s7.i(x8, x9, j8, str3, str2, i14, i12, i13, z8);
                                }
                                i7 = 0;
                            }
                        }
                    }
                }
            }
            i7 = i8;
            iVar = null;
            if (iVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(iVar);
            }
            i10++;
            i8 = i7;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            k.e(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
