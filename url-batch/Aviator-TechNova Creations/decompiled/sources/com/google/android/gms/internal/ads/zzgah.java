package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgah {
    private final String zza;
    private final long zzb;

    public zzgah() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzgah(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }
}
