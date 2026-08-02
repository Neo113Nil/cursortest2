package j$.util.concurrent;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class v implements Iterator {
    public ConcurrentLinkedQueue.Node a;
    public Object b;
    public ConcurrentLinkedQueue.Node c;
    public final /* synthetic */ ConcurrentLinkedQueue d;

    public v(ConcurrentLinkedQueue concurrentLinkedQueue) {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node node2;
        this.d = concurrentLinkedQueue;
        loop0: while (true) {
            node = concurrentLinkedQueue.head;
            node2 = node;
            while (true) {
                E e = node2.item;
                if (e != 0) {
                    this.a = node2;
                    this.b = e;
                    break loop0;
                }
                ConcurrentLinkedQueue.Node node3 = node2.next;
                if (node3 == null) {
                    break loop0;
                } else if (node2 == node3) {
                    break;
                } else {
                    node2 = node3;
                }
            }
        }
        concurrentLinkedQueue.f(node, node2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ConcurrentLinkedQueue.Node node = this.a;
        if (node == null) {
            throw new NoSuchElementException();
        }
        this.c = node;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        ConcurrentLinkedQueue.Node node2 = node.next;
        if (node == node2) {
            node2 = concurrentLinkedQueue.head;
        }
        Object obj = null;
        while (node2 != null) {
            obj = node2.item;
            if (obj != null) {
                break;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.d;
            ConcurrentLinkedQueue.Node node3 = node2.next;
            ConcurrentLinkedQueue.Node node4 = node2 == node3 ? concurrentLinkedQueue2.head : node3;
            if (node4 != null) {
                ConcurrentLinkedQueue.d.a(node, node2, node4);
            }
            node2 = node4;
        }
        this.a = node2;
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ConcurrentLinkedQueue.Node node = this.c;
        if (node == null) {
            throw new IllegalStateException();
        }
        node.item = null;
        this.c = null;
    }
}
