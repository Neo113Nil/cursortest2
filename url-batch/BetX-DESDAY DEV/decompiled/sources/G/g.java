package G;

import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f200b = new g(new h(f.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f201a;

    public g(h hVar) {
        this.f201a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f200b;
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
            if (this.f201a.equals(((g) obj).f201a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f201a.f202a.hashCode();
    }

    public final String toString() {
        return this.f201a.f202a.toString();
    }
}
