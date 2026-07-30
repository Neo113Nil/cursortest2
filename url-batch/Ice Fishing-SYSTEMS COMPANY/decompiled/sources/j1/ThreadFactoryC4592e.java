package j1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC4592e implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f38486d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f38487a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f38488b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f38489c;

    public ThreadFactoryC4592e() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f38487a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f38489c = "lottie-" + f38486d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f38487a, runnable, this.f38489c + this.f38488b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
