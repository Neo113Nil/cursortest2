package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class jf {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static tf1 b(Configuration configuration) {
        return tf1.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(tf1 tf1Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(tf1Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, tf1 tf1Var) {
        configuration.setLocales(LocaleList.forLanguageTags(tf1Var.a.a.toLanguageTags()));
    }
}
