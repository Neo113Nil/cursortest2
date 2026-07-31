package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ks0 extends a3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final tq0 f7611c;

    /* renamed from: d, reason: collision with root package name */
    final ts0 f7612d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7613e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f7614f;

    ks0(tq0 tq0Var, ts0 ts0Var, String str, String[] strArr) {
        this.f7611c = tq0Var;
        this.f7612d = ts0Var;
        this.f7613e = str;
        this.f7614f = strArr;
        y2.t.z().j(this);
    }

    @Override // a3.b0
    public final void a() {
        try {
            this.f7612d.u(this.f7613e, this.f7614f);
        } finally {
            a3.g2.f72i.post(new js0(this));
        }
    }

    @Override // a3.b0
    public final cc3<?> b() {
        return (((Boolean) sw.c().b(m10.f8313u1)).booleanValue() && (this.f7612d instanceof ct0)) ? wo0.f13898e.E(new Callable() { // from class: com.google.android.gms.internal.ads.is0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ks0.this.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.f7612d.v(this.f7613e, this.f7614f, this));
    }

    public final String e() {
        return this.f7613e;
    }
}
