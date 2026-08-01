package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzghu {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzghq
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                int i = zzghu.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzgsj zza4 = zzgsk.zza();
                zza4.zza(((zzghp) zzgddVar).zzc());
                zza3.zzc(((zzgsk) zza4.zzal()).zzau());
                zza3.zza(zzgss.RAW);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzghp.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzghr
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                int i = zzghu.zza;
                zzglp zzglpVar = (zzglp) zzgltVar;
                if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
                }
                try {
                    zzgsk zze2 = zzgsk.zze(((zzglp) zzgltVar).zzc().zzg(), zzgvy.zza());
                    if (zzglpVar.zzc().zzf() == zzgss.RAW) {
                        return zzghp.zzb(zze2.zzf());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(zzglpVar.zzc().zzf()) + " with format " + String.valueOf(zze2));
                } catch (zzgwy e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzghs
        }, zzgho.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzght
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                int i = zzghu.zza;
                zzglo zzgloVar = (zzglo) zzgltVar;
                if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (zzgloVar.zzc() != zzgss.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(String.valueOf(zzgloVar.zzc()))));
                }
                try {
                    zzgsh zze2 = zzgsh.zze(((zzglo) zzgltVar).zze(), zzgvy.zza());
                    if (zze2.zza() == 0) {
                        return zzgho.zza(zzghp.zzb(zze2.zzf().zzf()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zze2));
                } catch (zzgwy e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, zza2, zzglo.class);
    }

    public static void zza(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }
}
