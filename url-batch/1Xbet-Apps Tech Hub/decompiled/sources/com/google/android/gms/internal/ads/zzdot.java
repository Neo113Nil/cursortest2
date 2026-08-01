package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdot extends zzbie {
    private final String zza;
    private final zzdkf zzb;
    private final zzdkk zzc;
    private final zzdtp zzd;

    public zzdot(String str, zzdkf zzdkfVar, zzdkk zzdkkVar, zzdtp zzdtpVar) {
        this.zza = str;
        this.zzb = zzdkfVar;
        this.zzc = zzdkkVar;
        this.zzd = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzA() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzC() {
        this.zzb.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzN(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            zzcbn.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzO(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzF(zzbic zzbicVar) throws RemoteException {
        this.zzb.zzP(zzbicVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzG() {
        return this.zzb.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzH() throws RemoteException {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgM)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbga zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbgf zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final zzbgi zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final List zzv() throws RemoteException {
        return zzH() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzw() throws RemoteException {
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzB(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }
}
