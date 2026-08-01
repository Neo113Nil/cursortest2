package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sr {
    public static final sr b = new sr(new tr(new LocaleList(new Locale[0])));
    public final tr a;

    public sr(tr trVar) {
        this.a = trVar;
    }

    public static sr a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new sr(new tr(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sr) {
            return this.a.equals(((sr) obj).a);
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
