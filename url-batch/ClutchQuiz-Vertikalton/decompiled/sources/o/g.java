package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3222a;

    /* renamed from: b, reason: collision with root package name */
    public int f3223b;

    /* renamed from: c, reason: collision with root package name */
    public int f3224c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0265a f3225e;

    public g(C0265a c0265a, int i) {
        this.f3225e = c0265a;
        this.f3222a = i;
        this.f3223b = c0265a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3224c < this.f3223b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3225e.b(this.f3224c, this.f3222a);
        this.f3224c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3224c - 1;
        this.f3224c = i;
        this.f3223b--;
        this.d = false;
        this.f3225e.g(i);
    }
}
