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

/* loaded from: classes.dex */
final class AFd1ySDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFInAppEventParameterName;
    final AFd1xSDK.AFa1zSDK AFInAppEventType;
    private final AFi1qSDK AFKeystoreWrapper;
    private boolean AFLogger;
    private boolean registerClient;
    private final ScheduledExecutorService valueOf;
    private final AFc1vSDK values;

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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFd1ySDK aFd1ySDK, AFh1xSDK aFh1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        if (!aFd1ySDK.AFLogger) {
            try {
                aFd1ySDK.AFInAppEventType.values(aFh1xSDK);
            } catch (Exception e4) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e4, true);
            }
        }
        aFd1ySDK.registerClient = false;
        aFd1ySDK.AFLogger = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1ySDK aFd1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        int i2 = 1;
        aFd1ySDK.registerClient = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1ySDK.valueOf;
            h hVar = new h(aFd1ySDK, i2);
            AFd1xSDK.AFa1uSDK aFa1uSDK = AFd1xSDK.AFa1uSDK;
            scheduledExecutorService.schedule(hVar, AFd1xSDK.AFa1uSDK.AFInAppEventParameterName(), TimeUnit.MILLISECONDS);
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
            } catch (Exception e4) {
                AFLogger.afErrorLog("Listener threw exception! ", e4);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventParameterName.execute(new h(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventParameterName.execute(new g(this, 0, new AFh1xSDK(activity, this.AFKeystoreWrapper)));
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
}
