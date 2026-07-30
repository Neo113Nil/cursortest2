package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzhsm implements zzhjb {
    static final /* synthetic */ zzhsm zza = new zzhsm();

    private /* synthetic */ zzhsm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhsg zzhsgVar = (zzhsg) zzhbpVar;
        int i = zzhso.zza;
        ECParameterSpec zza2 = zzhsgVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("EC");
        keyPairGenerator.initialize(zza2);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        zzhsj zzhsjVar = new zzhsj(null);
        zzhsjVar.zza(zzhsgVar);
        zzhsjVar.zzc(num);
        zzhsjVar.zzb(eCPublicKey.getW());
        zzhsk zzd = zzhsjVar.zzd();
        zzhsh zzhshVar = new zzhsh(null);
        zzhshVar.zza(zzd);
        zzhshVar.zzb(zzhyf.zza(eCPrivateKey.getS(), zzhax.zza()));
        return zzhshVar.zzc();
    }
}
