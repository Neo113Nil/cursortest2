package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f36940a;

    public InterruptionSafeThread() {
        this.f36940a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f36940a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f36940a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f36940a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f36940a = true;
    }

    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f36940a = true;
    }
}
