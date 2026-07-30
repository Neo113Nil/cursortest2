package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.functions.Func0;

/* loaded from: classes5.dex */
class e {

    class a implements Func0 {
        final /* synthetic */ Callable val$callable;

        a(Callable callable) {
            this.val$callable = callable;
        }

        public Observable<T> call() {
            try {
                return Observable.just(this.val$callable.call());
            } catch (Exception e8) {
                return Observable.error(e8);
            }
        }
    }

    e() {
    }

    static <T> Observable<T> fromCallable(Callable<T> callable) {
        return Observable.defer(new a(callable));
    }
}
