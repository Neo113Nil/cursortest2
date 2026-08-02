package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hrw extends hdf {
    private final ListIterator a;

    public hrw(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.hdf, defpackage.hdd
    protected final /* synthetic */ Iterator a() {
        return this.a;
    }

    @Override // defpackage.hdf, java.util.ListIterator
    public final void add(Object obj) {
        obj.getClass();
        this.a.add(obj);
    }

    @Override // defpackage.hdf
    protected final ListIterator b() {
        return this.a;
    }

    @Override // defpackage.hdd, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdf, java.util.ListIterator
    public final void set(Object obj) {
        obj.getClass();
        this.a.set(obj);
    }
}
