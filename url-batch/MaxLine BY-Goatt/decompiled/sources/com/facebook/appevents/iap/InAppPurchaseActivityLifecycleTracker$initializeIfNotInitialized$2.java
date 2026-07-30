package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import defpackage.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 implements Application.ActivityLifecycleCallbacks {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$0() {
        Object obj;
        Object obj2;
        Context applicationContext = FacebookSdk.getApplicationContext();
        obj = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj);
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, purchasesInapp, false);
        obj2 = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, InAppPurchaseEventManager.getPurchasesSubs(applicationContext, obj2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStopped$lambda$1() {
        Object obj;
        Object obj2;
        Context applicationContext = FacebookSdk.getApplicationContext();
        obj = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj);
        if (purchasesInapp.isEmpty()) {
            obj2 = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
            purchasesInapp = InAppPurchaseEventManager.getPurchaseHistoryInapp(applicationContext, obj2);
        }
        InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, purchasesInapp, false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        try {
            FacebookSdk.getExecutor().execute(new m(11));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Boolean bool;
        activity.getClass();
        try {
            bool = InAppPurchaseActivityLifecycleTracker.hasBillingActivity;
            if (Intrinsics.b(bool, Boolean.TRUE) && Intrinsics.b(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                FacebookSdk.getExecutor().execute(new m(10));
            }
        } catch (Exception unused) {
        }
    }
}
