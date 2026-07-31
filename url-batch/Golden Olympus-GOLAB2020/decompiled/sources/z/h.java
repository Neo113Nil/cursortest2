package z;

import android.os.Handler;
import android.os.Process;
import com.ironsource.C1463f4;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f46834a;

        /* renamed from: b, reason: collision with root package name */
        private int f46835b;

        /* renamed from: z.h$a$a, reason: collision with other inner class name */
        private static class C0296a extends Thread {

            /* renamed from: b, reason: collision with root package name */
            private final int f46836b;

            C0296a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f46836b = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f46836b);
                super.run();
            }
        }

        a(String str, int i4) {
            this.f46834a = str;
            this.f46835b = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0296a(runnable, this.f46834a, this.f46835b);
        }
    }

    private static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Callable f46837b;

        /* renamed from: c, reason: collision with root package name */
        private A.a f46838c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f46839d;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A.a f46840b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f46841c;

            a(A.a aVar, Object obj) {
                this.f46840b = aVar;
                this.f46841c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f46840b.accept(this.f46841c);
            }
        }

        b(Handler handler, Callable callable, A.a aVar) {
            this.f46837b = callable;
            this.f46838c = aVar;
            this.f46839d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f46837b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f46839d.post(new a(this.f46838c, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i4, int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, A.a aVar) {
        executor.execute(new b(z.b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i4) {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException(C1463f4.f16211f);
        }
    }
}
