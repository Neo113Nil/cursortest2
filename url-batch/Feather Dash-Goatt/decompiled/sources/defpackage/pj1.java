package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class pj1 implements Iterator, yb0 {
    public Object[] d = oj1.e.d;
    public int e;
    public int g;

    public final void a(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.g = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
