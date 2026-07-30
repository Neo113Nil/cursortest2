package com.appsflyer.internal;

import com.appsflyer.migration.AppsFlyerMigrationHelper;

/* loaded from: classes.dex */
public final class AFh1tSDK {
    public static final boolean getMediationNetwork() {
        try {
            AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
