package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Gc {
    public static final H9 a(Gc gc, Q9 q9, Map map) {
        int i3;
        Object value;
        gc.getClass();
        H9 h9 = new H9();
        switch (q9) {
            case UNKNOWN:
                i3 = 0;
                break;
            case APPSFLYER:
                i3 = 1;
                break;
            case ADJUST:
                i3 = 2;
                break;
            case KOCHAVA:
                i3 = 3;
                break;
            case TENJIN:
                i3 = 4;
                break;
            case AIRBRIDGE:
                i3 = 5;
                break;
            case SINGULAR:
                i3 = 6;
                break;
            default:
                throw new O0.b();
        }
        h9.f6072a = i3;
        Hc.f6079b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int Z2 = c2.q.Z(c2.g.N(entrySet));
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
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
            h9.f6073b = jSONObject.getBytes(s2.a.f10316a);
        }
        return h9;
    }
}
