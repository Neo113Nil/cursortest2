package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgje extends zzgjf {
    public zzgje(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    final zzgjd zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgjc(bArr, i);
    }
}
