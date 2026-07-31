package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class k63 extends y53 {

    /* renamed from: f, reason: collision with root package name */
    private final Object f7398f;

    /* renamed from: g, reason: collision with root package name */
    private int f7399g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n63 f7400h;

    k63(n63 n63Var, int i7) {
        this.f7400h = n63Var;
        this.f7398f = n63.j(n63Var, i7);
        this.f7399g = i7;
    }

    private final void a() {
        int z6;
        int i7 = this.f7399g;
        if (i7 == -1 || i7 >= this.f7400h.size() || !m43.a(this.f7398f, n63.j(this.f7400h, this.f7399g))) {
            z6 = this.f7400h.z(this.f7398f);
            this.f7399g = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.y53, java.util.Map.Entry
    public final Object getKey() {
        return this.f7398f;
    }

    @Override // com.google.android.gms.internal.ads.y53, java.util.Map.Entry
    public final Object getValue() {
        Map o7 = this.f7400h.o();
        if (o7 != null) {
            return o7.get(this.f7398f);
        }
        a();
        int i7 = this.f7399g;
        if (i7 == -1) {
            return null;
        }
        return n63.m(this.f7400h, i7);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map o7 = this.f7400h.o();
        if (o7 != null) {
            return o7.put(this.f7398f, obj);
        }
        a();
        int i7 = this.f7399g;
        if (i7 == -1) {
            this.f7400h.put(this.f7398f, obj);
            return null;
        }
        Object m7 = n63.m(this.f7400h, i7);
        n63.q(this.f7400h, this.f7399g, obj);
        return m7;
    }
}
