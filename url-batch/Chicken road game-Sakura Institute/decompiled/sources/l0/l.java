package l0;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5766f = k.f5761e.f5765d;

    /* renamed from: g, reason: collision with root package name */
    public int f5767g;

    /* renamed from: h, reason: collision with root package name */
    public int f5768h;

    public final void a(Object[] objArr, int i7, int i8) {
        this.f5766f = objArr;
        this.f5767g = i7;
        this.f5768h = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5768h < this.f5767g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
