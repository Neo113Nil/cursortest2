package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u extends t implements ListIterator {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, int i) {
        super(wVar);
        this.h = wVar;
        s sVar = w.d;
        int a = wVar.a();
        sVar.getClass();
        s.b(i, a);
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            dd0.c();
            return null;
        }
        int i = this.e - 1;
        this.e = i;
        return this.h.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
