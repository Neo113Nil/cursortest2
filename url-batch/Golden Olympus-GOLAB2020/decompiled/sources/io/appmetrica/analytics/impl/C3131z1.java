package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3131z1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f40294a;

    public C3131z1(I1 i12) {
        this.f40294a = i12;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f40294a) {
            try {
                I1 i12 = this.f40294a;
                if (i12.f37690c) {
                    i12.f37689b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
