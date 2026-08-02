package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgp implements Iterator {
    final Set a;
    hgr b;
    hgr c;
    int d;
    final /* synthetic */ hgu e;

    public hgp(hgu hguVar) {
        this.e = hguVar;
        this.a = hnu.j(hguVar.q().size());
        this.b = hguVar.a;
        this.d = hguVar.f;
    }

    private final void a() {
        if (this.e.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hgr hgrVar;
        a();
        hgr hgrVar2 = this.b;
        if (hgrVar2 == null) {
            throw new NoSuchElementException();
        }
        this.c = hgrVar2;
        Set set = this.a;
        set.add(hgrVar2.getKey());
        do {
            hgrVar = this.b.a;
            this.b = hgrVar;
            if (hgrVar == null) {
                break;
            }
        } while (!set.add(hgrVar.getKey()));
        return this.c.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        hoq.I(this.c != null, "no calls to next() since the last call to remove()");
        Object key = this.c.getKey();
        hgu hguVar = this.e;
        hguVar.h(key);
        this.c = null;
        this.d = hguVar.f;
    }
}
