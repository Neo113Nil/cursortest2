package m3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f2737f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2738g;
    public boolean h;
    public int i;

    public b(int i, int i4, int i5) {
        this.f2737f = i5;
        this.f2738g = i4;
        boolean z4 = false;
        if (i5 <= 0 ? i >= i4 : i <= i4) {
            z4 = true;
        }
        this.h = z4;
        this.i = z4 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        if (i != this.f2738g) {
            this.i = this.f2737f + i;
        } else {
            if (!this.h) {
                throw new NoSuchElementException();
            }
            this.h = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
