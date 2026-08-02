package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class C1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L1 f5832a;

    public C1(L1 l12) {
        this.f5832a = l12;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f5832a) {
            try {
                L1 l12 = this.f5832a;
                if (l12.f6253c) {
                    l12.f6252b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
