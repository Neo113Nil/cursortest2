package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcvl implements zzczv, com.google.android.gms.ads.internal.client.zza, zzdbc, zzczb, zzcyh, zzddo {
    private final Clock zza;
    private final zzcap zzb;

    public zzcvl(Clock clock, zzcap zzcapVar) {
        this.zza = clock;
        this.zzb = zzcapVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzbx(zzbwq zzbwqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzi(zzazk zzazkVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzj(zzazk zzazkVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzl(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzm(zzazk zzazkVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        this.zzb.zzh(true);
    }
}
