package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: i.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0534u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static E.f b(Configuration configuration) {
        return E.f.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(E.f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f654a.f655a.toLanguageTags()));
    }

    public static void d(Configuration configuration, E.f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f654a.f655a.toLanguageTags()));
    }
}
