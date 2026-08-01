package kotlin.collections;

import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends hd.u implements ListIterator {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f5559r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i3) {
        super(4, fVar);
        this.f5559r = fVar;
        c cVar = f.f5563d;
        int b10 = fVar.b();
        cVar.getClass();
        c.b(i3, b10);
        this.f4526e = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4526e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4526e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        int i3 = this.f4526e - 1;
        this.f4526e = i3;
        return this.f5559r.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4526e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
