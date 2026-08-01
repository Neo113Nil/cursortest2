package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzwe extends zzda {
    private static final Object zzc = new Object();
    private static final zzbs zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbs zzh;
    private final zzbi zzi;

    static {
        zzau zzauVar = new zzau();
        zzauVar.zza("SinglePeriodTimeline");
        zzauVar.zzb(Uri.EMPTY);
        zzd = zzauVar.zzc();
    }

    public zzwe(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzbs zzbsVar, zzbi zzbiVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        zzbsVar.getClass();
        this.zzh = zzbsVar;
        this.zzi = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcx zzd(int i, zzcx zzcxVar, boolean z) {
        zzef.zza(i, 0, 1);
        zzcxVar.zzl(null, z ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcz zze(int i, zzcz zzczVar, long j) {
        zzef.zza(i, 0, 1);
        Object obj = zzcz.zza;
        zzbs zzbsVar = this.zzh;
        long j2 = this.zzf;
        zzczVar.zza(obj, zzbsVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, j2, 0, 0, 0L);
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final Object zzf(int i) {
        zzef.zza(i, 0, 1);
        return zzc;
    }
}
