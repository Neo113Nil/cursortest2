package com.cmplay.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
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

/* compiled from: AsyncTaskEx.java */
/* loaded from: classes.dex */
public abstract class d<Params, Progress, Result> {
    private static final ThreadFactory e = new ThreadFactory() { // from class: com.cmplay.base.util.d.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3999a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f3999a.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> f = new LinkedBlockingQueue(10);

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f3995a = new ThreadPoolExecutor(3, 128, 1, TimeUnit.SECONDS, f, e);

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f3996b = new ThreadPoolExecutor(3, 128, 1, TimeUnit.SECONDS, f, e);

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f3997c = new ThreadPoolExecutor(3, 128, 1, TimeUnit.SECONDS, f, e);

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f3998d = new ThreadPoolExecutor(3, 128, 1, TimeUnit.SECONDS, f, e, new ThreadPoolExecutor.DiscardPolicy());
    private static final b g = new b(Looper.getMainLooper());
    private static volatile Executor h = f3995a;
    private volatile c k = c.PENDING;
    private final AtomicBoolean l = new AtomicBoolean();
    private final AbstractCallableC0325d<Params, Result> i = new AbstractCallableC0325d<Params, Result>() { // from class: com.cmplay.base.util.d.2
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.l.set(true);
            Process.setThreadPriority(10);
            return (Result) d.this.d(d.this.a((Object[]) this.f4009b));
        }
    };
    private final FutureTask<Result> j = new FutureTask<Result>(this.i) { // from class: com.cmplay.base.util.d.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.c((d) get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                d.this.c((d) null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occured while executing doInBackground()", th);
            }
        }
    };

    /* compiled from: AsyncTaskEx.java */
    public enum c {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result a(Params... paramsArr);

    protected void a() {
    }

    protected void a(Result result) {
    }

    protected void b() {
    }

    protected void b(Progress... progressArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Result result) {
        if (this.l.get()) {
            return;
        }
        d(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result d(Result result) {
        g.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    protected void b(Result result) {
        b();
    }

    public final boolean c() {
        return this.j.isCancelled();
    }

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return a(h, paramsArr);
    }

    public final d<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.k != c.PENDING) {
            switch (this.k) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.k = c.RUNNING;
        a();
        this.i.f4009b = paramsArr;
        executor.execute(this.j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Result result) {
        if (c()) {
            b((d<Params, Progress, Result>) result);
        } else {
            a((d<Params, Progress, Result>) result);
        }
        this.k = c.FINISHED;
    }

    /* compiled from: AsyncTaskEx.java */
    private static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f4003a.e(aVar.f4004b[0]);
                    break;
                case 2:
                    aVar.f4003a.b((Object[]) aVar.f4004b);
                    break;
            }
        }
    }

    /* compiled from: AsyncTaskEx.java */
    /* renamed from: com.cmplay.base.util.d$d, reason: collision with other inner class name */
    private static abstract class AbstractCallableC0325d<Params, Result> implements Callable<Result> {

        /* renamed from: b, reason: collision with root package name */
        Params[] f4009b;

        private AbstractCallableC0325d() {
        }
    }

    /* compiled from: AsyncTaskEx.java */
    private static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        final d f4003a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f4004b;

        a(d dVar, Data... dataArr) {
            this.f4003a = dVar;
            this.f4004b = dataArr;
        }
    }
}
