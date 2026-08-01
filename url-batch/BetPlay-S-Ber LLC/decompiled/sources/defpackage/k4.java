package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class k4 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static sr b(Configuration configuration) {
        return sr.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(sr srVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(srVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, sr srVar) {
        configuration.setLocales(LocaleList.forLanguageTags(srVar.a.a.toLanguageTags()));
    }
}
