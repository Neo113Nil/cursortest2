package I;

import a2.InterfaceC0184a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2163d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final G0 f2164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2165f;

    /* renamed from: g, reason: collision with root package name */
    public int f2166g;

    /* renamed from: h, reason: collision with root package name */
    public int f2167h;

    public M(G0 g02, int i3, int i4) {
        this.f2164e = g02;
        this.f2165f = i4;
        this.f2166g = i3;
        this.f2167h = g02.f2124j;
        if (g02.f2123i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2163d) {
            case 0:
                return this.f2166g < this.f2165f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2163d) {
            case 0:
                G0 g02 = this.f2164e;
                int i3 = g02.f2124j;
                int i4 = this.f2167h;
                if (i3 != i4) {
                    throw new ConcurrentModificationException();
                }
                int i5 = this.f2166g;
                this.f2166g = C0089d.j(g02.f2118d, i5) + i5;
                return new H0(g02, i5, i4);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2163d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public M(G0 g02, int i3, N n3, C0089d c0089d) {
        this.f2164e = g02;
        this.f2165f = i3;
        this.f2166g = g02.f2124j;
    }
}
