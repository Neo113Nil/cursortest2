package io.reactivex.rxjava3.disposables;

import androidx.collection.CircularArray;
import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {
    public volatile boolean disposed;
    public CircularArray resources;

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean add(Disposable disposable) {
        if (!this.disposed) {
            synchronized (this) {
                try {
                    if (!this.disposed) {
                        CircularArray circularArray = this.resources;
                        if (circularArray == null) {
                            circularArray = new CircularArray();
                            int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            circularArray.head = numberOfLeadingZeros - 1;
                            circularArray.capacityBitmask = (int) (0.75f * numberOfLeadingZeros);
                            circularArray.elements = new Object[numberOfLeadingZeros];
                            this.resources = circularArray;
                        }
                        circularArray.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean delete(Disposable disposable) {
        Object obj;
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.disposed) {
                    return false;
                }
                CircularArray circularArray = this.resources;
                if (circularArray != null) {
                    Object[] objArr = circularArray.elements;
                    int i = circularArray.head;
                    int hashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            circularArray.removeEntry(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            circularArray.removeEntry(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.disposed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.disposed) {
                    return;
                }
                this.disposed = true;
                CircularArray circularArray = this.resources;
                ArrayList arrayList = null;
                this.resources = null;
                if (circularArray == null) {
                    return;
                }
                for (Object obj : circularArray.elements) {
                    if (obj instanceof Disposable) {
                        try {
                            ((Disposable) obj).dispose();
                        } catch (Throwable th) {
                            Longs.throwIfFatal(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.wrapOrThrow((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }
}
