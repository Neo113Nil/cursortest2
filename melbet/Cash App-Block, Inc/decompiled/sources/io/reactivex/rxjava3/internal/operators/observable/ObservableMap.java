package io.reactivex.rxjava3.internal.operators.observable;

import androidx.media3.common.util.WakeLockManager;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.observers.DisposableLambdaObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class ObservableMap extends AbstractObservableWithUpstream {
    public final /* synthetic */ int $r8$classId;
    public final Function function;

    public final class MapObserver implements Observer, QueueDisposable {
        public final /* synthetic */ int $r8$classId;
        public boolean done;
        public final Observer downstream;
        public final Object mapper;
        public QueueDisposable qd;
        public Disposable upstream;

        public MapObserver(Observer observer, Object obj, int i) {
            this.$r8$classId = i;
            this.downstream = observer;
            this.mapper = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.done) {
                UnsignedBytes.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.mapper;
            Observer observer = this.downstream;
            switch (i) {
                case 0:
                    if (!this.done) {
                        try {
                            Object mo39apply = ((Function) obj2).mo39apply(obj);
                            Objects.requireNonNull(mo39apply, "The mapper function returned a null value.");
                            observer.onNext(mo39apply);
                            break;
                        } catch (Throwable th) {
                            Longs.throwIfFatal(th);
                            this.upstream.dispose();
                            onError(th);
                        }
                    }
                    break;
                default:
                    try {
                        if (((Predicate) obj2).test(obj)) {
                            observer.onNext(obj);
                            break;
                        }
                    } catch (Throwable th2) {
                        Longs.throwIfFatal(th2);
                        this.upstream.dispose();
                        this.onError(th2);
                        return;
                    }
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.qd = (QueueDisposable) disposable;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object poll;
            int i = this.$r8$classId;
            Object obj = this.mapper;
            switch (i) {
                case 0:
                    Object poll2 = this.qd.poll();
                    if (poll2 == null) {
                        return null;
                    }
                    Object mo39apply = ((Function) obj).mo39apply(poll2);
                    Objects.requireNonNull(mo39apply, "The mapper function returned a null value.");
                    return mo39apply;
            }
            do {
                poll = this.qd.poll();
                if (poll != null) {
                }
                return poll;
            } while (!((Predicate) obj).test(poll));
            return poll;
        }

        @Override // io.reactivex.rxjava3.operators.QueueDisposable
        public int requestFusion() {
            switch (this.$r8$classId) {
            }
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableMap(Observable observable, Function function, int i) {
        super(observable);
        this.$r8$classId = i;
        this.function = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = this.$r8$classId;
        Function function = this.function;
        ObservableSource observableSource = this.source;
        switch (i) {
            case 0:
                ((Observable) observableSource).subscribe(new MapObserver(observer, function, 0));
                break;
            case 1:
                WakeLockManager wakeLockManager = new WakeLockManager();
                wakeLockManager.wakeLockManagerInternal = observer;
                wakeLockManager.wakeLockHandler = function;
                wakeLockManager.mainHandler = new SequentialDisposable();
                observer.onSubscribe((SequentialDisposable) wakeLockManager.mainHandler);
                ((Observable) observableSource).subscribe(wakeLockManager);
                break;
            default:
                ((Observable) observableSource).subscribe(new DisposableLambdaObserver(observer, function, 1));
                break;
        }
    }
}
