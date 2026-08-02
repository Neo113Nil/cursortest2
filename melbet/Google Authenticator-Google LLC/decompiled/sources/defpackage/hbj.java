package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hbj implements Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ hbk e;

    public hbj(hbk hbkVar) {
        this.e = hbkVar;
        this.b = hbkVar.a.a();
        this.d = hbkVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        hoq.I(this.c != -1, "no calls to next() since the last call to remove()");
        hbk hbkVar = this.e;
        hbkVar.b -= hbkVar.a.g(this.c);
        this.b--;
        this.c = -1;
        this.d = hbkVar.a.d;
    }
}
