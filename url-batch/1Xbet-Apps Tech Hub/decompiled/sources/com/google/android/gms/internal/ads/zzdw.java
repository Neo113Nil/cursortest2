package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdw {
    public static final zzdw zza = new zzdw(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdw(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzfs.zzG(i3) ? zzfs.zzl(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        return this.zzb == zzdwVar.zzb && this.zzc == zzdwVar.zzc && this.zzd == zzdwVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}
