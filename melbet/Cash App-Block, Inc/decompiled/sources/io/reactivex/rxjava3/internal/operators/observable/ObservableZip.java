package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.MatchResult;

/* loaded from: classes9.dex */
public final class ObservableZip extends Observable {
    public final /* synthetic */ int $r8$classId;
    public final int bufferSize;
    public final ObservableSource[] sources;
    public final MatchResult.Destructured zipper;

    public final class ZipCoordinator extends AtomicInteger implements Disposable {
        public volatile boolean cancelled;
        public final Observer downstream;
        public final ZipObserver[] observers;
        public final Object[] row;
        public final MatchResult.Destructured zipper;

        public ZipCoordinator(Observer observer, MatchResult.Destructured destructured, int i) {
            this.downstream = observer;
            this.zipper = destructured;
            this.observers = new ZipObserver[i];
            this.row = new Object[i];
        }

        public final void cancel() {
            ZipObserver[] zipObserverArr = this.observers;
            for (ZipObserver zipObserver : zipObserverArr) {
                SpscLinkedArrayQueue spscLinkedArrayQueue = zipObserver.queue;
                while (true) {
                    if (spscLinkedArrayQueue.poll() != null || !spscLinkedArrayQueue.isEmpty()) {
                    }
                }
            }
            for (ZipObserver zipObserver2 : zipObserverArr) {
                DisposableHelper.dispose(zipObserver2.upstream);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            for (ZipObserver zipObserver : this.observers) {
                DisposableHelper.dispose(zipObserver.upstream);
            }
            if (getAndIncrement() == 0) {
                for (ZipObserver zipObserver2 : this.observers) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue = zipObserver2.queue;
                    while (true) {
                        if (spscLinkedArrayQueue.poll() != null || !spscLinkedArrayQueue.isEmpty()) {
                        }
                    }
                }
            }
        }

        public final void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ZipObserver[] zipObserverArr = this.observers;
            Observer observer = this.downstream;
            Object[] objArr = this.row;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (ZipObserver zipObserver : zipObserverArr) {
                    if (objArr[i3] == null) {
                        boolean z = zipObserver.done;
                        Object poll = zipObserver.queue.poll();
                        boolean z2 = poll == null;
                        if (this.cancelled) {
                            cancel();
                            return;
                        }
                        if (z) {
                            Throwable th2 = zipObserver.error;
                            if (th2 != null) {
                                this.cancelled = true;
                                cancel();
                                observer.onError(th2);
                                return;
                            } else if (z2) {
                                this.cancelled = true;
                                cancel();
                                observer.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            i2++;
                        } else {
                            objArr[i3] = poll;
                        }
                    } else if (zipObserver.done && (th = zipObserver.error) != null) {
                        this.cancelled = true;
                        cancel();
                        observer.onError(th);
                        return;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        Object mo39apply = this.zipper.mo39apply(objArr.clone());
                        Objects.requireNonNull(mo39apply, "The zipper returned a null value");
                        observer.onNext(mo39apply);
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        Longs.throwIfFatal(th3);
                        cancel();
                        observer.onError(th3);
                        return;
                    }
                }
            }
        }
    }

    public final class ZipObserver implements Observer {
        public volatile boolean done;
        public Throwable error;
        public final ZipCoordinator parent;
        public final SpscLinkedArrayQueue queue;
        public final AtomicReference upstream = new AtomicReference();

        public ZipObserver(ZipCoordinator zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.queue = new SpscLinkedArrayQueue(i);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.queue.offer(obj);
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }
    }

    public /* synthetic */ ObservableZip(ObservableSource[] observableSourceArr, MatchResult.Destructured destructured, int i, int i2) {
        this.$r8$classId = i2;
        this.sources = observableSourceArr;
        this.zipper = destructured;
        this.bufferSize = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                ObservableSource[] observableSourceArr = this.sources;
                int length = observableSourceArr.length;
                if (length == 0) {
                    EmptyDisposable.complete(observer);
                    break;
                } else {
                    ZipCoordinator zipCoordinator = new ZipCoordinator(observer, this.zipper, length);
                    int i2 = this.bufferSize;
                    ZipObserver[] zipObserverArr = zipCoordinator.observers;
                    int length2 = zipObserverArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        zipObserverArr[i3] = new ZipObserver(zipCoordinator, i2);
                    }
                    zipCoordinator.lazySet(0);
                    zipCoordinator.downstream.onSubscribe(zipCoordinator);
                    while (i < length2 && !zipCoordinator.cancelled) {
                        ((Observable) observableSourceArr[i]).subscribe(zipObserverArr[i]);
                        i++;
                    }
                }
            default:
                ObservableSource[] observableSourceArr2 = this.sources;
                int length3 = observableSourceArr2.length;
                if (length3 == 0) {
                    EmptyDisposable.complete(observer);
                    break;
                } else {
                    ObservableCombineLatest$LatestCoordinator observableCombineLatest$LatestCoordinator = new ObservableCombineLatest$LatestCoordinator(observer, this.zipper, length3, this.bufferSize);
                    ObservableCombineLatest$CombinerObserver[] observableCombineLatest$CombinerObserverArr = observableCombineLatest$LatestCoordinator.observers;
                    int length4 = observableCombineLatest$CombinerObserverArr.length;
                    observableCombineLatest$LatestCoordinator.downstream.onSubscribe(observableCombineLatest$LatestCoordinator);
                    while (i < length4 && !observableCombineLatest$LatestCoordinator.done && !observableCombineLatest$LatestCoordinator.cancelled) {
                        ((Observable) observableSourceArr2[i]).subscribe(observableCombineLatest$CombinerObserverArr[i]);
                        i++;
                    }
                }
        }
    }
}
