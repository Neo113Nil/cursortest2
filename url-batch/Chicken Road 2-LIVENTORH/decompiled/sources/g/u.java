package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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

    public static j0.e b(Configuration configuration) {
        return j0.e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j0.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f1891a.f1892a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j0.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f1891a.f1892a.toLanguageTags()));
    }
}
