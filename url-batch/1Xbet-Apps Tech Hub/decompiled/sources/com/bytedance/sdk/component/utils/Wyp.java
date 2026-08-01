package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* compiled from: LanguageUtils.java */
/* loaded from: classes.dex */
public class Wyp {
    private static Context pvs;

    public static void pvs(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            pvs = context.createConfigurationContext(icD(context, str, str2));
        } catch (Throwable th) {
            Ju.icD(th.getMessage());
        }
        uc.pvs(pvs);
    }

    private static Configuration icD(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
