package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

@RequiresApi(24)
/* loaded from: classes.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
    }

    private static LocaleListCompat combineLocales(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i8 = 0;
        while (i8 < localeListCompat.size() + localeListCompat2.size()) {
            Locale locale = i8 < localeListCompat.size() ? localeListCompat.get(i8) : localeListCompat2.get(i8 - localeListCompat.size());
            if (locale != null) {
                linkedHashSet.add(locale);
            }
            i8++;
        }
        return LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static LocaleListCompat combineLocalesIfOverlayExists(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        return (localeListCompat == null || localeListCompat.isEmpty()) ? LocaleListCompat.getEmptyLocaleList() : combineLocales(localeListCompat, localeListCompat2);
    }

    static LocaleListCompat combineLocalesIfOverlayExists(LocaleList localeList, LocaleList localeList2) {
        boolean isEmpty;
        if (localeList != null) {
            isEmpty = localeList.isEmpty();
            if (!isEmpty) {
                return combineLocales(LocaleListCompat.wrap(localeList), LocaleListCompat.wrap(localeList2));
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }
}
