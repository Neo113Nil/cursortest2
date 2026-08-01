package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3219a;

    /* renamed from: b, reason: collision with root package name */
    public int f3220b;

    /* renamed from: c, reason: collision with root package name */
    public int f3221c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0276a f3222e;

    public g(C0276a c0276a, int i) {
        this.f3222e = c0276a;
        this.f3219a = i;
        this.f3220b = c0276a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3221c < this.f3220b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3222e.b(this.f3221c, this.f3219a);
        this.f3221c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3221c - 1;
        this.f3221c = i;
        this.f3220b--;
        this.d = false;
        this.f3222e.g(i);
    }
}
