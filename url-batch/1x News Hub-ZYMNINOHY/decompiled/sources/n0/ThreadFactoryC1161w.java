package n0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1161w implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f10135a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10136b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f10136b;
        Thread newThread = this.f10135a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
