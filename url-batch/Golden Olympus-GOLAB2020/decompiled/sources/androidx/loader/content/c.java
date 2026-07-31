package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadFactory f12729g;

    /* renamed from: h, reason: collision with root package name */
    private static final BlockingQueue f12730h;

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f12731i;

    /* renamed from: j, reason: collision with root package name */
    private static f f12732j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile Executor f12733k;

    /* renamed from: b, reason: collision with root package name */
    private final h f12734b;

    /* renamed from: c, reason: collision with root package name */
    private final FutureTask f12735c;

    /* renamed from: d, reason: collision with root package name */
    private volatile g f12736d = g.PENDING;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f12737e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f12738f = new AtomicBoolean();

    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f12739a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f12739a.getAndIncrement());
        }
    }

    class b extends h {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            c.this.f12738f.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = c.this.b(this.f12749b);
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    class C0118c extends FutureTask {
        C0118c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.l(get());
            } catch (InterruptedException e4) {
                Log.w("AsyncTask", e4);
            } catch (CancellationException unused) {
                c.this.l(null);
            } catch (ExecutionException e5) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e5.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12742a;

        static {
            int[] iArr = new int[g.values().length];
            f12742a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12742a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final c f12743a;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f12744b;

        e(c cVar, Object... objArr) {
            this.f12743a = cVar;
            this.f12744b = objArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i4 = message.what;
            if (i4 == 1) {
                eVar.f12743a.d(eVar.f12744b[0]);
            } else {
                if (i4 != 2) {
                    return;
                }
                eVar.f12743a.j(eVar.f12744b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h implements Callable {

        /* renamed from: b, reason: collision with root package name */
        Object[] f12749b;

        h() {
        }
    }

    static {
        a aVar = new a();
        f12729g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f12730h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, UserVerificationMethods.USER_VERIFY_PATTERN, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f12731i = threadPoolExecutor;
        f12733k = threadPoolExecutor;
    }

    c() {
        b bVar = new b();
        this.f12734b = bVar;
        this.f12735c = new C0118c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            try {
                if (f12732j == null) {
                    f12732j = new f();
                }
                fVar = f12732j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z4) {
        this.f12737e.set(true);
        return this.f12735c.cancel(z4);
    }

    protected abstract Object b(Object... objArr);

    public final c c(Executor executor, Object... objArr) {
        if (this.f12736d == g.PENDING) {
            this.f12736d = g.RUNNING;
            i();
            this.f12734b.f12749b = objArr;
            executor.execute(this.f12735c);
            return this;
        }
        int i4 = d.f12742a[this.f12736d.ordinal()];
        if (i4 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i4 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f12736d = g.FINISHED;
    }

    public final boolean f() {
        return this.f12737e.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    protected void i() {
    }

    protected void j(Object... objArr) {
    }

    Object k(Object obj) {
        e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    void l(Object obj) {
        if (this.f12738f.get()) {
            return;
        }
        k(obj);
    }
}
