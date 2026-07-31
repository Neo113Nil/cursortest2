package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class ya0 implements t70<ob0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mb0 f14594a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ha0 f14595b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nb0 f14596c;

    ya0(nb0 nb0Var, mb0 mb0Var, ha0 ha0Var) {
        this.f14596c = nb0Var;
        this.f14594a = mb0Var;
        this.f14595b = ha0Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(ob0 ob0Var, Map map) {
        Object obj;
        obj = this.f14596c.f9012a;
        synchronized (obj) {
            if (this.f14594a.a() != -1 && this.f14594a.a() != 1) {
                this.f14596c.f9019h = 0;
                ha0 ha0Var = this.f14595b;
                ha0Var.X("/log", s70.f11699g);
                ha0Var.X("/result", s70.f11707o);
                this.f14594a.d(this.f14595b);
                this.f14596c.f9018g = this.f14594a;
                a3.r1.k("Successfully loaded JS Engine.");
            }
        }
    }
}
