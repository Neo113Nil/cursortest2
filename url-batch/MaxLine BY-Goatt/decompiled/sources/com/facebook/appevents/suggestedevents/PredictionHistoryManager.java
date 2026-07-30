package com.facebook.appevents.suggestedevents;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.mi1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PredictionHistoryManager {
    private static final String CLICKED_PATH_STORE = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
    private static final String SUGGESTED_EVENTS_HISTORY = "SUGGESTED_EVENTS_HISTORY";
    private static SharedPreferences shardPreferences;
    public static final PredictionHistoryManager INSTANCE = new PredictionHistoryManager();
    private static final Map<String, String> clickedViewPaths = new LinkedHashMap();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private PredictionHistoryManager() {
    }

    public static final void addPrediction(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return;
        }
        try {
            str.getClass();
            str2.getClass();
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(str, str2);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(SUGGESTED_EVENTS_HISTORY, Utility.mapToJsonStr(mi1.i(map))).apply();
            } else {
                Intrinsics.f("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
        }
    }

    public static final String getPathID(View view, String str) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            view.getClass();
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ViewHierarchy.getParentOfView(view);
                }
                jSONObject.put(ViewHierarchyConstants.CLASS_NAME_KEY, jSONArray);
            } catch (JSONException unused) {
            }
            return Utility.sha256hash(jSONObject.toString());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
            return null;
        }
    }

    private final void initAndWait() {
        String str = BuildConfig.FLAVOR;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(CLICKED_PATH_STORE, 0);
            sharedPreferences.getClass();
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            if (sharedPreferences == null) {
                Intrinsics.f("shardPreferences");
                throw null;
            }
            String string = sharedPreferences.getString(SUGGESTED_EVENTS_HISTORY, BuildConfig.FLAVOR);
            if (string != null) {
                str = string;
            }
            map.putAll(Utility.jsonStrToMap(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final String queryEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            str.getClass();
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PredictionHistoryManager.class);
            return null;
        }
    }
}
