package M1;

import a2.InterfaceC0188e;
import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends AbstractSet implements Set, InterfaceC0188e {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
