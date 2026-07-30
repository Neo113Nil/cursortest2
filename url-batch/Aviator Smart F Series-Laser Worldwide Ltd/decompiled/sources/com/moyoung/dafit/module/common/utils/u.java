package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public class u {
    private static final String CN_DISPLAY_COUNTRY = "中國";
    private static final String COUNTRY_BR = "BR";
    public static final String COUNTRY_CA = "CA";
    public static final String COUNTRY_CN = "CN";
    public static final String COUNTRY_IN = "IN";
    public static final String COUNTRY_JP = "JP";
    public static final String COUNTRY_KR = "KR";
    public static final String COUNTRY_US = "US";
    public static final String COUNTRY_ZA = "ZA";
    public static final String LANGUAGE_AR = "ar";
    public static final String LANGUAGE_DE = "de";
    public static final String LANGUAGE_EN = "en";
    public static final String LANGUAGE_ES = "es";
    public static final String LANGUAGE_FR = "fr";
    public static final String LANGUAGE_IT = "it";
    public static final String LANGUAGE_JA = "ja";
    public static final String LANGUAGE_KO = "ko";
    public static final String LANGUAGE_OTHER = "other";
    public static final String LANGUAGE_PT = "pt";
    public static final String LANGUAGE_RU = "ru";
    public static final String LANGUAGE_TR = "uk";
    public static final String LANGUAGE_ZH = "zh";

    public static boolean checkLanguage(String str) {
        String language = getLocale().getLanguage();
        if (TextUtils.isEmpty(language) || TextUtils.isEmpty(str)) {
            return false;
        }
        return language.endsWith(str);
    }

    public static String getCountry() {
        String country = getLocale().getCountry();
        com.orhanobut.logger.f.d("country: " + country);
        return country;
    }

    private static Locale getLocale() {
        Locale.Category category;
        Locale locale;
        if (26 > Build.VERSION.SDK_INT) {
            return Locale.getDefault();
        }
        category = Locale.Category.DISPLAY;
        locale = Locale.getDefault(category);
        return locale;
    }

    public static String getLocaleLanguage() {
        return getLocale().getLanguage();
    }

    public static boolean isBr() {
        String country = getLocale().getCountry();
        com.orhanobut.logger.f.d("country: " + country);
        return TextUtils.equals(country, COUNTRY_BR);
    }

    public static boolean isEN() {
        return checkLanguage("en");
    }

    public static boolean isIN(Context context) {
        return TextUtils.equals(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso(), COUNTRY_IN.toLowerCase());
    }

    public static boolean isJA() {
        return checkLanguage(LANGUAGE_JA);
    }

    public static boolean isOfCountry(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            String country = getCountry();
            for (String str : strArr) {
                if (TextUtils.equals(country, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSimplified() {
        return isZH() && !isTraditional();
    }

    public static boolean isTraditional() {
        if (!isZH()) {
            return false;
        }
        Locale locale = getLocale();
        return TextUtils.equals(locale.getDisplayCountry(), CN_DISPLAY_COUNTRY) || !TextUtils.equals(locale.getCountry(), COUNTRY_CN);
    }

    public static boolean isUS() {
        return TextUtils.equals(getCountry(), COUNTRY_US);
    }

    public static boolean isZH() {
        return checkLanguage("zh");
    }
}
