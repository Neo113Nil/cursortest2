package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgfl {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgfh
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgss zzgssVar;
                zzgfg zzgfgVar = (zzgfg) zzgddVar;
                int i = zzgfl.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzgqa zzc2 = zzgqb.zzc();
                zzgqd zzc3 = zzgqe.zzc();
                zzc3.zza(zzgfgVar.zzb());
                zzc2.zzb((zzgqe) zzc3.zzal());
                zzc2.zza(zzgfgVar.zzc());
                zza3.zzc(((zzgqb) zzc2.zzal()).zzau());
                zzgfe zzd2 = zzgfgVar.zzd();
                if (zzgfe.zza.equals(zzd2)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzgfe.zzb.equals(zzd2)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else {
                    if (!zzgfe.zzc.equals(zzd2)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzd2))));
                    }
                    zzgssVar = zzgss.RAW;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzgfg.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgfi
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzgfl.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzgfj
        }, zzgey.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzgfk
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzgfl.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzgey zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgpy zze2 = zzgpy.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfd zzgfdVar = new zzgfd(null);
            zzgfdVar.zzb(zze2.zzg().zzd());
            zzgfdVar.zza(zze2.zzf().zza());
            zzgfdVar.zzc(16);
            zzgfdVar.zzd(zzd(zzgloVar.zzc()));
            zzgfg zze3 = zzgfdVar.zze();
            zzgew zzgewVar = new zzgew(null);
            zzgewVar.zzc(zze3);
            zzgewVar.zzb(zzgul.zzb(zze2.zzg().zzA(), zzgdpVar));
            zzgewVar.zza(zzgloVar.zzf());
            return zzgewVar.zzd();
        } catch (zzgwy unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgfg zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgqb zze2 = zzgqb.zze(zzglpVar.zzc().zzg(), zzgvy.zza());
            zzgfd zzgfdVar = new zzgfd(null);
            zzgfdVar.zzb(zze2.zza());
            zzgfdVar.zza(zze2.zzf().zza());
            zzgfdVar.zzc(16);
            zzgfdVar.zzd(zzd(zzglpVar.zzc().zzf()));
            return zzgfdVar.zze();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgfe zzd(zzgss zzgssVar) throws GeneralSecurityException {
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzgfe.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfe.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
            }
        }
        return zzgfe.zzb;
    }
}
