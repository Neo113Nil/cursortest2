package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618kb {
    public static final H9 a(C0618kb c0618kb, Q9 q9, JSONObject jSONObject) {
        int i3;
        c0618kb.getClass();
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
        h9.f6073b = jSONObject.toString().getBytes(s2.a.f10316a);
        return h9;
    }
}
