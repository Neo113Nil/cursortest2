package X0;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends AbstractSet implements Set, k1.a {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
