package S0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f826e;

    /* renamed from: f, reason: collision with root package name */
    public final int f827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f828g;

    /* renamed from: h, reason: collision with root package name */
    public int f829h;

    public b(int i2, int i3, int i4) {
        this.f826e = i4;
        this.f827f = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f828g = z2;
        this.f829h = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f828g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i2 = this.f829h;
        if (i2 != this.f827f) {
            this.f829h = this.f826e + i2;
            return i2;
        }
        if (!this.f828g) {
            throw new NoSuchElementException();
        }
        this.f828g = false;
        return i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
