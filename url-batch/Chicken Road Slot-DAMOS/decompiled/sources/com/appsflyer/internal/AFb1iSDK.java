package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {
    private final AFi1oSDK AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private ScheduledFuture<?> component4;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;
    private final AFa1mSDK getMonetizationNetwork;
    final AFb1aSDK.AFa1tSDK getRevenue;

    public AFb1iSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK, AFb1aSDK.AFa1tSDK aFa1tSDK) {
        scheduledExecutorService.getClass();
        aFa1mSDK.getClass();
        aFi1oSDK.getClass();
        aFa1tSDK.getClass();
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.AFAdRevenueData = aFi1oSDK;
        this.getRevenue = aFa1tSDK;
        this.areAllFieldsValid = new f(0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
        Object mVar;
        aFb1iSDK.getClass();
        aFb1iSDK.getMediationNetwork = false;
        try {
            hd.l lVar = hd.n.f4511e;
            aFb1iSDK.getRevenue.getMediationNetwork();
            mVar = Unit.f5554a;
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        Throwable a9 = hd.n.a(mVar);
        if (a9 != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        Object mVar;
        aFb1iSDK.getClass();
        aFh1qSDK.getClass();
        try {
            hd.l lVar = hd.n.f4511e;
            aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
            mVar = Unit.f5554a;
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        Throwable a9 = hd.n.a(mVar);
        if (a9 != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", a9, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getMonetizationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            this.getCurrencyIso4217Code.execute(new g(0, this, new AFh1qSDK(activity, this.AFAdRevenueData)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
