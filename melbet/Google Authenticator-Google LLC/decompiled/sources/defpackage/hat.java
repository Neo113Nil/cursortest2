package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hat implements Iterator {
    final Iterator a;
    Object b = null;
    Collection c = null;
    Iterator d = hgj.a;
    final /* synthetic */ hbg e;

    public hat(hbg hbgVar) {
        this.e = hbgVar;
        this.a = hbgVar.a.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        hbg hbgVar = this.e;
        hbgVar.b--;
    }
}
