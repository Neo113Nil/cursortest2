package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ProfileInformationCache {
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();
    private static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    private ProfileInformationCache() {
    }

    public static final JSONObject getProfileInformation(String str) {
        str.getClass();
        return infoCache.get(str);
    }

    public static final void putProfileInformation(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        infoCache.put(str, jSONObject);
    }
}
