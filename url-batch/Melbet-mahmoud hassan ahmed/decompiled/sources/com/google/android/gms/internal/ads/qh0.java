package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class qh0 extends xm0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h3.c f10682f;

    qh0(rh0 rh0Var, h3.c cVar) {
        this.f10682f = cVar;
    }

    @Override // com.google.android.gms.internal.ads.ym0
    public final void b3(String str, String str2, Bundle bundle) {
        this.f10682f.b(new h3.b(new xz(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.ym0
    public final void s(String str) {
        this.f10682f.a(str);
    }
}
