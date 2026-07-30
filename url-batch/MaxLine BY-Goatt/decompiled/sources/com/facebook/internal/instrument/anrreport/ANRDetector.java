package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.m;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ANRDetector {
    private static final int DETECTION_INTERVAL_IN_MS = 500;
    public static final ANRDetector INSTANCE = new ANRDetector();
    private static final int myUid = Process.myUid();
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    private static String previousStackTrace = BuildConfig.FLAVOR;
    private static final Runnable anrDetectorRunnable = new m(0);

    private ANRDetector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void anrDetectorRunnable$lambda$0() {
        if (CrashShieldHandler.isObjectCrashing(ANRDetector.class)) {
            return;
        }
        try {
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("activity");
            systemService.getClass();
            checkProcessError((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRDetector.class);
        }
    }

    public static final void checkProcessError(ActivityManager activityManager) {
        if (CrashShieldHandler.isObjectCrashing(ANRDetector.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                        Thread thread = Looper.getMainLooper().getThread();
                        thread.getClass();
                        String stackTrace = InstrumentUtility.getStackTrace(thread);
                        if (!Intrinsics.b(stackTrace, previousStackTrace) && InstrumentUtility.isSDKRelatedThread(thread)) {
                            previousStackTrace = stackTrace;
                            InstrumentData.Builder.build(processErrorStateInfo.shortMsg, stackTrace).save();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRDetector.class);
        }
    }

    public static final void start() {
        if (CrashShieldHandler.isObjectCrashing(ANRDetector.class)) {
            return;
        }
        try {
            scheduledExecutorService.scheduleWithFixedDelay(anrDetectorRunnable, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRDetector.class);
        }
    }
}
