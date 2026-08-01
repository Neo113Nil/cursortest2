package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vy {
    public static final vy b = new vy(new wy(new LocaleList(new Locale[0])));
    public final wy a;

    public vy(wy wyVar) {
        this.a = wyVar;
    }

    public static vy a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new vy(new wy(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vy) {
            return this.a.equals(((vy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
