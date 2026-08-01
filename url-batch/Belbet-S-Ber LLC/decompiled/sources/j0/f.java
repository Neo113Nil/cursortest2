package j0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2133b = new f(new g(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final g f2134a;

    public f(g gVar) {
        this.f2134a = gVar;
    }

    public static f a(String str) {
        if (str == null || str.isEmpty()) {
            return f2133b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new f(new g(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2134a.equals(((f) obj).f2134a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2134a.f2135a.hashCode();
    }

    public final String toString() {
        return this.f2134a.f2135a.toString();
    }
}
