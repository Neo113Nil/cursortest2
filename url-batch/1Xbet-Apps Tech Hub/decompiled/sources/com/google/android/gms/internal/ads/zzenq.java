package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzenq implements com.google.android.gms.ads.internal.client.zza, zzdge {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzcbn.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final synchronized void zzbL() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzcbn.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final synchronized void zzs() {
    }
}
