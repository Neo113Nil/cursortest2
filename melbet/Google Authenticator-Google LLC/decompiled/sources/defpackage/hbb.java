package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hbb implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ hbc c;

    public hbb(hbc hbcVar) {
        this.c = hbcVar;
        this.b = hbcVar.b;
        Collection collection = hbcVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        hbc hbcVar = this.c;
        hbcVar.b();
        if (hbcVar.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        hbc hbcVar = this.c;
        hbg hbgVar = hbcVar.e;
        hbgVar.b--;
        hbcVar.c();
    }

    public hbb(hbc hbcVar, Iterator it) {
        this.c = hbcVar;
        this.b = hbcVar.b;
        this.a = it;
    }
}
