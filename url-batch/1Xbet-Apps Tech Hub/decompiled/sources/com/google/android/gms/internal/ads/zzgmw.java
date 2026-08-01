package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgmw {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgss zzgssVar;
                zzgmr zzgmrVar = (zzgmr) zzgddVar;
                int i = zzgmw.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzgpc zzc2 = zzgpd.zzc();
                zzgpf zzc3 = zzgpg.zzc();
                zzc3.zza(zzgmrVar.zzb());
                zzc2.zzb((zzgpg) zzc3.zzal());
                zzc2.zza(zzgmrVar.zzc());
                zza3.zzc(((zzgpd) zzc2.zzal()).zzau());
                zzgmp zze2 = zzgmrVar.zze();
                if (zzgmp.zza.equals(zze2)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzgmp.zzb.equals(zze2)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else if (zzgmp.zzd.equals(zze2)) {
                    zzgssVar = zzgss.RAW;
                } else {
                    if (!zzgmp.zzc.equals(zze2)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zze2))));
                    }
                    zzgssVar = zzgss.LEGACY;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzgmr.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzgmw.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzgmu
        }, zzgmh.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzgmw.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzgmh zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgpa zze2 = zzgpa.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgmo zzgmoVar = new zzgmo(null);
            zzgmoVar.zza(zze2.zzg().zzd());
            zzgmoVar.zzb(zze2.zzf().zza());
            zzgmoVar.zzc(zzd(zzgloVar.zzc()));
            zzgmr zzd2 = zzgmoVar.zzd();
            zzgmf zzgmfVar = new zzgmf(null);
            zzgmfVar.zzc(zzd2);
            zzgmfVar.zza(zzgul.zzb(zze2.zzg().zzA(), zzgdpVar));
            zzgmfVar.zzb(zzgloVar.zzf());
            return zzgmfVar.zzd();
        } catch (zzgwy | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgmr zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgpd zze2 = zzgpd.zze(zzglpVar.zzc().zzg(), zzgvy.zza());
            zzgmo zzgmoVar = new zzgmo(null);
            zzgmoVar.zza(zze2.zza());
            zzgmoVar.zzb(zze2.zzf().zza());
            zzgmoVar.zzc(zzd(zzglpVar.zzc().zzf()));
            return zzgmoVar.zzd();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgmp zzd(zzgss zzgssVar) throws GeneralSecurityException {
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzgmp.zza;
        }
        if (ordinal == 2) {
            return zzgmp.zzc;
        }
        if (ordinal == 3) {
            return zzgmp.zzd;
        }
        if (ordinal == 4) {
            return zzgmp.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
    }
}
