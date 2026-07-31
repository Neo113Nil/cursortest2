package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i00 extends ey {

    /* renamed from: f, reason: collision with root package name */
    private m90 f6476f;

    @Override // com.google.android.gms.internal.ads.fy
    public final void D3(m90 m90Var) {
        this.f6476f = m90Var;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void F0(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void I5(x3.a aVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void O3(String str, x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void Q(String str) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void U4(float f7) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void Y3(qy qyVar) {
    }

    final /* synthetic */ void a() {
        m90 m90Var = this.f6476f;
        if (m90Var != null) {
            try {
                m90Var.j3(Collections.emptyList());
            } catch (RemoteException e7) {
                io0.h("Could not notify onComplete event.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final float b() {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final String d() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final List<f90> e() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void i() {
        io0.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        bo0.f3473b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.h00
            @Override // java.lang.Runnable
            public final void run() {
                i00.this.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void j1(n00 n00Var) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void l4(dd0 dd0Var) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void l5(String str) {
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final boolean q() {
        return false;
    }
}
