package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1eSDK implements AFc1fSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFc1fSDK
    public final /* synthetic */ Map<String, String> values(String str) {
        HashMap hashMap = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }
}
