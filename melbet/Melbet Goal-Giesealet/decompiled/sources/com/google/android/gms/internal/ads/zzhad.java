package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhad extends zzhau {
    private final int zza;
    private final int zzb;
    private final zzhac zzc;

    /* synthetic */ zzhad(int i, int i2, zzhac zzhacVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhacVar;
    }

    public static zzhab zzb() {
        return new zzhab(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhad)) {
            return false;
        }
        zzhad zzhadVar = (zzhad) obj;
        return zzhadVar.zza == this.zza && zzhadVar.zze() == zze() && zzhadVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhad.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int length = String.valueOf(valueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzc != zzhac.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhac zzhacVar = this.zzc;
        if (zzhacVar == zzhac.zzd) {
            return this.zzb;
        }
        if (zzhacVar == zzhac.zza || zzhacVar == zzhac.zzb || zzhacVar == zzhac.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhac zzf() {
        return this.zzc;
    }
}
