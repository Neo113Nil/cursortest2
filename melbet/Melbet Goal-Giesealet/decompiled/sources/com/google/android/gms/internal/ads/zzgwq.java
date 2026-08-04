package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgwq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgwp.zza, zzgup.class, zzgzk.class);
        zzd = zzgys.zzd(zzgwm.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgwn.zza, zzguk.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgwo.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgup zzgupVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzheu zzd2 = zzhev.zzd();
        zzhew zzb2 = zzhex.zzb();
        zzb2.zza(zzgupVar.zzd());
        zzd2.zza((zzhex) zzb2.zzbu());
        zze2.zzb(((zzhev) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgupVar.zzc()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgup zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhev zzc2 = zzhev.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzc2.zza() == 0) {
                return zzgup.zzb(zzg(zzgzkVar.zzc().zzc()), zzc2.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzguk zzgukVar, zzgqt zzgqtVar) {
        zzhes zze2 = zzhet.zze();
        byte[] zzc2 = zzgukVar.zzd().zzc(zzgqtVar);
        zze2.zzb(zzhhb.zzr(zzc2, 0, zzc2.length));
        zzhew zzb2 = zzhex.zzb();
        zzb2.zza(zzgukVar.zze().zzd());
        zze2.zza((zzhex) zzb2.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhet) zze2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgukVar.zze().zzc()), zzgukVar.zzf());
    }

    static /* synthetic */ zzguk zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhet zzd2 = zzhet.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzc().zzc() == 32) {
                return zzguk.zzc(zzgup.zzb(zzg(zzgzjVar.zzd()), zzd2.zzb().zza()), zzhgh.zza(zzd2.zzc().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhep zzf(zzguo zzguoVar) throws GeneralSecurityException {
        if (Objects.equals(zzguoVar, zzguo.zza)) {
            return zzhep.TINK;
        }
        if (Objects.equals(zzguoVar, zzguo.zzb)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzguoVar.toString()));
    }

    private static zzguo zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzguo.zza;
        }
        if (ordinal == 3) {
            return zzguo.zzb;
        }
        int zza2 = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
