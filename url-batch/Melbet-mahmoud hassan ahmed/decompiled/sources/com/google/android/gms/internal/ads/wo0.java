package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wo0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dc3 f13894a;

    /* renamed from: b, reason: collision with root package name */
    public static final dc3 f13895b;

    /* renamed from: c, reason: collision with root package name */
    public static final dc3 f13896c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f13897d;

    /* renamed from: e, reason: collision with root package name */
    public static final dc3 f13898e;

    /* renamed from: f, reason: collision with root package name */
    public static final dc3 f13899f;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (v3.c.a()) {
            r33.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new so0("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new so0("Default"));
        }
        uo0 uo0Var = null;
        f13894a = new vo0(threadPoolExecutor, uo0Var);
        if (v3.c.a()) {
            executor = r33.a().b(5, new so0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new so0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        f13895b = new vo0(executor, uo0Var);
        if (v3.c.a()) {
            executor2 = r33.a().a(new so0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new so0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        f13896c = new vo0(executor2, uo0Var);
        f13897d = new ro0(3, new so0("Schedule"));
        f13898e = new vo0(new to0(), uo0Var);
        f13899f = new vo0(jc3.b(), uo0Var);
    }
}
