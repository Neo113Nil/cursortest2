package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class vo implements Iterator, wr {
    public Object f;
    public int g = -2;
    public final /* synthetic */ ch h;

    public vo(ch chVar) {
        this.h = chVar;
    }

    public final void a() {
        Object a;
        int i = this.g;
        ch chVar = this.h;
        if (i == -2) {
            a = ((v1) chVar.b).a();
        } else {
            h hVar = (h) chVar.c;
            this.f.getClass();
            a = ((v1) hVar.g).a();
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
