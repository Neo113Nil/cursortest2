package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876oe {
    public static final H9 a(C0876oe c0876oe, Q9 q9, Object obj) {
        int i2;
        c0876oe.getClass();
        H9 h9 = new H9();
        switch (q9) {
            case UNKNOWN:
                i2 = 0;
                break;
            case APPSFLYER:
                i2 = 1;
                break;
            case ADJUST:
                i2 = 2;
                break;
            case KOCHAVA:
                i2 = 3;
                break;
            case TENJIN:
                i2 = 4;
                break;
            case AIRBRIDGE:
                i2 = 5;
                break;
            case SINGULAR:
                i2 = 6;
                break;
            default:
                throw new C1.b();
        }
        h9.f6866a = i2;
        C0902pe.f9006b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        h9.f6867b = jSONObject.toString().getBytes(B4.a.f287a);
        return h9;
    }
}
