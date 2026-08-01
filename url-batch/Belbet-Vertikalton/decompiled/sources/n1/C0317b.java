package n1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317b implements Iterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3760c;

    /* renamed from: d, reason: collision with root package name */
    public int f3761d;

    public C0317b(int i, int i2, int i3) {
        this.f3758a = i3;
        this.f3759b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f3760c = z2;
        this.f3761d = z2 ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3760c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3761d;
        if (i != this.f3759b) {
            this.f3761d = this.f3758a + i;
        } else {
            if (!this.f3760c) {
                throw new NoSuchElementException();
            }
            this.f3760c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
