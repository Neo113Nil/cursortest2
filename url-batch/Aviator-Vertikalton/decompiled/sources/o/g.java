package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3689a;

    /* renamed from: b, reason: collision with root package name */
    public int f3690b;

    /* renamed from: c, reason: collision with root package name */
    public int f3691c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3692d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0304a f3693e;

    public g(C0304a c0304a, int i) {
        this.f3693e = c0304a;
        this.f3689a = i;
        this.f3690b = c0304a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3691c < this.f3690b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3693e.b(this.f3691c, this.f3689a);
        this.f3691c++;
        this.f3692d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3692d) {
            throw new IllegalStateException();
        }
        int i = this.f3691c - 1;
        this.f3691c = i;
        this.f3690b--;
        this.f3692d = false;
        this.f3693e.g(i);
    }
}
