package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zk2 implements Iterator, fu0 {
    public final /* synthetic */ hd2 OPXfSBeufaJ8;
    public final Iterator rtx2ld2ELZv4;

    public zk2(hd2 hd2Var) {
        this.OPXfSBeufaJ8 = hd2Var;
        this.rtx2ld2ELZv4 = hd2Var.lS5Rgt96tfkO.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.rtx2ld2ELZv4.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.OPXfSBeufaJ8.TSizfFm2Yiuu.OPXfSBeufaJ8(this.rtx2ld2ELZv4.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
