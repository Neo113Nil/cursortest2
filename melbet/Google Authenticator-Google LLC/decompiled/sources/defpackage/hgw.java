package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgw extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object[] b;

    public hgw(Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        hoq.O(i, size());
        return i == 0 ? this.a : this.b[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int length = this.b.length;
        return hoq.m(2, 1);
    }
}
