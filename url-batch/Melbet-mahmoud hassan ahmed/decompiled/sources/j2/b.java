package j2;

import android.text.TextUtils;
import java.util.regex.Pattern;
import m4.p0;
import m4.s;
import m4.t;

/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18084d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final s<String> f18085e = s.x("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    private static final s<String> f18086f = s.y("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final s<String> f18087g = s.x("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final s<String> f18088h = s.y("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f18089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18091c;

    private b(int i7, int i8, int i9) {
        this.f18089a = i7;
        this.f18090b = i8;
        this.f18091c = i9;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e7 = l4.b.e(str.trim());
        if (e7.isEmpty()) {
            return null;
        }
        return b(s.s(TextUtils.split(e7, f18084d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9.equals("auto") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static b b(s<String> sVar) {
        char c7;
        char c8;
        String str = (String) t.b(p0.e(f18088h, sVar), "outside");
        int hashCode = str.hashCode();
        char c9 = 1;
        if (hashCode == -1392885889) {
            if (str.equals("before")) {
                c7 = 2;
            }
            c7 = 65535;
        } else if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str.equals("after")) {
                c7 = 0;
            }
            c7 = 65535;
        } else {
            if (str.equals("outside")) {
                c7 = 1;
            }
            c7 = 65535;
        }
        int i7 = c7 != 0 ? c7 != 1 ? 1 : -2 : 2;
        p0.e e7 = p0.e(f18085e, sVar);
        if (!e7.isEmpty()) {
            String str2 = (String) e7.iterator().next();
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 3005871) {
                if (hashCode2 == 3387192 && str2.equals("none")) {
                    c9 = 0;
                }
                c9 = 65535;
            }
            return new b(c9 == 0 ? 0 : -1, 0, i7);
        }
        p0.e e8 = p0.e(f18087g, sVar);
        p0.e e9 = p0.e(f18086f, sVar);
        if (e8.isEmpty() && e9.isEmpty()) {
            return new b(-1, 0, i7);
        }
        String str3 = (String) t.b(e8, "filled");
        int hashCode3 = str3.hashCode();
        if (hashCode3 != -1274499742) {
            if (hashCode3 == 3417674 && str3.equals("open")) {
                c8 = 0;
            }
            c8 = 65535;
        } else {
            if (str3.equals("filled")) {
                c8 = 1;
            }
            c8 = 65535;
        }
        int i8 = c8 != 0 ? 1 : 2;
        String str4 = (String) t.b(e9, "circle");
        int hashCode4 = str4.hashCode();
        if (hashCode4 != -1360216880) {
            if (hashCode4 != -905816648) {
                if (hashCode4 == 99657 && str4.equals("dot")) {
                    r5 = 0;
                }
            } else if (str4.equals("sesame")) {
                r5 = 1;
            }
        } else if (str4.equals("circle")) {
            r5 = 2;
        }
        return new b(r5 != 0 ? r5 != 1 ? 1 : 3 : 2, i8, i7);
    }
}
