package o7;

import b8.b0;
import java.util.ListIterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends b0 implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f7539e;

    /* renamed from: i, reason: collision with root package name */
    public int f7540i;

    /* renamed from: r, reason: collision with root package name */
    public final e f7541r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i3) {
        super(1);
        int size = eVar.size();
        if (i3 < 0 || i3 > size) {
            i0.g(a.a.h0("index", i3, size));
            throw null;
        }
        this.f7539e = size;
        this.f7540i = i3;
        this.f7541r = eVar;
    }

    public final Object a(int i3) {
        return this.f7541r.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7540i < this.f7539e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7540i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        int i3 = this.f7540i;
        this.f7540i = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7540i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        int i3 = this.f7540i - 1;
        this.f7540i = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7540i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
