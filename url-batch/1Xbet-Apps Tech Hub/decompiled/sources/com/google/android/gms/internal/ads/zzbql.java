package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbql implements MediationAdLoadCallback {
    final /* synthetic */ zzbpx zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbqs zzc;

    zzbql(zzbqs zzbqsVar, zzbpx zzbpxVar, Adapter adapter) {
        this.zzc = zzbqsVar;
        this.zza = zzbpxVar;
        this.zzb = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            zzcbn.zze(this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
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
            this.zzc.zzi = (MediationInterscrollerAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
        return new zzbqi(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
