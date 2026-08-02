package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hig implements Iterator {
    private final hic a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private hid f;

    public hig(hic hicVar, Iterator it) {
        this.a = hicVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        if (i == 0) {
            hid hidVar = (hid) this.b.next();
            this.f = hidVar;
            i = hidVar.a();
            this.d = i;
        }
        this.c = i - 1;
        this.e = true;
        hid hidVar2 = this.f;
        hidVar2.getClass();
        return hidVar2.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        hoq.I(this.e, "no calls to next() since the last call to remove()");
        if (this.d == 1) {
            this.b.remove();
        } else {
            hic hicVar = this.a;
            hid hidVar = this.f;
            hidVar.getClass();
            hicVar.remove(hidVar.a);
        }
        this.d--;
        this.e = false;
    }
}
