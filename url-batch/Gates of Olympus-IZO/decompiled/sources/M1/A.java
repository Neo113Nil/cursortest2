package M1;

import a2.InterfaceC0184a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class A implements Iterator, InterfaceC0184a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
