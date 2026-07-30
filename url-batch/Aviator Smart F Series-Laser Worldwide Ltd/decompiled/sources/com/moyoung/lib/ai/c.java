package com.moyoung.lib.ai;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public class c {
    public static String getCurrentLanguage() {
        Locale locale;
        Locale.Category category;
        if (Build.VERSION.SDK_INT >= 24) {
            category = Locale.Category.DISPLAY;
            locale = Locale.getDefault(category);
        } else {
            locale = Locale.getDefault();
        }
        return localeToString(locale);
    }

    private static String localeToString(Locale locale) {
        if (locale == null) {
            return "en-US";
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            String language = locale.getLanguage();
            return ("in".equals(language) ? "id" : "iw".equals(language) ? "he" : language) + "-" + country;
        }
        String language2 = locale.getLanguage();
        language2.hashCode();
        switch (language2) {
            case "ar":
                return "ar-SA";
            case "de":
                return "de-DE";
            case "es":
                return "es-ES";
            case "fr":
                return "fr-FR";
            case "hi":
                return "hi-IN";
            case "id":
            case "in":
                return "id-ID";
            case "ja":
                return "ja-JP";
            case "ko":
                return "ko-KR";
            case "ru":
                return "ru-RU";
            case "zh":
                return "zh-CN";
            default:
                return "en-US";
        }
    }
}
