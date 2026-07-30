package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1gSDK implements AFb1fSDK {
    private final SharedPreferences AFKeystoreWrapper;

    public AFb1gSDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final int AFInAppEventType(String str, int i) {
        try {
            return this.AFKeystoreWrapper.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final boolean AFKeystoreWrapper(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final String valueOf(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final long values(String str, long j) {
        try {
            return this.AFKeystoreWrapper.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void AFInAppEventType(String str, long j) {
        this.AFKeystoreWrapper.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void valueOf(String str, boolean z) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void values(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void AFInAppEventType(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final void valueOf(String str, int i) {
        this.AFKeystoreWrapper.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFb1fSDK
    public final boolean valueOf(String str) {
        return this.AFKeystoreWrapper.contains(str);
    }
}
