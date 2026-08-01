package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzggd {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgfz
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgss zzgssVar;
                zzgfy zzgfyVar = (zzgfy) zzgddVar;
                int i = zzggd.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzgqj zzd2 = zzgqk.zzd();
                zzd2.zza(zzgfyVar.zzb());
                zza3.zzc(((zzgqk) zzd2.zzal()).zzau());
                zzgfw zzc2 = zzgfyVar.zzc();
                if (zzgfw.zza.equals(zzc2)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzgfw.zzb.equals(zzc2)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else {
                    if (!zzgfw.zzc.equals(zzc2)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzc2))));
                    }
                    zzgssVar = zzgss.RAW;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzgfy.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgga
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzggd.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzggb
        }, zzgfp.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzggc
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzggd.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzgfp zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgqh zze2 = zzgqh.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfv zzgfvVar = new zzgfv(null);
            zzgfvVar.zzb(zze2.zzf().zzd());
            zzgfvVar.zza(12);
            zzgfvVar.zzc(16);
            zzgfvVar.zzd(zzd(zzgloVar.zzc()));
            zzgfy zze3 = zzgfvVar.zze();
            zzgfn zzgfnVar = new zzgfn(null);
            zzgfnVar.zzc(zze3);
            zzgfnVar.zzb(zzgul.zzb(zze2.zzf().zzA(), zzgdpVar));
            zzgfnVar.zza(zzgloVar.zzf());
            return zzgfnVar.zzd();
        } catch (zzgwy unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgfy zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgqk zzf2 = zzgqk.zzf(zzglpVar.zzc().zzg(), zzgvy.zza());
            if (zzf2.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgfv zzgfvVar = new zzgfv(null);
            zzgfvVar.zzb(zzf2.zza());
            zzgfvVar.zza(12);
            zzgfvVar.zzc(16);
            zzgfvVar.zzd(zzd(zzglpVar.zzc().zzf()));
            return zzgfvVar.zze();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgfw zzd(zzgss zzgssVar) throws GeneralSecurityException {
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzgfw.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfw.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
            }
        }
        return zzgfw.zzb;
    }
}
