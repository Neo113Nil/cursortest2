package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class eo extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f8012a;

    eo(List list) {
        this.f8012a = new ArrayList(list);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8012a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f8012a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f8012a.toArray();
    }
}
