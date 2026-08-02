package io.reactivex.rxjava3.internal.disposables;

import com.google.common.primitives.Longs;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.schedulers.ScheduledRunnable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    public volatile boolean disposed;
    public LinkedList resources;

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean add(Disposable disposable) {
        if (!this.disposed) {
            synchronized (this) {
                try {
                    if (!this.disposed) {
                        LinkedList linkedList = this.resources;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.resources = linkedList;
                        }
                        linkedList.add(disposable);
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
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.disposed) {
                    return false;
                }
                LinkedList linkedList = this.resources;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
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
                LinkedList linkedList = this.resources;
                ArrayList arrayList = null;
                this.resources = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        Longs.throwIfFatal(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
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
        ((ScheduledRunnable) disposable).dispose();
        return true;
    }
}
