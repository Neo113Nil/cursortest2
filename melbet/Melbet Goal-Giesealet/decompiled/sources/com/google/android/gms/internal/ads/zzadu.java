package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzadu implements zzadv {
    private final long zza;
    private final zzadt zzb;

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        return this.zzb;
    }

    public zzadu(long j, long j2) {
        this.zza = j;
        zzadw zzadwVar = j2 == 0 ? zzadw.zza : new zzadw(0L, j2);
        this.zzb = new zzadt(zzadwVar, zzadwVar);
    }
}
