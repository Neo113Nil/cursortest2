package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3336a;

    /* renamed from: b, reason: collision with root package name */
    public int f3337b;

    /* renamed from: c, reason: collision with root package name */
    public int f3338c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0279a f3339e;

    public g(C0279a c0279a, int i) {
        this.f3339e = c0279a;
        this.f3336a = i;
        this.f3337b = c0279a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3338c < this.f3337b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3339e.b(this.f3338c, this.f3336a);
        this.f3338c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3338c - 1;
        this.f3338c = i;
        this.f3337b--;
        this.d = false;
        this.f3339e.g(i);
    }
}
