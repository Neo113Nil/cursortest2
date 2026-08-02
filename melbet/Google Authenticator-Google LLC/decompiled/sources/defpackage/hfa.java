package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfa extends hjr {
    final Iterator a;
    Object b = null;
    Iterator c = hgh.a;
    final /* synthetic */ hfc d;

    public hfa(hfc hfcVar) {
        this.d = hfcVar;
        this.a = hfcVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((heb) entry.getValue()).iterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }
}
