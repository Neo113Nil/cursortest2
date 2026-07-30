package E;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f653b = new f(new g(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final g f654a;

    public f(g gVar) {
        this.f654a = gVar;
    }

    public static f a(String str) {
        if (str == null || str.isEmpty()) {
            return f653b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = Locale.forLanguageTag(split[i2]);
        }
        return new f(new g(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f654a.equals(((f) obj).f654a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f654a.f655a.hashCode();
    }

    public final String toString() {
        return this.f654a.f655a.toString();
    }
}
