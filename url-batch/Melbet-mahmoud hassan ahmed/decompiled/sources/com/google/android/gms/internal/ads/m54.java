package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class m54 extends h54 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8425f = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f8426d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f8427e;

    private m54(ei0 ei0Var, Object obj, Object obj2) {
        super(ei0Var);
        this.f8426d = obj;
        this.f8427e = obj2;
    }

    public static m54 q(zo zoVar) {
        return new m54(new n54(zoVar), hh0.f6244o, f8425f);
    }

    public static m54 r(ei0 ei0Var, Object obj, Object obj2) {
        return new m54(ei0Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.h54, com.google.android.gms.internal.ads.ei0
    public final int a(Object obj) {
        Object obj2;
        ei0 ei0Var = this.f6081c;
        if (f8425f.equals(obj) && (obj2 = this.f8427e) != null) {
            obj = obj2;
        }
        return ei0Var.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final pf0 d(int i7, pf0 pf0Var, boolean z6) {
        this.f6081c.d(i7, pf0Var, z6);
        if (n13.p(pf0Var.f10217b, this.f8427e) && z6) {
            pf0Var.f10217b = f8425f;
        }
        return pf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final hh0 e(int i7, hh0 hh0Var, long j7) {
        this.f6081c.e(i7, hh0Var, j7);
        if (n13.p(hh0Var.f6248a, this.f8426d)) {
            hh0Var.f6248a = hh0.f6244o;
        }
        return hh0Var;
    }

    @Override // com.google.android.gms.internal.ads.h54, com.google.android.gms.internal.ads.ei0
    public final Object f(int i7) {
        Object f7 = this.f6081c.f(i7);
        return n13.p(f7, this.f8427e) ? f8425f : f7;
    }

    public final m54 p(ei0 ei0Var) {
        return new m54(ei0Var, this.f8426d, this.f8427e);
    }
}
