package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3458a;

    /* renamed from: b, reason: collision with root package name */
    public int f3459b;

    /* renamed from: c, reason: collision with root package name */
    public int f3460c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0282a f3461e;

    public g(C0282a c0282a, int i) {
        this.f3461e = c0282a;
        this.f3458a = i;
        this.f3459b = c0282a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3460c < this.f3459b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3461e.b(this.f3460c, this.f3458a);
        this.f3460c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3460c - 1;
        this.f3460c = i;
        this.f3459b--;
        this.d = false;
        this.f3461e.g(i);
    }
}
