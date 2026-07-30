package defpackage;

import defpackage.h0;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j0 extends i0 implements ListIterator {
    public final /* synthetic */ h0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 h0Var, int i) {
        super(0, h0Var);
        this.p = h0Var;
        h0.a aVar = h0.m;
        int a = h0Var.a();
        aVar.getClass();
        h0.a.b(i, a);
        this.n = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.n > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            b71.f();
            return null;
        }
        int i = this.n - 1;
        this.n = i;
        return this.p.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
