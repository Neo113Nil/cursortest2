package io.appmetrica.analytics.impl;

import org.json.JSONObject;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560db {
    public static final A9 a(C0560db c0560db, J9 j9, JSONObject jSONObject) {
        int i4;
        c0560db.getClass();
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
        a9.f10033b = jSONObject.toString().getBytes(AbstractC1504a.f15936a);
        return a9;
    }
}
