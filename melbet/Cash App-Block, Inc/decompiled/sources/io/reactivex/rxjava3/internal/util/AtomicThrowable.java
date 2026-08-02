package io.reactivex.rxjava3.internal.util;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class AtomicThrowable extends AtomicReference {
    public final boolean tryAddThrowableOrReport(Throwable th) {
        Throwable th2 = ExceptionHelper.TERMINATED;
        while (true) {
            Throwable th3 = (Throwable) get();
            if (th3 == ExceptionHelper.TERMINATED) {
                UnsignedBytes.onError(th);
                return false;
            }
            Throwable compositeException = th3 == null ? th : new CompositeException(th3, th);
            while (!compareAndSet(th3, compositeException)) {
                if (get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    public final void tryTerminateConsumer(Observer observer) {
        Throwable th = ExceptionHelper.TERMINATED;
        Throwable th2 = (Throwable) get();
        Throwable th3 = ExceptionHelper.TERMINATED;
        if (th2 != th3) {
            th2 = (Throwable) getAndSet(th3);
        }
        if (th2 == null) {
            observer.onComplete();
        } else if (th2 != th3) {
            observer.onError(th2);
        }
    }
}
