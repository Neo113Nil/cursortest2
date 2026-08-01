package H;

import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f292b = new f(new g(e.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final g f293a;

    public f(g gVar) {
        this.f293a = gVar;
    }

    public static f a(String str) {
        if (str == null || str.isEmpty()) {
            return f292b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = d.a(split[i]);
        }
        return new f(new g(e.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f293a.equals(((f) obj).f293a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f293a.f294a.hashCode();
    }

    public final String toString() {
        return this.f293a.f294a.toString();
    }
}
