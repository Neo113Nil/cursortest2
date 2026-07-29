package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3314a;

    /* renamed from: b, reason: collision with root package name */
    public int f3315b;

    /* renamed from: c, reason: collision with root package name */
    public int f3316c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0279a f3317e;

    public g(C0279a c0279a, int i) {
        this.f3317e = c0279a;
        this.f3314a = i;
        this.f3315b = c0279a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3316c < this.f3315b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3317e.b(this.f3316c, this.f3314a);
        this.f3316c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3316c - 1;
        this.f3316c = i;
        this.f3315b--;
        this.d = false;
        this.f3317e.g(i);
    }
}
