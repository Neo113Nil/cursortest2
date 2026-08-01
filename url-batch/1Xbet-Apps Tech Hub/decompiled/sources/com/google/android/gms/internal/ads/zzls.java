package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzls {
    private static final zzuk zzt = new zzuk(new Object(), -1);
    public final zzda zza;
    public final zzuk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzit zzf;
    public final boolean zzg;
    public final zzwl zzh;
    public final zzyf zzi;
    public final List zzj;
    public final zzuk zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcj zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzls(zzda zzdaVar, zzuk zzukVar, long j, long j2, int i, zzit zzitVar, boolean z, zzwl zzwlVar, zzyf zzyfVar, List list, zzuk zzukVar2, boolean z2, int i2, zzcj zzcjVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzdaVar;
        this.zzb = zzukVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzitVar;
        this.zzg = z;
        this.zzh = zzwlVar;
        this.zzi = zzyfVar;
        this.zzj = list;
        this.zzk = zzukVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzcjVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
    }

    public static zzls zzg(zzyf zzyfVar) {
        zzda zzdaVar = zzda.zza;
        zzuk zzukVar = zzt;
        return new zzls(zzdaVar, zzukVar, -9223372036854775807L, 0L, 1, null, false, zzwl.zza, zzyfVar, zzfwu.zzl(), zzukVar, false, 0, zzcj.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzuk zzh() {
        return zzt;
    }

    public final zzls zza(zzuk zzukVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzukVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzls zzb(zzuk zzukVar, long j, long j2, long j3, long j4, zzwl zzwlVar, zzyf zzyfVar, List list) {
        zzuk zzukVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        zzcj zzcjVar = this.zzn;
        long j5 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzls(this.zza, zzukVar, j2, j3, this.zze, this.zzf, this.zzg, zzwlVar, zzyfVar, list, zzukVar2, z, i, zzcjVar, j5, j4, j, elapsedRealtime, false);
    }

    public final zzls zzc(boolean z, int i) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzls zzd(zzit zzitVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzitVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzls zze(int i) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzls zzf(zzda zzdaVar) {
        return new zzls(zzdaVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
