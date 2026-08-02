package v2;

/* loaded from: classes.dex */
public final class n0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f15661d;

    public n0(Object obj) {
        obj.getClass();
        this.f15661d = obj;
    }

    @Override // v2.M, v2.D
    public final I b() {
        return I.o(this.f15661d);
    }

    @Override // v2.D
    public final int c(int i4, Object[] objArr) {
        objArr[i4] = this.f15661d;
        return i4 + 1;
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15661d.equals(obj);
    }

    @Override // v2.D
    public final boolean g() {
        return false;
    }

    @Override // v2.D
    /* renamed from: h */
    public final p0 iterator() {
        return new P(this.f15661d);
    }

    @Override // v2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15661d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15661d.toString() + ']';
    }
}
