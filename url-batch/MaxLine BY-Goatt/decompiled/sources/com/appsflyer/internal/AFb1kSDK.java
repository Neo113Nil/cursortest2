package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1iSDK;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class AFb1kSDK implements Application.ActivityLifecycleCallbacks {
    private final AFf1tSDK AFInAppEventParameterName;
    private final AFb1uSDK AFInAppEventType;
    private final Executor AFKeystoreWrapper;
    private boolean afDebugLog;
    boolean valueOf;
    final AFb1iSDK.AFa1wSDK values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1zSDK extends TimerTask {
        private /* synthetic */ Context AFKeystoreWrapper;

        public AFa1zSDK(Context context) {
            this.AFKeystoreWrapper = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (AFb1kSDK.this.valueOf && AFb1kSDK.this.afDebugLog) {
                AFb1kSDK aFb1kSDK = AFb1kSDK.this;
                aFb1kSDK.valueOf = false;
                try {
                    AFb1iSDK.AFa1wSDK aFa1wSDK = aFb1kSDK.values;
                    Context context = this.AFKeystoreWrapper;
                    context.getClass();
                    aFa1wSDK.AFKeystoreWrapper(context);
                } catch (Exception e) {
                    AFLogger.afErrorLog("Listener threw exception! ", e);
                }
            }
        }
    }

    public AFb1kSDK(Executor executor, AFb1uSDK aFb1uSDK, AFf1tSDK aFf1tSDK, AFb1iSDK.AFa1wSDK aFa1wSDK) {
        executor.getClass();
        aFb1uSDK.getClass();
        aFf1tSDK.getClass();
        aFa1wSDK.getClass();
        this.AFKeystoreWrapper = executor;
        this.AFInAppEventType = aFb1uSDK;
        this.AFInAppEventParameterName = aFf1tSDK;
        this.values = aFa1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFb1kSDK aFb1kSDK, Activity activity) {
        aFb1kSDK.getClass();
        activity.getClass();
        if (!aFb1kSDK.valueOf) {
            try {
                aFb1kSDK.values.values(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFb1kSDK.afDebugLog = false;
        aFb1kSDK.valueOf = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFb1kSDK aFb1kSDK, Activity activity) {
        aFb1kSDK.getClass();
        activity.getClass();
        aFb1kSDK.afDebugLog = true;
        Context applicationContext = activity.getApplicationContext();
        try {
            Timer timer = new Timer();
            AFa1zSDK aFa1zSDK = aFb1kSDK.new AFa1zSDK(applicationContext);
            AFb1iSDK.AFa1zSDK aFa1zSDK2 = AFb1iSDK.AFa1zSDK;
            timer.schedule(aFa1zSDK, AFb1iSDK.AFa1zSDK.valueOf());
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFb1kSDK aFb1kSDK, Activity activity) {
        aFb1kSDK.getClass();
        activity.getClass();
        AFb1uSDK aFb1uSDK = aFb1kSDK.AFInAppEventType;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != AFb1uSDK.AFInAppEventType) {
            AFb1uSDK.AFInAppEventType = intent;
        }
        aFb1kSDK.AFInAppEventParameterName.values(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.AFKeystoreWrapper.execute(new e(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.AFKeystoreWrapper.execute(new e(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.AFKeystoreWrapper.execute(new e(this, activity, 1));
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
