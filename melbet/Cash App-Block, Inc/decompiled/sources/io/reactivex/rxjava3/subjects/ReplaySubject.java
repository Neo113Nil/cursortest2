package io.reactivex.rxjava3.subjects;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ReplaySubject extends Subject {
    public final SizeBoundReplayBuffer buffer;
    public boolean done;
    public final AtomicReference observers = new AtomicReference(EMPTY);
    public static final ReplayDisposable[] EMPTY = new ReplayDisposable[0];
    public static final ReplayDisposable[] TERMINATED = new ReplayDisposable[0];
    public static final Object[] EMPTY_ARRAY = new Object[0];

    public final class Node extends AtomicReference {
        public final Object value;

        public Node(Object obj) {
            this.value = obj;
        }
    }

    public final class ReplayDisposable extends AtomicInteger implements Disposable {
        public volatile boolean cancelled;
        public final Observer downstream;
        public Node index;
        public final ReplaySubject state;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.downstream = observer;
            this.state = replaySubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }
    }

    public final class SizeBoundReplayBuffer extends AtomicReference {
        public volatile Node head;
        public final int maxSize = 1;
        public int size;
        public Node tail;

        public SizeBoundReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            this.head = node;
        }

        public final void addFinal(Serializable serializable) {
            Node node = new Node(serializable);
            Node node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            Node node3 = this.head;
            if (node3.value != null) {
                Node node4 = new Node(null);
                node4.lazySet(node3.get());
                this.head = node4;
            }
        }

        public final void replay(ReplayDisposable replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer observer = replayDisposable.downstream;
            Node node = replayDisposable.index;
            if (node == null) {
                node = this.head;
            }
            int i = 1;
            while (!replayDisposable.cancelled) {
                Node node2 = (Node) node.get();
                if (node2 != null) {
                    Object obj = node2.value;
                    if (obj == NotificationLite.COMPLETE) {
                        observer.onComplete();
                        replayDisposable.index = null;
                        replayDisposable.cancelled = true;
                        return;
                    } else {
                        if (obj instanceof NotificationLite.ErrorNotification) {
                            observer.onError(((NotificationLite.ErrorNotification) obj).e);
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        observer.onNext(obj);
                        node = node2;
                    }
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.index = node;
                    i = replayDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }
    }

    public ReplaySubject(SizeBoundReplayBuffer sizeBoundReplayBuffer) {
        this.buffer = sizeBoundReplayBuffer;
    }

    public static ReplaySubject createWithSize() {
        Functions.verifyPositive(1, "maxSize");
        return new ReplaySubject(new SizeBoundReplayBuffer());
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        SizeBoundReplayBuffer sizeBoundReplayBuffer = this.buffer;
        NotificationLite notificationLite = NotificationLite.COMPLETE;
        sizeBoundReplayBuffer.addFinal(notificationLite);
        sizeBoundReplayBuffer.compareAndSet(null, notificationLite);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.observers.getAndSet(TERMINATED)) {
            sizeBoundReplayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        if (this.done) {
            UnsignedBytes.onError(th);
            return;
        }
        this.done = true;
        NotificationLite.ErrorNotification errorNotification = new NotificationLite.ErrorNotification(th);
        SizeBoundReplayBuffer sizeBoundReplayBuffer = this.buffer;
        sizeBoundReplayBuffer.addFinal(errorNotification);
        sizeBoundReplayBuffer.compareAndSet(null, errorNotification);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.observers.getAndSet(TERMINATED)) {
            sizeBoundReplayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.nullCheck(obj, "onNext called with a null value.");
        if (this.done) {
            return;
        }
        SizeBoundReplayBuffer sizeBoundReplayBuffer = this.buffer;
        Node node = new Node(obj);
        Node node2 = sizeBoundReplayBuffer.tail;
        sizeBoundReplayBuffer.tail = node;
        sizeBoundReplayBuffer.size++;
        node2.set(node);
        int i = sizeBoundReplayBuffer.size;
        if (i > sizeBoundReplayBuffer.maxSize) {
            sizeBoundReplayBuffer.size = i - 1;
            sizeBoundReplayBuffer.head = (Node) sizeBoundReplayBuffer.head.get();
        }
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.observers.get()) {
            sizeBoundReplayBuffer.replay(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.done) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void remove(ReplayDisposable replayDisposable) {
        ReplayDisposable[] replayDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.observers;
            ReplayDisposable[] replayDisposableArr2 = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr2 == TERMINATED || replayDisposableArr2 == (replayDisposableArr = EMPTY)) {
                return;
            }
            int length = replayDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr2[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                replayDisposableArr = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr2, 0, replayDisposableArr, 0, i);
                System.arraycopy(replayDisposableArr2, i + 1, replayDisposableArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(replayDisposableArr2, replayDisposableArr)) {
                if (atomicReference.get() != replayDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        AtomicReference atomicReference = this.observers;
        while (true) {
            ReplayDisposable[] replayDisposableArr = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr == TERMINATED) {
                break;
            }
            int length = replayDisposableArr.length;
            ReplayDisposable[] replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
            while (!atomicReference.compareAndSet(replayDisposableArr, replayDisposableArr2)) {
                if (atomicReference.get() != replayDisposableArr) {
                    break;
                }
            }
            if (replayDisposable.cancelled) {
                remove(replayDisposable);
                return;
            }
        }
        this.buffer.replay(replayDisposable);
    }
}
