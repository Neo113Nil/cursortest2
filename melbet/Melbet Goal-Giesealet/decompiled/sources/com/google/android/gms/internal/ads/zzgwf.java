package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgwf extends zzgwg {
    public zzgwf(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    final zzgwe zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgwd(bArr, i);
    }
}
