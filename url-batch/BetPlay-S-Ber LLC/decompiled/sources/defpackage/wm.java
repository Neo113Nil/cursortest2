package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class wm implements Iterator, vp {
    public Object f;
    public int g = -2;
    public final /* synthetic */ df h;

    public wm(df dfVar) {
        this.h = dfVar;
    }

    public final void a() {
        Object a;
        int i = this.g;
        df dfVar = this.h;
        if (i == -2) {
            a = ((d2) dfVar.b).a();
        } else {
            u40 u40Var = (u40) dfVar.c;
            this.f.getClass();
            a = ((d2) u40Var.g).a();
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
