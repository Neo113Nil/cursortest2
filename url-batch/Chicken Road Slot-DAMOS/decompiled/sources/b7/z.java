package b7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f1409a;

    static {
        h7.b bVar = new h7.b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1409a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
