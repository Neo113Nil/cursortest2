package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hce implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ hci e;

    public hce(hci hciVar) {
        this.e = hciVar;
        this.b = hciVar.e;
        this.c = hciVar.c();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object a = a(i);
        this.c = this.e.d(this.c);
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        hoq.I(this.d >= 0, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        hci hciVar = this.e;
        hciVar.remove(hciVar.g(i));
        this.c = hciVar.a(this.c, this.d);
        this.d = -1;
    }
}
