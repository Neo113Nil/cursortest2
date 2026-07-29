package b.a.c;

import b.ac;
import b.m;
import b.s;
import b.t;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: HttpHeaders.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f1864a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static long a(ac acVar) {
        return a(acVar.e());
    }

    public static long a(s sVar) {
        return a(sVar.a("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(m mVar, t tVar, s sVar) {
        if (mVar == m.f2111a) {
            return;
        }
        List<b.l> a2 = b.l.a(tVar, sVar);
        if (a2.isEmpty()) {
            return;
        }
        mVar.a(tVar, a2);
    }

    public static boolean b(ac acVar) {
        if (acVar.a().b().equals("HEAD")) {
            return false;
        }
        int b2 = acVar.b();
        return (((b2 >= 100 && b2 < 200) || b2 == 204 || b2 == 304) && a(acVar) == -1 && !"chunked".equalsIgnoreCase(acVar.a("Transfer-Encoding"))) ? false : true;
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
