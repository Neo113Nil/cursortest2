package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhfx extends zzhch {
    private final zzhfw zza;

    private zzhfx(zzhfw zzhfwVar) {
        this.zza = zzhfwVar;
    }

    public static zzhfx zzb(zzhfw zzhfwVar) {
        return new zzhfx(zzhfwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhfx) && ((zzhfx) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhfx.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhfw.zzc;
    }

    public final zzhfw zzc() {
        return this.zza;
    }
}
