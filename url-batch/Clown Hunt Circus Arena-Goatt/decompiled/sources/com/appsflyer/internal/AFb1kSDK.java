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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class AFb1kSDK implements Application.ActivityLifecycleCallbacks {
    private final AFf1tSDK AFInAppEventParameterName;
    private final AFb1uSDK AFInAppEventType;
    private final Executor AFKeystoreWrapper;
    private boolean afDebugLog;
    boolean valueOf;
    final AFb1iSDK.AFa1wSDK values;

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

    public AFb1kSDK(Executor executor, AFb1uSDK aFb1uSDK, AFf1tSDK aFf1tSDK, AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1uSDK, "");
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        this.AFKeystoreWrapper = executor;
        this.AFInAppEventType = aFb1uSDK;
        this.AFInAppEventParameterName = aFf1tSDK;
        this.values = aFa1wSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1kSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.AFInAppEventParameterName(AFb1kSDK.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1kSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.AFKeystoreWrapper(AFb1kSDK.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        aFb1kSDK.afDebugLog = true;
        Context applicationContext = activity.getApplicationContext();
        try {
            Timer timer = new Timer();
            AFa1zSDK aFa1zSDK = aFb1kSDK.new AFa1zSDK(applicationContext);
            AFb1iSDK.Companion companion = AFb1iSDK.INSTANCE;
            timer.schedule(aFa1zSDK, AFb1iSDK.Companion.valueOf());
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    public static final class AFa1zSDK extends TimerTask {
        private /* synthetic */ Context AFKeystoreWrapper;

        AFa1zSDK(Context context) {
            this.AFKeystoreWrapper = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (AFb1kSDK.this.valueOf && AFb1kSDK.this.afDebugLog) {
                AFb1kSDK.this.valueOf = false;
                try {
                    AFb1iSDK.AFa1wSDK aFa1wSDK = AFb1kSDK.this.values;
                    Context context = this.AFKeystoreWrapper;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    aFa1wSDK.AFKeystoreWrapper(context);
                } catch (Exception e) {
                    AFLogger.afErrorLog("Listener threw exception! ", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1kSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFb1kSDK.values(AFb1kSDK.this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFb1kSDK aFb1kSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        AFb1uSDK aFb1uSDK = aFb1kSDK.AFInAppEventType;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != AFb1uSDK.AFInAppEventType) {
            AFb1uSDK.AFInAppEventType = intent;
        }
        aFb1kSDK.AFInAppEventParameterName.values(activity);
    }
}
