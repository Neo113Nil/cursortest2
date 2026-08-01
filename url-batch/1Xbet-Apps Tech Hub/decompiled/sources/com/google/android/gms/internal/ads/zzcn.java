package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcn {
    private final zzah zzd;
    public static final zzcn zza = new zzcl().zze();
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzck
    };

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcn) {
            return this.zzd.equals(((zzcn) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }
}
