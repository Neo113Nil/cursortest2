package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static I.f b(Configuration configuration) {
        return I.f.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(I.f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f577a.f578a.toLanguageTags()));
    }

    public static void d(Configuration configuration, I.f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f577a.f578a.toLanguageTags()));
    }
}
