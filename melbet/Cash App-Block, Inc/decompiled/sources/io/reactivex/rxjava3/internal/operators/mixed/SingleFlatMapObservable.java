package io.reactivex.rxjava3.internal.operators.mixed;

import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class SingleFlatMapObservable extends Observable {
    public final /* synthetic */ int $r8$classId;
    public final Function mapper;
    public final Object source;

    public /* synthetic */ SingleFlatMapObservable(Object obj, Function function, int i) {
        this.$r8$classId = i;
        this.source = obj;
        this.mapper = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = this.$r8$classId;
        Object obj = this.source;
        Function function = this.mapper;
        switch (i) {
            case 0:
                FlatMapObserver flatMapObserver = new FlatMapObserver(observer, function);
                observer.onSubscribe(flatMapObserver);
                ((Single) obj).subscribe(flatMapObserver);
                break;
            default:
                try {
                    Object mo39apply = function.mo39apply(obj);
                    Objects.requireNonNull(mo39apply, "The mapper returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) mo39apply;
                    if (!(observableSource instanceof Supplier)) {
                        ((Observable) observableSource).subscribe(observer);
                        break;
                    } else {
                        try {
                            Object obj2 = ((Supplier) observableSource).get();
                            if (obj2 != null) {
                                ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, obj2);
                                observer.onSubscribe(observableScalarXMap$ScalarDisposable);
                                observableScalarXMap$ScalarDisposable.run();
                                break;
                            } else {
                                EmptyDisposable.complete(observer);
                                break;
                            }
                        } catch (Throwable th) {
                            Longs.throwIfFatal(th);
                            EmptyDisposable.error(th, observer);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    Longs.throwIfFatal(th2);
                    EmptyDisposable.error(th2, observer);
                    return;
                }
        }
    }

    public final class FlatMapObserver extends AtomicReference implements Observer, SingleObserver, Disposable {
        public final /* synthetic */ int $r8$classId;
        public final Observer downstream;
        public final Object mapper;

        public FlatMapObserver(Observer observer) {
            this.$r8$classId = 1;
            this.downstream = observer;
            this.mapper = new AtomicReference();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            switch (this.$r8$classId) {
                case 0:
                    DisposableHelper.dispose(this);
                    break;
                default:
                    DisposableHelper.dispose((AtomicReference) this.mapper);
                    DisposableHelper.dispose(this);
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            switch (this.$r8$classId) {
                case 0:
                    this.downstream.onComplete();
                    break;
                default:
                    this.downstream.onComplete();
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            switch (this.$r8$classId) {
                case 0:
                    this.downstream.onError(th);
                    break;
                default:
                    this.downstream.onError(th);
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    this.downstream.onNext(obj);
                    break;
                default:
                    this.downstream.onNext(obj);
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            switch (this.$r8$classId) {
                case 0:
                    DisposableHelper.replace(this, disposable);
                    break;
                default:
                    DisposableHelper.setOnce((AtomicReference) this.mapper, disposable);
                    break;
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(Object obj) {
            try {
                Object mo39apply = ((Function) this.mapper).mo39apply(obj);
                Objects.requireNonNull(mo39apply, "The mapper returned a null Publisher");
                ObservableSource observableSource = (ObservableSource) mo39apply;
                if (((Disposable) get()) == DisposableHelper.DISPOSED) {
                    return;
                }
                ((Observable) observableSource).subscribe(this);
            } catch (Throwable th) {
                Longs.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        public FlatMapObserver(Observer observer, Function function) {
            this.$r8$classId = 0;
            this.downstream = observer;
            this.mapper = function;
        }
    }
}
