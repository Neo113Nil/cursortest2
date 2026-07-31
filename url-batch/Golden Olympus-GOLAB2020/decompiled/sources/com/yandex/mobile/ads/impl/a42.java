package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a42 {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a42 f23152h = new a42(new c(v82.a(v82.f33556g + " TaskRunner", true)));

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Logger f23153i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f23154a;

    /* renamed from: b, reason: collision with root package name */
    private int f23155b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23156c;

    /* renamed from: d, reason: collision with root package name */
    private long f23157d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f23158e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f23159f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b42 f23160g;

    public interface a {
        long a();

        void a(@NotNull a42 a42Var);

        void a(@NotNull a42 a42Var, long j4);

        void execute(@NotNull Runnable runnable);
    }

    public static final class b {
        @NotNull
        public static Logger a() {
            return a42.f23153i;
        }
    }

    static {
        Logger logger = Logger.getLogger(a42.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f23153i = logger;
    }

    public a42(@NotNull c backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f23154a = backend;
        this.f23155b = 10000;
        this.f23158e = new ArrayList();
        this.f23159f = new ArrayList();
        this.f23160g = new b42(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(w32 w32Var) {
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(w32Var.b());
        try {
            long e4 = w32Var.e();
            synchronized (this) {
                a(w32Var, e4);
                Unit unit = Unit.f41027a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                a(w32Var, -1L);
                Unit unit2 = Unit.f41027a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void c() {
        int size = this.f23158e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((z32) this.f23158e.get(size)).b();
            }
        }
        for (int size2 = this.f23159f.size() - 1; -1 < size2; size2--) {
            z32 z32Var = (z32) this.f23159f.get(size2);
            z32Var.b();
            if (z32Var.e().isEmpty()) {
                this.f23159f.remove(size2);
            }
        }
    }

    @NotNull
    public final a d() {
        return this.f23154a;
    }

    @NotNull
    public final z32 e() {
        int i4;
        synchronized (this) {
            i4 = this.f23155b;
            this.f23155b = i4 + 1;
        }
        return new z32(this, "Q" + i4);
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ThreadPoolExecutor f23161a;

        public c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f23161a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.a42.a
        public final void a(@NotNull a42 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.yandex.mobile.ads.impl.a42.a
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f23161a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.a42.a
        public final void a(@NotNull a42 taskRunner, long j4) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j5 = j4 / 1000000;
            long j6 = j4 - (1000000 * j5);
            if (j5 > 0 || j4 > 0) {
                taskRunner.wait(j5, (int) j6);
            }
        }

        @Override // com.yandex.mobile.ads.impl.a42.a
        public final long a() {
            return System.nanoTime();
        }
    }

    public final void a(@NotNull z32 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f23159f.remove(taskQueue);
            } else {
                v82.a(this.f23159f, taskQueue);
            }
        }
        if (this.f23156c) {
            this.f23154a.a(this);
        } else {
            this.f23154a.execute(this.f23160g);
        }
    }

    private final void a(w32 w32Var) {
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        w32Var.a(-1L);
        z32 d4 = w32Var.d();
        Intrinsics.checkNotNull(d4);
        d4.e().remove(w32Var);
        this.f23159f.remove(d4);
        d4.a(w32Var);
        this.f23158e.add(d4);
    }

    @Nullable
    public final w32 b() {
        w32 w32Var;
        long j4;
        boolean z4;
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (true) {
            w32 w32Var2 = null;
            if (this.f23159f.isEmpty()) {
                return null;
            }
            long a4 = this.f23154a.a();
            ArrayList arrayList = this.f23159f;
            int size = arrayList.size();
            long j5 = Long.MAX_VALUE;
            w32 w32Var3 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    w32Var = w32Var2;
                    j4 = a4;
                    z4 = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                w32 w32Var4 = (w32) ((z32) obj).e().get(0);
                w32Var = w32Var2;
                j4 = a4;
                long max = Math.max(0L, w32Var4.c() - a4);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (w32Var3 != null) {
                        z4 = true;
                        break;
                    }
                    w32Var3 = w32Var4;
                }
                w32Var2 = w32Var;
                a4 = j4;
            }
            if (w32Var3 != null) {
                a(w32Var3);
                if (z4 || (!this.f23156c && !this.f23159f.isEmpty())) {
                    this.f23154a.execute(this.f23160g);
                }
                return w32Var3;
            }
            if (this.f23156c) {
                if (j5 < this.f23157d - j4) {
                    this.f23154a.a(this);
                }
                return w32Var;
            }
            this.f23156c = true;
            this.f23157d = j4 + j5;
            try {
                try {
                    this.f23154a.a(this, j5);
                } catch (InterruptedException unused) {
                    c();
                }
            } finally {
                this.f23156c = false;
            }
        }
    }

    private final void a(w32 w32Var, long j4) {
        if (v82.f33555f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        z32 d4 = w32Var.d();
        Intrinsics.checkNotNull(d4);
        if (d4.c() == w32Var) {
            boolean d5 = d4.d();
            d4.i();
            d4.a(null);
            this.f23158e.remove(d4);
            if (j4 != -1 && !d5 && !d4.g()) {
                d4.a(w32Var, j4, true);
            }
            if (d4.e().isEmpty()) {
                return;
            }
            this.f23159f.add(d4);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
