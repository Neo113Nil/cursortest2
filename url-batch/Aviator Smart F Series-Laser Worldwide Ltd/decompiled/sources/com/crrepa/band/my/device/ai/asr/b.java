package com.crrepa.band.my.device.ai.asr;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {
    private static final Set<String> SUPPORTED_LANGUAGES = new HashSet(Arrays.asList("zh-CN", "zh-TW", "en-US", "ja-JP", "ko-KR", "hi-IN", "ar-SA", "es-ES", "fr-FR", "de-DE", "ru-RU", "zh-HK", "bn-IN", "pt-PT", "id-ID", "ur-IN", "sw-KE", "vi-VN", "th-TH", "tr-TR", "it-IT", "fa-IR", "pl-PL", "uk-UA", "nl-NL", "ta-IN", "ms-MY", "fil-PH", "pa-IN", "ro-RO", "my-MM"));

    public static String getCurrentLanguage() {
        Locale locale;
        Locale.Category category;
        if (Build.VERSION.SDK_INT >= 24) {
            category = Locale.Category.DISPLAY;
            locale = Locale.getDefault(category);
        } else {
            locale = Locale.getDefault();
        }
        String localeToString = localeToString(locale);
        Set<String> set = SUPPORTED_LANGUAGES;
        if (set.contains(localeToString)) {
            return localeToString;
        }
        String language = locale.getLanguage();
        for (String str : set) {
            if (str.startsWith(language)) {
                return str;
            }
        }
        return "en-US";
    }

    public static Set<String> getSupportedLanguages() {
        return new HashSet(SUPPORTED_LANGUAGES);
    }

    private static String localeToString(Locale locale) {
        if (locale == null) {
            return "en-US";
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            return locale.getLanguage() + "-" + country;
        }
        String language = locale.getLanguage();
        language.hashCode();
        switch (language) {
            case "ar":
                return "ar-SA";
            case "de":
                return "de-DE";
            case "es":
                return "es-ES";
            case "fa":
                return "fa-IR";
            case "fr":
                return "fr-FR";
            case "hi":
                return "hi-IN";
            case "id":
                return "id-ID";
            case "it":
                return "it-IT";
            case "ja":
                return "ja-JP";
            case "ko":
                return "ko-KR";
            case "ms":
                return "ms-MY";
            case "my":
                return "my-MM";
            case "nl":
                return "nl-NL";
            case "pa":
                return "pa-IN";
            case "pl":
                return "pl-PL";
            case "pt":
                return "pt-PT";
            case "ro":
                return "ro-RO";
            case "ru":
                return "ru-RU";
            case "sw":
                return "sw-KE";
            case "ta":
                return "ta-IN";
            case "th":
                return "th-TH";
            case "tr":
                return "tr-TR";
            case "uk":
                return "uk-UA";
            case "ur":
                return "ur-IN";
            case "vi":
                return "vi-VN";
            case "zh":
                return "zh-CN";
            case "fil":
                return "fil-PH";
            default:
                return "en-US";
        }
    }
}
