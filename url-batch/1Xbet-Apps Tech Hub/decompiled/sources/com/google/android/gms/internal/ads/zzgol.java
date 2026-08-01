package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgol {
    public static final /* synthetic */ int zza = 0;
    private static final zzguk zzb;
    private static final zzgjq zzc;
    private static final zzgjq zzd;
    private static final zzglc zze;
    private static final zzgky zzf;
    private static final zzgkc zzg;
    private static final zzgjy zzh;

    static {
        zzguk zza2 = zzgmd.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzgjo zza3 = zzgjq.zza();
        zza3.zza(zzgss.RAW, zzgno.zzd);
        zza3.zza(zzgss.TINK, zzgno.zza);
        zza3.zza(zzgss.LEGACY, zzgno.zzc);
        zza3.zza(zzgss.CRUNCHY, zzgno.zzb);
        zzc = zza3.zzb();
        zzgjo zza4 = zzgjq.zza();
        zza4.zza(zzgqy.SHA1, zzgnn.zza);
        zza4.zza(zzgqy.SHA224, zzgnn.zzb);
        zza4.zza(zzgqy.SHA256, zzgnn.zzc);
        zza4.zza(zzgqy.SHA384, zzgnn.zzd);
        zza4.zza(zzgqy.SHA512, zzgnn.zze);
        zzd = zza4.zzb();
        zze = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgoh
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzglt zza(zzgdd zzgddVar) {
                return zzgol.zza((zzgnq) zzgddVar);
            }
        }, zzgnq.class, zzglp.class);
        zzf = zzgky.zzb(new zzgkw() { // from class: com.google.android.gms.internal.ads.zzgoi
            @Override // com.google.android.gms.internal.ads.zzgkw
            public final zzgdd zza(zzglt zzgltVar) {
                return zzgol.zzc((zzglp) zzgltVar);
            }
        }, zza2, zzglp.class);
        zzg = zzgkc.zza(new zzgka() { // from class: com.google.android.gms.internal.ads.zzgoj
        }, zzgne.class, zzglo.class);
        zzh = zzgjy.zzb(new zzgjw() { // from class: com.google.android.gms.internal.ads.zzgok
            @Override // com.google.android.gms.internal.ads.zzgjw
            public final zzgcp zza(zzglt zzgltVar, zzgdp zzgdpVar) {
                return zzgol.zzb((zzglo) zzgltVar, zzgdpVar);
            }
        }, zza2, zzglo.class);
    }

    public static /* synthetic */ zzglp zza(zzgnq zzgnqVar) {
        zzgrq zza2 = zzgrr.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgrd zzd2 = zzgre.zzd();
        zzgrg zzd3 = zzgrh.zzd();
        zzd3.zzb(zzgnqVar.zzb());
        zzd3.zza((zzgqy) zzd.zzb(zzgnqVar.zzf()));
        zzd2.zzb((zzgrh) zzd3.zzal());
        zzd2.zza(zzgnqVar.zzc());
        zza2.zzc(((zzgre) zzd2.zzal()).zzau());
        zza2.zza((zzgss) zzc.zzb(zzgnqVar.zzg()));
        return zzglp.zzb((zzgrr) zza2.zzal());
    }

    public static /* synthetic */ zzgne zzb(zzglo zzgloVar, zzgdp zzgdpVar) {
        if (!zzgloVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgrb zzf2 = zzgrb.zzf(zzgloVar.zze(), zzgvy.zza());
            if (zzf2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgnm zze2 = zzgnq.zze();
            zze2.zzb(zzf2.zzh().zzd());
            zze2.zzc(zzf2.zzg().zza());
            zze2.zza((zzgnn) zzd.zzc(zzf2.zzg().zzc()));
            zze2.zzd((zzgno) zzc.zzc(zzgloVar.zzc()));
            zzgnq zze3 = zze2.zze();
            zzgnc zza2 = zzgne.zza();
            zza2.zzc(zze3);
            zza2.zzb(zzgul.zzb(zzf2.zzh().zzA(), zzgdpVar));
            zza2.zza(zzgloVar.zzf());
            return zza2.zzd();
        } catch (zzgwy | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgnq zzc(zzglp zzglpVar) {
        if (!zzglpVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzglpVar.zzc().zzh())));
        }
        try {
            zzgre zzg2 = zzgre.zzg(zzglpVar.zzc().zzg(), zzgvy.zza());
            if (zzg2.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzg2.zzc());
            }
            zzgnm zze2 = zzgnq.zze();
            zze2.zzb(zzg2.zza());
            zze2.zzc(zzg2.zzh().zza());
            zze2.zza((zzgnn) zzd.zzc(zzg2.zzh().zzc()));
            zze2.zzd((zzgno) zzc.zzc(zzglpVar.zzc().zzf()));
            return zze2.zze();
        } catch (zzgwy e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zzd(zzgku zzgkuVar) throws GeneralSecurityException {
        zzgkuVar.zzh(zze);
        zzgkuVar.zzg(zzf);
        zzgkuVar.zzf(zzg);
        zzgkuVar.zze(zzh);
    }
}
