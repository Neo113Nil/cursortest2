package com.appsflyer.internal;

import j6.C0588e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.F;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l6.C0671a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1eSDK {
    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) {
        IntRange c7 = C0588e.c(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(s.g(c7, 10));
        Iterator it = c7.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((F) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getCurrencyIso4217Code(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        C0671a a7 = l6.j.a(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = a7.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            Intrinsics.checkNotNullExpressionValue(obj, "");
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
