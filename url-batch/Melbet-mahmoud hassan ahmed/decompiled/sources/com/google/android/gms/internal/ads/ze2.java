package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ze2 implements ij2 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f15090g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f15091a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15092b;

    /* renamed from: c, reason: collision with root package name */
    private final k81 f15093c;

    /* renamed from: d, reason: collision with root package name */
    private final jt2 f15094d;

    /* renamed from: e, reason: collision with root package name */
    private final ks2 f15095e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.t1 f15096f = y2.t.p().h();

    public ze2(String str, String str2, k81 k81Var, jt2 jt2Var, ks2 ks2Var) {
        this.f15091a = str;
        this.f15092b = str2;
        this.f15093c = k81Var;
        this.f15094d = jt2Var;
        this.f15095e = ks2Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3 a() {
        final Bundle bundle = new Bundle();
        if (((Boolean) sw.c().b(m10.Z3)).booleanValue()) {
            this.f15093c.c(this.f15095e.f7618d);
            bundle.putAll(this.f15094d.a());
        }
        return rb3.i(new hj2() { // from class: com.google.android.gms.internal.ads.ye2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Object obj) {
                ze2.this.b(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void b(Bundle bundle, Bundle bundle2) {
        if (((Boolean) sw.c().b(m10.Z3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) sw.c().b(m10.Y3)).booleanValue()) {
                synchronized (f15090g) {
                    this.f15093c.c(this.f15095e.f7618d);
                    bundle2.putBundle("quality_signals", this.f15094d.a());
                }
            } else {
                this.f15093c.c(this.f15095e.f7618d);
                bundle2.putBundle("quality_signals", this.f15094d.a());
            }
        }
        bundle2.putString("seq_num", this.f15091a);
        bundle2.putString("session_id", this.f15096f.K() ? "" : this.f15092b);
    }
}
