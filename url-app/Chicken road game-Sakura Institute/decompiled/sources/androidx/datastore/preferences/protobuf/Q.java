package androidx.datastore.preferences.protobuf;

import A.C0020p;

/* loaded from: classes.dex */
public final class Q implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0456v f5298a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f5299b;

    /* renamed from: c, reason: collision with root package name */
    public final C0450o f5300c;

    public Q(k0 k0Var, C0450o c0450o, AbstractC0456v abstractC0456v) {
        this.f5299b = k0Var;
        c0450o.getClass();
        this.f5300c = c0450o;
        this.f5298a = abstractC0456v;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean a(Object obj) {
        this.f5300c.getClass();
        r0.B.c(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void b(Object obj, Object obj2) {
        AbstractC0435a0.B(this.f5299b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void c(Object obj, H h4) {
        this.f5300c.getClass();
        r0.B.c(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int d(AbstractC0456v abstractC0456v) {
        this.f5299b.getClass();
        return abstractC0456v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void e(Object obj, C0020p c0020p, C0449n c0449n) {
        this.f5299b.getClass();
        k0.a(obj);
        this.f5300c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int f(AbstractC0456v abstractC0456v) {
        this.f5299b.getClass();
        j0 j0Var = abstractC0456v.unknownFields;
        int i2 = j0Var.f5369d;
        if (i2 != -1) {
            return i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < j0Var.f5366a; i5++) {
            int i6 = j0Var.f5367b[i5] >>> 3;
            i4 += C0447l.m(3, (C0442g) j0Var.f5368c[i5]) + C0447l.E(2, i6) + (C0447l.D(1) * 2);
        }
        j0Var.f5369d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final AbstractC0456v g() {
        AbstractC0456v abstractC0456v = this.f5298a;
        return abstractC0456v != null ? abstractC0456v.k() : ((AbstractC0454t) abstractC0456v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void h(Object obj) {
        this.f5299b.getClass();
        k0.b(obj);
        this.f5300c.getClass();
        r0.B.c(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean i(AbstractC0456v abstractC0456v, Object obj) {
        this.f5299b.getClass();
        return abstractC0456v.unknownFields.equals(((AbstractC0456v) obj).unknownFields);
    }
}
