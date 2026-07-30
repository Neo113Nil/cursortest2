package org.greenrobot.greendao.rx;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.query.i;
import org.greenrobot.greendao.query.j;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;

/* loaded from: classes5.dex */
public class c extends org.greenrobot.greendao.rx.a {
    private final j query;

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public List<Object> call() {
            return c.this.query.forCurrentThread().list();
        }
    }

    class b implements Callable {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return c.this.query.forCurrentThread().unique();
        }
    }

    /* renamed from: org.greenrobot.greendao.rx.c$c, reason: collision with other inner class name */
    class C0401c implements Observable.OnSubscribe {
        C0401c() {
        }

        public void call(Subscriber<Object> subscriber) {
            try {
                i listLazyUncached = c.this.query.forCurrentThread().listLazyUncached();
                try {
                    Iterator<Object> it = listLazyUncached.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (subscriber.isUnsubscribed()) {
                            break;
                        } else {
                            subscriber.onNext(next);
                        }
                    }
                    listLazyUncached.close();
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                } catch (Throwable th) {
                    listLazyUncached.close();
                    throw th;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
            }
        }
    }

    public c(j jVar) {
        this.query = jVar;
    }

    @Override // org.greenrobot.greendao.rx.a
    public /* bridge */ /* synthetic */ Scheduler getScheduler() {
        return super.getScheduler();
    }

    public Observable<List<Object>> list() {
        return wrap(new a());
    }

    public Observable<Object> oneByOne() {
        return wrap(Observable.create(new C0401c()));
    }

    public Observable<Object> unique() {
        return wrap(new b());
    }

    public c(j jVar, Scheduler scheduler) {
        super(scheduler);
        this.query = jVar;
    }
}
