package com.squareup.wire.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes.dex */
public final class ImmutableList extends AbstractList implements RandomAccess, Serializable {
    public final ArrayList list;

    public ImmutableList(List list) {
        list.getClass();
        this.list = new ArrayList(list);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.list.get(i);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.list.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.list.toArray(new Object[0]);
    }
}
