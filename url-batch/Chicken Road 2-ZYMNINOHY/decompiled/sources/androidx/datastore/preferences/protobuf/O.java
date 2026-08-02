package androidx.datastore.preferences.protobuf;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0168a f4586a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f4587b;

    /* renamed from: c, reason: collision with root package name */
    public final C0183p f4588c;

    public O(e0 e0Var, C0183p c0183p, AbstractC0168a abstractC0168a) {
        this.f4587b = e0Var;
        c0183p.getClass();
        this.f4588c = c0183p;
        this.f4586a = abstractC0168a;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        X.k(this.f4587b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f4) {
        this.f4588c.getClass();
        AbstractC0005f.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj) {
        this.f4587b.getClass();
        d0 d0Var = ((AbstractC0189w) obj).unknownFields;
        if (d0Var.f4631e) {
            d0Var.f4631e = false;
        }
        this.f4588c.getClass();
        AbstractC0005f.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean d(Object obj) {
        this.f4588c.getClass();
        AbstractC0005f.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0189w abstractC0189w) {
        this.f4587b.getClass();
        d0 d0Var = abstractC0189w.unknownFields;
        int i4 = d0Var.f4630d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < d0Var.f4627a; i6++) {
            int i7 = d0Var.f4628b[i6] >>> 3;
            i5 += C0180m.Y(3, (C0174g) d0Var.f4629c[i6]) + C0180m.b0(i7) + C0180m.a0(2) + (C0180m.a0(1) * 2);
        }
        d0Var.f4630d = i5;
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0189w abstractC0189w) {
        this.f4587b.getClass();
        return abstractC0189w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean g(AbstractC0189w abstractC0189w, AbstractC0189w abstractC0189w2) {
        this.f4587b.getClass();
        return abstractC0189w.unknownFields.equals(abstractC0189w2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj, C0178k c0178k, C0182o c0182o) {
        this.f4587b.getClass();
        e0.a(obj);
        this.f4588c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0189w newInstance() {
        AbstractC0168a abstractC0168a = this.f4586a;
        return abstractC0168a instanceof AbstractC0189w ? ((AbstractC0189w) abstractC0168a).i() : ((AbstractC0187u) ((AbstractC0189w) abstractC0168a).c(5)).b();
    }
}
