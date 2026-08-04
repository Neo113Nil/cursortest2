package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzao {
    private final zzan[] zza;

    public zzao(long j, zzan... zzanVarArr) {
        this.zza = zzanVarArr;
    }

    public zzao(List list) {
        this.zza = (zzan[]) list.toArray(new zzan[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zza, ((zzao) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + Long.hashCode(-9223372036854775807L);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 8);
        sb.append("entries=");
        sb.append(arrays);
        sb.append("");
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzan zzb(int i) {
        return this.zza[i];
    }

    public final zzao zzc(zzao zzaoVar) {
        return zzaoVar == null ? this : zzd(zzaoVar.zza);
    }

    public final zzao zzd(zzan... zzanVarArr) {
        int length = zzanVarArr.length;
        if (length == 0) {
            return this;
        }
        zzan[] zzanVarArr2 = this.zza;
        String str = zzeo.zza;
        int length2 = zzanVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzanVarArr2, length2 + length);
        System.arraycopy(zzanVarArr, 0, copyOf, length2, length);
        return new zzao(-9223372036854775807L, (zzan[]) copyOf);
    }
}
