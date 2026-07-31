package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes3.dex */
public final class AFd1sSDK implements AFd1xSDK {
    private final SharedPreferences AFInAppEventType;

    public AFd1sSDK(SharedPreferences sharedPreferences) {
        this.AFInAppEventType = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void valueOf(String str, String str2) {
        this.AFInAppEventType.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final String AFInAppEventType(String str, String str2) {
        try {
            return this.AFInAppEventType.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final boolean values(String str) {
        try {
            return this.AFInAppEventType.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventParameterName(String str, boolean z) {
        this.AFInAppEventType.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final long AFInAppEventType(String str, long j) {
        try {
            return this.AFInAppEventType.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventParameterName(String str, long j) {
        this.AFInAppEventType.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventParameterName(String str, int i) {
        this.AFInAppEventType.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final int AFKeystoreWrapper(String str, int i) {
        try {
            return this.AFInAppEventType.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final boolean valueOf(String str) {
        return this.AFInAppEventType.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFKeystoreWrapper(String str) {
        this.AFInAppEventType.edit().remove(str).apply();
    }
}
