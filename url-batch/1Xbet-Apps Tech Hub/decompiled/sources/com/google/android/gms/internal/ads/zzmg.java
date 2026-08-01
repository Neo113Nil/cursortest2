package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzmg implements zzlb {
    private final zzeg zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzcj zze = zzcj.zza;

    public zzmg(zzeg zzegVar) {
        this.zza = zzegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzcj zzcjVar = this.zze;
        return j + (zzcjVar.zzc == 1.0f ? zzfs.zzq(elapsedRealtime) : zzcjVar.zza(elapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzcj zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzcj zzcjVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzcjVar;
    }
}
