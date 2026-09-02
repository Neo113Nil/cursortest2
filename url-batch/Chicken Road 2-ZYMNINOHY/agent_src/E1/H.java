package E1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class H implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f496a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f497b = new AtomicInteger(1);

    public H(C0029e c0029e) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f496a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + this.f497b.getAndIncrement());
        return newThread;
    }
}
