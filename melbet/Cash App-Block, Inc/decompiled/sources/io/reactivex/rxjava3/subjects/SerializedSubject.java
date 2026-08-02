package io.reactivex.rxjava3.subjects;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes9.dex */
public final class SerializedSubject extends Subject implements AppendOnlyLinkedArrayList$NonThrowingPredicate {
    public final PublishSubject actual;
    public volatile boolean done;
    public boolean emitting;
    public HuffmanTreeGroup queue;

    public SerializedSubject(PublishSubject publishSubject) {
        this.actual = publishSubject;
    }

    public final void emitLoop() {
        HuffmanTreeGroup huffmanTreeGroup;
        while (true) {
            synchronized (this) {
                try {
                    huffmanTreeGroup = this.queue;
                    if (huffmanTreeGroup == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            huffmanTreeGroup.forEachWhile(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                this.done = true;
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onComplete();
                    return;
                }
                HuffmanTreeGroup huffmanTreeGroup = this.queue;
                if (huffmanTreeGroup == null) {
                    huffmanTreeGroup = new HuffmanTreeGroup(24);
                    this.queue = huffmanTreeGroup;
                }
                huffmanTreeGroup.add(NotificationLite.COMPLETE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.done) {
            UnsignedBytes.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.done) {
                    this.done = true;
                    if (this.emitting) {
                        HuffmanTreeGroup huffmanTreeGroup = this.queue;
                        if (huffmanTreeGroup == null) {
                            huffmanTreeGroup = new HuffmanTreeGroup(24);
                            this.queue = huffmanTreeGroup;
                        }
                        ((Object[]) huffmanTreeGroup.codes)[0] = new NotificationLite.ErrorNotification(th);
                        return;
                    }
                    this.emitting = true;
                    z = false;
                }
                if (z) {
                    UnsignedBytes.onError(th);
                } else {
                    this.actual.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (!this.emitting) {
                    this.emitting = true;
                    this.actual.onNext(obj);
                    emitLoop();
                } else {
                    HuffmanTreeGroup huffmanTreeGroup = this.queue;
                    if (huffmanTreeGroup == null) {
                        huffmanTreeGroup = new HuffmanTreeGroup(24);
                        this.queue = huffmanTreeGroup;
                    }
                    huffmanTreeGroup.add(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.done) {
            synchronized (this) {
                try {
                    if (!this.done) {
                        if (this.emitting) {
                            HuffmanTreeGroup huffmanTreeGroup = this.queue;
                            if (huffmanTreeGroup == null) {
                                huffmanTreeGroup = new HuffmanTreeGroup(24);
                                this.queue = huffmanTreeGroup;
                            }
                            huffmanTreeGroup.add(new NotificationLite.DisposableNotification(disposable));
                            return;
                        }
                        this.emitting = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            disposable.dispose();
        } else {
            this.actual.onSubscribe(disposable);
            emitLoop();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.actual.subscribe(observer);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        NotificationLite notificationLite = NotificationLite.COMPLETE;
        PublishSubject publishSubject = this.actual;
        if (obj == notificationLite) {
            publishSubject.onComplete();
            return true;
        }
        if (obj instanceof NotificationLite.ErrorNotification) {
            publishSubject.onError(((NotificationLite.ErrorNotification) obj).e);
            return true;
        }
        if (obj instanceof NotificationLite.DisposableNotification) {
            publishSubject.onSubscribe(((NotificationLite.DisposableNotification) obj).upstream);
            return false;
        }
        publishSubject.onNext(obj);
        return false;
    }
}
