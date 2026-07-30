package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import defpackage.a;
import defpackage.m;
import defpackage.m3;
import defpackage.up2;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    private static final String TAG;
    private static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock;
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount;
    private static final ScheduledExecutorService iapExecutor;
    private static String previousActivityName;
    private static final ScheduledExecutorService singleThreadExecutor;
    private static final AtomicBoolean tracking;

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        iapExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    private final void cancelCurrentTask() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            try {
                if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                    scheduledFuture.cancel(false);
                }
                currentFuture = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    private final int getSessionTimeoutInSeconds() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery == null ? Constants.getDefaultAppEventsSessionTimeoutInSeconds() : appSettingsWithoutQuery.getSessionTimeoutInSeconds();
    }

    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    public static final boolean isTracking() {
        return tracking.get();
    }

    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(new m(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityCreated$lambda$1() {
        if (currentSession == null) {
            currentSession = SessionInfo.Companion.getStoredSessionInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager.onActivityDestroyed(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        int i = 0;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, INCORRECT_IMPL_WARNING);
        }
        cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new m3(activityName, i, currentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7(long j, String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), null, null, 4, null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(Long.valueOf(j));
        }
        if (foregroundActivityCount.get() <= 0) {
            m3 m3Var = new m3(str, 1, j);
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(m3Var, INSTANCE.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
                Unit unit = Unit.a;
            }
        }
        long j2 = currentActivityAppearTime;
        AutomaticAnalyticsLogger.logActivityTimeSpentEvent(str, j2 > 0 ? (j - j2) / INTERRUPTION_THRESHOLD_MILLISECONDS : 0L);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.writeSessionToDisk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$7$lambda$5(long j, String str) {
        str.getClass();
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            SessionLogger.logDeactivateApp(str, currentSession, appId);
            SessionInfo.Companion.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            Unit unit = Unit.a;
        }
    }

    public static final void onActivityResumed(Activity activity) {
        activity.getClass();
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        INSTANCE.cancelCurrentTask();
        final long currentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        final String activityName = Utility.getActivityName(activity);
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager.trackActivity(activity);
        String str = previousActivityName;
        if (str != null && up2.q(str, "ProxyBillingActivity") && !Intrinsics.b(activityName, "ProxyBillingActivity")) {
            iapExecutor.execute(new m(2));
        }
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: l3
            @Override // java.lang.Runnable
            public final void run() {
                ActivityLifecycleTracker.onActivityResumed$lambda$3(currentTimeMillis, activityName, applicationContext);
            }
        });
        previousActivityName = activityName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$3(long j, String str, Context context) {
        SessionInfo sessionInfo;
        str.getClass();
        SessionInfo sessionInfo2 = currentSession;
        Long sessionLastEventTime = sessionInfo2 != null ? sessionInfo2.getSessionLastEventTime() : null;
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j), null, null, 4, null);
            String str2 = appId;
            context.getClass();
            SessionLogger.logActivateApp(str, null, str2, context);
        } else if (sessionLastEventTime != null) {
            long longValue = j - sessionLastEventTime.longValue();
            if (longValue > INSTANCE.getSessionTimeoutInSeconds() * 1000) {
                SessionLogger.logDeactivateApp(str, currentSession, appId);
                String str3 = appId;
                context.getClass();
                SessionLogger.logActivateApp(str, null, str3, context);
                currentSession = new SessionInfo(Long.valueOf(j), null, null, 4, null);
            } else if (longValue > INTERRUPTION_THRESHOLD_MILLISECONDS && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(Long.valueOf(j));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.writeSessionToDisk();
        }
    }

    public static final void startTracking(Application application, String str) {
        application.getClass();
        if (tracking.compareAndSet(false, true)) {
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, new a());
            appId = str;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.ActivityLifecycleTracker$startTracking$2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    String str2;
                    activity.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityCreated");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityCreated(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    String str2;
                    activity.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityDestroyed");
                    ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    String str2;
                    activity.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityPaused");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    String str2;
                    activity.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityResumed");
                    AppEventUtility.assertIsMainThread();
                    ActivityLifecycleTracker.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    String str2;
                    activity.getClass();
                    bundle.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivitySaveInstanceState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    int i;
                    String str2;
                    activity.getClass();
                    i = ActivityLifecycleTracker.activityReferences;
                    ActivityLifecycleTracker.activityReferences = i + 1;
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityStarted");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    String str2;
                    int i;
                    activity.getClass();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    str2 = ActivityLifecycleTracker.TAG;
                    companion.log(loggingBehavior, str2, "onActivityStopped");
                    AppEventsLogger.Companion.onContextStop();
                    i = ActivityLifecycleTracker.activityReferences;
                    ActivityLifecycleTracker.activityReferences = i - 1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTracking$lambda$0(boolean z) {
        if (z) {
            CodelessManager.enable();
        } else {
            CodelessManager.disable();
        }
    }
}
