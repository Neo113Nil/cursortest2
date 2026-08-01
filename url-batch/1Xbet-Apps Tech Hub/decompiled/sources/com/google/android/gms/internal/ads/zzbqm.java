package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbqm implements InitializationCompleteCallback {
    final /* synthetic */ zzbme zza;

    zzbqm(zzbqs zzbqsVar, zzbme zzbmeVar) {
        this.zza = zzbmeVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }
}
