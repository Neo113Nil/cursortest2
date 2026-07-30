package com.baidu.ar;

import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f2371a;

    /* renamed from: b, reason: collision with root package name */
    public int f2372b;

    /* renamed from: c, reason: collision with root package name */
    public int f2373c;

    /* renamed from: d, reason: collision with root package name */
    public int f2374d;

    /* renamed from: e, reason: collision with root package name */
    public long f2375e;

    public class a implements RejectedExecutionHandler {
        public a(h5 h5Var) {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            h.b("HttpRequestExecutor", "请求队列已满，请求被丢弃");
        }
    }

    public h5(int i8, int i9, int i10, long j8) {
        this.f2372b = i8;
        this.f2373c = i9;
        this.f2374d = i10;
        this.f2375e = j8;
    }

    public b6 a(HttpException httpException, c6 c6Var) {
        a4 a4Var = new a4(httpException, c6Var);
        a().submit(a4Var);
        return a4Var;
    }

    public void b() {
        ExecutorService executorService = this.f2371a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public b6 a(j5 j5Var, c6 c6Var, IProgressCallback iProgressCallback) {
        f5 f5Var = new f5(j5Var, c6Var);
        f5Var.a(iProgressCallback);
        a().submit(f5Var);
        return f5Var;
    }

    public b6 a(j5 j5Var, IProgressCallback iProgressCallback) {
        f5 f5Var = new f5(j5Var);
        f5Var.a(iProgressCallback);
        f5Var.b();
        return f5Var;
    }

    public final ExecutorService a() {
        if (this.f2371a == null) {
            this.f2371a = new ThreadPoolExecutor(this.f2372b, this.f2373c, this.f2375e, TimeUnit.SECONDS, new LinkedBlockingQueue(this.f2374d), Executors.defaultThreadFactory(), new a(this));
        }
        return this.f2371a;
    }
}
