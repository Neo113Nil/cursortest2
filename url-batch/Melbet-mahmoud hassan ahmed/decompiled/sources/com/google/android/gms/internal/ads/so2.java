package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;

/* loaded from: classes.dex */
public final class so2<RequestComponentT extends ea1<AdT>, AdT> implements ep2<RequestComponentT, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private RequestComponentT f11900a;

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ cc3 a(fp2 fp2Var, dp2 dp2Var, Object obj) {
        return c(fp2Var, dp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT g() {
        return this.f11900a;
    }

    public final synchronized cc3<AdT> c(fp2 fp2Var, dp2<RequestComponentT> dp2Var, RequestComponentT requestcomponentt) {
        z71<AdT> a7;
        if (requestcomponentt != null) {
            this.f11900a = requestcomponentt;
        } else {
            this.f11900a = dp2Var.a(fp2Var.f5172b).f();
        }
        a7 = this.f11900a.a();
        return a7.h(a7.i());
    }
}
