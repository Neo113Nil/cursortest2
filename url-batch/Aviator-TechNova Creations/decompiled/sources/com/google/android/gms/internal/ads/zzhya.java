package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhya implements zzhbs {
    static final zzhiu zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhit zza2 = zzhiu.zza();
        zza2.zza(zzhxn.SHA256, zzhui.zza);
        zza2.zza(zzhxn.SHA384, zzhui.zzb);
        zza2.zza(zzhxn.SHA512, zzhui.zzc);
        zza = zza2.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhbs zzb(zzhuo zzhuoVar) throws GeneralSecurityException {
        try {
            return zzhwi.zze(zzhuoVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhuoVar.zzd(), zzhuoVar.zzf().zzd()));
            zzhuk zzf = zzhuoVar.zzf();
            zzhiu zzhiuVar = zza;
            return new zzhxz(rSAPublicKey, (zzhxn) zzhiuVar.zzb(zzf.zzf()), (zzhxn) zzhiuVar.zzb(zzf.zzg()), zzf.zzh(), zzhuoVar.zze().zzc(), zzhuoVar.zzf().zze().equals(zzhuj.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
