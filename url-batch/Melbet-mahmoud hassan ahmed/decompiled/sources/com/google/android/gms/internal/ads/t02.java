package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class t02 extends qi0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ u02 f12025f;

    protected t02(u02 u02Var) {
        this.f12025f = u02Var;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void U0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12025f.f12533a.e(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void z1(a3.f0 f0Var) {
        this.f12025f.f12533a.f(new a3.e0(f0Var.f62f, f0Var.f63g));
    }
}
