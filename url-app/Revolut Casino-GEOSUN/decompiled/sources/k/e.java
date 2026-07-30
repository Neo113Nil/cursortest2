package k;

import D.C0013n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f2658e;

    /* renamed from: f, reason: collision with root package name */
    public int f2659f;

    /* renamed from: g, reason: collision with root package name */
    public int f2660g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2661h = false;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0013n f2662i;

    public e(C0013n c0013n, int i2) {
        this.f2662i = c0013n;
        this.f2658e = i2;
        this.f2659f = ((C0179a) c0013n.f247d).f2676g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2660g < this.f2659f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f2662i.b(this.f2660g, this.f2658e);
        this.f2660g++;
        this.f2661h = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2661h) {
            throw new IllegalStateException();
        }
        int i2 = this.f2660g - 1;
        this.f2660g = i2;
        this.f2659f--;
        this.f2661h = false;
        this.f2662i.c(i2);
    }
}
