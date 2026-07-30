package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blankj.utilcode.util.z0;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class q {
    private static final String KEY_LOCALE = "KEY_LOCALE";
    private static final String VALUE_FOLLOW_SYSTEM = "VALUE_FOLLOW_SYSTEM";

    static class a implements z0.b {
        final /* synthetic */ boolean val$isRelaunchApp;

        a(boolean z7) {
            this.val$isRelaunchApp = z7;
        }

        @Override // com.blankj.utilcode.util.z0.b
        public void accept(Boolean bool) {
            if (bool.booleanValue()) {
                q.restart(this.val$isRelaunchApp);
            } else {
                c1.relaunchApp();
            }
        }
    }

    static class b implements Runnable {
        final /* synthetic */ z0.b val$consumer;
        final /* synthetic */ Locale val$destLocale;
        final /* synthetic */ int val$index;

        b(Locale locale, int i8, z0.b bVar) {
            this.val$destLocale = locale;
            this.val$index = i8;
            this.val$consumer = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.pollCheckAppContextLocal(this.val$destLocale, this.val$index + 1, this.val$consumer);
        }
    }

    private q() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void applyLanguage(@NonNull Locale locale) {
        applyLanguage(locale, false);
    }

    private static void applyLanguageReal(Locale locale, boolean z7) {
        if (locale == null) {
            c1.getSpUtils4Utils().put(KEY_LOCALE, VALUE_FOLLOW_SYSTEM, true);
        } else {
            c1.getSpUtils4Utils().put(KEY_LOCALE, locale2String(locale), true);
        }
        if (locale == null) {
            locale = getLocal(Resources.getSystem().getConfiguration());
        }
        updateAppContextLanguage(locale, new a(z7));
    }

    public static void applySystemLanguage() {
        applySystemLanguage(false);
    }

    public static Context attachBaseContext(Context context) {
        String string = c1.getSpUtils4Utils().getString(KEY_LOCALE);
        if (TextUtils.isEmpty(string) || VALUE_FOLLOW_SYSTEM.equals(string)) {
            return context;
        }
        Locale string2Locale = string2Locale(string);
        if (string2Locale == null) {
            return context;
        }
        Configuration configuration = context.getResources().getConfiguration();
        setLocal(configuration, string2Locale);
        return context.createConfigurationContext(configuration);
    }

    public static Locale getAppContextLanguage() {
        return getContextLanguage(z0.getApp());
    }

    public static Locale getAppliedLanguage() {
        String string = c1.getSpUtils4Utils().getString(KEY_LOCALE);
        if (TextUtils.isEmpty(string) || VALUE_FOLLOW_SYSTEM.equals(string)) {
            return null;
        }
        return string2Locale(string);
    }

    public static Locale getContextLanguage(Context context) {
        return getLocal(context.getResources().getConfiguration());
    }

    private static Locale getLocal(Configuration configuration) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT < 24) {
            return configuration.locale;
        }
        locales = configuration.getLocales();
        locale = locales.get(0);
        return locale;
    }

    public static Locale getSystemLanguage() {
        return getLocal(Resources.getSystem().getConfiguration());
    }

    public static boolean isAppliedLanguage() {
        return getAppliedLanguage() != null;
    }

    private static boolean isRightFormatLocalStr(String str) {
        int i8 = 0;
        for (char c8 : str.toCharArray()) {
            if (c8 == '$') {
                if (i8 >= 1) {
                    return false;
                }
                i8++;
            }
        }
        return i8 == 1;
    }

    private static boolean isSameLocale(Locale locale, Locale locale2) {
        return c1.equals(locale2.getLanguage(), locale.getLanguage()) && c1.equals(locale2.getCountry(), locale.getCountry());
    }

    private static String locale2String(Locale locale) {
        return locale.getLanguage() + "$" + locale.getCountry();
    }

    static void pollCheckAppContextLocal(Locale locale, int i8, z0.b bVar) {
        Resources resources = z0.getApp().getResources();
        Configuration configuration = resources.getConfiguration();
        Locale local = getLocal(configuration);
        setLocal(configuration, locale);
        z0.getApp().getResources().updateConfiguration(configuration, resources.getDisplayMetrics());
        if (bVar == null) {
            return;
        }
        if (isSameLocale(local, locale)) {
            bVar.accept(Boolean.TRUE);
        } else if (i8 < 20) {
            c1.runOnUiThreadDelayed(new b(locale, i8, bVar), 16L);
        } else {
            Log.e("LanguageUtils", "appLocal didn't update.");
            bVar.accept(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restart(boolean z7) {
        if (z7) {
            c1.relaunchApp();
            return;
        }
        Iterator<Activity> it = c1.getActivityList().iterator();
        while (it.hasNext()) {
            it.next().recreate();
        }
    }

    private static void setLocal(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    private static Locale string2Locale(String str) {
        Locale string2LocaleReal = string2LocaleReal(str);
        if (string2LocaleReal == null) {
            Log.e("LanguageUtils", "The string of " + str + " is not in the correct format.");
            c1.getSpUtils4Utils().remove(KEY_LOCALE);
        }
        return string2LocaleReal;
    }

    private static Locale string2LocaleReal(String str) {
        if (!isRightFormatLocalStr(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("$");
            return new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void updateAppContextLanguage(@NonNull Locale locale, @Nullable z0.b bVar) {
        pollCheckAppContextLocal(locale, 0, bVar);
    }

    private static void updateConfiguration(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        setLocal(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static void applyLanguage(@NonNull Locale locale, boolean z7) {
        applyLanguageReal(locale, z7);
    }

    public static void applySystemLanguage(boolean z7) {
        applyLanguageReal(null, z7);
    }

    public static boolean isAppliedLanguage(@NonNull Locale locale) {
        Locale appliedLanguage = getAppliedLanguage();
        if (appliedLanguage == null) {
            return false;
        }
        return isSameLocale(locale, appliedLanguage);
    }

    static void applyLanguage(Activity activity) {
        Locale string2Locale;
        String string = c1.getSpUtils4Utils().getString(KEY_LOCALE);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (VALUE_FOLLOW_SYSTEM.equals(string)) {
            string2Locale = getLocal(Resources.getSystem().getConfiguration());
        } else {
            string2Locale = string2Locale(string);
        }
        if (string2Locale == null) {
            return;
        }
        updateConfiguration(activity, string2Locale);
        updateConfiguration(z0.getApp(), string2Locale);
    }
}
