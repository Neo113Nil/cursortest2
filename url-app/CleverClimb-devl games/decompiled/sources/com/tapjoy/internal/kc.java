package com.tapjoy.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class kc implements kf {

    /* renamed from: a, reason: collision with root package name */
    private final a f8488a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final ke f8489b = new ke();

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        a aVar = this.f8488a;
        if (!aVar.tryAcquireSharedNanos(-1, timeUnit.toNanos(j))) {
            throw new TimeoutException("Timeout waiting for task.");
        }
        return aVar.a();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        a aVar = this.f8488a;
        aVar.acquireSharedInterruptibly(-1);
        return aVar.a();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f8488a.b();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f8488a.c();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!this.f8488a.a(null, null, 4)) {
            return false;
        }
        this.f8489b.a();
        return true;
    }

    protected final boolean a(@Nullable Object obj) {
        boolean a2 = this.f8488a.a(obj, null, 2);
        if (a2) {
            this.f8489b.a();
        }
        return a2;
    }

    protected final boolean a(Throwable th) {
        boolean a2 = this.f8488a.a(null, (Throwable) jq.a(th), 2);
        if (a2) {
            this.f8489b.a();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return a2;
    }

    static final class a extends AbstractQueuedSynchronizer {

        /* renamed from: a, reason: collision with root package name */
        private Object f8490a;

        /* renamed from: b, reason: collision with root package name */
        private Throwable f8491b;

        a() {
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected final int tryAcquireShared(int i) {
            return b() ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        final Object a() {
            int state = getState();
            if (state == 2) {
                if (this.f8491b != null) {
                    throw new ExecutionException(this.f8491b);
                }
                return this.f8490a;
            }
            if (state == 4) {
                throw new CancellationException("Task was cancelled.");
            }
            throw new IllegalStateException("Error, synchronizer in invalid state: " + state);
        }

        final boolean b() {
            return (getState() & 6) != 0;
        }

        final boolean c() {
            return getState() == 4;
        }

        final boolean a(@Nullable Object obj, @Nullable Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.f8490a = obj;
                this.f8491b = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }
}
