package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzado {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzado(int i, byte[] bArr, int i2, int i3) {
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
            zzado zzadoVar = (zzado) obj;
            if (this.zza == zzadoVar.zza && this.zzc == zzadoVar.zzc && this.zzd == zzadoVar.zzd && Arrays.equals(this.zzb, zzadoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
