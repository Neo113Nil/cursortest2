package K;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f1479b = new l(new m(k.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final m f1480a;

    public l(m mVar) {
        this.f1480a = mVar;
    }

    public static l a(String str) {
        if (str == null || str.isEmpty()) {
            return f1479b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = j.a(split[i]);
        }
        return new l(new m(k.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f1480a.equals(((l) obj).f1480a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1480a.f1481a.hashCode();
    }

    public final String toString() {
        return this.f1480a.f1481a.toString();
    }
}
