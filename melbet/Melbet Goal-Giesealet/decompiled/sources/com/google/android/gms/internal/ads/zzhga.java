package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhga implements zzhbw {
    public static zzhbw zzb(zzhbu zzhbuVar) throws GeneralSecurityException {
        zzhbw zzb = zzhca.zzb(zzhbuVar);
        try {
            return new zzhfz(zzb, zzhcb.zzb(zzhbuVar), null);
        } catch (GeneralSecurityException unused) {
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
