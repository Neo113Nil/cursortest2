package androidx.datastore.preferences.protobuf;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0155w f2248a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2249b;

    /* renamed from: c, reason: collision with root package name */
    public final C0149p f2250c;

    public O(e0 e0Var, C0149p c0149p, AbstractC0155w abstractC0155w) {
        this.f2249b = e0Var;
        c0149p.getClass();
        this.f2250c = c0149p;
        this.f2248a = abstractC0155w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        X.k(this.f2249b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f) {
        this.f2250c.getClass();
        AbstractC0033i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int c(AbstractC0155w abstractC0155w) {
        this.f2249b.getClass();
        return abstractC0155w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj) {
        this.f2249b.getClass();
        d0 d0Var = ((AbstractC0155w) obj).unknownFields;
        if (d0Var.f2291e) {
            d0Var.f2291e = false;
        }
        this.f2250c.getClass();
        AbstractC0033i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean e(Object obj) {
        this.f2250c.getClass();
        AbstractC0033i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean f(AbstractC0155w abstractC0155w, AbstractC0155w abstractC0155w2) {
        this.f2249b.getClass();
        return abstractC0155w.unknownFields.equals(abstractC0155w2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(Object obj, C0144k c0144k, C0148o c0148o) {
        this.f2249b.getClass();
        e0.a(obj);
        this.f2250c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0155w abstractC0155w) {
        this.f2249b.getClass();
        d0 d0Var = abstractC0155w.unknownFields;
        int i3 = d0Var.f2290d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < d0Var.f2287a; i5++) {
            int i6 = d0Var.f2288b[i5] >>> 3;
            i4 += C0146m.V(3, (C0140g) d0Var.f2289c[i5]) + C0146m.Y(i6) + C0146m.X(2) + (C0146m.X(1) * 2);
        }
        d0Var.f2290d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0155w newInstance() {
        AbstractC0155w abstractC0155w = this.f2248a;
        return abstractC0155w != null ? abstractC0155w.i() : ((AbstractC0153u) abstractC0155w.c(5)).b();
    }
}
