package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzang {
    public final Object zza;
    public final zzamj zzb;
    public final zzanj zzc;
    public boolean zzd;

    private zzang(zzanj zzanjVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzanjVar;
    }

    private zzang(Object obj, zzamj zzamjVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzamjVar;
        this.zzc = null;
    }

    public static zzang zza(zzanj zzanjVar) {
        return new zzang(zzanjVar);
    }

    public static zzang zzb(Object obj, zzamj zzamjVar) {
        return new zzang(obj, zzamjVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
