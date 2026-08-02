package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbn extends AbstractCollection {
    final /* synthetic */ hbo a;

    public hbn(hbo hboVar) {
        this.a = hboVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.a.p().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hao((hbg) this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((hbg) this.a).b;
    }
}
