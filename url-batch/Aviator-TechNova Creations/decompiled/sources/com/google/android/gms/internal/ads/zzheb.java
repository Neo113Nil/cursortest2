package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzheb extends zzhch {
    private final zzhea zza;

    private zzheb(zzhea zzheaVar) {
        this.zza = zzheaVar;
    }

    public static zzheb zzb(zzhea zzheaVar) {
        return new zzheb(zzheaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzheb) && ((zzheb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzheb.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhea.zzc;
    }

    public final zzhea zzc() {
        return this.zza;
    }
}
