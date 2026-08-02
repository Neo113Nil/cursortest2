package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdd extends hdk implements Iterator {
    protected hdd() {
    }

    protected abstract Iterator a();

    @Override // defpackage.hdk
    protected /* bridge */ /* synthetic */ Object f() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a().remove();
    }
}
