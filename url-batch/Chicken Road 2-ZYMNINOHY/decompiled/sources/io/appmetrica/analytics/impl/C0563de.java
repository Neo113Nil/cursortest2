package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563de {
    public static final A9 a(C0563de c0563de, J9 j9) {
        int i4;
        c0563de.getClass();
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
        return a9;
    }
}
