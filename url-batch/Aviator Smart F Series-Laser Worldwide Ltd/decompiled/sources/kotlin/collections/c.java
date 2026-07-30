package kotlin.collections;

import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class c extends java.util.AbstractCollection implements Collection, g6.b {
    protected c() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
