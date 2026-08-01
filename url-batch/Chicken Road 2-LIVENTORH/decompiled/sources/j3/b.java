package j3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Iterator, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f1980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1981g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1982h;
    public int i;

    public b(int i, int i4, int i5) {
        this.f1980f = i5;
        this.f1981g = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i >= i4 : i <= i4) {
            z3 = true;
        }
        this.f1982h = z3;
        this.i = z3 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1982h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        if (i != this.f1981g) {
            this.i = this.f1980f + i;
        } else {
            if (!this.f1982h) {
                throw new NoSuchElementException();
            }
            this.f1982h = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
