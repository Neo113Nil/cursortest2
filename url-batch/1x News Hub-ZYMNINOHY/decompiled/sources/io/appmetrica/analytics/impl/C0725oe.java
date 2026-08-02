package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725oe {
    public static final H9 a(C0725oe c0725oe, Q9 q9, Object obj) {
        int i3;
        c0725oe.getClass();
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
        C0751pe.f8081b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        h9.f6073b = jSONObject.toString().getBytes(s2.a.f10316a);
        return h9;
    }
}
