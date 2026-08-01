package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfdj implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzfdl zzb;

    zzfdj(zzfdl zzfdlVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzfdlVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdpy zzdpyVar;
        zzdpyVar = this.zzb.zzi;
        if (zzdpyVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzcbn.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
