package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhjp extends zzhbp {
    private final zzhlc zza;

    public zzhjp(zzhlc zzhlcVar) {
        this.zza = zzhlcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhjp)) {
            return false;
        }
        zzhlc zzhlcVar = ((zzhjp) obj).zza;
        zzhlc zzhlcVar2 = this.zza;
        return zzhlcVar2.zzc().zzc().equals(zzhlcVar.zzc().zzc()) && zzhlcVar2.zzc().zza().equals(zzhlcVar.zzc().zza()) && zzhlcVar2.zzc().zzb().equals(zzhlcVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhlc zzhlcVar = this.zza;
        return Objects.hash(zzhlcVar.zzc(), zzhlcVar.zzf());
    }

    public final String toString() {
        zzhlc zzhlcVar = this.zza;
        String zza = zzhlcVar.zzc().zza();
        int ordinal = zzhlcVar.zzc().zzc().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zza, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhqy.RAW;
    }

    public final zzhlc zzb() {
        return this.zza;
    }
}
