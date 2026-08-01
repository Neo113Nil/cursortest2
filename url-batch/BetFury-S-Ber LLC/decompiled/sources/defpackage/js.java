package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class js implements Iterator, pw {
    public Object f;
    public int g = -2;
    public final /* synthetic */ ij h;

    public js(ij ijVar) {
        this.h = ijVar;
    }

    public final void a() {
        Object a;
        int i = this.g;
        ij ijVar = this.h;
        if (i == -2) {
            a = ((z1) ijVar.b).a();
        } else {
            h hVar = (h) ijVar.c;
            this.f.getClass();
            a = ((z1) hVar.g).a();
        }
        this.f = a;
        this.g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < 0) {
            a();
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g < 0) {
            a();
        }
        if (this.g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f;
        obj.getClass();
        this.g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
