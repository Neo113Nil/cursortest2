package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class AFd1ySDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFInAppEventParameterName;
    final AFd1xSDK.AFa1zSDK AFInAppEventType;
    private final AFi1qSDK AFKeystoreWrapper;
    private boolean AFLogger;
    private boolean registerClient;
    private final ScheduledExecutorService valueOf;
    private final AFc1vSDK values;

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

    public AFd1ySDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1vSDK aFc1vSDK, AFi1qSDK aFi1qSDK, AFd1xSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.AFInAppEventParameterName = executor;
        this.valueOf = scheduledExecutorService;
        this.values = aFc1vSDK;
        this.AFKeystoreWrapper = aFi1qSDK;
        this.AFInAppEventType = aFa1zSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1xSDK aFh1xSDK = new AFh1xSDK(activity, this.AFKeystoreWrapper);
        this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1ySDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.AFInAppEventParameterName(AFd1ySDK.this, aFh1xSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1ySDK aFd1ySDK, AFh1xSDK aFh1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        if (!aFd1ySDK.AFLogger) {
            try {
                aFd1ySDK.AFInAppEventType.values(aFh1xSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1ySDK.registerClient = false;
        aFd1ySDK.AFLogger = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1ySDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.AFInAppEventType(AFd1ySDK.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(final AFd1ySDK aFd1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        aFd1ySDK.registerClient = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1ySDK.valueOf;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFd1ySDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.values(AFd1ySDK.this);
                }
            };
            AFd1xSDK.Companion companion = AFd1xSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1xSDK.Companion.AFInAppEventParameterName(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFd1ySDK aFd1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        if (aFd1ySDK.AFLogger && aFd1ySDK.registerClient) {
            aFd1ySDK.AFLogger = false;
            try {
                aFd1ySDK.AFInAppEventType.valueOf();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1vSDK aFc1vSDK = this.values;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1vSDK.AFInAppEventType) {
            aFc1vSDK.AFInAppEventType = intent;
        }
        this.AFKeystoreWrapper.values(activity);
    }
}
