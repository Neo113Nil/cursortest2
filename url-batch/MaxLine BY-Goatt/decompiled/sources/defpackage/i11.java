package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i11 extends k11 {
    public final transient int o;
    public final transient int p;
    public final /* synthetic */ k11 q;

    public i11(k11 k11Var, int i, int i2) {
        this.q = k11Var;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.e11
    public final Object[] b() {
        return this.q.b();
    }

    @Override // defpackage.e11
    public final int c() {
        return this.q.d() + this.o + this.p;
    }

    @Override // defpackage.e11
    public final int d() {
        return this.q.d() + this.o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zm3.l(i, this.p);
        return this.q.get(i + this.o);
    }

    @Override // defpackage.k11, defpackage.e11, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.k11, java.util.List
    /* renamed from: j */
    public final k11 subList(int i, int i2) {
        zm3.o(i, i2, this.p);
        int i3 = this.o;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.k11, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }

    @Override // defpackage.k11, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
