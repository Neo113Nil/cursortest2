package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzadj {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzadj(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadj zzadjVar = (zzadj) obj;
            if (this.zza == zzadjVar.zza && this.zzc == zzadjVar.zzc && this.zzd == zzadjVar.zzd && Arrays.equals(this.zzb, zzadjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
