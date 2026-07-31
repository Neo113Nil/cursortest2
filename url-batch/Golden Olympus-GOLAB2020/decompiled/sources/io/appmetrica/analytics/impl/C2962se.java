package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2962se {
    public static final V9 a(C2962se c2962se, EnumC2594ea enumC2594ea) {
        int i4;
        c2962se.getClass();
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
        return v9;
    }
}
