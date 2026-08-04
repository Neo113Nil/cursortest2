package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgww {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgwv.zza, zzguw.class, zzgzk.class);
        zzd = zzgys.zzd(zzgws.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgwt.zza, zzguq.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgwu.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzguw zzguwVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zze2.zzb(zzhfb.zzc().zzaM());
        zze2.zzc(zzf(zzguwVar.zzc()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzguw zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            if (zzhfb.zzb(zzgzkVar.zzc().zzb(), zzhhr.zza()).zza() == 0) {
                return zzguw.zzb(zzg(zzgzkVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzguq zzguqVar, zzgqt zzgqtVar) {
        zzhey zzd2 = zzhez.zzd();
        byte[] zzc2 = zzguqVar.zzd().zzc(zzgqtVar);
        zzd2.zza(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhez) zzd2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzguqVar.zze().zzc()), zzguqVar.zzf());
    }

    static /* synthetic */ zzguq zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhez zzc2 = zzhez.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() == 0) {
                return zzguq.zzc(zzg(zzgzjVar.zzd()), zzhgh.zza(zzc2.zzb().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhep zzf(zzguv zzguvVar) throws GeneralSecurityException {
        if (zzguv.zza.equals(zzguvVar)) {
            return zzhep.TINK;
        }
        if (zzguv.zzb.equals(zzguvVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzguv.zzc.equals(zzguvVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzguvVar.toString()));
    }

    private static zzguv zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzguv.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzguv.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzguv.zzb;
    }
}
