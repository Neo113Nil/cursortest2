package com.cmplay.policy.gdpr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Set;

/* loaded from: classes.dex */
public class SharePreferenceHelper extends BaseSharePreference {
    public static final String CONFIRM_GDPR_AD_STAY_INFORMED_UPDATE = "confirm_gdpr_ad_stay_informed_update";
    public static final String CONFIRM_GDPR_POLICY_UPDATES = "confirm_gdpr_policy_updates";
    private static final String SHARE_PREF_NAME = "cmp_commons_data_save";
    public static final String UNIQUE_PSUEDO_ID = "unique_psuedo_id";

    public static void init(Context context) {
        if (mContext == null) {
            mContext = context.getApplicationContext();
            getSharedPreferences();
        }
    }

    protected static SharedPreferences getSharedPreferences() {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(SHARE_PREF_NAME, 0);
        }
        return mSp;
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

    public static int getInt(String str, int i) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences == null ? i : sharedPreferences.getInt(str, i);
    }

    public static void setBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        applyToEditor(edit);
    }

    public static boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences == null ? z : sharedPreferences.getBoolean(str, z);
    }

    public static void setInt(String str, int i) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i);
        applyToEditor(edit);
    }

    public static long getLong(String str, long j) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public static synchronized void setLong(String str, long j) {
        synchronized (SharePreferenceHelper.class) {
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
        synchronized (SharePreferenceHelper.class) {
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
