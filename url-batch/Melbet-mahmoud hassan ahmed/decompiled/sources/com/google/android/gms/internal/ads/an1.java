package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class an1 {

    /* renamed from: a, reason: collision with root package name */
    l50 f2872a;

    /* renamed from: b, reason: collision with root package name */
    i50 f2873b;

    /* renamed from: c, reason: collision with root package name */
    y50 f2874c;

    /* renamed from: d, reason: collision with root package name */
    v50 f2875d;

    /* renamed from: e, reason: collision with root package name */
    ba0 f2876e;

    /* renamed from: f, reason: collision with root package name */
    final h.e<String, r50> f2877f = new h.e<>();

    /* renamed from: g, reason: collision with root package name */
    final h.e<String, o50> f2878g = new h.e<>();

    public final an1 a(i50 i50Var) {
        this.f2873b = i50Var;
        return this;
    }

    public final an1 b(l50 l50Var) {
        this.f2872a = l50Var;
        return this;
    }

    public final an1 c(String str, r50 r50Var, o50 o50Var) {
        this.f2877f.put(str, r50Var);
        if (o50Var != null) {
            this.f2878g.put(str, o50Var);
        }
        return this;
    }

    public final an1 d(ba0 ba0Var) {
        this.f2876e = ba0Var;
        return this;
    }

    public final an1 e(v50 v50Var) {
        this.f2875d = v50Var;
        return this;
    }

    public final an1 f(y50 y50Var) {
        this.f2874c = y50Var;
        return this;
    }

    public final cn1 g() {
        return new cn1(this);
    }
}
