package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hei extends hel {
    private final transient hel a;

    public hei(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.hel
    public final hel a() {
        return this.a;
    }

    @Override // defpackage.hel
    /* renamed from: b */
    public final hel subList(int i, int i2) {
        hoq.G(i, i2, size());
        return this.a.subList(size() - i2, size() - i).a();
    }

    @Override // defpackage.hel, defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        hoq.O(i, size());
        return this.a.get((size() - 1) - i);
    }

    @Override // defpackage.hel, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.heb
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.hel, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return (size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.hel, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
