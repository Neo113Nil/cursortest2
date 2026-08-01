package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3313a;

    /* renamed from: b, reason: collision with root package name */
    public int f3314b;

    /* renamed from: c, reason: collision with root package name */
    public int f3315c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0277a f3316e;

    public g(C0277a c0277a, int i) {
        this.f3316e = c0277a;
        this.f3313a = i;
        this.f3314b = c0277a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3315c < this.f3314b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3316e.b(this.f3315c, this.f3313a);
        this.f3315c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3315c - 1;
        this.f3315c = i;
        this.f3314b--;
        this.d = false;
        this.f3316e.g(i);
    }
}
