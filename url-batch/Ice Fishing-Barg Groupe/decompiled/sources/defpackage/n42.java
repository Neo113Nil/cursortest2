package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n42 extends BjEWd04qc7Mw implements Serializable {
    private static final m42 Companion = new m42();
    public static final n42 OPXfSBeufaJ8;
    public final o41 rtx2ld2ELZv4;

    static {
        o41.Companion.getClass();
        OPXfSBeufaJ8 = new n42(o41.S9EYkSpbGuxq);
    }

    public n42() {
        this.rtx2ld2ELZv4 = new o41();
    }

    @Override // defpackage.BjEWd04qc7Mw
    public final int PxuCJdSBwIXG() {
        return this.rtx2ld2ELZv4.gPXPFXrUH4XX;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.rtx2ld2ELZv4.PxuCJdSBwIXG(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.rtx2ld2ELZv4.TSizfFm2Yiuu();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.rtx2ld2ELZv4.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.rtx2ld2ELZv4.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        o41 o41Var = this.rtx2ld2ELZv4;
        o41Var.getClass();
        return new l41(o41Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o41 o41Var = this.rtx2ld2ELZv4;
        o41Var.TSizfFm2Yiuu();
        int RAsUl2FVSrh6 = o41Var.RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 < 0) {
            return false;
        }
        o41Var.dgRBjINgWbAK(RAsUl2FVSrh6);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.rtx2ld2ELZv4.TSizfFm2Yiuu();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.rtx2ld2ELZv4.TSizfFm2Yiuu();
        return super.retainAll(collection);
    }

    public n42(o41 o41Var) {
        o41Var.getClass();
        this.rtx2ld2ELZv4 = o41Var;
    }
}
