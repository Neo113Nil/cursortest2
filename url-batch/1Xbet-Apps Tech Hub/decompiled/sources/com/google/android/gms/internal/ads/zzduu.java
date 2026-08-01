package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzduu {
    private final zzblb zza;

    zzduu(zzblb zzblbVar) {
        this.zza = zzblbVar;
    }

    private final void zzs(zzdut zzdutVar) throws RemoteException {
        String zza = zzdut.zza(zzdutVar);
        zzcbn.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdut("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdClicked";
        this.zza.zzb(zzdut.zza(zzdutVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdClosed";
        zzs(zzdutVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdFailedToLoad";
        zzdutVar.zzd = Integer.valueOf(i);
        zzs(zzdutVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdLoaded";
        zzs(zzdutVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdutVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("interstitial", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdOpened";
        zzs(zzdutVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("creation", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "nativeObjectCreated";
        zzs(zzdutVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("creation", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "nativeObjectNotCreated";
        zzs(zzdutVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdClicked";
        zzs(zzdutVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onRewardedAdClosed";
        zzs(zzdutVar);
    }

    public final void zzl(long j, zzbxg zzbxgVar) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onUserEarnedReward";
        zzdutVar.zze = zzbxgVar.zzf();
        zzdutVar.zzf = Integer.valueOf(zzbxgVar.zze());
        zzs(zzdutVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onRewardedAdFailedToLoad";
        zzdutVar.zzd = Integer.valueOf(i);
        zzs(zzdutVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onRewardedAdFailedToShow";
        zzdutVar.zzd = Integer.valueOf(i);
        zzs(zzdutVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onAdImpression";
        zzs(zzdutVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onRewardedAdLoaded";
        zzs(zzdutVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdutVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdut zzdutVar = new zzdut("rewarded", null);
        zzdutVar.zza = Long.valueOf(j);
        zzdutVar.zzc = "onRewardedAdOpened";
        zzs(zzdutVar);
    }
}
