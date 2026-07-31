package androidx.datastore.preferences.protobuf;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class Q implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0211v f3823a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f3824b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205o f3825c;

    public Q(k0 k0Var, C0205o c0205o, AbstractC0211v abstractC0211v) {
        this.f3824b = k0Var;
        c0205o.getClass();
        this.f3825c = c0205o;
        this.f3823a = abstractC0211v;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean a(Object obj) {
        this.f3825c.getClass();
        AbstractC0080b.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void b(Object obj, Object obj2) {
        AbstractC0190a0.B(this.f3824b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void c(Object obj, H h3) {
        this.f3825c.getClass();
        AbstractC0080b.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int d(AbstractC0211v abstractC0211v) {
        this.f3824b.getClass();
        return abstractC0211v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void e(Object obj, J.D d3, C0204n c0204n) {
        this.f3824b.getClass();
        k0.a(obj);
        this.f3825c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int f(AbstractC0211v abstractC0211v) {
        this.f3824b.getClass();
        j0 j0Var = abstractC0211v.unknownFields;
        int i3 = j0Var.f3894d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < j0Var.f3891a; i5++) {
            int i6 = j0Var.f3892b[i5] >>> 3;
            i4 += C0202l.m(3, (C0197g) j0Var.f3893c[i5]) + C0202l.E(2, i6) + (C0202l.D(1) * 2);
        }
        j0Var.f3894d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final AbstractC0211v g() {
        AbstractC0211v abstractC0211v = this.f3823a;
        return abstractC0211v != null ? abstractC0211v.k() : ((AbstractC0209t) abstractC0211v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void h(Object obj) {
        this.f3824b.getClass();
        k0.b(obj);
        this.f3825c.getClass();
        AbstractC0080b.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean i(AbstractC0211v abstractC0211v, Object obj) {
        this.f3824b.getClass();
        return abstractC0211v.unknownFields.equals(((AbstractC0211v) obj).unknownFields);
    }
}
