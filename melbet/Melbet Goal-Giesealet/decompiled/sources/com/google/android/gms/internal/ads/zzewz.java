package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzewz implements zzhpx {
    private final zzewu zza;

    private zzewz(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewz zzc(zzewu zzewuVar) {
        return new zzewz(zzewuVar);
    }

    public static String zzd(zzewu zzewuVar) {
        String zze = zzewuVar.zze();
        zzhqf.zzb(zze);
        return zze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
