package d4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class k0 implements i0 {
    /* synthetic */ k0(j0 j0Var) {
    }

    public static final ExecutorService b(int i7, ThreadFactory threadFactory, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // d4.i0
    public final ExecutorService a(ThreadFactory threadFactory, int i7) {
        return b(1, threadFactory, 1);
    }
}
