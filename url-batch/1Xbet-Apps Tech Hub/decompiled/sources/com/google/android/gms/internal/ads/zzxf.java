package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzxf implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(zzam zzamVar, int i) {
        this.zza = 1 == (zzamVar.zze & 1);
        this.zzb = zzxw.zzn(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxf zzxfVar) {
        return zzfwj.zzj().zzd(this.zzb, zzxfVar.zzb).zzd(this.zza, zzxfVar.zza).zza();
    }
}
