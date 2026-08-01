package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class er {
    public static final er b = new er(new fr(new LocaleList(new Locale[0])));
    public final fr a;

    public er(fr frVar) {
        this.a = frVar;
    }

    public static er a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new er(new fr(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof er) {
            return this.a.equals(((er) obj).a);
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
