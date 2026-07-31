package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1uSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class AFd1vSDK implements Application.ActivityLifecycleCallbacks {
    private final AFc1pSDK AFInAppEventParameterName;
    private final ScheduledExecutorService AFInAppEventType;
    private final AFh1iSDK AFKeystoreWrapper;
    private boolean e;
    private boolean unregisterClient;
    private final Executor valueOf;
    final AFd1uSDK.AFa1tSDK values;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public AFd1vSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1pSDK aFc1pSDK, AFh1iSDK aFh1iSDK, AFd1uSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.valueOf = executor;
        this.AFInAppEventType = scheduledExecutorService;
        this.AFInAppEventParameterName = aFc1pSDK;
        this.AFKeystoreWrapper = aFh1iSDK;
        this.values = aFa1tSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFg1fSDK aFg1fSDK = new AFg1fSDK(activity, this.AFKeystoreWrapper);
        this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1vSDK.values(AFd1vSDK.this, aFg1fSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1vSDK aFd1vSDK, AFg1fSDK aFg1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFg1fSDK, "");
        if (!aFd1vSDK.e) {
            try {
                aFd1vSDK.values.values(aFg1fSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1vSDK.unregisterClient = false;
        aFd1vSDK.e = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFd1vSDK.AFInAppEventType(AFd1vSDK.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(final AFd1vSDK aFd1vSDK) {
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        aFd1vSDK.unregisterClient = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1vSDK.AFInAppEventType;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFd1vSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1vSDK.valueOf(AFd1vSDK.this);
                }
            };
            AFd1uSDK.Companion companion = AFd1uSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1uSDK.Companion.AFInAppEventType(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFd1vSDK aFd1vSDK) {
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        if (aFd1vSDK.e && aFd1vSDK.unregisterClient) {
            aFd1vSDK.e = false;
            try {
                aFd1vSDK.values.AFInAppEventParameterName();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1pSDK aFc1pSDK = this.AFInAppEventParameterName;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1pSDK.valueOf) {
            aFc1pSDK.valueOf = intent;
        }
        this.AFKeystoreWrapper.valueOf(activity);
    }
}
