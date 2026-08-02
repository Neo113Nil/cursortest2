package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118z0 {
    public static boolean a() {
        boolean z;
        synchronized (C1092y0.class) {
            z = C1092y0.f13043f;
        }
        return z;
    }

    public static void b() {
        synchronized (C1092y0.class) {
            C1092y0.f13043f = true;
        }
    }
}
