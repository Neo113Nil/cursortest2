package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcwz implements zzikg {
    private final zzcwv zza;

    private zzcwz(zzcwv zzcwvVar) {
        this.zza = zzcwvVar;
    }

    public static zzcwz zzc(zzcwv zzcwvVar) {
        return new zzcwz(zzcwvVar);
    }

    public static zzfjc zzd(zzcwv zzcwvVar) {
        zzfjc zza = zzcwvVar.zza();
        zziko.zzb(zza);
        return zza;
    }

    public final zzfjc zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
