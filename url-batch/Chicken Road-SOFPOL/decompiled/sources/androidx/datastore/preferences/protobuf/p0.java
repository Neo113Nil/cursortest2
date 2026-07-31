package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f751a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f752b;

    /* renamed from: c, reason: collision with root package name */
    public final p f753c;

    public p0(f1 f1Var, p pVar, a aVar) {
        this.f752b = f1Var;
        pVar.getClass();
        this.f753c = pVar;
        this.f751a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        y0.k(this.f752b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj, g0 g0Var) {
        this.f753c.getClass();
        a0.q.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int c(w wVar) {
        this.f752b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void d(Object obj) {
        this.f752b.getClass();
        e1 e1Var = ((w) obj).unknownFields;
        if (e1Var.f679e) {
            e1Var.f679e = false;
        }
        this.f753c.getClass();
        a0.q.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean e(Object obj) {
        this.f753c.getClass();
        a0.q.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean f(w wVar, w wVar2) {
        this.f752b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void g(Object obj, k kVar, o oVar) {
        this.f752b.getClass();
        f1.a(obj);
        this.f753c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int h(w wVar) {
        this.f752b.getClass();
        e1 e1Var = wVar.unknownFields;
        int i = e1Var.f678d;
        if (i != -1) {
            return i;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < e1Var.f675a; i9++) {
            int i10 = e1Var.f676b[i9] >>> 3;
            i8 += m.J(3, (g) e1Var.f677c[i9]) + m.M(i10) + m.L(2) + (m.L(1) * 2);
        }
        e1Var.f678d = i8;
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w i() {
        a aVar = this.f751a;
        return aVar instanceof w ? ((w) aVar).i() : ((u) ((w) aVar).c(5)).b();
    }
}
