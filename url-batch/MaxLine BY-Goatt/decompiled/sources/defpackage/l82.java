package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l82 extends p11 {
    public final transient n11 p;
    public final transient m82 q;

    public l82(n11 n11Var, m82 m82Var) {
        this.p = n11Var;
        this.q = m82Var;
    }

    @Override // defpackage.e11
    public final int a(Object[] objArr) {
        return this.q.a(objArr);
    }

    @Override // defpackage.e11, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.p.get(obj) != null;
    }

    @Override // defpackage.e11
    /* renamed from: e */
    public final g23 iterator() {
        return this.q.listIterator(0);
    }

    @Override // defpackage.p11
    public final k11 f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((n82) this.p).r;
    }
}
