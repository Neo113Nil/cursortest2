package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wt {
    public static final wt b = new wt(new xt(new LocaleList(new Locale[0])));
    public final xt a;

    public wt(xt xtVar) {
        this.a = xtVar;
    }

    public static wt a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new wt(new xt(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wt) {
            return this.a.equals(((wt) obj).a);
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
