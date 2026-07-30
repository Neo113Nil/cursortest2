package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzhue implements zzhjb {
    static final /* synthetic */ zzhue zza = new zzhue();

    private /* synthetic */ zzhue() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhty zzhtyVar = (zzhty) zzhbpVar;
        int i = zzhug.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhtyVar.zzc(), new BigInteger(1, zzhtyVar.zzd().toByteArray())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        zzhub zzhubVar = new zzhub(null);
        zzhubVar.zza(zzhtyVar);
        zzhubVar.zzb(rSAPublicKey.getModulus());
        zzhubVar.zzc(num);
        zzhuc zzd = zzhubVar.zzd();
        zzhtz zzhtzVar = new zzhtz(null);
        zzhtzVar.zza(zzd);
        zzhtzVar.zzb(zzhyf.zza(rSAPrivateCrtKey.getPrimeP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeQ(), zzhax.zza()));
        zzhtzVar.zzc(zzhyf.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhax.zza()));
        zzhtzVar.zzd(zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhax.zza()));
        zzhtzVar.zze(zzhyf.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhax.zza()));
        return zzhtzVar.zzf();
    }
}
