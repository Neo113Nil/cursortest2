package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1696a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f1697b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f1698c;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1699a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f1699a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler d(Looper looper) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i7 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // c.c
    public void a(Runnable runnable) {
        this.f1697b.execute(runnable);
    }

    @Override // c.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // c.c
    public void c(Runnable runnable) {
        if (this.f1698c == null) {
            synchronized (this.f1696a) {
                if (this.f1698c == null) {
                    this.f1698c = d(Looper.getMainLooper());
                }
            }
        }
        this.f1698c.post(runnable);
    }
}
