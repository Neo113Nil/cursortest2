package b8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends i {

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f1413r;

    public a0(Object obj) {
        obj.getClass();
        this.f1413r = obj;
    }

    @Override // b8.i, b8.b
    public final g b() {
        d dVar = g.f1423e;
        Object[] objArr = {this.f1413r};
        z4.w.j(1, objArr);
        return g.k(1, objArr);
    }

    @Override // b8.b
    public final int c(Object[] objArr) {
        objArr[0] = this.f1413r;
        return 1;
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1413r.equals(obj);
    }

    @Override // b8.b
    public final boolean h() {
        return false;
    }

    @Override // b8.i, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1413r.hashCode();
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return new l(this.f1413r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f1413r.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
