package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class m4 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static vy b(Configuration configuration) {
        return vy.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(vy vyVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(vyVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, vy vyVar) {
        configuration.setLocales(LocaleList.forLanguageTags(vyVar.a.a.toLanguageTags()));
    }
}
