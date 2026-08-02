package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hhw extends hhk {
    final /* synthetic */ hhx a;

    public hhw(hhx hhxVar) {
        this.a = hhxVar;
    }

    @Override // defpackage.hhk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        hhu hhuVar = this.a.a;
        Set q = hhuVar.q();
        hhuVar.getClass();
        return new hhg(q.iterator(), new grv(hhuVar, 5));
    }

    @Override // defpackage.hhk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        hhx hhxVar = this.a;
        hhxVar.a.q().remove(entry.getKey());
        return true;
    }
}
