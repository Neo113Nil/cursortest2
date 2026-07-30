package kotlin.collections;

import f6.InterfaceC0406a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class F implements Iterator, InterfaceC0406a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
