package v2;

/* loaded from: classes.dex */
public final class d0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient f0 f15621d;

    /* renamed from: e, reason: collision with root package name */
    public final transient e0 f15622e;

    public d0(f0 f0Var, e0 e0Var) {
        this.f15621d = f0Var;
        this.f15622e = e0Var;
    }

    @Override // v2.M, v2.D
    public final I b() {
        return this.f15622e;
    }

    @Override // v2.D
    public final int c(int i4, Object[] objArr) {
        return this.f15622e.c(i4, objArr);
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15621d.get(obj) != null;
    }

    @Override // v2.D
    public final boolean g() {
        return true;
    }

    @Override // v2.D
    /* renamed from: h */
    public final p0 iterator() {
        return this.f15622e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15621d.f15635f;
    }
}
