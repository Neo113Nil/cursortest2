package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzemq extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzenx zza;

    public zzemq(Context context, zzciq zzciqVar, zzfeo zzfeoVar, zzdkv zzdkvVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzenz zzenzVar = new zzenz(zzdkvVar, zzciqVar.zzy());
        zzenzVar.zze(zzbhVar);
        this.zza = new zzenx(new zzeoj(zzciqVar, context, zzenzVar, zzfeoVar), zzfeoVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zza.zzd(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
