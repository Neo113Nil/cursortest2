package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944x0 {
    public static boolean a() {
        boolean z;
        synchronized (C0918w0.class) {
            z = C0918w0.f;
        }
        return z;
    }

    public static void b() {
        synchronized (C0918w0.class) {
            C0918w0.f = true;
        }
    }
}
