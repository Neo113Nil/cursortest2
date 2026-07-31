package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes.dex */
public class SettingUtil {
    public static int getSecureInt(ContentResolver contentResolver, String str, int i4) {
        try {
            return Settings.Secure.getInt(contentResolver, str, i4);
        } catch (RuntimeException e4) {
            Logger.e("SettingUtil", "Settings Secure getInt throwFromSystemServer:", e4);
            return i4;
        }
    }

    public static int getSystemInt(ContentResolver contentResolver, String str, int i4) {
        try {
            return Settings.System.getInt(contentResolver, str, i4);
        } catch (RuntimeException e4) {
            Logger.e("SettingUtil", "Settings System getInt throwFromSystemServer:", e4);
            return i4;
        }
    }
}
