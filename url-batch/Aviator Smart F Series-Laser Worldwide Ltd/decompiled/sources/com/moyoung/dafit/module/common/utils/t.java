package com.moyoung.dafit.module.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;

/* loaded from: classes4.dex */
public class t {
    public static String[] getStringArrayByLocal(Context context, int i8, String str) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str));
        return context.createConfigurationContext(configuration).getResources().getStringArray(i8);
    }

    public static String getStringByLocal(String str, String str2) {
        return getStringByLocal(d.get(), getStringResourceId(str), str2);
    }

    public static String getStringResourceByName(String str) {
        Context context = d.get();
        return context.getResources().getString(getStringResourceId(str));
    }

    @SuppressLint({"DiscouragedApi"})
    public static int getStringResourceId(String str) {
        Context context = d.get();
        return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
    }

    public static String getStringByLocal(Context context, int i8, String str) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        String[] split = str.split("-");
        if (split.length == 2) {
            configuration.setLocale(new Locale(split[0], split[1]));
        } else {
            configuration.setLocale(new Locale(str));
        }
        return context.createConfigurationContext(configuration).getResources().getString(i8);
    }
}
