package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgtp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgto.zza, zzgtk.class, zzgzk.class);
        zzd = zzgys.zzd(zzgtl.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgtm.zza, zzgti.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgtn.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgtk zzgtkVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhej zzc2 = zzhek.zzc();
        zzc2.zza(zzgtkVar.zzc());
        zze2.zzb(((zzhek) zzc2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgtkVar.zzd()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgtk zzc(zzgzk zzgzkVar) {
        if (zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzgtk.zzb(zzhek.zzb(zzgzkVar.zzc().zzb(), zzhhr.zza()).zza(), zzg(zzgzkVar.zzc().zzc()));
            } catch (zzhiw e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        String zza2 = zzgzkVar.zzc().zza();
        String.valueOf(zza2);
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
    }

    static /* synthetic */ zzgzj zzd(zzgti zzgtiVar, zzgqt zzgqtVar) {
        zzheh zzd2 = zzhei.zzd();
        zzhej zzc2 = zzhek.zzc();
        zzc2.zza(zzgtiVar.zzd().zzc());
        zzd2.zza((zzhek) zzc2.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhei) zzd2.zzbu()).zzaM(), zzhds.REMOTE, zzf(zzgtiVar.zzd().zzd()), zzgtiVar.zze());
    }

    static /* synthetic */ zzgti zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhei zzc2 = zzhei.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() == 0) {
                return zzgti.zzc(zzgtk.zzb(zzc2.zzb().zza(), zzg(zzgzjVar.zzd())), zzgzjVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzhep zzf(zzgtj zzgtjVar) throws GeneralSecurityException {
        if (zzgtj.zza.equals(zzgtjVar)) {
            return zzhep.TINK;
        }
        if (zzgtj.zzb.equals(zzgtjVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgtjVar.toString()));
    }

    private static zzgtj zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgtj.zza;
        }
        if (ordinal == 3) {
            return zzgtj.zzb;
        }
        int zza2 = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
