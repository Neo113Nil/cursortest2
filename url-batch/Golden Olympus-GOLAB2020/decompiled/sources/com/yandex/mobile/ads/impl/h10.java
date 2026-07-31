package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tn1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h10 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private ThreadPoolExecutor f26515a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<tn1.a> f26516b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<tn1.a> f26517c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<tn1> f26518d = new ArrayDeque<>();

    public final void a(@NotNull tn1.a call) {
        tn1.a aVar;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f26516b.add(call);
                if (!call.a().f()) {
                    String c4 = call.c();
                    Iterator<tn1.a> it = this.f26517c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<tn1.a> it2 = this.f26516b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                } else {
                                    aVar = it2.next();
                                    if (Intrinsics.areEqual(aVar.c(), c4)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (Intrinsics.areEqual(aVar.c(), c4)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        call.a(aVar);
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    public final void b(@NotNull tn1.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.b().decrementAndGet();
        a(this.f26517c, call);
    }

    public final synchronized int c() {
        return this.f26518d.size() + this.f26517c.size();
    }

    public final void b(@NotNull tn1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a(this.f26518d, call);
    }

    private final void b() {
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<tn1.a> it = this.f26516b.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    tn1.a next = it.next();
                    if (this.f26517c.size() >= 64) {
                        break;
                    }
                    if (next.b().get() < 5) {
                        it.remove();
                        next.b().incrementAndGet();
                        Intrinsics.checkNotNull(next);
                        arrayList.add(next);
                        this.f26517c.add(next);
                    }
                }
                c();
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((tn1.a) arrayList.get(i4)).a(a());
        }
    }

    public final synchronized void a(@NotNull tn1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f26518d.add(call);
    }

    @NotNull
    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f26515a == null) {
                this.f26515a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), v82.a(v82.f33556g + " Dispatcher", false));
            }
            threadPoolExecutor = this.f26515a;
            Intrinsics.checkNotNull(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    private final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                Unit unit = Unit.f41027a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }
}
