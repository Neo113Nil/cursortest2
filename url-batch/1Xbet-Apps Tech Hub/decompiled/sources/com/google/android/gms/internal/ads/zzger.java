package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzger {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgen
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgqy zzgqyVar;
                zzgss zzgssVar;
                zzgem zzgemVar = (zzgem) zzgddVar;
                int i = zzger.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzgpl zza4 = zzgpm.zza();
                zzgpr zzc2 = zzgps.zzc();
                zzgpu zzc3 = zzgpv.zzc();
                zzc3.zza(zzgemVar.zzd());
                zzc2.zzb((zzgpv) zzc3.zzal());
                zzc2.zza(zzgemVar.zzb());
                zza4.zza((zzgps) zzc2.zzal());
                zzgrd zzd2 = zzgre.zzd();
                zzgrg zzd3 = zzgrh.zzd();
                zzd3.zzb(zzgemVar.zze());
                zzgej zzf2 = zzgemVar.zzf();
                if (zzgej.zza.equals(zzf2)) {
                    zzgqyVar = zzgqy.SHA1;
                } else if (zzgej.zzb.equals(zzf2)) {
                    zzgqyVar = zzgqy.SHA224;
                } else if (zzgej.zzc.equals(zzf2)) {
                    zzgqyVar = zzgqy.SHA256;
                } else if (zzgej.zzd.equals(zzf2)) {
                    zzgqyVar = zzgqy.SHA384;
                } else {
                    if (!zzgej.zze.equals(zzf2)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzf2))));
                    }
                    zzgqyVar = zzgqy.SHA512;
                }
                zzd3.zza(zzgqyVar);
                zzd2.zzb((zzgrh) zzd3.zzal());
                zzd2.zza(zzgemVar.zzc());
                zza4.zzb((zzgre) zzd2.zzal());
                zza3.zzc(((zzgpm) zza4.zzal()).zzau());
                zzgek zzg = zzgemVar.zzg();
                if (zzgek.zza.equals(zzg)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzgek.zzb.equals(zzg)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else {
                    if (!zzgek.zzc.equals(zzg)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzg))));
                    }
                    zzgssVar = zzgss.RAW;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzgem.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgeo
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzger.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzgep
        }, zzgec.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzgeq
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzger.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzgec zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgpj zze2 = zzgpj.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zze2.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zze2.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgei zzgeiVar = new zzgei(null);
            zzgeiVar.zza(zze2.zzf().zzh().zzd());
            zzgeiVar.zzc(zze2.zzg().zzh().zzd());
            zzgeiVar.zzd(zze2.zzf().zzg().zza());
            zzgeiVar.zze(zze2.zzg().zzg().zza());
            zzgeiVar.zzb(zzd(zze2.zzg().zzg().zzc()));
            zzgeiVar.zzf(zze(zzgloVar.zzc()));
            zzgem zzg = zzgeiVar.zzg();
            zzgea zzgeaVar = new zzgea(null);
            zzgeaVar.zzd(zzg);
            zzgeaVar.zza(zzgul.zzb(zze2.zzf().zzh().zzA(), zzgdpVar));
            zzgeaVar.zzb(zzgul.zzb(zze2.zzg().zzh().zzA(), zzgdpVar));
            zzgeaVar.zzc(zzgloVar.zzf());
            return zzgeaVar.zze();
        } catch (zzgwy unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgem zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgpm zzd2 = zzgpm.zzd(zzglpVar.zzc().zzg(), zzgvy.zza());
            if (zzd2.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgei zzgeiVar = new zzgei(null);
            zzgeiVar.zza(zzd2.zze().zza());
            zzgeiVar.zzc(zzd2.zzf().zza());
            zzgeiVar.zzd(zzd2.zze().zzg().zza());
            zzgeiVar.zze(zzd2.zzf().zzh().zza());
            zzgeiVar.zzb(zzd(zzd2.zzf().zzh().zzc()));
            zzgeiVar.zzf(zze(zzglpVar.zzc().zzf()));
            return zzgeiVar.zzg();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgej zzd(zzgqy zzgqyVar) throws GeneralSecurityException {
        zzgqy zzgqyVar2 = zzgqy.UNKNOWN_HASH;
        zzgss zzgssVar = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgqyVar.ordinal();
        if (ordinal == 1) {
            return zzgej.zza;
        }
        if (ordinal == 2) {
            return zzgej.zzd;
        }
        if (ordinal == 3) {
            return zzgej.zzc;
        }
        if (ordinal == 4) {
            return zzgej.zze;
        }
        if (ordinal == 5) {
            return zzgej.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgqyVar.zza());
    }

    private static zzgek zze(zzgss zzgssVar) throws GeneralSecurityException {
        zzgqy zzgqyVar = zzgqy.UNKNOWN_HASH;
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzgek.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgek.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
            }
        }
        return zzgek.zzb;
    }
}
