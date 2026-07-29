package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.internal.jr;

/* loaded from: classes2.dex */
public class TapjoyAppSettings {
    public static final String TAG = "TapjoyAppSettings";

    /* renamed from: b, reason: collision with root package name */
    private static TapjoyAppSettings f7744b;

    /* renamed from: a, reason: collision with root package name */
    String f7745a;

    /* renamed from: c, reason: collision with root package name */
    private Context f7746c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f7747d;

    private TapjoyAppSettings(Context context) {
        this.f7746c = context;
        this.f7747d = this.f7746c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        this.f7745a = this.f7747d.getString(TapjoyConstants.PREF_LOG_LEVEL, null);
        if (jr.c(this.f7745a)) {
            return;
        }
        TapjoyLog.d(TAG, "restoreLoggingLevel from sharedPref -- loggingLevel=" + this.f7745a);
        TapjoyLog.a(this.f7745a, true);
    }

    public static TapjoyAppSettings getInstance() {
        return f7744b;
    }

    public static void init(Context context) {
        TapjoyLog.d(TAG, "initializing app settings");
        f7744b = new TapjoyAppSettings(context);
    }

    public void saveLoggingLevel(String str) {
        if (jr.c(str)) {
            TapjoyLog.d(TAG, "saveLoggingLevel -- server logging level is NULL or Empty string");
            return;
        }
        TapjoyLog.d(TAG, "saveLoggingLevel -- currentLevel=" + this.f7745a + ";newLevel=" + str);
        if (jr.c(this.f7745a) || !this.f7745a.equals(str)) {
            SharedPreferences.Editor edit = this.f7747d.edit();
            edit.putString(TapjoyConstants.PREF_LOG_LEVEL, str);
            edit.apply();
            this.f7745a = str;
            TapjoyLog.a(this.f7745a, true);
        }
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging set to '");
        sb.append(str);
        sb.append("'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.i(str2, sb.toString());
    }

    public void clearLoggingLevel() {
        SharedPreferences.Editor edit = this.f7747d.edit();
        edit.remove(TapjoyConstants.PREF_LOG_LEVEL);
        edit.apply();
        this.f7745a = null;
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging 'Disabled'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.i(str, sb.toString());
        TapjoyLog.setDebugEnabled(isLoggingEnabled);
    }

    public void saveConnectResultAndParams(String str, String str2, long j) {
        if (jr.c(str) || jr.c(str2)) {
            return;
        }
        SharedPreferences.Editor edit = this.f7747d.edit();
        edit.putString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, str);
        edit.putString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, str2);
        if (j >= 0) {
            edit.putLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, j);
        } else {
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
        }
        TapjoyLog.i(TAG, "Stored connect result");
        edit.apply();
    }

    public void removeConnectResult() {
        if (this.f7747d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, null) != null) {
            SharedPreferences.Editor edit = this.f7747d.edit();
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            TapjoyLog.i(TAG, "Removed connect result");
            edit.apply();
        }
    }

    public String getConnectResult(String str, long j) {
        String string = this.f7747d.getString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, null);
        if (!jr.c(string) && !jr.c(str) && str.equals(this.f7747d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, null))) {
            long j2 = this.f7747d.getLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, -1L);
            if (j2 < 0 || j2 >= j) {
                return string;
            }
        }
        return null;
    }
}
