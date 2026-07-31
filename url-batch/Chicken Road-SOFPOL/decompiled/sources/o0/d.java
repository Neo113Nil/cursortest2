package o0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements ListIterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5576d;

    /* renamed from: e, reason: collision with root package name */
    public int f5577e;

    public d(int i, List list) {
        this.f5576d = list;
        this.f5577e = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f5576d.add(this.f5577e, obj);
        this.f5577e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5577e < this.f5576d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5577e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f5577e;
        this.f5577e = i + 1;
        return this.f5576d.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5577e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f5577e - 1;
        this.f5577e = i;
        return this.f5576d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5577e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f5577e - 1;
        this.f5577e = i;
        this.f5576d.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f5576d.set(this.f5577e, obj);
    }
}
