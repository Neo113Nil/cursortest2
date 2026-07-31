package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0089a f1478a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1479b;

    /* renamed from: c, reason: collision with root package name */
    public final C0104p f1480c;

    public O(e0 e0Var, C0104p c0104p, AbstractC0089a abstractC0089a) {
        this.f1479b = e0Var;
        c0104p.getClass();
        this.f1480c = c0104p;
        this.f1478a = abstractC0089a;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        X.k(this.f1479b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f2) {
        this.f1480c.getClass();
        L.d.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int c(AbstractC0110w abstractC0110w) {
        this.f1479b.getClass();
        return abstractC0110w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj) {
        this.f1479b.getClass();
        d0 d0Var = ((AbstractC0110w) obj).unknownFields;
        if (d0Var.f1521e) {
            d0Var.f1521e = false;
        }
        this.f1480c.getClass();
        L.d.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean e(Object obj) {
        this.f1480c.getClass();
        L.d.h(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean f(AbstractC0110w abstractC0110w, AbstractC0110w abstractC0110w2) {
        this.f1479b.getClass();
        return abstractC0110w.unknownFields.equals(abstractC0110w2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(Object obj, C0099k c0099k, C0103o c0103o) {
        this.f1479b.getClass();
        e0.a(obj);
        this.f1480c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0110w abstractC0110w) {
        this.f1479b.getClass();
        d0 d0Var = abstractC0110w.unknownFields;
        int i2 = d0Var.f1520d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d0Var.f1517a; i4++) {
            int i5 = d0Var.f1518b[i4] >>> 3;
            i3 += C0101m.T(3, (C0095g) d0Var.f1519c[i4]) + C0101m.W(i5) + C0101m.V(2) + (C0101m.V(1) * 2);
        }
        d0Var.f1520d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0110w i() {
        AbstractC0089a abstractC0089a = this.f1478a;
        return abstractC0089a instanceof AbstractC0110w ? ((AbstractC0110w) abstractC0089a).i() : ((AbstractC0108u) ((AbstractC0110w) abstractC0089a).c(5)).b();
    }
}
