package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3319a;

    /* renamed from: b, reason: collision with root package name */
    public int f3320b;

    /* renamed from: c, reason: collision with root package name */
    public int f3321c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0280a f3322e;

    public g(C0280a c0280a, int i) {
        this.f3322e = c0280a;
        this.f3319a = i;
        this.f3320b = c0280a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3321c < this.f3320b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3322e.b(this.f3321c, this.f3319a);
        this.f3321c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3321c - 1;
        this.f3321c = i;
        this.f3320b--;
        this.d = false;
        this.f3322e.g(i);
    }
}
