package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzekx extends zzbxa {
    final /* synthetic */ zzdan zza;
    final /* synthetic */ zzcyf zzb;
    final /* synthetic */ zzczo zzc;
    final /* synthetic */ zzdgn zzd;

    zzekx(zzeky zzekyVar, zzdan zzdanVar, zzcyf zzcyfVar, zzczo zzczoVar, zzdgn zzdgnVar) {
        this.zza = zzdanVar;
        this.zzb = zzcyfVar;
        this.zzc = zzczoVar;
        this.zzd = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzbz(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzbw();
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzm(IObjectWrapper iObjectWrapper, zzbxc zzbxcVar) {
        this.zzd.zza(zzbxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
