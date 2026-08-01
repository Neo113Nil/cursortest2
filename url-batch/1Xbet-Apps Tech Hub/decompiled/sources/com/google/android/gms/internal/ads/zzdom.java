package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdom extends zzbgw {
    private final String zza;
    private final zzdkf zzb;
    private final zzdkk zzc;

    public zzdom(String str, zzdkf zzdkfVar, zzdkk zzdkkVar) {
        this.zza = str;
        this.zzb = zzdkfVar;
        this.zzc = zzdkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final com.google.android.gms.ads.internal.client.zzdq zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final zzbga zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final zzbgi zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzm() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzn() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final List zzo() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
