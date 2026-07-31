package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;

/* renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3225o implements Iterator, InterfaceC2471a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
