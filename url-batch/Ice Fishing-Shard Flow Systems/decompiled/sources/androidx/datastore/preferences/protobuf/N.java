package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class N implements V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0185a f3449a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f3450b;

    /* renamed from: c, reason: collision with root package name */
    public final C0199o f3451c;

    public N(d0 d0Var, C0199o c0199o, AbstractC0185a abstractC0185a) {
        this.f3450b = d0Var;
        c0199o.getClass();
        this.f3451c = c0199o;
        this.f3449a = abstractC0185a;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        W.k(this.f3450b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e7) {
        this.f3451c.getClass();
        C4.p.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int c(AbstractC0205v abstractC0205v) {
        this.f3450b.getClass();
        return abstractC0205v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f3450b.getClass();
        c0 c0Var = ((AbstractC0205v) obj).unknownFields;
        if (c0Var.f3490e) {
            c0Var.f3490e = false;
        }
        this.f3451c.getClass();
        C4.p.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(Object obj) {
        this.f3451c.getClass();
        C4.p.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean f(AbstractC0205v abstractC0205v, AbstractC0205v abstractC0205v2) {
        this.f3450b.getClass();
        return abstractC0205v.unknownFields.equals(abstractC0205v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(Object obj, C0194j c0194j, C0198n c0198n) {
        this.f3450b.getClass();
        d0.a(obj);
        this.f3451c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0205v abstractC0205v) {
        this.f3450b.getClass();
        c0 c0Var = abstractC0205v.unknownFields;
        int i2 = c0Var.f3489d;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i7 = 0; i7 < c0Var.f3486a; i7++) {
            int i8 = c0Var.f3487b[i7] >>> 3;
            i5 += C0196l.Y(3, (C0191g) c0Var.f3488c[i7]) + C0196l.b0(i8) + C0196l.a0(2) + (C0196l.a0(1) * 2);
        }
        c0Var.f3489d = i5;
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0205v i() {
        AbstractC0185a abstractC0185a = this.f3449a;
        return abstractC0185a instanceof AbstractC0205v ? ((AbstractC0205v) abstractC0185a).i() : ((AbstractC0203t) ((AbstractC0205v) abstractC0185a).c(5)).b();
    }
}
