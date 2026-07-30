package com.google.android.gms.internal.ads;

import q2.C4927z0;

/* loaded from: classes2.dex */
public final class Uv extends AbstractBinderC3533lf {

    /* renamed from: n, reason: collision with root package name */
    public Rt f28189n;

    /* renamed from: u, reason: collision with root package name */
    public C2593Hm f28190u;

    /* renamed from: v, reason: collision with root package name */
    public String f28191v;

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void a(C4927z0 c4927z0) {
        C2593Hm c2593Hm = this.f28190u;
        if (this.f28189n == null || c2593Hm == null) {
            return;
        }
        String c4643n = c4927z0.b().toString();
        String str = this.f28191v;
        StringBuilder sb = new StringBuilder(String.valueOf(c4643n).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(c4643n);
        sb.append(", adUnitId: ");
        sb.append(str);
        u2.i.f(sb.toString());
        ((Hv) c2593Hm.f25416u).c(c4927z0);
        this.f28189n = null;
        this.f28190u = null;
        this.f28191v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void c() {
        C2593Hm c2593Hm = this.f28190u;
        Rt rt = this.f28189n;
        if (rt == null || c2593Hm == null) {
            return;
        }
        ((ZD) c2593Hm.f25417v).d(rt);
        this.f28189n = null;
        this.f28190u = null;
        this.f28191v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void s(int i) {
        this.f28189n = null;
        this.f28190u = null;
        this.f28191v = null;
    }
}
