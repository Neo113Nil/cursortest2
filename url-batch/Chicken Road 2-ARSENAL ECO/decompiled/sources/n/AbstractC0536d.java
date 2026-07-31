package n;

import android.os.LocaleList;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0536d {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
