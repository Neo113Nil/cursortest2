package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class e extends AbstractSet implements Set, g6.h {
    protected e() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
