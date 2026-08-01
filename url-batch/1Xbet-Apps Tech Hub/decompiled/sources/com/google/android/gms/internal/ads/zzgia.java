package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgia extends zzgdv {
    private final String zza;
    private final zzghy zzb;
    private final zzgdv zzc;

    /* synthetic */ zzgia(String str, zzghy zzghyVar, zzgdv zzgdvVar, zzghz zzghzVar) {
        this.zza = str;
        this.zzb = zzghyVar;
        this.zzc = zzgdvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgia)) {
            return false;
        }
        zzgia zzgiaVar = (zzgia) obj;
        return zzgiaVar.zzb.equals(this.zzb) && zzgiaVar.zzc.equals(this.zzc) && zzgiaVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgia.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        zzgdv zzgdvVar = this.zzc;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zza + ", dekParsingStrategy: " + String.valueOf(this.zzb) + ", dekParametersForNewKeys: " + String.valueOf(zzgdvVar) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return false;
    }

    public final zzgdv zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
