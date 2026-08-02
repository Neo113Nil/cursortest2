package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hmo implements Iterator {
    final /* synthetic */ hmp a;
    private final hky b;
    private int c;
    private int d;

    public hmo(hmp hmpVar, hky hkyVar, int i) {
        this.a = hmpVar;
        this.b = hkyVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c = this.b.c(this.a.f(this.c));
        int i = this.d;
        if (i == 0) {
            this.c = -1;
            return c;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.d >>>= numberOfTrailingZeros;
        this.c += numberOfTrailingZeros;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
