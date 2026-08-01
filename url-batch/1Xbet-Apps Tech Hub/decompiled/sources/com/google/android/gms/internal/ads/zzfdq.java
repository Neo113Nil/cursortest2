package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfdq implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfdr zzb;

    zzfdq(zzfdr zzfdrVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zzb = zzfdrVar;
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdpy zzdpyVar;
        zzdpyVar = this.zzb.zzd;
        if (zzdpyVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcbn.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
