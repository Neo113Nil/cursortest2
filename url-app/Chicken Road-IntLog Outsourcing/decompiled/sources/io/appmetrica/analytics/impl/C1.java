package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class C1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L1 f6614a;

    public C1(L1 l12) {
        this.f6614a = l12;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f6614a) {
            try {
                L1 l12 = this.f6614a;
                if (l12.f7058c) {
                    l12.f7057b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
