package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzk extends AbstractList {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public gzk(Object[] objArr, Object obj, Object obj2) {
        this.a = objArr;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return i != 0 ? i != 1 ? this.a[i - 2] : this.c : this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 4;
    }
}
