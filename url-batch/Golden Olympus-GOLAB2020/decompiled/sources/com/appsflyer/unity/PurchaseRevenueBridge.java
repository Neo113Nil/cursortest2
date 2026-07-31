package com.appsflyer.unity;

import android.util.Log;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.PurchaseClient;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseRevenueBridge {
    private static final String TAG = "AppsFlyerUnity";
    private static UnityPurchaseRevenueBridge unityBridge;

    public interface UnityPurchaseRevenueBridge {
        String getAdditionalParameters(String str, String str2);
    }

    public static /* synthetic */ Map a(List list) {
        try {
            String jSONObject = new JSONObject(Collections.singletonMap("events", list)).toString();
            UnityPurchaseRevenueBridge unityPurchaseRevenueBridge = unityBridge;
            String additionalParameters = unityPurchaseRevenueBridge != null ? unityPurchaseRevenueBridge.getAdditionalParameters("", jSONObject) : null;
            if (additionalParameters != null) {
                JSONObject jSONObject2 = new JSONObject(additionalParameters);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.get(next));
                }
                return hashMap;
            }
        } catch (JSONException e4) {
            Log.e(TAG, "Failed to parse additional params from Unity", e4);
        }
        return Collections.EMPTY_MAP;
    }

    public static /* synthetic */ Map b(List list) {
        try {
            String jSONObject = new JSONObject(Collections.singletonMap("events", list)).toString();
            UnityPurchaseRevenueBridge unityPurchaseRevenueBridge = unityBridge;
            String additionalParameters = unityPurchaseRevenueBridge != null ? unityPurchaseRevenueBridge.getAdditionalParameters(jSONObject, "") : null;
            if (additionalParameters != null) {
                JSONObject jSONObject2 = new JSONObject(additionalParameters);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.get(next));
                }
                return hashMap;
            }
        } catch (JSONException e4) {
            Log.e(TAG, "Failed to parse additional params from Unity", e4);
        }
        return Collections.EMPTY_MAP;
    }

    public static PurchaseClient.Builder configurePurchaseClient(PurchaseClient.Builder builder) {
        return builder.setInAppPurchaseEventDataSource(new PurchaseClient.InAppPurchaseEventDataSource() { // from class: com.appsflyer.unity.c
            @Override // com.appsflyer.api.PurchaseClient.PurchaseEventDataSource
            public final Map onNewPurchases(List<? extends InAppPurchaseEvent> list) {
                return PurchaseRevenueBridge.b(list);
            }
        }).setSubscriptionPurchaseEventDataSource(new PurchaseClient.SubscriptionPurchaseEventDataSource() { // from class: com.appsflyer.unity.d
            @Override // com.appsflyer.api.PurchaseClient.PurchaseEventDataSource
            public final Map onNewPurchases(List<? extends SubscriptionPurchaseEvent> list) {
                return PurchaseRevenueBridge.a(list);
            }
        });
    }

    public static void setUnityBridge(UnityPurchaseRevenueBridge unityPurchaseRevenueBridge) {
        unityBridge = unityPurchaseRevenueBridge;
    }
}
