package c4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class j1 implements Executor {

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f1997g;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f1996f = new AtomicInteger(1);

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Thread> f1998h = new WeakReference<>(null);

    j1(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this, str) { // from class: c4.i1

            /* renamed from: a, reason: collision with root package name */
            private final j1 f1992a;

            /* renamed from: b, reason: collision with root package name */
            private final String f1993b;

            {
                this.f1992a = this;
                this.f1993b = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.f1992a.a(this.f1993b, runnable);
            }
        });
        this.f1997g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    final /* synthetic */ Thread a(String str, Runnable runnable) {
        int andIncrement = this.f1996f.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" #");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        this.f1998h = new WeakReference<>(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f1998h.get()) {
            runnable.run();
        } else {
            this.f1997g.execute(runnable);
        }
    }
}
