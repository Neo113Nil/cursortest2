package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cq0 {
    @NotNull
    public static HashMap a(@NotNull JSONObject jsonObject) {
        Object obj;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        Intrinsics.checkNotNull(keys);
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.checkNotNull(key);
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                obj = jsonObject.get(key);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    hashMap.put(key, a((JSONObject) obj));
                } else {
                    hashMap.put(key, obj);
                }
            }
        }
        return hashMap;
    }
}
