package Y0;

import java.util.AbstractSet;
import java.util.Set;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public abstract class f extends AbstractSet implements Set, InterfaceC0284a {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
