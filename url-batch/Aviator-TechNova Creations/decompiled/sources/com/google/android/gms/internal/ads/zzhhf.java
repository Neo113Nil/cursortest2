package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhhf extends zzhhg {
    public zzhhf(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    final zzhhe zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhhd(bArr, i);
    }
}
