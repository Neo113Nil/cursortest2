package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
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

    public static j0.f b(Configuration configuration) {
        return j0.f.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j0.f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f2134a.f2135a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j0.f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f2134a.f2135a.toLanguageTags()));
    }
}
