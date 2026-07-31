package N;

import g2.InterfaceC0439a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3526d = m.f3521e.f3525d;

    /* renamed from: e, reason: collision with root package name */
    public int f3527e;

    /* renamed from: f, reason: collision with root package name */
    public int f3528f;

    public final void a(Object[] objArr, int i3, int i4) {
        this.f3526d = objArr;
        this.f3527e = i3;
        this.f3528f = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3528f < this.f3527e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
