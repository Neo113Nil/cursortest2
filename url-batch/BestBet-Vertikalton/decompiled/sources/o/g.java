package o;

import h0.r;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3576a;

    /* renamed from: b, reason: collision with root package name */
    public int f3577b;

    /* renamed from: c, reason: collision with root package name */
    public int f3578c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3579e;

    public g(r rVar, int i) {
        this.f3579e = rVar;
        this.f3576a = i;
        this.f3577b = rVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3578c < this.f3577b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c2 = this.f3579e.c(this.f3578c, this.f3576a);
        this.f3578c++;
        this.d = true;
        return c2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3578c - 1;
        this.f3578c = i;
        this.f3577b--;
        this.d = false;
        this.f3579e.i(i);
    }
}
