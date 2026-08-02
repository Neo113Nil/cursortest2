package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kps implements ListIterator {
    private int a;
    private int b = -1;
    private int c;
    private final /* synthetic */ int d;
    private final kpf e;

    public kps(kpr kprVar, int i, int i2) {
        int i3;
        this.d = i2;
        this.e = kprVar;
        this.a = i;
        i3 = kprVar.modCount;
        this.c = i3;
    }

    private final void a() {
        int i;
        i = ((kpt) this.e).modCount;
        if (i != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        int i;
        i = ((kpr) this.e).d.modCount;
        if (i != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        if (this.d != 0) {
            b();
            int i3 = this.a;
            this.a = i3 + 1;
            kpr kprVar = (kpr) this.e;
            kprVar.add(i3, obj);
            this.b = -1;
            i2 = kprVar.modCount;
            this.c = i2;
            return;
        }
        a();
        int i4 = this.a;
        this.a = i4 + 1;
        kpt kptVar = (kpt) this.e;
        kptVar.add(i4, obj);
        this.b = -1;
        i = kptVar.modCount;
        this.c = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        kpf kpfVar = this.e;
        int i2 = this.a;
        return i != 0 ? i2 < ((kpr) kpfVar).c : i2 < ((kpt) kpfVar).c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        int i2 = this.a;
        return i != 0 ? i2 > 0 : i2 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            b();
            kpf kpfVar = this.e;
            int i = this.a;
            kpr kprVar = (kpr) kpfVar;
            if (i >= kprVar.c) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            this.b = i;
            return kprVar.a[kprVar.b + i];
        }
        a();
        kpf kpfVar2 = this.e;
        int i2 = this.a;
        kpt kptVar = (kpt) kpfVar2;
        if (i2 >= kptVar.c) {
            throw new NoSuchElementException();
        }
        this.a = i2 + 1;
        this.b = i2;
        return kptVar.b[i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.d == 0) {
            a();
            int i = this.a;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.a = i2;
            this.b = i2;
            return ((kpt) this.e).b[i2];
        }
        b();
        int i3 = this.a;
        if (i3 <= 0) {
            throw new NoSuchElementException();
        }
        int i4 = i3 - 1;
        this.a = i4;
        this.b = i4;
        kpr kprVar = (kpr) this.e;
        return kprVar.a[kprVar.b + i4];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        if (this.d != 0) {
            b();
            int i3 = this.b;
            if (i3 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            kpf kpfVar = this.e;
            kpfVar.b(i3);
            this.a = this.b;
            this.b = -1;
            i2 = ((kpr) kpfVar).modCount;
            this.c = i2;
            return;
        }
        a();
        int i4 = this.b;
        if (i4 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        kpf kpfVar2 = this.e;
        kpfVar2.b(i4);
        this.a = this.b;
        this.b = -1;
        i = ((kpt) kpfVar2).modCount;
        this.c = i;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((kpr) this.e).set(i, obj);
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        ((kpt) this.e).set(i2, obj);
    }

    public kps(kpt kptVar, int i, int i2) {
        int i3;
        this.d = i2;
        this.e = kptVar;
        this.a = i;
        i3 = kptVar.modCount;
        this.c = i3;
    }
}
