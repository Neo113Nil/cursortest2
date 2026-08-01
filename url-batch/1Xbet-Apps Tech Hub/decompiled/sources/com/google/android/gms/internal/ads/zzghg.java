package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzghg {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzglc zzc;
    private static final zzgky zzd;
    private static final zzgkc zze;
    private static final zzgjy zzf;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzghc
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                zzgss zzgssVar;
                int i = zzghg.zza;
                zzgrq zza3 = zzgrr.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zza3.zzc(zzgqw.zzc().zzau());
                zzgha zzb2 = ((zzghb) zzgddVar).zzb();
                if (zzgha.zza.equals(zzb2)) {
                    zzgssVar = zzgss.TINK;
                } else if (zzgha.zzb.equals(zzb2)) {
                    zzgssVar = zzgss.CRUNCHY;
                } else {
                    if (!zzgha.zzc.equals(zzb2)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzb2.toString()));
                    }
                    zzgssVar = zzgss.RAW;
                }
                zza3.zza(zzgssVar);
                return zzglp.zzb((zzgrr) zza3.zzal());
            }
        }, zzghb.class, zzglp.class);
        zzd = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzghd
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzghg.zzb((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zze = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzghe
        }, zzggw.class, zzglo.class);
        zzf = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzghf
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzghg.zza((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzggw zza(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgqt zze2 = zzgqt.zze(zzgloVar.zze(), zzgvy.zza());
            if (zze2.zza() == 0) {
                return zzggw.zza(zzd(zzgloVar.zzc()), zzgul.zzb(zze2.zzf().zzA(), zzgdpVar), zzgloVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgwy unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzghb zzb(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgqw.zzd(zzglpVar.zzc().zzg(), zzgvy.zza());
            return zzghb.zzc(zzd(zzglpVar.zzc().zzf()));
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static void zzc(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zzc);
        zzgkuVar.zzg(zzd);
        zzgkuVar.zzf(zze);
        zzgkuVar.zze(zzf);
    }

    private static zzgha zzd(zzgss zzgssVar) throws GeneralSecurityException {
        zzgss zzgssVar2 = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzgssVar.ordinal();
        if (ordinal == 1) {
            return zzgha.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgha.zzc;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgssVar.zza());
            }
        }
        return zzgha.zzb;
    }
}
