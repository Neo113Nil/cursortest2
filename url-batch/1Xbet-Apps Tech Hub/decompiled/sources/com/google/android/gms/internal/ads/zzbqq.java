package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbqq implements MediationAdLoadCallback {
    final /* synthetic */ zzbpx zza;
    final /* synthetic */ zzbqs zzb;

    zzbqq(zzbqs zzbqsVar, zzbpx zzbpxVar) {
        this.zzb = zzbqsVar;
        this.zza = zzbpxVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcbn.zze(obj.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzh = (MediationRewardedAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
        return new zzbxz(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcbn.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }
}
