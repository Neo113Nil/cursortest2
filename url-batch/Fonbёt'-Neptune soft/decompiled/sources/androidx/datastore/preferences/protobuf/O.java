package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0159w f1638a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1639b;

    /* renamed from: c, reason: collision with root package name */
    public final C0153p f1640c;

    public O(e0 e0Var, C0153p c0153p, AbstractC0159w abstractC0159w) {
        this.f1639b = e0Var;
        c0153p.getClass();
        this.f1640c = c0153p;
        this.f1638a = abstractC0159w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        this.f1640c.getClass();
        A0.b.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0148k c0148k, C0152o c0152o) {
        this.f1639b.getClass();
        e0.a(obj);
        this.f1640c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, Object obj2) {
        X.A(this.f1639b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, F f2) {
        this.f1640c.getClass();
        A0.b.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0159w abstractC0159w) {
        this.f1639b.getClass();
        return abstractC0159w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0159w abstractC0159w) {
        this.f1639b.getClass();
        d0 d0Var = abstractC0159w.unknownFields;
        int i2 = d0Var.f1680d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d0Var.f1677a; i4++) {
            int i5 = d0Var.f1678b[i4] >>> 3;
            C0144g c0144g = (C0144g) d0Var.f1679c[i4];
            i3 += C0150m.Y(3, c0144g) + C0150m.o0(2, i5) + (C0150m.n0(1) * 2);
        }
        d0Var.f1680d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0159w g() {
        AbstractC0159w abstractC0159w = this.f1638a;
        return abstractC0159w instanceof AbstractC0159w ? abstractC0159w.k() : ((AbstractC0157u) abstractC0159w.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj) {
        this.f1639b.getClass();
        e0.b(obj);
        this.f1640c.getClass();
        A0.b.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean i(AbstractC0159w abstractC0159w, Object obj) {
        this.f1639b.getClass();
        return abstractC0159w.unknownFields.equals(((AbstractC0159w) obj).unknownFields);
    }
}
