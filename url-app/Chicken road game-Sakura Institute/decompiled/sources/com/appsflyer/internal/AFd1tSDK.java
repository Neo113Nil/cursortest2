package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFd1tSDK implements AFd1qSDK {
    private final SharedPreferences AFKeystoreWrapper;

    public AFd1tSDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean AFInAppEventType(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e4) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e4);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final String AFKeystoreWrapper(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e4) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e4);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void valueOf(String str, boolean z4) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z4).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final long values(String str, long j4) {
        try {
            return this.AFKeystoreWrapper.getLong(str, j4);
        } catch (ClassCastException e4) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e4);
            return j4;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, int i2) {
        this.AFKeystoreWrapper.edit().putInt(str, i2).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final int valueOf(String str, int i2) {
        try {
            return this.AFKeystoreWrapper.getInt(str, i2);
        } catch (ClassCastException e4) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e4);
            return i2;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str, long j4) {
        this.AFKeystoreWrapper.edit().putLong(str, j4).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean values(String str) {
        return this.AFKeystoreWrapper.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }
}
