package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes12.dex */
public class klz {

    @SuppressLint({"StaticFieldLeak"})
    private static Context zmn;

    public static void zmn(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            zmn = context.createConfigurationContext(fs(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        doe.zmn(zmn);
    }

    private static Configuration fs(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
