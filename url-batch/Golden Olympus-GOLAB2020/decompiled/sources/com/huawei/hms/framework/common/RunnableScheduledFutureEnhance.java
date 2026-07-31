package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {

    /* renamed from: b, reason: collision with root package name */
    private RunnableScheduledFuture f14151b;

    /* renamed from: c, reason: collision with root package name */
    private String f14152c = Thread.currentThread().getName();

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
        this.f14151b = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.f14151b.cancel(z4);
    }

    public boolean equals(Object obj) {
        return this.f14151b.equals(obj);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return (T) this.f14151b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f14151b.getDelay(timeUnit);
    }

    public String getParentName() {
        return this.f14152c;
    }

    public int hashCode() {
        return this.f14151b.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f14151b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f14151b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.f14151b.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f14151b.run();
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f14151b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public T get(long j4, TimeUnit timeUnit) {
        return (T) this.f14151b.get(j4, timeUnit);
    }
}
