package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0665z0 {
    public static boolean a() {
        boolean z;
        synchronized (C0640y0.class) {
            z = C0640y0.f;
        }
        return z;
    }

    public static void b() {
        synchronized (C0640y0.class) {
            C0640y0.f = true;
        }
    }
}
