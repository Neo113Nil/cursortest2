package G;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2716d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final F0 f2717e;

    /* renamed from: i, reason: collision with root package name */
    public final int f2718i;

    /* renamed from: j, reason: collision with root package name */
    public int f2719j;

    /* renamed from: k, reason: collision with root package name */
    public int f2720k;

    public L(F0 f02, int i2, int i4) {
        this.f2717e = f02;
        this.f2718i = i4;
        this.f2719j = i2;
        this.f2720k = f02.f2676m;
        if (f02.f2675l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2716d) {
            case 0:
                return this.f2719j < this.f2718i;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2716d) {
            case 0:
                F0 f02 = this.f2717e;
                int i2 = f02.f2676m;
                int i4 = this.f2720k;
                if (i2 != i4) {
                    throw new ConcurrentModificationException();
                }
                int i5 = this.f2719j;
                this.f2719j = C0192d.j(f02.f2670d, i5) + i5;
                return new G0(f02, i5, i4);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2716d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public L(F0 f02, int i2, M m4, C0192d c0192d) {
        this.f2717e = f02;
        this.f2718i = i2;
        this.f2719j = f02.f2676m;
    }
}
