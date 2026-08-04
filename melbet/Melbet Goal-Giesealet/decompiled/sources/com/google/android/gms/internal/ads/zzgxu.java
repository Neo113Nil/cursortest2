package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgxu extends zzgqs {
    private final String zza;
    private final zzhep zzb;

    /* synthetic */ zzgxu(String str, zzhep zzhepVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhepVar;
    }

    public final String toString() {
        String str = this.zza;
        int ordinal = this.zzb.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzhep.RAW;
    }
}
