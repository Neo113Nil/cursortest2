package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1bSDK {
    private static final List<Object> getMediationNetwork(JSONArray jSONArray) {
        IntRange f3 = be.f.f(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(z.j(f3, 10));
        Iterator it = f3.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((m0) it).nextInt());
            obj.getClass();
            arrayList.add(getMediationNetwork(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        de.a b10 = de.k.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, getMediationNetwork(obj));
        }
        return linkedHashMap;
    }

    private static final Object getMediationNetwork(Object obj) {
        if (obj instanceof JSONArray) {
            return getMediationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
