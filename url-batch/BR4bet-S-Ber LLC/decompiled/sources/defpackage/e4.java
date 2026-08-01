package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class e4 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static wt b(Configuration configuration) {
        return wt.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(wt wtVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(wtVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, wt wtVar) {
        configuration.setLocales(LocaleList.forLanguageTags(wtVar.a.a.toLanguageTags()));
    }
}
