package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3231a;

    /* renamed from: b, reason: collision with root package name */
    public int f3232b;

    /* renamed from: c, reason: collision with root package name */
    public int f3233c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0279a f3234e;

    public g(C0279a c0279a, int i) {
        this.f3234e = c0279a;
        this.f3231a = i;
        this.f3232b = c0279a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3233c < this.f3232b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3234e.b(this.f3233c, this.f3231a);
        this.f3233c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3233c - 1;
        this.f3233c = i;
        this.f3232b--;
        this.d = false;
        this.f3234e.g(i);
    }
}
