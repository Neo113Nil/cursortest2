package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1eSDK implements AFe1zSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ Map<String, String> getRevenue(String str) {
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
