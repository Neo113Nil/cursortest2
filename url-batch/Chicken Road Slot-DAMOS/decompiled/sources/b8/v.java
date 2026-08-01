package b8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends i {

    /* renamed from: r, reason: collision with root package name */
    public final transient x f1447r;

    /* renamed from: s, reason: collision with root package name */
    public final transient w f1448s;

    public v(x xVar, w wVar) {
        this.f1447r = xVar;
        this.f1448s = wVar;
    }

    @Override // b8.i, b8.b
    public final g b() {
        return this.f1448s;
    }

    @Override // b8.b
    public final int c(Object[] objArr) {
        return this.f1448s.c(objArr);
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1447r.get(obj) != null;
    }

    @Override // b8.b
    public final boolean h() {
        return true;
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return this.f1448s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1447r.f1458t;
    }
}
