package io.reactivex.internal.operators.flowable;

import androidx.lifecycle.g;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    static final CacheSubscription[] EMPTY = new CacheSubscription[0];
    static final CacheSubscription[] TERMINATED = new CacheSubscription[0];
    final int capacityHint;
    volatile boolean done;
    Throwable error;
    final Node<T> head;
    final AtomicBoolean once;
    volatile long size;
    final AtomicReference<CacheSubscription<T>[]> subscribers;
    Node<T> tail;
    int tailOffset;

    static final class CacheSubscription<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 6770240836423125754L;
        final c downstream;
        long index;
        Node<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        CacheSubscription(c cVar, FlowableCache<T> flowableCache) {
            this.downstream = cVar;
            this.parent = flowableCache;
            this.node = flowableCache.head;
        }

        @Override // p7.d
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.addCancel(this.requested, j8);
                this.parent.replay(this);
            }
        }
    }

    static final class Node<T> {
        volatile Node<T> next;
        final T[] values;

        Node(int i8) {
            this.values = (T[]) new Object[i8];
        }
    }

    public FlowableCache(Flowable<T> flowable, int i8) {
        super(flowable);
        this.capacityHint = i8;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(i8);
        this.head = node;
        this.tail = node;
        this.subscribers = new AtomicReference<>(EMPTY);
    }

    void add(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            if (cacheSubscriptionArr == TERMINATED) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!g.a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    long cachedEventCount() {
        return this.size;
    }

    boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    boolean isConnected() {
        return this.once.get();
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onComplete() {
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.getAndSet(TERMINATED)) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onNext(T t7) {
        int i8 = this.tailOffset;
        if (i8 == this.capacityHint) {
            Node<T> node = new Node<>(i8);
            node.values[0] = t7;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i8] = t7;
            this.tailOffset = i8 + 1;
        }
        this.size++;
        for (CacheSubscription<T> cacheSubscription : this.subscribers.get()) {
            replay(cacheSubscription);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onSubscribe(d dVar) {
        dVar.request(Long.MAX_VALUE);
    }

    void remove(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.subscribers.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                } else if (cacheSubscriptionArr[i8] == cacheSubscription) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 < 0) {
                return;
            }
            if (length == 1) {
                cacheSubscriptionArr2 = EMPTY;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i8);
                System.arraycopy(cacheSubscriptionArr, i8 + 1, cacheSubscriptionArr3, i8, (length - i8) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!g.a(this.subscribers, cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    void replay(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j8 = cacheSubscription.index;
        int i8 = cacheSubscription.offset;
        Node<T> node = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        c cVar = cacheSubscription.downstream;
        int i9 = this.capacityHint;
        int i10 = 1;
        while (true) {
            boolean z7 = this.done;
            boolean z8 = this.size == j8;
            if (z7 && z8) {
                cacheSubscription.node = null;
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            if (!z8) {
                long j9 = atomicLong.get();
                if (j9 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j9 != j8) {
                    if (i8 == i9) {
                        node = node.next;
                        i8 = 0;
                    }
                    cVar.onNext(node.values[i8]);
                    i8++;
                    j8++;
                }
            }
            cacheSubscription.index = j8;
            cacheSubscription.offset = i8;
            cacheSubscription.node = node;
            i10 = cacheSubscription.addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(cVar, this);
        cVar.onSubscribe(cacheSubscription);
        add(cacheSubscription);
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            replay(cacheSubscription);
        } else {
            this.source.subscribe((FlowableSubscriber) this);
        }
    }
}
