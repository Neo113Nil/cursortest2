package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mm implements Iterator, kp {
    public Object f;
    public int g = -2;
    public final /* synthetic */ ef h;

    public mm(ef efVar) {
        this.h = efVar;
    }

    public final void a() {
        Object a;
        int i = this.g;
        ef efVar = this.h;
        if (i == -2) {
            a = ((u1) efVar.b).a();
        } else {
            l40 l40Var = (l40) efVar.c;
            this.f.getClass();
            a = ((u1) l40Var.g).a();
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
