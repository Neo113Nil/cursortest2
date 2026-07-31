package M1;

import a2.InterfaceC0186c;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AbstractList implements List, InterfaceC0186c {
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
