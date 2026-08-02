package retrofit2.adapter.rxjava3;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromIterable$FromIterableDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class CallEnqueueObservable extends Observable {
    public final /* synthetic */ int $r8$classId;
    public final Object originalCall;

    public final class CallCallback implements Disposable, Callback {
        public final Call call;
        public volatile boolean disposed;
        public final Observer observer;
        public boolean terminated = false;

        public CallCallback(Call call, Observer observer) {
            this.call = call;
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th);
            } catch (Throwable th2) {
                Longs.throwIfFatal(th2);
                UnsignedBytes.onError(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call call, Response response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th) {
                Longs.throwIfFatal(th);
                if (this.terminated) {
                    UnsignedBytes.onError(th);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    Longs.throwIfFatal(th2);
                    UnsignedBytes.onError(new CompositeException(th, th2));
                }
            }
        }
    }

    public /* synthetic */ CallEnqueueObservable(Object obj, int i) {
        this.$r8$classId = i;
        this.originalCall = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Object obj;
        switch (this.$r8$classId) {
            case 0:
                Call m2176clone = ((Call) this.originalCall).m2176clone();
                CallCallback callCallback = new CallCallback(m2176clone, observer);
                observer.onSubscribe(callCallback);
                if (callCallback.disposed) {
                    return;
                }
                m2176clone.enqueue(callCallback);
                return;
            case 1:
                ObservableCreate$CreateEmitter observableCreate$CreateEmitter = new ObservableCreate$CreateEmitter(observer);
                observer.onSubscribe(observableCreate$CreateEmitter);
                try {
                    ((ObservableOnSubscribe) this.originalCall).subscribe(observableCreate$CreateEmitter);
                    return;
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    observableCreate$CreateEmitter.onError(th);
                    return;
                }
            case 2:
                try {
                    obj = ((Functions.JustValue) this.originalCall).value;
                } catch (Throwable th2) {
                    th = th2;
                    Longs.throwIfFatal(th);
                }
                if (obj == null) {
                    throw ExceptionHelper.createNullPointerException("Supplier returned a null Throwable.");
                }
                Throwable th3 = ExceptionHelper.TERMINATED;
                th = (Throwable) obj;
                EmptyDisposable.error(th, observer);
                return;
            case 3:
                try {
                    Iterator it = ((ArrayList) this.originalCall).iterator();
                    try {
                        if (!it.hasNext()) {
                            EmptyDisposable.complete(observer);
                            return;
                        }
                        ObservableFromIterable$FromIterableDisposable observableFromIterable$FromIterableDisposable = new ObservableFromIterable$FromIterableDisposable(observer, it);
                        observer.onSubscribe(observableFromIterable$FromIterableDisposable);
                        if (observableFromIterable$FromIterableDisposable.fusionMode) {
                            return;
                        }
                        while (!observableFromIterable$FromIterableDisposable.disposed) {
                            try {
                                Object next = observableFromIterable$FromIterableDisposable.it.next();
                                Objects.requireNonNull(next, "The iterator returned a null value");
                                observableFromIterable$FromIterableDisposable.downstream.onNext(next);
                                if (observableFromIterable$FromIterableDisposable.disposed) {
                                    return;
                                }
                                try {
                                    if (!observableFromIterable$FromIterableDisposable.it.hasNext()) {
                                        if (observableFromIterable$FromIterableDisposable.disposed) {
                                            return;
                                        }
                                        observableFromIterable$FromIterableDisposable.downstream.onComplete();
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    Longs.throwIfFatal(th4);
                                    observableFromIterable$FromIterableDisposable.downstream.onError(th4);
                                    return;
                                }
                            } catch (Throwable th5) {
                                Longs.throwIfFatal(th5);
                                observableFromIterable$FromIterableDisposable.downstream.onError(th5);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th6) {
                        Longs.throwIfFatal(th6);
                        EmptyDisposable.error(th6, observer);
                        return;
                    }
                } catch (Throwable th7) {
                    Longs.throwIfFatal(th7);
                    EmptyDisposable.error(th7, observer);
                    return;
                }
            default:
                ((Observable) ((ObservableSource) this.originalCall)).subscribe(observer);
                return;
        }
    }
}
