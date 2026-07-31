package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class h72 implements pk1 {

    /* renamed from: a, reason: collision with root package name */
    private final rr2 f6097a;

    /* renamed from: b, reason: collision with root package name */
    private final cf0 f6098b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6099c;

    /* renamed from: d, reason: collision with root package name */
    private ob1 f6100d = null;

    h72(rr2 rr2Var, cf0 cf0Var, boolean z6) {
        this.f6097a = rr2Var;
        this.f6098b = cf0Var;
        this.f6099c = z6;
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final void a(boolean z6, Context context, jb1 jb1Var) {
        try {
            if (!(this.f6099c ? this.f6098b.B0(x3.b.B3(context)) : this.f6098b.N0(x3.b.B3(context)))) {
                throw new ok1("Adapter failed to show.");
            }
            if (this.f6100d == null) {
                return;
            }
            if (((Boolean) sw.c().b(m10.f8202g1)).booleanValue() || this.f6097a.V != 2) {
                return;
            }
            this.f6100d.zza();
        } catch (Throwable th) {
            throw new ok1(th);
        }
    }

    public final void b(ob1 ob1Var) {
        this.f6100d = ob1Var;
    }
}
