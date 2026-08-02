package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgi implements Iterator {
    private Iterator a;
    private Iterator b = hgh.a;
    private Iterator c;
    private Deque d;

    public hgi(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                Deque deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.c = (Iterator) this.d.removeFirst();
            }
            it = null;
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof hgi) {
                hgi hgiVar = (hgi) it4;
                this.b = hgiVar.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (hgiVar.d != null) {
                    while (!hgiVar.d.isEmpty()) {
                        this.d.addFirst((Iterator) hgiVar.d.removeLast());
                    }
                }
                this.c = hgiVar.c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.b;
        this.a = it;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
