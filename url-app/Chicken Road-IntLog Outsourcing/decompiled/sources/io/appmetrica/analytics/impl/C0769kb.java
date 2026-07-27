package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769kb {
    public static final H9 a(C0769kb c0769kb, Q9 q9, JSONObject jSONObject) {
        int i2;
        c0769kb.getClass();
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
        h9.f6867b = jSONObject.toString().getBytes(B4.a.f287a);
        return h9;
    }
}
