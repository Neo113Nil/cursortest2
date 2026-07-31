package T5;

import java.util.LinkedHashMap;
import java.util.Locale;
import k5.C0477g;
import k5.C0483m;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2401a;

    static {
        C0477g c0477g = new C0477g(kotlin.jvm.internal.t.a(String.class), U.f2407a);
        C0477g c0477g2 = new C0477g(kotlin.jvm.internal.t.a(Character.TYPE), C0196l.f2445a);
        C0477g c0477g3 = new C0477g(kotlin.jvm.internal.t.a(char[].class), C0195k.f2444c);
        C0477g c0477g4 = new C0477g(kotlin.jvm.internal.t.a(Double.TYPE), C0200p.f2451a);
        C0477g c0477g5 = new C0477g(kotlin.jvm.internal.t.a(double[].class), C0199o.f2450c);
        C0477g c0477g6 = new C0477g(kotlin.jvm.internal.t.a(Float.TYPE), C0204u.f2463a);
        C0477g c0477g7 = new C0477g(kotlin.jvm.internal.t.a(float[].class), C0203t.f2462c);
        C0477g c0477g8 = new C0477g(kotlin.jvm.internal.t.a(Long.TYPE), F.f2388a);
        C0477g c0477g9 = new C0477g(kotlin.jvm.internal.t.a(long[].class), E.f2387c);
        C0477g c0477g10 = new C0477g(kotlin.jvm.internal.t.a(k5.q.class), d0.f2425a);
        C0477g c0477g11 = new C0477g(kotlin.jvm.internal.t.a(k5.r.class), c0.f2422c);
        C0477g c0477g12 = new C0477g(kotlin.jvm.internal.t.a(Integer.TYPE), C0209z.f2479a);
        C0477g c0477g13 = new C0477g(kotlin.jvm.internal.t.a(int[].class), C0208y.f2478c);
        C0477g c0477g14 = new C0477g(kotlin.jvm.internal.t.a(k5.o.class), a0.f2417a);
        C0477g c0477g15 = new C0477g(kotlin.jvm.internal.t.a(k5.p.class), Z.f2416c);
        C0477g c0477g16 = new C0477g(kotlin.jvm.internal.t.a(Short.TYPE), T.f2405a);
        C0477g c0477g17 = new C0477g(kotlin.jvm.internal.t.a(short[].class), S.f2404c);
        C0477g c0477g18 = new C0477g(kotlin.jvm.internal.t.a(k5.t.class), g0.f2435a);
        C0477g c0477g19 = new C0477g(kotlin.jvm.internal.t.a(k5.u.class), f0.f2432c);
        C0477g c0477g20 = new C0477g(kotlin.jvm.internal.t.a(Byte.TYPE), C0193i.f2440a);
        C0477g c0477g21 = new C0477g(kotlin.jvm.internal.t.a(byte[].class), C0192h.f2437c);
        C0477g c0477g22 = new C0477g(kotlin.jvm.internal.t.a(C0483m.class), X.f2412a);
        C0477g c0477g23 = new C0477g(kotlin.jvm.internal.t.a(k5.n.class), W.f2411c);
        C0477g c0477g24 = new C0477g(kotlin.jvm.internal.t.a(Boolean.TYPE), C0190f.f2430a);
        C0477g c0477g25 = new C0477g(kotlin.jvm.internal.t.a(boolean[].class), C0189e.f2427c);
        C0477g c0477g26 = new C0477g(kotlin.jvm.internal.t.a(k5.v.class), h0.f2438b);
        C0477g c0477g27 = new C0477g(kotlin.jvm.internal.t.a(Void.class), H.f2391a);
        kotlin.jvm.internal.d a7 = kotlin.jvm.internal.t.a(G5.a.class);
        int i7 = G5.a.f864i;
        C0477g[] c0477gArr = {c0477g, c0477g2, c0477g3, c0477g4, c0477g5, c0477g6, c0477g7, c0477g8, c0477g9, c0477g10, c0477g11, c0477g12, c0477g13, c0477g14, c0477g15, c0477g16, c0477g17, c0477g18, c0477g19, c0477g20, c0477g21, c0477g22, c0477g23, c0477g24, c0477g25, c0477g26, c0477g27, new C0477g(a7, C0201q.f2453a)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(l5.t.p0(28));
        l5.t.r0(linkedHashMap, c0477gArr);
        f2401a = linkedHashMap;
    }

    public static final String a(String str) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf2 = String.valueOf(charAt);
            kotlin.jvm.internal.i.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            valueOf = valueOf2.toUpperCase(locale);
            kotlin.jvm.internal.i.d(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                String lowerCase = substring.toLowerCase(locale);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.i.d(substring2, "substring(...)");
        sb.append(substring2);
        return sb.toString();
    }
}
