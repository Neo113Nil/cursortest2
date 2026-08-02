package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class u implements Spliterator {
    public ConcurrentLinkedQueue.Node a;
    public int b;
    public boolean c;
    public final /* synthetic */ ConcurrentLinkedQueue d;

    public u(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    public final ConcurrentLinkedQueue.Node a() {
        ConcurrentLinkedQueue.Node node = this.a;
        if (node == null && !this.c) {
            node = this.d.b();
            this.a = node;
            if (node == null) {
                this.c = true;
            }
        }
        return node;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ConcurrentLinkedQueue.Node a = a();
        if (a != null) {
            this.a = null;
            this.c = true;
            this.d.c(consumer, a);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        E e;
        consumer.getClass();
        ConcurrentLinkedQueue.Node a = a();
        if (a == null) {
            return false;
        }
        do {
            e = a.item;
            ConcurrentLinkedQueue.Node node = a.next;
            a = a == node ? this.d.b() : node;
            if (e != 0) {
                break;
            }
        } while (a != null);
        this.a = a;
        if (a == null) {
            this.c = true;
        }
        if (e == 0) {
            return false;
        }
        consumer.accept(e);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node a = a();
        if (a != null && (node = a.next) != null) {
            int min = Math.min(this.b + 1, 33554432);
            this.b = min;
            Object[] objArr = null;
            int i = 0;
            do {
                Object obj = a.item;
                if (obj != null) {
                    if (objArr == null) {
                        objArr = new Object[min];
                    }
                    objArr[i] = obj;
                    i++;
                }
                a = a == node ? this.d.b() : node;
                if (a == null || (node = a.next) == null) {
                    break;
                }
            } while (i < min);
            this.a = a;
            if (a == null) {
                this.c = true;
            }
            if (i != 0) {
                return Spliterators.a(objArr, 0, i, 4368);
            }
        }
        return null;
    }
}
