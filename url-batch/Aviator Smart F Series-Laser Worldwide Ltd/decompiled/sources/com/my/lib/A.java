package com.my.lib;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class A {
    public static String a(Context context) {
        Locale locale;
        LocaleList locales;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = Locale.getDefault();
        }
        return locale != null ? locale.getLanguage() : "";
    }
}
