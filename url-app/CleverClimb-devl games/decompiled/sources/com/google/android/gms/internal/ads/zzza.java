package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.a;

/* loaded from: classes2.dex */
final class zzza implements Runnable {
    private final /* synthetic */ zzyq zzbvd;
    private final /* synthetic */ a.EnumC0366a zzbve;

    zzza(zzyq zzyqVar, a.EnumC0366a enumC0366a) {
        this.zzbvd = zzyqVar;
        this.zzbve = enumC0366a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxt zzxtVar;
        try {
            zzxtVar = this.zzbvd.zzbuu;
            zzxtVar.onAdFailedToLoad(zzzc.zza(this.zzbve));
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
