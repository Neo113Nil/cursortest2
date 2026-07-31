package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;

/* loaded from: classes.dex */
public final class to2<RequestComponentT extends ea1<AdT>, AdT> implements ep2<RequestComponentT, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ep2<RequestComponentT, AdT> f12292a;

    /* renamed from: b, reason: collision with root package name */
    private RequestComponentT f12293b;

    public to2(ep2<RequestComponentT, AdT> ep2Var) {
        this.f12292a = ep2Var;
    }

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ cc3 a(fp2 fp2Var, dp2 dp2Var, Object obj) {
        return c(fp2Var, dp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized RequestComponentT g() {
        return this.f12293b;
    }

    public final synchronized cc3<AdT> c(fp2 fp2Var, dp2<RequestComponentT> dp2Var, RequestComponentT requestcomponentt) {
        this.f12293b = requestcomponentt;
        if (fp2Var.f5171a == null) {
            return ((so2) this.f12292a).c(fp2Var, dp2Var, requestcomponentt);
        }
        z71<AdT> a7 = requestcomponentt.a();
        return a7.h(a7.j(rb3.i(fp2Var.f5171a)));
    }
}
