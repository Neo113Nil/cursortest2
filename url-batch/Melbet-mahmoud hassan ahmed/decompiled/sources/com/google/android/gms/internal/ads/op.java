package com.google.android.gms.internal.ads;

import t2.a;

/* loaded from: classes.dex */
public final class op extends vp {

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0140a f9761f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9762g;

    public op(a.AbstractC0140a abstractC0140a, String str) {
        this.f9761f = abstractC0140a;
        this.f9762g = str;
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void F(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void Q1(tp tpVar) {
        if (this.f9761f != null) {
            this.f9761f.e(new pp(tpVar, this.f9762g));
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void q6(cv cvVar) {
        if (this.f9761f != null) {
            this.f9761f.c(cvVar.g());
        }
    }
}
