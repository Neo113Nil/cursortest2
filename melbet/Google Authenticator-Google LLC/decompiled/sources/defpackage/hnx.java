package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnx implements Iterator {
    final /* synthetic */ hny a;
    private int b = 0;

    public hnx(hny hnyVar) {
        this.a = hnyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        hny hnyVar = this.a;
        if (i >= hnyVar.size()) {
            throw new NoSuchElementException();
        }
        hnz hnzVar = hnyVar.b;
        Object obj = hnzVar.b[hnyVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
