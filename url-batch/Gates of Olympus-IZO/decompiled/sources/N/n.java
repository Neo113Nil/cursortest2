package N;

import a2.InterfaceC0184a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2844d = m.f2839e.f2843d;

    /* renamed from: e, reason: collision with root package name */
    public int f2845e;

    /* renamed from: f, reason: collision with root package name */
    public int f2846f;

    public final void a(Object[] objArr, int i3, int i4) {
        this.f2844d = objArr;
        this.f2845e = i3;
        this.f2846f = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2846f < this.f2845e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
