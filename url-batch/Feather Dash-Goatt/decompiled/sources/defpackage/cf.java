package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cf implements Iterator {
    public int d = 0;
    public final int e;
    public final /* synthetic */ ff g;

    public cf(ff ffVar) {
        this.g = ffVar;
        this.e = ffVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i < this.e) {
            this.d = i + 1;
            return Byte.valueOf(this.g.g(i));
        }
        dd0.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
