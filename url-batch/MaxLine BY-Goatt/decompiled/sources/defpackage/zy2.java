package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zy2 implements Iterator, k71 {
    public final Iterator m;
    public final /* synthetic */ ps2 n;

    public zy2(ps2 ps2Var) {
        this.n = ps2Var;
        this.m = ((Sequence) ps2Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.n.c.invoke(this.m.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
