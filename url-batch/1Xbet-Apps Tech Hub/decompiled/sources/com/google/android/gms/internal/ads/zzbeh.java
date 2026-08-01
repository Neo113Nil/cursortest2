package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public class zzbeh {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbeh(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbeh zza(String str, double d) {
        return new zzbeh(str, Double.valueOf(d), 3);
    }

    public static zzbeh zzb(String str, long j) {
        return new zzbeh(str, Long.valueOf(j), 2);
    }

    public static zzbeh zzc(String str, String str2) {
        return new zzbeh(str, str2, 4);
    }

    public static zzbeh zzd(String str, boolean z) {
        return new zzbeh(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbfl zza = zzbfn.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbfn.zzb() != null) {
            zzbfn.zzb().zza();
        }
        return this.zzb;
    }
}
