package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class t {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static G.f b(Configuration configuration) {
        return G.f.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(G.f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f245a.f246a.toLanguageTags()));
    }

    public static void d(Configuration configuration, G.f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f245a.f246a.toLanguageTags()));
    }
}
