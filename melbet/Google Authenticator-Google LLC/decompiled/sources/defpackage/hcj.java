package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcj implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ hck d;

    public hcj(hck hckVar) {
        this.d = hckVar;
        this.a = hckVar.b;
        this.b = hckVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        hck hckVar = this.d;
        Object c = hckVar.c(i);
        this.b = hckVar.b(this.b);
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        hoq.I(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        hck hckVar = this.d;
        hckVar.remove(hckVar.c(i));
        this.b--;
        this.c = -1;
    }
}
