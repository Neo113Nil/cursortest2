package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hch extends AbstractCollection {
    final /* synthetic */ hci a;

    public hch(hci hciVar) {
        this.a = hciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        hci hciVar = this.a;
        Map n = hciVar.n();
        return n != null ? n.values().iterator() : new hcc(hciVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
