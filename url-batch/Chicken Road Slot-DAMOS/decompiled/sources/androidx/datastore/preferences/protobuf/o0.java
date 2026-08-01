package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f601a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f602b;

    /* renamed from: c, reason: collision with root package name */
    public final o f603c;

    public o0(e1 e1Var, o oVar, a aVar) {
        this.f602b = e1Var;
        oVar.getClass();
        this.f603c = oVar;
        this.f601a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void a(Object obj, Object obj2) {
        x0.k(this.f602b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void b(Object obj, f0 f0Var) {
        this.f603c.getClass();
        v4.a.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int c(v vVar) {
        this.f602b.getClass();
        return vVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void d(Object obj) {
        this.f602b.getClass();
        d1 d1Var = ((v) obj).unknownFields;
        if (d1Var.f529e) {
            d1Var.f529e = false;
        }
        this.f603c.getClass();
        v4.a.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean e(Object obj) {
        this.f603c.getClass();
        v4.a.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean f(v vVar, v vVar2) {
        this.f602b.getClass();
        return vVar.unknownFields.equals(vVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void g(Object obj, j jVar, n nVar) {
        this.f602b.getClass();
        e1.a(obj);
        this.f603c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int h(v vVar) {
        this.f602b.getClass();
        d1 d1Var = vVar.unknownFields;
        int i3 = d1Var.f528d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < d1Var.f525a; i11++) {
            int i12 = d1Var.f526b[i11] >>> 3;
            i10 += l.f(3, (f) d1Var.f527c[i11]) + l.i(i12) + l.h(2) + (l.h(1) * 2);
        }
        d1Var.f528d = i10;
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final v i() {
        a aVar = this.f601a;
        return aVar instanceof v ? ((v) aVar).i() : ((t) ((v) aVar).c(5)).b();
    }
}
