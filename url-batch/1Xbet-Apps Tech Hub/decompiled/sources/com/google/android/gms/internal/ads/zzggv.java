package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzggv {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzggr
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgss zzgssVar;
                zzggq zzggqVar = (zzggq) zzgddVar;
                int i = zzggv.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzgqp zzd2 = zzgqq.zzd();
                zzd2.zza(zzggqVar.zzb());
                zza3.zzc(((zzgqq) zzd2.zzal()).zzau());
                zzggo zzc2 = zzggqVar.zzc();
                if (zzggo.zza.equals(zzc2)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzggo.zzb.equals(zzc2)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else {
                    if (!zzggo.zzc.equals(zzc2)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzc2))));
                    }
                    zzgssVar = zzgss.RAW;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzggq.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzggs
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzggv.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzggt
        }, zzggh.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzggu
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzggv.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzggh zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgqn zze2 = zzgqn.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggn zzggnVar = new zzggn(null);
            zzggnVar.zza(zze2.zzf().zzd());
            zzggnVar.zzb(zzd(zzgloVar.zzc()));
            zzggq zzc2 = zzggnVar.zzc();
            zzggf zzggfVar = new zzggf(null);
            zzggfVar.zzc(zzc2);
            zzggfVar.zzb(zzgul.zzb(zze2.zzf().zzA(), zzgdpVar));
            zzggfVar.zza(zzgloVar.zzf());
            return zzggfVar.zzd();
        } catch (zzgwy unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzggq zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgqq zzf2 = zzgqq.zzf(zzglpVar.zzc().zzg(), zzgvy.zza());
            if (zzf2.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzggn zzggnVar = new zzggn(null);
            zzggnVar.zza(zzf2.zza());
            zzggnVar.zzb(zzd(zzglpVar.zzc().zzf()));
            return zzggnVar.zzc();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzggo zzd(zzgss zzgssVar) throws GeneralSecurityException {
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzggo.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggo.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
            }
        }
        return zzggo.zzb;
    }
}
