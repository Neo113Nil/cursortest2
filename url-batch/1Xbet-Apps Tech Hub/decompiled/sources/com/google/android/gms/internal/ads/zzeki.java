package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzeki extends zzelj {
    private final zzdgn zza;

    public zzeki(zzcyf zzcyfVar, zzdgc zzdgcVar, zzcyz zzcyzVar, zzczo zzczoVar, zzczt zzcztVar, zzcyu zzcyuVar, zzddb zzddbVar, zzdgu zzdguVar, zzdan zzdanVar, zzdgn zzdgnVar, zzdcx zzdcxVar) {
        super(zzcyfVar, zzdgcVar, zzcyzVar, zzczoVar, zzcztVar, zzddbVar, zzdanVar, zzdguVar, zzdcxVar, zzcyuVar);
        this.zza = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelj, com.google.android.gms.internal.ads.zzbpx
    public final void zzs(zzbxc zzbxcVar) {
        this.zza.zza(zzbxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelj, com.google.android.gms.internal.ads.zzbpx
    public final void zzt(zzbxg zzbxgVar) throws RemoteException {
        this.zza.zza(new zzbxc(zzbxgVar.zzf(), zzbxgVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzelj, com.google.android.gms.internal.ads.zzbpx
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelj, com.google.android.gms.internal.ads.zzbpx
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelj, com.google.android.gms.internal.ads.zzbpx
    public final void zzy() {
        this.zza.zzc();
    }
}
