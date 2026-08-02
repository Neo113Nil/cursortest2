package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdtp {
    private final zzbjw zza;

    zzdtp(zzbjw zzbjwVar) {
        this.zza = zzbjwVar;
    }

    private final void zzs(zzdto zzdtoVar) throws RemoteException {
        String zza = zzdto.zza(zzdtoVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdto("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdClicked";
        this.zza.zzb(zzdto.zza(zzdtoVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdClosed";
        zzs(zzdtoVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdFailedToLoad";
        zzdtoVar.zzd = Integer.valueOf(i);
        zzs(zzdtoVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdLoaded";
        zzs(zzdtoVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtoVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdOpened";
        zzs(zzdtoVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("creation", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "nativeObjectCreated";
        zzs(zzdtoVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("creation", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtoVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdClicked";
        zzs(zzdtoVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onRewardedAdClosed";
        zzs(zzdtoVar);
    }

    public final void zzl(long j, zzbwd zzbwdVar) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onUserEarnedReward";
        zzdtoVar.zze = zzbwdVar.zzf();
        zzdtoVar.zzf = Integer.valueOf(zzbwdVar.zze());
        zzs(zzdtoVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onRewardedAdFailedToLoad";
        zzdtoVar.zzd = Integer.valueOf(i);
        zzs(zzdtoVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onRewardedAdFailedToShow";
        zzdtoVar.zzd = Integer.valueOf(i);
        zzs(zzdtoVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onAdImpression";
        zzs(zzdtoVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtoVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtoVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j);
        zzdtoVar.zzc = "onRewardedAdOpened";
        zzs(zzdtoVar);
    }
}
