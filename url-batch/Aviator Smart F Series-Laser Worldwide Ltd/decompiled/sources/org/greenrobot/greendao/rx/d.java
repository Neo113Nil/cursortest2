package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

/* loaded from: classes5.dex */
public class d extends org.greenrobot.greendao.rx.a {
    private final org.greenrobot.greendao.c daoSession;

    class a implements Callable {
        final /* synthetic */ Runnable val$runnable;

        a(Runnable runnable) {
            this.val$runnable = runnable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            d.this.daoSession.runInTx(this.val$runnable);
            return null;
        }
    }

    class b implements Callable {
        final /* synthetic */ Callable val$callable;

        b(Callable callable) {
            this.val$callable = callable;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public T call() {
            return d.this.daoSession.callInTx(this.val$callable);
        }
    }

    public d(org.greenrobot.greendao.c cVar) {
        this.daoSession = cVar;
    }

    public <T> Observable<T> call(Callable<T> callable) {
        return wrap(new b(callable));
    }

    public org.greenrobot.greendao.c getDaoSession() {
        return this.daoSession;
    }

    @Override // org.greenrobot.greendao.rx.a
    public /* bridge */ /* synthetic */ Scheduler getScheduler() {
        return super.getScheduler();
    }

    public Observable<Void> run(Runnable runnable) {
        return wrap(new a(runnable));
    }

    public d(org.greenrobot.greendao.c cVar, Scheduler scheduler) {
        super(scheduler);
        this.daoSession = cVar;
    }
}
