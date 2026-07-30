package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.zv;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class RemoteServiceParametersHelper {
    public static final RemoteServiceParametersHelper INSTANCE = new RemoteServiceParametersHelper();
    private static final String TAG = "RemoteServiceWrapper";

    private RemoteServiceParametersHelper() {
    }

    public static final Bundle buildEventsBundle(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            eventType.getClass();
            str.getClass();
            list.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray buildEventsJson = INSTANCE.buildEventsJson(list, str);
            if (buildEventsJson.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", buildEventsJson.toString());
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceParametersHelper.class);
            return null;
        }
    }

    private final JSONArray buildEventsJson(List<AppEvent> list, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList N = zv.N(list);
            EventDeactivationManager.processEvents(N);
            boolean includeImplicitEvents = includeImplicitEvents(str);
            int size = N.size();
            int i = 0;
            while (i < size) {
                Object obj = N.get(i);
                i++;
                AppEvent appEvent = (AppEvent) obj;
                if (appEvent.isImplicit()) {
                    if (appEvent.isImplicit() && includeImplicitEvents) {
                    }
                }
                jSONArray.put(appEvent.getJsonObject());
            }
            return jSONArray;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean includeImplicitEvents(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(str, false);
            if (queryAppSettings != null) {
                return queryAppSettings.supportsImplicitLogging();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
