package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzzj implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzzj(zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzmn.zzaa(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzj zzzjVar) {
        return zzgts.zzg().zzd(this.zzb, zzzjVar.zzb).zzd(this.zza, zzzjVar.zza).zze();
    }
}
