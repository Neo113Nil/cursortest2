package g1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364d;

    /* renamed from: e, reason: collision with root package name */
    public int f365e;

    public a(int i2, int i3, int i4) {
        this.f362b = i4;
        this.f363c = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f364d = z2;
        this.f365e = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f364d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f365e;
        if (i2 != this.f363c) {
            this.f365e = this.f362b + i2;
        } else {
            if (!this.f364d) {
                throw new NoSuchElementException();
            }
            this.f364d = false;
        }
        return Integer.valueOf(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
