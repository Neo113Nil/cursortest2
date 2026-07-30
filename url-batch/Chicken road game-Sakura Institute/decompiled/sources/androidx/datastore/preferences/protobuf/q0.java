package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f892a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f893b;

    /* renamed from: c, reason: collision with root package name */
    public final o f894c;

    public q0(j1 j1Var, o oVar, a aVar) {
        this.f893b = j1Var;
        oVar.getClass();
        this.f894c = oVar;
        this.f892a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void a(Object obj, a0.p pVar, n nVar) {
        this.f893b.getClass();
        j1.a(obj);
        this.f894c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void b(Object obj, Object obj2) {
        z0.x(this.f893b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void c(Object obj, h0 h0Var) {
        this.f894c.getClass();
        r6.i.e(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final int d(v vVar) {
        this.f893b.getClass();
        return vVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void e(Object obj) {
        this.f893b.getClass();
        ((v) obj).unknownFields.f848e = false;
        this.f894c.getClass();
        r6.i.e(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final boolean f(Object obj) {
        this.f894c.getClass();
        r6.i.e(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final boolean g(v vVar, v vVar2) {
        this.f893b.getClass();
        return vVar.unknownFields.equals(vVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final int h(v vVar) {
        this.f893b.getClass();
        i1 i1Var = vVar.unknownFields;
        int i7 = i1Var.f847d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i1Var.f844a; i9++) {
            int i10 = i1Var.f845b[i9] >>> 3;
            i8 += l.l(3, (g) i1Var.f846c[i9]) + l.t(i10) + l.s(2) + (l.s(1) * 2);
        }
        i1Var.f847d = i8;
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final v i() {
        a aVar = this.f892a;
        return aVar instanceof v ? ((v) aVar).i() : ((t) ((v) aVar).c(5)).b();
    }
}
