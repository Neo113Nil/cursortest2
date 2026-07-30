package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhdm extends zzhch {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhdl zzd;

    /* synthetic */ zzhdm(int i, int i2, int i3, zzhdl zzhdlVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhdlVar;
    }

    public static zzhdk zzb() {
        return new zzhdk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdm)) {
            return false;
        }
        zzhdm zzhdmVar = (zzhdm) obj;
        if (zzhdmVar.zza == this.zza) {
            int i = zzhdmVar.zzb;
            int i2 = zzhdmVar.zzc;
            if (zzhdmVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhdm.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhdl.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhdl zzd() {
        return this.zzd;
    }
}
