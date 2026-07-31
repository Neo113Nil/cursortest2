package S1;

import g2.InterfaceC0441c;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AbstractList implements List, InterfaceC0441c {
    public abstract int b();

    public abstract Object c(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return c(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
