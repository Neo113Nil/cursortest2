package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class u3 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static er b(Configuration configuration) {
        return er.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(er erVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(erVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, er erVar) {
        configuration.setLocales(LocaleList.forLanguageTags(erVar.a.a.toLanguageTags()));
    }
}
