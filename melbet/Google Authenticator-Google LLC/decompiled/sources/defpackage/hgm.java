package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgm extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ hgu b;

    public hgm(hgu hguVar, Object obj) {
        this.a = obj;
        this.b = hguVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new hgt(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        hgq hgqVar = (hgq) this.b.d.get(this.a);
        if (hgqVar == null) {
            return 0;
        }
        return hgqVar.c;
    }
}
