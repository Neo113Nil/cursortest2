package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzapn {
    public final Object zza;
    public final zzaoq zzb;
    public final zzapq zzc;
    public boolean zzd;

    private zzapn(zzapq zzapqVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapqVar;
    }

    private zzapn(Object obj, zzaoq zzaoqVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaoqVar;
        this.zzc = null;
    }

    public static zzapn zza(Object obj, zzaoq zzaoqVar) {
        return new zzapn(obj, zzaoqVar);
    }

    public static zzapn zzb(zzapq zzapqVar) {
        return new zzapn(zzapqVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
