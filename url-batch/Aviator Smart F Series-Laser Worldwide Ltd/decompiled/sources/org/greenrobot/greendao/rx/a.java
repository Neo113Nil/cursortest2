package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

/* loaded from: classes5.dex */
class a {
    protected final Scheduler scheduler;

    a() {
        this.scheduler = null;
    }

    public Scheduler getScheduler() {
        return this.scheduler;
    }

    protected <R> Observable<R> wrap(Callable<R> callable) {
        return wrap(e.fromCallable(callable));
    }

    a(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    protected <R> Observable<R> wrap(Observable<R> observable) {
        Scheduler scheduler = this.scheduler;
        return scheduler != null ? observable.subscribeOn(scheduler) : observable;
    }
}
