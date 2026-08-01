package b8;

import java.util.ListIterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends b0 implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f1416e;

    /* renamed from: i, reason: collision with root package name */
    public int f1417i;

    /* renamed from: r, reason: collision with root package name */
    public final g f1418r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, int i3) {
        super(0);
        int size = gVar.size();
        i7.a.B(i3, size);
        this.f1416e = size;
        this.f1417i = i3;
        this.f1418r = gVar;
    }

    public final Object a(int i3) {
        return this.f1418r.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1417i < this.f1416e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1417i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        int i3 = this.f1417i;
        this.f1417i = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1417i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        int i3 = this.f1417i - 1;
        this.f1417i = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1417i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
