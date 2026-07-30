package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.d;

/* loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements d {
    private static final long serialVersionUID = -2189523197179400958L;
    d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z7) {
        this.cancelOnReplace = z7;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i8 = 1;
        long j8 = 0;
        d dVar = null;
        do {
            d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet(null);
            }
            long j9 = this.missedRequested.get();
            if (j9 != 0) {
                j9 = this.missedRequested.getAndSet(0L);
            }
            long j10 = this.missedProduced.get();
            if (j10 != 0) {
                j10 = this.missedProduced.getAndSet(0L);
            }
            d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j11 = this.requested;
                if (j11 != Long.MAX_VALUE) {
                    j11 = BackpressureHelper.addCap(j11, j9);
                    if (j11 != Long.MAX_VALUE) {
                        j11 -= j10;
                        if (j11 < 0) {
                            SubscriptionHelper.reportMoreProduced(j11);
                            j11 = 0;
                        }
                    }
                    this.requested = j11;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j11 != 0) {
                        j8 = BackpressureHelper.addCap(j8, j11);
                        dVar = dVar2;
                    }
                } else if (dVar3 != null && j9 != 0) {
                    j8 = BackpressureHelper.addCap(j8, j9);
                    dVar = dVar3;
                }
            }
            i8 = addAndGet(-i8);
        } while (i8 != 0);
        if (j8 != 0) {
            dVar.request(j8);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j8) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j8);
            drain();
            return;
        }
        long j9 = this.requested;
        if (j9 != Long.MAX_VALUE) {
            long j10 = j9 - j8;
            if (j10 < 0) {
                SubscriptionHelper.reportMoreProduced(j10);
                j10 = 0;
            }
            this.requested = j10;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // p7.d
    public final void request(long j8) {
        if (!SubscriptionHelper.validate(j8) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j8);
            drain();
            return;
        }
        long j9 = this.requested;
        if (j9 != Long.MAX_VALUE) {
            long addCap = BackpressureHelper.addCap(j9, j8);
            this.requested = addCap;
            if (addCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        d dVar = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (dVar != null) {
            dVar.request(j8);
        }
    }

    public final void setSubscription(d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        ObjectHelper.requireNonNull(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d andSet = this.missedSubscription.getAndSet(dVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        d dVar2 = this.actual;
        if (dVar2 != null && this.cancelOnReplace) {
            dVar2.cancel();
        }
        this.actual = dVar;
        long j8 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j8 != 0) {
            dVar.request(j8);
        }
    }
}
