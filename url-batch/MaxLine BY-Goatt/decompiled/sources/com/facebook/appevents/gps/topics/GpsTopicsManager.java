package com.facebook.appevents.gps.topics;

import android.os.Build;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.ah0;
import defpackage.b71;
import defpackage.ev0;
import defpackage.y91;
import defpackage.ya1;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GpsTopicsManager {
    public static final GpsTopicsManager INSTANCE = new GpsTopicsManager();
    private static final boolean RECORD_OBSERVATION = true;
    private static final String TAG;
    private static final y91 executor$delegate;
    private static final AtomicBoolean isTopicsObservationEnabled;

    static {
        String cls = GpsTopicsManager.class.toString();
        cls.getClass();
        TAG = cls;
        executor$delegate = ya1.b(GpsTopicsManager$executor$2.INSTANCE);
        isTopicsObservationEnabled = new AtomicBoolean(false);
    }

    private GpsTopicsManager() {
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return null;
        }
    }

    public static final /* synthetic */ List access$processObservedTopics(GpsTopicsManager gpsTopicsManager, ev0 ev0Var) {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return gpsTopicsManager.processObservedTopics(ev0Var);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return null;
        }
    }

    public static final void enableTopicsObservation() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return;
        }
        try {
            isTopicsObservationEnabled.set(RECORD_OBSERVATION);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
        }
    }

    private final Executor getExecutor() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = executor$delegate.getValue();
            value.getClass();
            return (Executor) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final CompletableFuture<List<TopicData>> getTopics() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return null;
        }
        try {
            if (!shouldObserveTopics()) {
                CompletableFuture<List<TopicData>> completedFuture = CompletableFuture.completedFuture(ah0.m);
                completedFuture.getClass();
                return completedFuture;
            }
            final CompletableFuture<List<TopicData>> completableFuture = new CompletableFuture<>();
            try {
                FacebookSdk.getApplicationContext();
                new OutcomeReceiver() { // from class: com.facebook.appevents.gps.topics.GpsTopicsManager$getTopics$callback$1
                    public void onError(Exception exc) {
                        exc.getClass();
                        Log.w(GpsTopicsManager.access$getTAG$p(), "GPS_TOPICS_OBSERVATION_FAILURE", exc);
                        completableFuture.completeExceptionally(exc);
                    }

                    public /* synthetic */ void onResult(Object obj) {
                        if (obj == null) {
                            onResult((ev0) null);
                        } else {
                            b71.o();
                        }
                    }

                    public void onResult(ev0 ev0Var) {
                        throw null;
                    }
                };
                throw new RuntimeException("Stub!");
            } catch (Throwable th) {
                Log.w(TAG, "GPS_TOPICS_OBSERVATION_FAILURE", th);
                completableFuture.completeExceptionally(th);
                return completableFuture;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, GpsTopicsManager.class);
            return null;
        }
    }

    private final List<TopicData> processObservedTopics(ev0 ev0Var) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final boolean shouldObserveTopics() {
        if (CrashShieldHandler.isObjectCrashing(GpsTopicsManager.class)) {
            return false;
        }
        try {
            if (!isTopicsObservationEnabled.get()) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 33) {
                return false;
            }
            return RECORD_OBSERVATION;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsTopicsManager.class);
            return false;
        }
    }
}
