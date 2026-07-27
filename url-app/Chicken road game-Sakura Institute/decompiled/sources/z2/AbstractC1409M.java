package z2;

import java.util.Iterator;

/* renamed from: z2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1409M implements Iterator, N2.a {
    public abstract int b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
