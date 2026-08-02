package io.reactivex.rxjava3.core;

import com.google.common.primitives.Longs;

/* loaded from: classes9.dex */
public abstract class Single implements SingleSource {
    public final void subscribe(SingleObserver singleObserver) {
        try {
            subscribeActual(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Longs.throwIfFatal(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void subscribeActual(SingleObserver singleObserver);
}
