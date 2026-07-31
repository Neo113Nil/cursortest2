package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class IronSourceSharedPreferencesUtilities {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16093a = "_preferences";

    static int a(Context context, String str, String str2, int i4) {
        return context == null ? i4 : context.getSharedPreferences(str, 0).getInt(str2, i4);
    }

    public static boolean getBooleanFromSharedPrefs(Context context, String str, String str2, boolean z4) {
        return context == null ? z4 : context.getSharedPreferences(str, 0).getBoolean(str2, z4);
    }

    public static String getDefaultSharedPrefName(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f16093a;
    }

    public static int getIntFromDefaultSharedPrefs(Context context, String str, int i4) {
        return a(context, getDefaultSharedPrefName(context, ""), str, i4);
    }

    public static String getStringFromDefaultSharedPrefs(Context context, String str, String str2) {
        return getStringFromSharedPrefs(context, getDefaultSharedPrefName(context, ""), str, str2);
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveIntToSharedPrefs(Context context, String str, String str2, int i4) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i4);
        edit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    static void a(Context context, String str, String str2, boolean z4) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, z4);
        edit.apply();
    }
}
