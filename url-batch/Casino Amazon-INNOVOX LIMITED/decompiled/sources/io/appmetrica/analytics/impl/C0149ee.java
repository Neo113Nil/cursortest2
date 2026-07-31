package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.ee, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0149ee {
    public static final B9 a(C0149ee c0149ee, K9 k9) {
        int i;
        c0149ee.getClass();
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
        return b9;
    }
}
