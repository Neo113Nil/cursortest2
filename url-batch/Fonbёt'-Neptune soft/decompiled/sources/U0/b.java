package U0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, R0.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f1090e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1091f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1092g;

    /* renamed from: h, reason: collision with root package name */
    public int f1093h;

    public b(int i2, int i3, int i4) {
        this.f1090e = i4;
        this.f1091f = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f1092g = z2;
        this.f1093h = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f1093h;
        if (i2 != this.f1091f) {
            this.f1093h = this.f1090e + i2;
        } else {
            if (!this.f1092g) {
                throw new NoSuchElementException();
            }
            this.f1092g = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1092g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
