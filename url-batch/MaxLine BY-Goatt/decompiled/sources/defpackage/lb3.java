package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lb3 implements Iterator {
    public final /* synthetic */ Iterator m;
    public final /* synthetic */ Iterator n;

    public lb3(qb3 qb3Var, Iterator it, Iterator it2) {
        this.m = it;
        this.n = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.m.hasNext()) {
            return true;
        }
        return this.n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.m;
        if (it.hasNext()) {
            return new pc3(((Integer) it.next()).toString());
        }
        Iterator it2 = this.n;
        if (it2.hasNext()) {
            return new pc3((String) it2.next());
        }
        b71.f();
        return null;
    }
}
