package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdr implements Iterator {
    final /* synthetic */ hds a;
    private int b;
    private int c;
    private int d;
    private int e;

    public hdr(hds hdsVar) {
        this.a = hdsVar;
        hdt hdtVar = hdsVar.b;
        this.b = hdtVar.e;
        this.c = -1;
        this.d = hdtVar.d;
        this.e = hdtVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        hds hdsVar = this.a;
        Object a = hdsVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = hdsVar.b.f[i];
        this.e--;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        hoq.I(this.c != -1, "no calls to next() since the last call to remove()");
        int i = this.c;
        hdt hdtVar = this.a.b;
        hdtVar.e(i, hnu.ag(hdtVar.a[i]));
        if (this.b == hdtVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = hdtVar.d;
    }
}
