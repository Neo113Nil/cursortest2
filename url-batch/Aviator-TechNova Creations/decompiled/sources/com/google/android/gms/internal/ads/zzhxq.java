package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhxq implements zzhnp {
    final zzhnp zza;
    final zzhnp zzb;

    /* synthetic */ zzhxq(zzhnp zzhnpVar, zzhnp zzhnpVar2, byte[] bArr) {
        this.zza = zzhnpVar;
        this.zzb = zzhnpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
