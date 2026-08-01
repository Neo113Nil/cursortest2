package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbxs extends RewardedAd {
    private final String zza;
    private final zzbxj zzb;
    private final Context zzc;
    private final zzbyb zzd = new zzbyb();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbxs(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzq(context, str, new zzbpo());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                return zzbxjVar.zzb();
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar = null;
        try {
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzdnVar = zzbxjVar.zzc();
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzbxj zzbxjVar = this.zzb;
            zzbxg zzd = zzbxjVar != null ? zzbxjVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzbxt(zzd);
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzbxjVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzbxjVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzbxjVar.zzj(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbxj zzbxjVar = this.zzb;
                if (zzbxjVar != null) {
                    zzbxjVar.zzl(new zzbxx(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzcbn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcbn.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzbxjVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbxj zzbxjVar = this.zzb;
            if (zzbxjVar != null) {
                zzbxjVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdxVar), new zzbxw(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        }
    }
}
