package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3909a;

    /* renamed from: b, reason: collision with root package name */
    public int f3910b;

    /* renamed from: c, reason: collision with root package name */
    public int f3911c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3912d = false;
    public final /* synthetic */ C0331a e;

    public g(C0331a c0331a, int i) {
        this.e = c0331a;
        this.f3909a = i;
        this.f3910b = c0331a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3911c < this.f3910b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.e.b(this.f3911c, this.f3909a);
        this.f3911c++;
        this.f3912d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3912d) {
            throw new IllegalStateException();
        }
        int i = this.f3911c - 1;
        this.f3911c = i;
        this.f3910b--;
        this.f3912d = false;
        this.e.g(i);
    }
}
