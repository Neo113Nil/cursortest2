package com.appsflyer.internal;

import defpackage.ai;
import defpackage.b11;
import defpackage.j91;
import defpackage.lm;
import defpackage.o90;
import defpackage.v90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1eSDK {
    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) {
        IntRange g = b11.g(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(ai.h(g));
        Iterator it = g.iterator();
        while (((v90) it).g) {
            Object obj = jSONArray.get(((o90) it).nextInt());
            obj.getClass();
            arrayList.add(getCurrencyIso4217Code(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        lm b = j91.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, getCurrencyIso4217Code(obj));
        }
        return linkedHashMap;
    }

    private static final Object getCurrencyIso4217Code(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
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
