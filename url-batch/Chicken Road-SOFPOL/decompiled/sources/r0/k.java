package r0;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f6493d = j.f6488e.f6492d;

    /* renamed from: e, reason: collision with root package name */
    public int f6494e;

    /* renamed from: f, reason: collision with root package name */
    public int f6495f;

    public final void a(Object[] objArr, int i, int i8) {
        this.f6493d = objArr;
        this.f6494e = i;
        this.f6495f = i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6495f < this.f6494e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
