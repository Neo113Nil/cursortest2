package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzhc {
    final /* synthetic */ zzhe zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhc(zzhe zzheVar, int i4, boolean z4, boolean z5) {
        this.zza = zzheVar;
        this.zzb = i4;
        this.zzc = z4;
        this.zzd = z5;
    }

    public final void zza(String str) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(String str, Object obj) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(String str, Object obj, Object obj2) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zza.zzu(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
