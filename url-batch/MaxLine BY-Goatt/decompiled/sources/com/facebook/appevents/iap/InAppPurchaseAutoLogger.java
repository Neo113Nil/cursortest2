package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.c82;
import defpackage.q11;
import defpackage.s50;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseAutoLogger {
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();
    private static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean isFirstAppLaunchWithNewIAP = InAppPurchaseLoggerManager.getIsFirstAppLaunchWithNewIAP();
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.migrateOldCacheHistory();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                InAppPurchaseBillingClientWrapperV2V4.Companion companion = InAppPurchaseBillingClientWrapperV2V4.Companion;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getIapPurchaseDetailsMap(), companion.getSkuDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getSubsPurchaseDetailsMap(), companion.getSkuDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion.getIapPurchaseDetailsMap().clear();
                companion.getSubsPurchaseDetailsMap().clear();
            } else {
                InAppPurchaseBillingClientWrapperV5V7.Companion companion2 = InAppPurchaseBillingClientWrapperV5V7.Companion;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getIapPurchaseDetailsMap(), companion2.getProductDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getSubsPurchaseDetailsMap(), companion2.getProductDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion2.getIapPurchaseDetailsMap().clear();
                companion2.getSubsPurchaseDetailsMap().clear();
            }
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.setAppHasBeenLaunchedWithNewIAP();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final synchronized void startIapLogging(Context context, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        synchronized (InAppPurchaseAutoLogger.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
                return;
            }
            try {
                context.getClass();
                billingClientVersion.getClass();
                AtomicBoolean atomicBoolean = failedToCreateWrapper;
                if (atomicBoolean.get()) {
                    return;
                }
                c82 c82Var = new c82();
                InAppPurchaseUtils.BillingClientVersion billingClientVersion2 = InAppPurchaseUtils.BillingClientVersion.V2_V4;
                if (billingClientVersion == billingClientVersion2) {
                    c82Var.m = InAppPurchaseBillingClientWrapperV2V4.Companion.getOrCreateInstance(context);
                } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                    c82Var.m = InAppPurchaseBillingClientWrapperV5V7.Companion.getOrCreateInstance(context);
                }
                int i = 1;
                if (c82Var.m == null) {
                    atomicBoolean.set(true);
                    return;
                }
                if (!FeatureManager.isEnabled(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.isEnabled() && billingClientVersion != billingClientVersion2)) {
                    ((InAppPurchaseBillingClientWrapper) c82Var.m).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new q11(billingClientVersion, context, i));
                } else {
                    ((InAppPurchaseBillingClientWrapper) c82Var.m).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new s50(c82Var, billingClientVersion, context, 4));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1(c82 c82Var, InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            c82Var.getClass();
            billingClientVersion.getClass();
            context.getClass();
            ((InAppPurchaseBillingClientWrapper) c82Var.m).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.SUBS, new q11(billingClientVersion, context, 0));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1$lambda$0(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$2(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            billingClientVersion.getClass();
            context.getClass();
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            packageName.getClass();
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    public final AtomicBoolean getFailedToCreateWrapper() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return failedToCreateWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
