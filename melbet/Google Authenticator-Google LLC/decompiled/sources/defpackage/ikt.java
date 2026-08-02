package defpackage;

import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikt extends huo {
    public static final ThreadLocal a = new ThreadLocal();
    private final ThreadPoolExecutor b;

    public ikt() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dgs(defaultThreadFactory, 2));
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void a(Deque deque, Runnable runnable) {
        oy.at(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // defpackage.huo, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) a.get();
        if (deque == null || deque.size() > 1) {
            this.b.execute(new iaq(runnable, 9));
        } else {
            a(deque, runnable);
        }
    }

    @Override // defpackage.huo, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.b;
    }

    @Override // defpackage.huo
    protected final ExecutorService g() {
        return this.b;
    }
}
