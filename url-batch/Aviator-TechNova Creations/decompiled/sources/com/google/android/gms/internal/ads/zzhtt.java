package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhtt implements zzhbs {
    private final zzhkr zza;

    public zzhtt(zzhkr zzhkrVar, zzhjs zzhjsVar) {
        this.zza = zzhkrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhts zzhtsVar : this.zza.zza(bArr)) {
            try {
                zzhtsVar.zza.zza(bArr, bArr2);
                int i = zzhtsVar.zzb;
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
