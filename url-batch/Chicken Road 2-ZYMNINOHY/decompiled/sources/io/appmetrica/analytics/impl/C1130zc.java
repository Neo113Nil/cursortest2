package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130zc {
    public static final A9 a(C1130zc c1130zc, J9 j9, Map map) {
        int i4;
        Object value;
        c1130zc.getClass();
        A9 a9 = new A9();
        switch (j9) {
            case UNKNOWN:
                i4 = 0;
                break;
            case APPSFLYER:
                i4 = 1;
                break;
            case ADJUST:
                i4 = 2;
                break;
            case KOCHAVA:
                i4 = 3;
                break;
            case TENJIN:
                i4 = 4;
                break;
            case AIRBRIDGE:
                i4 = 5;
                break;
            case SINGULAR:
                i4 = 6;
                break;
            default:
                throw new G1.a();
        }
        a9.f10032a = i4;
        Ac.f10040b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int z = d3.u.z(d3.k.Y(entrySet));
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    linkedHashMap.put(key, value);
                }
            }
            value = entry.getValue();
            linkedHashMap.put(key, value);
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            a9.f10033b = jSONObject.getBytes(AbstractC1504a.f15936a);
        }
        return a9;
    }
}
