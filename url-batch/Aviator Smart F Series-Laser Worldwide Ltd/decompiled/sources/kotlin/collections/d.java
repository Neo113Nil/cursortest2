package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class d extends AbstractList implements List, g6.e {
    protected d() {
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i8, Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i8) {
        return removeAt(i8);
    }

    public abstract Object removeAt(int i8);

    @Override // java.util.AbstractList, java.util.List
    public abstract Object set(int i8, Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
