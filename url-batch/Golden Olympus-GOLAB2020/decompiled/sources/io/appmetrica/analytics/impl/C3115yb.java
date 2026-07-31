package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3115yb {
    public static final V9 a(C3115yb c3115yb, EnumC2594ea enumC2594ea, JSONObject jSONObject) {
        int i4;
        c3115yb.getClass();
        V9 v9 = new V9();
        switch (enumC2594ea) {
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
                throw new W1.m();
        }
        v9.f38414a = i4;
        v9.f38415b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return v9;
    }
}
