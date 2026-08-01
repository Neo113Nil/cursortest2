package f;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static g0.d b(Configuration configuration) {
        return g0.d.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(g0.d dVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dVar.f1757a.f1758a.toLanguageTags()));
    }

    public static void d(Configuration configuration, g0.d dVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dVar.f1757a.f1758a.toLanguageTags()));
    }
}
