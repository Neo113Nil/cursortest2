package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class k00 extends ek0 {
    private static void t6(final nk0 nk0Var) {
        io0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        bo0.f3473b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.j00
            @Override // java.lang.Runnable
            public final void run() {
                nk0 nk0Var2 = nk0.this;
                if (nk0Var2 != null) {
                    try {
                        nk0Var2.D(1);
                    } catch (RemoteException e7) {
                        io0.i("#007 Could not call remote method.", e7);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void G4(kv kvVar, nk0 nk0Var) {
        t6(nk0Var);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void O5(wy wyVar) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void X1(uk0 uk0Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void X3(ty tyVar) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final Bundle a() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void a3(kv kvVar, nk0 nk0Var) {
        t6(nk0Var);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final String b() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final zy c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final ck0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void k0(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void m6(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void n5(jk0 jk0Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void q4(ok0 ok0Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void t1(x3.a aVar, boolean z6) {
    }
}
