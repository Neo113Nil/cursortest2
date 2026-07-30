package i;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: i.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0528o {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
