package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class zzes {
    final /* synthetic */ zzeu zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzes(zzeu zzeuVar, int i8, boolean z7, boolean z8) {
        this.zza = zzeuVar;
        this.zzb = i8;
        this.zzc = z7;
        this.zzd = z8;
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
