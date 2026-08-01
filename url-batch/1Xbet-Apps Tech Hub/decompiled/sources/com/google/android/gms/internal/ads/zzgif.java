package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgif {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgib
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgia zzgiaVar = (zzgia) zzgddVar;
                int i = zzgif.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                try {
                    zzgrr zze2 = zzgrr.zze(((zzglp) zzgku.zzc().zzd(zzgiaVar.zzb(), zzglp.class)).zzc().zzax(), zzgvy.zza());
                    zzgsp zzc2 = zzgsq.zzc();
                    zzc2.zzb(zzgiaVar.zzc());
                    zzc2.zza(zze2);
                    zza3.zzc(((zzgsq) zzc2.zzal()).zzau());
                    zza3.zza(zzgss.RAW);
                    return zzglp.zzb((zzgrr) zza3.zzal());
                } catch (zzgwy e) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                }
            }
        }, zzgia.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgic
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzgif.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzgid
        }, zzghv.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzgie
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzgif.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzghv zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgsn zze2 = zzgsn.zze(zzgloVar.zze(), zzgvy.zza());
            if (zzgloVar.zzc() != zzgss.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got " + String.valueOf(zze2));
            }
            if (zze2.zza() == 0) {
                return zzghv.zza(zzd(zze2.zzf()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zze2));
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgia zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            return zzd(zzgsq.zzf(zzglpVar.zzc().zzg(), zzgvy.zza()));
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgia zzd(zzgsq zzgsqVar) throws GeneralSecurityException {
        zzghy zzghyVar;
        zzgrq zza2 = zzgrr.zza();
        zza2.zzb(zzgsqVar.zza().zzh());
        zza2.zzc(zzgsqVar.zza().zzg());
        zza2.zza(zzgss.RAW);
        zzgdd zza3 = zzgdr.zza(((zzgrr) zza2.zzal()).zzax());
        if (zza3 instanceof zzgfy) {
            zzghyVar = zzghy.zza;
        } else if (zza3 instanceof zzghb) {
            zzghyVar = zzghy.zzc;
        } else if (zza3 instanceof zzgit) {
            zzghyVar = zzghy.zzb;
        } else if (zza3 instanceof zzgem) {
            zzghyVar = zzghy.zzd;
        } else if (zza3 instanceof zzgfg) {
            zzghyVar = zzghy.zze;
        } else {
            if (!(zza3 instanceof zzggq)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
            }
            zzghyVar = zzghy.zzf;
        }
        zzghx zzghxVar = new zzghx(null);
        zzghxVar.zzc(zzgsqVar.zzg());
        zzghxVar.zza((zzgdv) zza3);
        zzghxVar.zzb(zzghyVar);
        return zzghxVar.zzd();
    }
}
