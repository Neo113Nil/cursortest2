package q0;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final h f7724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7725e;

    /* renamed from: i, reason: collision with root package name */
    public int f7726i;

    /* renamed from: r, reason: collision with root package name */
    public final int f7727r;

    public d(h hVar, int i3, int i10) {
        this.f7724d = hVar;
        this.f7725e = i10;
        this.f7726i = i3;
        this.f7727r = hVar.f7753v;
        if (hVar.f7752u) {
            j.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7726i < this.f7725e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        h hVar = this.f7724d;
        int i3 = hVar.f7753v;
        int i10 = this.f7727r;
        if (i3 != i10) {
            j.f();
        }
        int i11 = this.f7726i;
        this.f7726i = hVar.f7746d[(i11 * 5) + 3] + i11;
        return new i(hVar, i11, i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
