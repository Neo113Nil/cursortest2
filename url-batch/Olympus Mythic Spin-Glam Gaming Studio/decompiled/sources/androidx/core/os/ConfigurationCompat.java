package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes11.dex */
public final class ConfigurationCompat {
    public static LocaleListCompat getLocales(Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }

    public static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.setLocales(configuration, localeListCompat);
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        static void setLocales(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.unwrap());
        }
    }
}
