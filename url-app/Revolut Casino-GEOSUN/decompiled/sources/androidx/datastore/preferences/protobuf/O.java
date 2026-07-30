package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0092w f1390a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1391b;

    /* renamed from: c, reason: collision with root package name */
    public final C0086p f1392c;

    public O(e0 e0Var, C0086p c0086p, AbstractC0092w abstractC0092w) {
        this.f1391b = e0Var;
        c0086p.getClass();
        this.f1392c = c0086p;
        this.f1390a = abstractC0092w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        this.f1392c.getClass();
        F0.h.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0081k c0081k, C0085o c0085o) {
        this.f1391b.getClass();
        e0.a(obj);
        this.f1392c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int c(AbstractC0092w abstractC0092w) {
        this.f1391b.getClass();
        d0 d0Var = abstractC0092w.unknownFields;
        int i2 = d0Var.f1432d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d0Var.f1429a; i4++) {
            int i5 = d0Var.f1430b[i4] >>> 3;
            i3 += C0083m.V(3, (C0077g) d0Var.f1431c[i4]) + C0083m.l0(2, i5) + (C0083m.k0(1) * 2);
        }
        d0Var.f1432d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0092w d() {
        AbstractC0092w abstractC0092w = this.f1390a;
        return abstractC0092w != null ? abstractC0092w.k() : ((AbstractC0090u) abstractC0092w.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void e(Object obj, Object obj2) {
        X.A(this.f1391b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void f(Object obj, F f2) {
        this.f1392c.getClass();
        F0.h.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(Object obj) {
        this.f1391b.getClass();
        e0.b(obj);
        this.f1392c.getClass();
        F0.h.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean h(AbstractC0092w abstractC0092w, Object obj) {
        this.f1391b.getClass();
        return abstractC0092w.unknownFields.equals(((AbstractC0092w) obj).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int i(AbstractC0092w abstractC0092w) {
        this.f1391b.getClass();
        return abstractC0092w.unknownFields.hashCode();
    }
}
