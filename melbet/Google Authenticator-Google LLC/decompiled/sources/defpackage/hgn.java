package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgn extends AbstractSequentialList {
    final /* synthetic */ hgu a;

    public hgn(hgu hguVar) {
        this.a = hguVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new hgs(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.e;
    }
}
