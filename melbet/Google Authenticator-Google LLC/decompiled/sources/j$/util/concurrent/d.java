package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.b;
        Object obj2 = lVar.c;
        this.j = lVar;
        a();
        return new k(obj, obj2, this.i);
    }
}
