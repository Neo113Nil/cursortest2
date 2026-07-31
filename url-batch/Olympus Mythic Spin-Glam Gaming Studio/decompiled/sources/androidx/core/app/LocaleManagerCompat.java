package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class LocaleManagerCompat {
    public static LocaleListCompat getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication(context);
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
            return LocaleListCompat.getEmptyLocaleList();
        }
        return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService(CommonUrlParts.LOCALE);
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static LocaleList localeManagerGetSystemLocales(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }

        @DoNotInline
        static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }
}
