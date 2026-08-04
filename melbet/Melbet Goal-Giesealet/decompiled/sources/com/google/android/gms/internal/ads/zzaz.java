package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaz {
    public final Object zza;
    public final int zzb;
    public final zzaj zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzaz(Object obj, int i, zzaj zzajVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzajVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zzb == zzazVar.zzb && this.zze == zzazVar.zze && this.zzf == zzazVar.zzf && this.zzg == zzazVar.zzg && this.zzh == zzazVar.zzh && this.zzi == zzazVar.zzi && Objects.equals(this.zzc, zzazVar.zzc) && Objects.equals(this.zza, zzazVar.zza) && Objects.equals(this.zzd, zzazVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zze;
        int length2 = String.valueOf(i2).length();
        long j = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        sb.append("mediaItem=");
        sb.append(i);
        sb.append(", period=");
        sb.append(i2);
        sb.append(", pos=");
        sb.append(j);
        String sb2 = sb.toString();
        int i3 = this.zzh;
        if (i3 == -1) {
            return sb2;
        }
        long j2 = this.zzg;
        int i4 = this.zzi;
        int length3 = sb2.length();
        StringBuilder sb3 = new StringBuilder(length3 + 13 + String.valueOf(j2).length() + 10 + String.valueOf(i3).length() + 5 + String.valueOf(i4).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j2);
        sb3.append(", adGroup=");
        sb3.append(i3);
        sb3.append(", ad=");
        sb3.append(i4);
        return sb3.toString();
    }
}
