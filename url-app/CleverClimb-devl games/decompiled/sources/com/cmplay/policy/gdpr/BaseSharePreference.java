package com.cmplay.policy.gdpr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public class BaseSharePreference {
    protected static Context mContext;
    public static BaseSharePreference mInstance;
    protected static SharedPreferences mSp;

    protected static SharedPreferences getSharedPreferences() {
        return null;
    }

    public static void init(Context context) {
        mContext = context.getApplicationContext();
        getSharedPreferences();
    }

    public BaseSharePreference getBaseSp() {
        if (mInstance == null) {
            mInstance = new BaseSharePreference();
        }
        return mInstance;
    }

    public static String getString(String str, String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    public static void setString(String str, String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        applyToEditor(edit);
    }

    public static long getLong(String str, long j) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public static synchronized void setLong(String str, long j) {
        synchronized (BaseSharePreference.class) {
            SharedPreferences sharedPreferences = getSharedPreferences();
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, j);
            applyToEditor(edit);
        }
    }

    @SuppressLint({"NewApi"})
    private static void applyToEditor(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    public static Set<String> getAllKey() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getAll().keySet();
    }

    public static synchronized void removeKey(String str) {
        synchronized (BaseSharePreference.class) {
            SharedPreferences sharedPreferences = getSharedPreferences();
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            applyToEditor(edit);
        }
    }
}
