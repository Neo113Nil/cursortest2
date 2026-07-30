package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SessionEventsState {
    private List<AppEvent> accumulatedEvents;
    private final String anonymousAppDeviceGUID;
    private final AttributionIdentifiers attributionIdentifiers;
    private final List<AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SessionEventsState";
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String str) {
        attributionIdentifiers.getClass();
        str.getClass();
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = str;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final synchronized void accumulatePersistedEvents(List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            list.getClass();
            this.accumulatedEvents.addAll(list);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void addEvent(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            appEvent.getClass();
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(appEvent);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void clearInFlightAndStats(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (z) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int populateRequest(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        SessionEventsState sessionEventsState;
        Throwable th;
        SessionEventsState sessionEventsState2;
        Throwable th2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            graphRequest.getClass();
            context.getClass();
            try {
                synchronized (this) {
                    try {
                        int i = this.numSkippedEventsDueToFullBuffer;
                        EventDeactivationManager.processEvents(this.accumulatedEvents);
                        this.inFlightEvents.addAll(this.accumulatedEvents);
                        this.accumulatedEvents.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (AppEvent appEvent : this.inFlightEvents) {
                            try {
                                if (!z && appEvent.isImplicit()) {
                                }
                                jSONArray.put(appEvent.getJsonObject());
                                jSONArray2.put(appEvent.getOperationalJsonObject());
                            } catch (Throwable th3) {
                                th2 = th3;
                                sessionEventsState2 = this;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.a;
                            populateRequest(graphRequest, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            sessionEventsState = this;
                            CrashShieldHandler.handleThrowable(th, sessionEventsState);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        sessionEventsState2 = this;
                        th2 = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                CrashShieldHandler.handleThrowable(th, sessionEventsState);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
            sessionEventsState = this;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void populateRequest(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, z, context);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.setGraphObject(jSONObject);
            Bundle parameters = graphRequest.getParameters();
            String jSONArray3 = jSONArray.toString();
            jSONArray3.getClass();
            parameters.putString("custom_events", jSONArray3);
            if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                parameters.putString("operational_parameters", jSONArray2.toString());
            }
            graphRequest.setTag(jSONArray3);
            graphRequest.setParameters(parameters);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
