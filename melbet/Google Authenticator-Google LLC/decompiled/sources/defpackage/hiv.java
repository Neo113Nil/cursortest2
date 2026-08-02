package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hiv extends hfm {
    private final transient her a;
    private final transient hel b;

    public hiv(her herVar, hel helVar) {
        this.a = herVar;
        this.b = helVar;
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        return this.b.c(objArr, i);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.hfm, defpackage.heb
    public final hel g() {
        return this.b;
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return this.b.listIterator(0);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
