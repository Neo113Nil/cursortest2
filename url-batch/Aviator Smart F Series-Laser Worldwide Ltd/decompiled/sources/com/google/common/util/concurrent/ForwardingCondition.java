package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ForwardingCondition implements Condition {
    ForwardingCondition() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() {
        delegate().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j8) {
        return delegate().awaitNanos(j8);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) {
        return delegate().awaitUntil(date);
    }

    abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j8, TimeUnit timeUnit) {
        return delegate().await(j8, timeUnit);
    }
}
