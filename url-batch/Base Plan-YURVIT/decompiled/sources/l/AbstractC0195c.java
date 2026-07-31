package l;

import android.os.LocaleList;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0195c {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
