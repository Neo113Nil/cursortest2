package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3693a;

    /* renamed from: b, reason: collision with root package name */
    public int f3694b;

    /* renamed from: c, reason: collision with root package name */
    public int f3695c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3696d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0306a f3697e;

    public g(C0306a c0306a, int i) {
        this.f3697e = c0306a;
        this.f3693a = i;
        this.f3694b = c0306a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3695c < this.f3694b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3697e.b(this.f3695c, this.f3693a);
        this.f3695c++;
        this.f3696d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3696d) {
            throw new IllegalStateException();
        }
        int i = this.f3695c - 1;
        this.f3695c = i;
        this.f3694b--;
        this.f3696d = false;
        this.f3697e.g(i);
    }
}
