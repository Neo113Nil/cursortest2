package G;

import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f201b = new g(new h(f.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f202a;

    public g(h hVar) {
        this.f202a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f201b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = e.a(split[i]);
        }
        return new g(new h(f.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f202a.equals(((g) obj).f202a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f202a.f203a.hashCode();
    }

    public final String toString() {
        return this.f202a.f203a.toString();
    }
}
