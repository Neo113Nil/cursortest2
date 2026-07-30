package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.yp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4244yp implements InterfaceC2944al {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35412n;

    /* renamed from: u, reason: collision with root package name */
    public final C2569Gf f35413u;

    public C4244yp(Context context, C2569Gf c2569Gf) {
        this.f35412n = context;
        this.f35413u = c2569Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        String str = ((Wt) c2953au.f29349b.f24454v).f28494e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2569Gf c2569Gf = this.f35413u;
        Context context = this.f35412n;
        c2569Gf.getClass();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31596Y0)).booleanValue() && c2569Gf.a(context) && C2569Gf.g(context)) {
            synchronized (c2569Gf.f25188j) {
            }
        }
        c2569Gf.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
    }
}
