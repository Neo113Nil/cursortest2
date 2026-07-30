package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhdd extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhdc zzd;

    /* synthetic */ zzhdd(int i, int i2, int i3, zzhdc zzhdcVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzhdcVar;
    }

    public static zzhdb zzb() {
        return new zzhdb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdd)) {
            return false;
        }
        zzhdd zzhddVar = (zzhdd) obj;
        if (zzhddVar.zza == this.zza && zzhddVar.zzb == this.zzb) {
            int i = zzhddVar.zzc;
            if (zzhddVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhdd.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = String.valueOf(valueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhdc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhdc zze() {
        return this.zzd;
    }
}
