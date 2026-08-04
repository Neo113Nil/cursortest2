package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgsu extends zzgrg {
    private final int zza;
    private final zzgst zzb;

    /* synthetic */ zzgsu(int i, zzgst zzgstVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzgstVar;
    }

    public static zzgss zzb() {
        return new zzgss(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsu)) {
            return false;
        }
        zzgsu zzgsuVar = (zzgsu) obj;
        return zzgsuVar.zza == this.zza && zzgsuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgsu.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int length = String.valueOf(valueOf).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzgst.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgst zzd() {
        return this.zzb;
    }
}
