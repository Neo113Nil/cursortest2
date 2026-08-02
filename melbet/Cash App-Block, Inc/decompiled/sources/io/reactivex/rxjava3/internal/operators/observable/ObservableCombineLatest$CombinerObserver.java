package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableCombineLatest$CombinerObserver extends AtomicReference implements Observer {
    public final int index;
    public final ObservableCombineLatest$LatestCoordinator parent;

    public ObservableCombineLatest$CombinerObserver(ObservableCombineLatest$LatestCoordinator observableCombineLatest$LatestCoordinator, int i) {
        this.parent = observableCombineLatest$LatestCoordinator;
        this.index = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r3 == r1.length) goto L17;
     */
    @Override // io.reactivex.rxjava3.core.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete() {
        ObservableCombineLatest$LatestCoordinator observableCombineLatest$LatestCoordinator = this.parent;
        int i = this.index;
        synchronized (observableCombineLatest$LatestCoordinator) {
            try {
                Object[] objArr = observableCombineLatest$LatestCoordinator.latest;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = observableCombineLatest$LatestCoordinator.complete + 1;
                    observableCombineLatest$LatestCoordinator.complete = i2;
                }
                observableCombineLatest$LatestCoordinator.done = true;
                if (z) {
                    observableCombineLatest$LatestCoordinator.cancelSources();
                }
                observableCombineLatest$LatestCoordinator.drain();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ObservableCombineLatest$LatestCoordinator observableCombineLatest$LatestCoordinator = this.parent;
        if (observableCombineLatest$LatestCoordinator.errors.tryAddThrowableOrReport(th)) {
            observableCombineLatest$LatestCoordinator.cancelSources();
            observableCombineLatest$LatestCoordinator.drain();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        boolean z;
        ObservableCombineLatest$LatestCoordinator observableCombineLatest$LatestCoordinator = this.parent;
        int i = this.index;
        synchronized (observableCombineLatest$LatestCoordinator) {
            try {
                Object[] objArr = observableCombineLatest$LatestCoordinator.latest;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i];
                int i2 = observableCombineLatest$LatestCoordinator.active;
                if (obj2 == null) {
                    i2++;
                    observableCombineLatest$LatestCoordinator.active = i2;
                }
                objArr[i] = obj;
                if (i2 == objArr.length) {
                    observableCombineLatest$LatestCoordinator.queue.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    observableCombineLatest$LatestCoordinator.drain();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}
