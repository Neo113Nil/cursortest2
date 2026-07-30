package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String TAG = AppEventStore.class.getName();

    private AppEventStore() {
    }

    public static final synchronized void persistEvents(AppEventCollection appEventCollection) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
                return;
            }
            try {
                appEventCollection.getClass();
                AppEventUtility.assertIsNotMainThread();
                PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
                for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.keySet()) {
                    SessionEventsState sessionEventsState = appEventCollection.get(accessTokenAppIdPair);
                    if (sessionEventsState == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readAndClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                }
                AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, AppEventStore.class);
            }
        }
    }

    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
                return;
            }
            try {
                accessTokenAppIdPair.getClass();
                sessionEventsState.getClass();
                AppEventUtility.assertIsNotMainThread();
                PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
                readAndClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, AppEventStore.class);
            }
        }
    }
}
