package androidx.core.text;

import android.icu.util.ULocale;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ICUCompat {
    public static String maximizeAndGetScript(Locale locale) {
        return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static ULocale forLocale(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        static ULocale addLikelySubtags(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        static String getScript(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static String getScript(Locale locale) {
            return locale.getScript();
        }
    }
}
