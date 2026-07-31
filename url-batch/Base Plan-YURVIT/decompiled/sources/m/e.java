package m;

import F.C0032n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f2831e;

    /* renamed from: f, reason: collision with root package name */
    public int f2832f;

    /* renamed from: g, reason: collision with root package name */
    public int f2833g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2834h = false;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0032n f2835i;

    public e(C0032n c0032n, int i2) {
        this.f2835i = c0032n;
        this.f2831e = i2;
        this.f2832f = ((C0199a) c0032n.f412d).f2849g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2833g < this.f2832f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f2835i.b(this.f2833g, this.f2831e);
        this.f2833g++;
        this.f2834h = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2834h) {
            throw new IllegalStateException();
        }
        int i2 = this.f2833g - 1;
        this.f2833g = i2;
        this.f2832f--;
        this.f2834h = false;
        this.f2835i.c(i2);
    }
}
