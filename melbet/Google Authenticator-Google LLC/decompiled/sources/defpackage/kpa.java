package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class kpa implements Iterator {
    public int a;
    final /* synthetic */ kpd b;

    public kpa(kpd kpdVar) {
        this.b = kpdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        kpd kpdVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return kpdVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
