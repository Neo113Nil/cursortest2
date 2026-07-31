package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0146eb {
    public static final B9 a(C0146eb c0146eb, K9 k9, JSONObject jSONObject) {
        int i;
        c0146eb.getClass();
        B9 b9 = new B9();
        switch (k9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        b9.f774a = i;
        b9.b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return b9;
    }
}
