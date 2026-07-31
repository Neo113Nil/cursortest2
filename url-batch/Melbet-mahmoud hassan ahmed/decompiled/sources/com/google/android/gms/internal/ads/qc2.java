package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qc2 implements yu, pi1 {

    /* renamed from: f, reason: collision with root package name */
    private ww f10646f;

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void M() {
        ww wwVar = this.f10646f;
        if (wwVar != null) {
            try {
                wwVar.a();
            } catch (RemoteException e7) {
                io0.h("Remote Exception at onAdClicked.", e7);
            }
        }
    }

    public final synchronized void a(ww wwVar) {
        this.f10646f = wwVar;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void r() {
        ww wwVar = this.f10646f;
        if (wwVar != null) {
            try {
                wwVar.a();
            } catch (RemoteException e7) {
                io0.h("Remote Exception at onPhysicalClick.", e7);
            }
        }
    }
}
