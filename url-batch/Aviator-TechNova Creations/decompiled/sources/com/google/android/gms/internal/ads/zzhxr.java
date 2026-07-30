package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhxr implements zzhnp {
    public static zzhnp zzb(zzhnn zzhnnVar) throws GeneralSecurityException {
        zzhnp zzb = zzhnt.zzb(zzhnnVar);
        try {
            return new zzhxq(zzb, zzhnu.zzb(zzhnnVar), null);
        } catch (GeneralSecurityException unused) {
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
