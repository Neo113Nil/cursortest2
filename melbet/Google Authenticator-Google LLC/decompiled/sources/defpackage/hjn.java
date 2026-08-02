package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hjn extends hfm {
    final transient Object a;

    public hjn(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.hfm, defpackage.heb
    public final hel g() {
        return hel.q(this.a);
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return new hgl(this.a);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
