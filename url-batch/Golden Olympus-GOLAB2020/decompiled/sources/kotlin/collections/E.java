package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class E implements Iterator, InterfaceC2471a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
