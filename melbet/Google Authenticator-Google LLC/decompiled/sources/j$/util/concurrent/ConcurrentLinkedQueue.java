package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable, Collection<E> {
    public static final j$.com.android.tools.r8.a a;
    public static final j$.com.android.tools.r8.a b;
    public static final j$.com.android.tools.r8.a c;
    public static final j$.com.android.tools.r8.a d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient Node<E> head;
    private volatile transient Node<E> tail;

    static {
        try {
            a = new j$.com.android.tools.r8.a(ConcurrentLinkedQueue.class, "head", Node.class);
            b = new j$.com.android.tools.r8.a(ConcurrentLinkedQueue.class, "tail", Node.class);
            c = new j$.com.android.tools.r8.a(Node.class, "item", Object.class);
            d = new j$.com.android.tools.r8.a(Node.class, "next", Node.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public ConcurrentLinkedQueue() {
        Node<E> node = new Node<>();
        this.tail = node;
        this.head = node;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Node<E> node = null;
        Node<E> node2 = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                break;
            }
            Node<E> node3 = new Node<>(readObject);
            if (node == null) {
                node = node3;
            } else {
                node2.getClass();
                d.b(node2, node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node<>();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Node<E> b2 = b();
        while (b2 != null) {
            E e = b2.item;
            if (e != null) {
                objectOutputStream.writeObject(e);
            }
            Node<E> node = b2.next;
            b2 = b2 == node ? this.head : node;
        }
        objectOutputStream.writeObject(null);
    }

    public final boolean a(Predicate predicate) {
        boolean z = false;
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            Node<E> node3 = null;
            int i = 8;
            while (node != null) {
                Node<E> node4 = node.next;
                E e = node.item;
                boolean z2 = true;
                boolean z3 = e != null;
                if (z3 && predicate.test(e)) {
                    if (c.a(node, e, null)) {
                        z = true;
                    }
                    z3 = false;
                }
                if (z3 || node4 == null || i - 1 == 0) {
                    if (node2 != node) {
                        j$.com.android.tools.r8.a aVar = d;
                        if (node3 != null) {
                            z2 = aVar.a(node3, node2, node);
                        } else if (a.a(this, node2, node)) {
                            aVar.c(node2, node2);
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            node2 = node;
                        }
                        node3 = node;
                        i = 8;
                        node2 = node4;
                    }
                    if (!z3) {
                    }
                    node3 = node;
                    i = 8;
                    node2 = node4;
                } else if (node == node4) {
                    break;
                }
                node = node4;
            }
            return z;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        Node<E> node;
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        Node node2 = null;
        Node node3 = null;
        for (E e : collection) {
            e.getClass();
            Node node4 = new Node(e);
            if (node2 == null) {
                node2 = node4;
            } else {
                node3.getClass();
                d.b(node3, node4);
            }
            node3 = node4;
        }
        if (node2 == null) {
            return false;
        }
        Node<E> node5 = this.tail;
        Node<E> node6 = node5;
        while (true) {
            Node<E> node7 = node5.next;
            if (node7 == null) {
                if (d.a(node5, null, node2)) {
                    break;
                }
            } else if (node5 == node7) {
                Node<E> node8 = this.tail;
                Node<E> node9 = node6 != node8 ? node8 : this.head;
                node6 = node8;
                node5 = node9;
            } else {
                if (node5 != node6) {
                    node = this.tail;
                    if (node6 != node) {
                        node7 = node;
                        node6 = node;
                        node5 = node7;
                    } else {
                        node6 = node;
                    }
                }
                node = node6;
                node6 = node;
                node5 = node7;
            }
        }
        j$.com.android.tools.r8.a aVar = b;
        if (aVar.f(this, node6, node3)) {
            return true;
        }
        Node<E> node10 = this.tail;
        if (node3.next != null) {
            return true;
        }
        aVar.f(this, node10, node3);
        return true;
    }

    public final Node b() {
        Node<E> node;
        Node<E> node2;
        boolean z;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                z = node2.item != null;
                if (z || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        f(node, node2);
        if (z) {
            return node2;
        }
        return null;
    }

    public final void c(Consumer consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e = node.item;
                if (e != null) {
                    consumer.accept(e);
                } else {
                    Node node4 = node;
                    while (node3 != null && node3.item == null) {
                        if (node4 == node3) {
                            break;
                        }
                        node4 = node3;
                        node3 = node3.next;
                    }
                    node = d(node2, node, node4, node3);
                }
                node2 = node;
                node = node3;
            }
            return;
            node = this.head;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a(new j$.time.format.b(8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node4 = node;
                    while (node3 != null && node3.item == null) {
                        if (node4 == node3) {
                            break;
                        }
                        node4 = node3;
                        node3 = node3.next;
                    }
                    node2 = d(node2, node, node4, node3);
                } else {
                    if (obj.equals(e)) {
                        return true;
                    }
                    node2 = node;
                }
                node = node3;
            }
            return false;
        }
    }

    public final Node d(Node node, Node node2, Node node3, Node node4) {
        boolean z;
        if (node4 == null) {
            if (node2 != node3) {
                node4 = node3;
            }
            return node;
        }
        j$.com.android.tools.r8.a aVar = d;
        if (node != null) {
            z = aVar.a(node, node2, node4);
        } else if (a.a(this, node2, node4)) {
            aVar.c(node2, node2);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (node != null) {
                j$.com.android.tools.r8.a aVar2 = c;
                long j = aVar2.b;
                Unsafe unsafe = j$.com.android.tools.r8.a.c;
                Class cls = aVar2.a;
                if ((cls == Integer.TYPE ? Integer.valueOf(unsafe.getInt(node, j)) : cls == Long.TYPE ? Long.valueOf(unsafe.getLong(node, j)) : unsafe.getObject(node, j)) != null) {
                }
            }
            return node;
        }
        return node3;
    }

    public final Object[] e(Object[] objArr) {
        int i;
        Object[] objArr2 = objArr;
        loop0: while (true) {
            Node<E> b2 = b();
            i = 0;
            while (b2 != null) {
                E e = b2.item;
                if (e != null) {
                    if (objArr2 == null) {
                        objArr2 = new Object[4];
                    } else if (i == objArr2.length) {
                        objArr2 = Arrays.copyOf(objArr2, (i + 4) * 2);
                    }
                    objArr2[i] = e;
                    i++;
                }
                Node<E> node = b2.next;
                if (b2 == node) {
                    break;
                }
                b2 = node;
            }
        }
        if (objArr2 == null) {
            return new Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArr2.length ? objArr2 : Arrays.copyOf(objArr2, i);
        }
        if (objArr != objArr2) {
            System.arraycopy(objArr2, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final void f(Node node, Node node2) {
        if (node == node2 || !a.a(this, node, node2)) {
            return;
        }
        d.c(node, node);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        c(consumer, this.head);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return b() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new v(this);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        Node<E> node;
        e.getClass();
        Node node2 = new Node(e);
        Node<E> node3 = this.tail;
        Node<E> node4 = node3;
        while (true) {
            Node<E> node5 = node3.next;
            if (node5 == null) {
                if (d.a(node3, null, node2)) {
                    break;
                }
            } else if (node3 == node5) {
                Node<E> node6 = this.tail;
                Node<E> node7 = node4 != node6 ? node6 : this.head;
                node4 = node6;
                node3 = node7;
            } else {
                if (node3 != node4) {
                    node = this.tail;
                    if (node4 != node) {
                        node5 = node;
                        node4 = node;
                        node3 = node5;
                    } else {
                        node4 = node;
                    }
                }
                node = node4;
                node4 = node;
                node3 = node5;
            }
        }
        if (node3 == node4) {
            return true;
        }
        b.f(this, node4, node2);
        return true;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Queue
    public E peek() {
        Node<E> node;
        Node<E> node2;
        E e;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                e = node2.item;
                if (e != null || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        f(node, node2);
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            while (true) {
                E e = node2.item;
                if (e != null && c.a(node2, e, null)) {
                    if (node2 != node) {
                        Node<E> node3 = node2.next;
                        if (node3 != null) {
                            node2 = node3;
                        }
                        f(node, node2);
                    }
                    return e;
                }
                Node<E> node4 = node2.next;
                if (node4 == null) {
                    f(node, node2);
                    return null;
                }
                if (node2 == node4) {
                    break;
                }
                node2 = node4;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node4 = node;
                    while (node3 != null && node3.item == null) {
                        if (node4 == node3) {
                            break;
                        }
                        node4 = node3;
                        node3 = node3.next;
                    }
                    node2 = d(node2, node, node4, node3);
                } else {
                    if (obj.equals(e) && c.a(node, e, null)) {
                        d(node2, node, node, node3);
                        return true;
                    }
                    node2 = node;
                }
                node = node3;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        return a(new t(collection, 1));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        predicate.getClass();
        return a(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return a(new t(collection, 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        while (true) {
            Node<E> b2 = b();
            int i = 0;
            while (b2 != null) {
                if (b2.item != null && (i = i + 1) == Integer.MAX_VALUE) {
                    return i;
                }
                Node<E> node = b2.next;
                if (b2 == node) {
                    break;
                }
                b2 = node;
            }
            return i;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new u(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return e(objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i;
        int i2;
        String[] strArr = null;
        loop0: while (true) {
            Node<E> b2 = b();
            i = 0;
            i2 = 0;
            while (b2 != null) {
                E e = b2.item;
                if (e != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i * 2);
                    }
                    String obj = e.toString();
                    strArr[i] = obj;
                    i2 += obj.length();
                    i++;
                }
                Node<E> node = b2.next;
                if (b2 == node) {
                    break;
                }
                b2 = node;
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[(i * 2) + i2];
        cArr[0] = '[';
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                int i5 = i3 + 1;
                cArr[i3] = ',';
                i3 += 2;
                cArr[i5] = ' ';
            }
            String str = strArr[i4];
            int length = str.length();
            str.getChars(0, length, cArr, i3);
            i3 += length;
        }
        cArr[i3] = ']';
        return new String(cArr);
    }

    /* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
    public static final class Node<E> {
        volatile E item;
        volatile Node<E> next;

        public Node(Object obj) {
            ConcurrentLinkedQueue.c.b(this, obj);
        }

        public Node() {
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return e(null);
    }
}
