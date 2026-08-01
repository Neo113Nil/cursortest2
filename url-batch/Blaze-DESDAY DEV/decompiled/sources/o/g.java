package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3277a;

    /* renamed from: b, reason: collision with root package name */
    public int f3278b;

    /* renamed from: c, reason: collision with root package name */
    public int f3279c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0282a f3280e;

    public g(C0282a c0282a, int i) {
        this.f3280e = c0282a;
        this.f3277a = i;
        this.f3278b = c0282a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3279c < this.f3278b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3280e.b(this.f3279c, this.f3277a);
        this.f3279c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3279c - 1;
        this.f3279c = i;
        this.f3278b--;
        this.d = false;
        this.f3280e.g(i);
    }
}
