package io.reactivex.rxjava3.subjects;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes9.dex */
public final class BehaviorSubject extends Subject {
    public static final BehaviorDisposable[] EMPTY = new BehaviorDisposable[0];
    public static final BehaviorDisposable[] TERMINATED = new BehaviorDisposable[0];
    public long index;
    public final AtomicReference observers;
    public final Lock readLock;
    public final AtomicReference terminalEvent;
    public final AtomicReference value;
    public final Lock writeLock;

    public final class BehaviorDisposable implements Disposable, AppendOnlyLinkedArrayList$NonThrowingPredicate {
        public volatile boolean cancelled;
        public final Observer downstream;
        public boolean emitting;
        public boolean fastPath;
        public long index;
        public boolean next;
        public HuffmanTreeGroup queue;
        public final BehaviorSubject state;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.downstream = observer;
            this.state = behaviorSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        public final void emitNext(Object obj, long j) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        if (this.index == j) {
                            return;
                        }
                        if (this.emitting) {
                            HuffmanTreeGroup huffmanTreeGroup = this.queue;
                            if (huffmanTreeGroup == null) {
                                huffmanTreeGroup = new HuffmanTreeGroup(24);
                                this.queue = huffmanTreeGroup;
                            }
                            huffmanTreeGroup.add(obj);
                            return;
                        }
                        this.next = true;
                        this.fastPath = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            Observer observer = this.downstream;
            if (obj == NotificationLite.COMPLETE) {
                observer.onComplete();
                return true;
            }
            if (obj instanceof NotificationLite.ErrorNotification) {
                observer.onError(((NotificationLite.ErrorNotification) obj).e);
                return true;
            }
            observer.onNext(obj);
            return false;
        }
    }

    public BehaviorSubject(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.observers = new AtomicReference(EMPTY);
        this.value = new AtomicReference(obj);
        this.terminalEvent = new AtomicReference();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        AtomicReference atomicReference;
        Throwable th = ExceptionHelper.TERMINATED;
        do {
            atomicReference = this.terminalEvent;
            if (atomicReference.compareAndSet(null, th)) {
                Lock lock = this.writeLock;
                lock.lock();
                this.index++;
                AtomicReference atomicReference2 = this.value;
                NotificationLite notificationLite = NotificationLite.COMPLETE;
                atomicReference2.lazySet(notificationLite);
                lock.unlock();
                for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.observers.getAndSet(TERMINATED)) {
                    behaviorDisposable.emitNext(notificationLite, this.index);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        do {
            atomicReference = this.terminalEvent;
            if (atomicReference.compareAndSet(null, th)) {
                NotificationLite.ErrorNotification errorNotification = new NotificationLite.ErrorNotification(th);
                Lock lock = this.writeLock;
                lock.lock();
                this.index++;
                this.value.lazySet(errorNotification);
                lock.unlock();
                for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.observers.getAndSet(TERMINATED)) {
                    behaviorDisposable.emitNext(errorNotification, this.index);
                }
                return;
            }
        } while (atomicReference.get() == null);
        UnsignedBytes.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.nullCheck(obj, "onNext called with a null value.");
        if (this.terminalEvent.get() != null) {
            return;
        }
        Lock lock = this.writeLock;
        lock.lock();
        this.index++;
        this.value.lazySet(obj);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.observers.get()) {
            behaviorDisposable.emitNext(obj, this.index);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.terminalEvent.get() != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void remove(BehaviorDisposable behaviorDisposable) {
        BehaviorDisposable[] behaviorDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.observers;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr2[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr = EMPTY;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr2, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr2, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr = behaviorDisposableArr3;
            }
            while (!atomicReference.compareAndSet(behaviorDisposableArr2, behaviorDisposableArr)) {
                if (atomicReference.get() != behaviorDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        HuffmanTreeGroup huffmanTreeGroup;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.onSubscribe(behaviorDisposable);
        AtomicReference atomicReference = this.observers;
        while (true) {
            BehaviorDisposable[] behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == TERMINATED) {
                Throwable th = (Throwable) this.terminalEvent.get();
                if (th == ExceptionHelper.TERMINATED) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            BehaviorDisposable[] behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
            while (!atomicReference.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2)) {
                if (atomicReference.get() != behaviorDisposableArr) {
                    break;
                }
            }
            if (behaviorDisposable.cancelled) {
                remove(behaviorDisposable);
                return;
            }
            if (behaviorDisposable.cancelled) {
                return;
            }
            synchronized (behaviorDisposable) {
                try {
                    if (behaviorDisposable.cancelled) {
                        return;
                    }
                    if (behaviorDisposable.next) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = behaviorDisposable.state;
                    Lock lock = behaviorSubject.readLock;
                    lock.lock();
                    behaviorDisposable.index = behaviorSubject.index;
                    Object obj = behaviorSubject.value.get();
                    lock.unlock();
                    behaviorDisposable.emitting = obj != null;
                    behaviorDisposable.next = true;
                    if (obj == null || behaviorDisposable.test(obj)) {
                        return;
                    }
                    while (!behaviorDisposable.cancelled) {
                        synchronized (behaviorDisposable) {
                            try {
                                huffmanTreeGroup = behaviorDisposable.queue;
                                if (huffmanTreeGroup == null) {
                                    behaviorDisposable.emitting = false;
                                    return;
                                }
                                behaviorDisposable.queue = null;
                            } finally {
                            }
                        }
                        huffmanTreeGroup.forEachWhile(behaviorDisposable);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
