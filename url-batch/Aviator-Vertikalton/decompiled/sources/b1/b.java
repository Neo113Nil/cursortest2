package b1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1641b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1642c;

    /* renamed from: d, reason: collision with root package name */
    public int f1643d;

    public b(int i, int i2, int i3) {
        this.f1640a = i3;
        this.f1641b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f1642c = z2;
        this.f1643d = z2 ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1642c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1643d;
        if (i != this.f1641b) {
            this.f1643d = this.f1640a + i;
        } else {
            if (!this.f1642c) {
                throw new NoSuchElementException();
            }
            this.f1642c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
