package D0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f361a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f362b;

    /* renamed from: c, reason: collision with root package name */
    private final String f363c;

    /* renamed from: d, reason: collision with root package name */
    private final int f364d;

    public b(String str) {
        this(str, 5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f361a, runnable, this.f363c + this.f362b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i4 = this.f364d;
        if (priority != i4) {
            thread.setPriority(i4);
        }
        return thread;
    }

    public b(String str, int i4) {
        this.f362b = new AtomicInteger(1);
        this.f364d = i4;
        this.f361a = Thread.currentThread().getThreadGroup();
        this.f363c = "PPS-" + str + "-pool-thread-";
    }
}
