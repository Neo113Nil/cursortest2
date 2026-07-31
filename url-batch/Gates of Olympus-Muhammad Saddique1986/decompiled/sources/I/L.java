package I;

import g2.InterfaceC0439a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2718d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final F0 f2719e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2720f;

    /* renamed from: g, reason: collision with root package name */
    public int f2721g;

    /* renamed from: h, reason: collision with root package name */
    public int f2722h;

    public L(F0 f02, int i3, int i4) {
        this.f2719e = f02;
        this.f2720f = i4;
        this.f2721g = i3;
        this.f2722h = f02.f2678j;
        if (f02.f2677i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2718d) {
            case 0:
                return this.f2721g < this.f2720f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2718d) {
            case 0:
                F0 f02 = this.f2719e;
                int i3 = f02.f2678j;
                int i4 = this.f2722h;
                if (i3 != i4) {
                    throw new ConcurrentModificationException();
                }
                int i5 = this.f2721g;
                this.f2721g = C0143d.j(f02.f2672d, i5) + i5;
                return new G0(f02, i5, i4);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2718d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public L(F0 f02, int i3, M m3, C0143d c0143d) {
        this.f2719e = f02;
        this.f2720f = i3;
        this.f2721g = f02.f2678j;
    }
}
