package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3318a;

    /* renamed from: b, reason: collision with root package name */
    public int f3319b;

    /* renamed from: c, reason: collision with root package name */
    public int f3320c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0274a f3321e;

    public g(C0274a c0274a, int i) {
        this.f3321e = c0274a;
        this.f3318a = i;
        this.f3319b = c0274a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3320c < this.f3319b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3321e.b(this.f3320c, this.f3318a);
        this.f3320c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3320c - 1;
        this.f3320c = i;
        this.f3319b--;
        this.d = false;
        this.f3321e.g(i);
    }
}
