package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3357a;

    /* renamed from: b, reason: collision with root package name */
    public int f3358b;

    /* renamed from: c, reason: collision with root package name */
    public int f3359c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0256a f3360e;

    public g(C0256a c0256a, int i) {
        this.f3360e = c0256a;
        this.f3357a = i;
        this.f3358b = c0256a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3359c < this.f3358b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3360e.b(this.f3359c, this.f3357a);
        this.f3359c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3359c - 1;
        this.f3359c = i;
        this.f3358b--;
        this.d = false;
        this.f3360e.g(i);
    }
}
