package com.moyoung.dafit.module.common.utils;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes4.dex */
public class b {
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static Locale[] getSystemLanguageList() {
        return Locale.getAvailableLocales();
    }

    public static String getSystemModel() {
        return Build.MODEL;
    }

    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }
}
