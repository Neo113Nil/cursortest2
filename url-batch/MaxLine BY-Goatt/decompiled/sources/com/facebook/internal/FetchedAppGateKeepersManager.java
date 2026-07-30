package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import defpackage.k3;
import defpackage.ok0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FetchedAppGateKeepersManager {
    private static final String APPLICATION_FIELDS = "fields";
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;
    private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
    private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
    private static final String APPLICATION_GRAPH_DATA = "data";
    private static final String APPLICATION_PLATFORM = "platform";
    private static final String APPLICATION_SDK_VERSION = "sdk_version";
    private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
    private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    private static final String APP_PLATFORM = "android";
    private static final String TAG = "FetchedAppGateKeepersManager";
    private static volatile GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static volatile Long timestamp;
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    private final JSONObject getAppGateKeepersQueryResponse(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APPLICATION_PLATFORM, "android");
        bundle.putString(APPLICATION_SDK_VERSION, FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, String.format("app/%s", Arrays.copyOf(new Object[]{APPLICATION_GATEKEEPER_EDGE}, 1)), null);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public static final boolean getGateKeeperForKey(String str, String str2, boolean z) {
        Boolean bool;
        str.getClass();
        Map<String, Boolean> gateKeepersForApplication = INSTANCE.getGateKeepersForApplication(str2);
        return (gateKeepersForApplication.containsKey(str) && (bool = gateKeepersForApplication.get(str)) != null) ? bool.booleanValue() : z;
    }

    private final synchronized JSONObject getGateKeepersForAppId(String str) {
        return fetchedAppGateKeepers.get(str);
    }

    private final boolean isTimestampValid(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < APPLICATION_GATEKEEPER_CACHE_TIMEOUT;
    }

    public static final synchronized void loadAppGateKeepersAsync(Callback callback) {
        synchronized (FetchedAppGateKeepersManager.class) {
            if (callback != null) {
                try {
                    callbacks.add(callback);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String applicationId = FacebookSdk.getApplicationId();
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
            if (fetchedAppGateKeepersManager.isTimestampValid(timestamp) && fetchedAppGateKeepersManager.getGateKeepersForAppId(applicationId) != null) {
                fetchedAppGateKeepersManager.pollCallbacks();
                return;
            }
            Context applicationContext = FacebookSdk.getApplicationContext();
            String format = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
            if (applicationContext == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(format, null);
            if (!Utility.isNullOrEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Utility.logd(Utility.LOG_TAG, e);
                }
                if (jSONObject != null) {
                    parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                }
            }
            Executor executor = FacebookSdk.getExecutor();
            if (executor == null) {
                return;
            }
            if (isLoading.compareAndSet(false, true)) {
                executor.execute(new ok0(applicationContext, applicationId, format));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppGateKeepersAsync$lambda$0(String str, Context context, String str2) {
        str.getClass();
        context.getClass();
        str2.getClass();
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(str);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
            context.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(str2, appGateKeepersQueryResponse.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    public static final synchronized JSONObject parseAppGateKeepersFromJSON$facebook_core_release(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (FetchedAppGateKeepersManager.class) {
            try {
                str.getClass();
                JSONObject gateKeepersForAppId = INSTANCE.getGateKeepersForAppId(str);
                jSONObject2 = gateKeepersForAppId != null ? new JSONObject(gateKeepersForAppId.toString()) : new JSONObject();
                JSONObject optJSONObject = (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) ? null : optJSONArray.optJSONObject(0);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray(APPLICATION_GATEKEEPER_FIELD);
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject3.getString(SDKConstants.PARAM_KEY), jSONObject3.getBoolean("value"));
                    } catch (JSONException e) {
                        Utility.logd(Utility.LOG_TAG, e);
                    }
                }
                INSTANCE.setGateKeepersForAppId(str, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    private final void pollCallbacks() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<Callback> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            Callback poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new k3(13, poll));
            }
        }
    }

    public static final JSONObject queryAppGateKeepers(String str, boolean z) {
        JSONObject gateKeepersForAppId;
        str.getClass();
        if (!z && (gateKeepersForAppId = INSTANCE.getGateKeepersForAppId(str)) != null) {
            return gateKeepersForAppId;
        }
        JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(str);
        FacebookSdk.getApplicationContext().getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{str}, 1)), appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
    }

    public static final void resetRuntimeGateKeeperCache() {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 != null) {
            GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, null, 1, null);
        }
    }

    private final synchronized void setGateKeepersForAppId(String str, JSONObject jSONObject) {
        fetchedAppGateKeepers.put(str, jSONObject);
    }

    public static final void setRuntimeGateKeeper(String str, GateKeeper gateKeeper) {
        str.getClass();
        gateKeeper.getClass();
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.getGateKeeper(str, gateKeeper.getName()) : null) == null) {
            Log.w(TAG, "Missing gatekeeper runtime cache");
            return;
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache3 != null) {
            gateKeeperRuntimeCache3.setGateKeeper(str, gateKeeper);
        }
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(String str, GateKeeper gateKeeper, int i, Object obj) {
        if ((i & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    public final Map<String, Boolean> getGateKeepersForApplication(String str) {
        loadAppGateKeepersAsync();
        if (str == null || getGateKeepersForAppId(str) == null) {
            return new HashMap();
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        List<GateKeeper> dumpGateKeepers = gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.dumpGateKeepers(str) : null;
        if (dumpGateKeepers != null) {
            HashMap hashMap = new HashMap();
            for (GateKeeper gateKeeper : dumpGateKeepers) {
                hashMap.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        JSONObject gateKeepersForAppId = getGateKeepersForAppId(str);
        if (gateKeepersForAppId == null) {
            gateKeepersForAppId = new JSONObject();
        }
        Iterator<String> keys = gateKeepersForAppId.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            hashMap2.put(next, Boolean.valueOf(gateKeepersForAppId.optBoolean(next)));
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache3 == null) {
            gateKeeperRuntimeCache3 = new GateKeeperRuntimeCache();
        }
        ArrayList arrayList = new ArrayList(hashMap2.size());
        for (Map.Entry entry : hashMap2.entrySet()) {
            arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
        }
        gateKeeperRuntimeCache3.setGateKeepers(str, arrayList);
        gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
        return hashMap2;
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync(null);
    }
}
