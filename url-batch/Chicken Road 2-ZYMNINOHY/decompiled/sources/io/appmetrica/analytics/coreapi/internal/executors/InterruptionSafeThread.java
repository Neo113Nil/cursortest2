package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f9646a;

    public InterruptionSafeThread() {
        this.f9646a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f9646a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f9646a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f9646a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f9646a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f9646a = true;
    }
}
