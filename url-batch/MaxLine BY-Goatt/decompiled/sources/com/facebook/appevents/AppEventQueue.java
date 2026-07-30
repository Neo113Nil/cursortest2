package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.k3;
import defpackage.kf1;
import defpackage.m;
import defpackage.n1;
import defpackage.q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static ScheduledFuture<?> scheduledFuture;
    public static final AppEventQueue INSTANCE = new AppEventQueue();
    private static final String TAG = AppEventQueue.class.getName();
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static volatile AppEventCollection appEventCollection = new AppEventCollection();
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable flushRunnable = new m(8);

    private AppEventQueue() {
    }

    public static final void add(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvent.getClass();
            singleThreadExecutor.execute(new q1(3, accessTokenAppIdPair, appEvent));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add$lambda$3(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvent.getClass();
            appEventCollection.addEvent(accessTokenAppIdPair, appEvent);
            if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.getEventCount() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                flushAndWait(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final GraphRequest buildRequestForSession(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState, boolean z, FlushStatistics flushStatistics) {
        if (!CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            try {
                accessTokenAppIdPair.getClass();
                sessionEventsState.getClass();
                flushStatistics.getClass();
                String applicationId = accessTokenAppIdPair.getApplicationId();
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
                GraphRequest newPostRequest = GraphRequest.Companion.newPostRequest(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1)), null, null);
                newPostRequest.setForceApplicationRequest(true);
                Bundle parameters = newPostRequest.getParameters();
                if (parameters == null) {
                    parameters = new Bundle();
                }
                String accessTokenString = accessTokenAppIdPair.getAccessTokenString();
                if (accessTokenString == null) {
                    AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
                    accessTokenString = currentAccessToken != null ? currentAccessToken.getToken() : null;
                }
                if (accessTokenString != null) {
                    parameters.putString("access_token", accessTokenString);
                }
                String pushNotificationsRegistrationId = InternalAppEventsLogger.Companion.getPushNotificationsRegistrationId();
                if (pushNotificationsRegistrationId != null) {
                    parameters.putString("device_token", pushNotificationsRegistrationId);
                }
                String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
                if (installReferrer != null) {
                    parameters.putString("install_referrer", installReferrer);
                }
                newPostRequest.setParameters(parameters);
                int populateRequest = sessionEventsState.populateRequest(newPostRequest, FacebookSdk.getApplicationContext(), queryAppSettings != null ? queryAppSettings.supportsImplicitLogging() : false, z);
                if (populateRequest != 0) {
                    flushStatistics.setNumEvents(flushStatistics.getNumEvents() + populateRequest);
                    newPostRequest.setCallback(new n1(accessTokenAppIdPair, newPostRequest, sessionEventsState, flushStatistics, 1));
                    return newPostRequest;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRequestForSession$lambda$4(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics, GraphResponse graphResponse) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            graphRequest.getClass();
            sessionEventsState.getClass();
            flushStatistics.getClass();
            graphResponse.getClass();
            handleResponse(accessTokenAppIdPair, graphRequest, graphResponse, sessionEventsState, flushStatistics);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final List<GraphRequest> buildRequests(AppEventCollection appEventCollection2, FlushStatistics flushStatistics) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            appEventCollection2.getClass();
            flushStatistics.getClass();
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.keySet()) {
                SessionEventsState sessionEventsState = appEventCollection2.get(accessTokenAppIdPair);
                if (sessionEventsState == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest buildRequestForSession = buildRequestForSession(accessTokenAppIdPair, sessionEventsState, limitEventAndDataUsage, flushStatistics);
                if (buildRequestForSession != null) {
                    arrayList.add(buildRequestForSession);
                    if (AppEventsCAPIManager.INSTANCE.isEnabled$facebook_core_release()) {
                        AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint(buildRequestForSession);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }

    public static final void flush(FlushReason flushReason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            flushReason.getClass();
            singleThreadExecutor.execute(new k3(5, flushReason));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$2(FlushReason flushReason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            flushReason.getClass();
            flushAndWait(flushReason);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final void flushAndWait(FlushReason flushReason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            flushReason.getClass();
            appEventCollection.addPersistedEvents(AppEventDiskStore.readAndClearStore());
            try {
                FlushStatistics sendEventsToServer = sendEventsToServer(flushReason, appEventCollection);
                if (sendEventsToServer != null) {
                    Intent intent = new Intent(AppEventsLogger.ACTION_APP_EVENTS_FLUSHED);
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED, sendEventsToServer.getNumEvents());
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_FLUSH_RESULT, sendEventsToServer.getResult());
                    kf1.a(FacebookSdk.getApplicationContext()).c(intent);
                }
            } catch (Exception e) {
                Log.w(TAG, "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushRunnable$lambda$0() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                flushAndWait(FlushReason.TIMER);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final Set<AccessTokenAppIdPair> getKeySet() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }

    public static final void handleResponse(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, GraphResponse graphResponse, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        String str;
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            graphRequest.getClass();
            graphResponse.getClass();
            sessionEventsState.getClass();
            flushStatistics.getClass();
            FacebookRequestError error = graphResponse.getError();
            String str2 = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            if (error != null) {
                if (error.getErrorCode() == -1) {
                    str2 = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{graphResponse.toString(), error.toString()}, 2));
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) graphRequest.getTag()).toString(2);
                    str.getClass();
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str3 = TAG;
                str3.getClass();
                companion.log(loggingBehavior, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.getGraphObject()), str2, str);
            }
            sessionEventsState.clearInFlightAndStats(error != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                FacebookSdk.getExecutor().execute(new q1(4, accessTokenAppIdPair, sessionEventsState));
            }
            if (flushResult == FlushResult.SUCCESS || flushStatistics.getResult() == flushResult2) {
                return;
            }
            flushStatistics.setResult(flushResult);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            sessionEventsState.getClass();
            AppEventStore.persistEvents(accessTokenAppIdPair, sessionEventsState);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final void persistToDisk() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new m(7));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistToDisk$lambda$1() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            AppEventStore.persistEvents(appEventCollection);
            appEventCollection = new AppEventCollection();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final FlushStatistics sendEventsToServer(FlushReason flushReason, AppEventCollection appEventCollection2) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            flushReason.getClass();
            appEventCollection2.getClass();
            FlushStatistics flushStatistics = new FlushStatistics();
            List<GraphRequest> buildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (buildRequests.isEmpty()) {
                return null;
            }
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.log(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.getNumEvents()), flushReason.toString());
            Iterator<GraphRequest> it = buildRequests.iterator();
            while (it.hasNext()) {
                it.next().executeAndWait();
            }
            return flushStatistics;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }
}
