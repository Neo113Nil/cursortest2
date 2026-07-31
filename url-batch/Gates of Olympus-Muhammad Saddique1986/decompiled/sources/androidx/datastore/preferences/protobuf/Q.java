package androidx.datastore.preferences.protobuf;

import B.C0014o;

/* loaded from: classes.dex */
public final class Q implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0267v f5024a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f5025b;

    /* renamed from: c, reason: collision with root package name */
    public final C0261o f5026c;

    public Q(k0 k0Var, C0261o c0261o, AbstractC0267v abstractC0267v) {
        this.f5025b = k0Var;
        c0261o.getClass();
        this.f5026c = c0261o;
        this.f5024a = abstractC0267v;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean a(Object obj) {
        this.f5026c.getClass();
        A.k.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void b(Object obj, C0014o c0014o, C0260n c0260n) {
        this.f5025b.getClass();
        k0.a(obj);
        this.f5026c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void c(Object obj, Object obj2) {
        AbstractC0246a0.B(this.f5025b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void d(Object obj, H h3) {
        this.f5026c.getClass();
        A.k.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int e(AbstractC0267v abstractC0267v) {
        this.f5025b.getClass();
        return abstractC0267v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int f(AbstractC0267v abstractC0267v) {
        this.f5025b.getClass();
        j0 j0Var = abstractC0267v.unknownFields;
        int i3 = j0Var.f5095d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < j0Var.f5092a; i5++) {
            int i6 = j0Var.f5093b[i5] >>> 3;
            i4 += C0258l.m(3, (C0253g) j0Var.f5094c[i5]) + C0258l.E(2, i6) + (C0258l.D(1) * 2);
        }
        j0Var.f5095d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final AbstractC0267v g() {
        AbstractC0267v abstractC0267v = this.f5024a;
        return abstractC0267v != null ? abstractC0267v.k() : ((AbstractC0265t) abstractC0267v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void h(Object obj) {
        this.f5025b.getClass();
        k0.b(obj);
        this.f5026c.getClass();
        A.k.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean i(AbstractC0267v abstractC0267v, Object obj) {
        this.f5025b.getClass();
        return abstractC0267v.unknownFields.equals(((AbstractC0267v) obj).unknownFields);
    }
}
