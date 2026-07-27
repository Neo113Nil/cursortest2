package com.appsflyer.internal;

import T2.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.AbstractC1409M;
import z2.C1442z;

/* loaded from: classes.dex */
public final class AFj1sSDK {
    private static final List<Object> AFInAppEventType(JSONArray jSONArray) {
        IntRange h4 = kotlin.ranges.b.h(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C1442z.h(h4, 10));
        Iterator<Integer> it = h4.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((AbstractC1409M) it).b());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(values(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> values(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        T2.a b4 = n.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b4.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            linkedHashMap.put(next, values(obj));
        }
        return linkedHashMap;
    }

    private static final Object values(Object obj) {
        if (obj instanceof JSONArray) {
            return AFInAppEventType((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return values((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
