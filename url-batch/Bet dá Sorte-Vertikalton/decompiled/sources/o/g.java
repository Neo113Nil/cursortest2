package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3346a;

    /* renamed from: b, reason: collision with root package name */
    public int f3347b;

    /* renamed from: c, reason: collision with root package name */
    public int f3348c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0257a f3349e;

    public g(C0257a c0257a, int i) {
        this.f3349e = c0257a;
        this.f3346a = i;
        this.f3347b = c0257a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3348c < this.f3347b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3349e.b(this.f3348c, this.f3346a);
        this.f3348c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3348c - 1;
        this.f3348c = i;
        this.f3347b--;
        this.d = false;
        this.f3349e.g(i);
    }
}
