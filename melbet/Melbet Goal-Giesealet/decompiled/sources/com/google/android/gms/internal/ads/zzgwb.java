package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgwb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgwa.zza, zzgta.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvx.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzgvy.zza, zzgsv.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvz.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgta zzgtaVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zze2.zzb(zzhdj.zzb().zzaM());
        zze2.zzc(zzf(zzgtaVar.zzc()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgta zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhdj.zza(zzgzkVar.zzc().zzb(), zzhhr.zza());
            return zzgta.zzb(zzg(zzgzkVar.zzc().zzc()));
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgsv zzgsvVar, zzgqt zzgqtVar) {
        zzhdg zzd2 = zzhdh.zzd();
        byte[] zzc2 = zzgsvVar.zzd().zzc(zzgqtVar);
        zzd2.zza(zzhhb.zzr(zzc2, 0, zzc2.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhdh) zzd2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgsvVar.zze().zzc()), zzgsvVar.zzf());
    }

    static /* synthetic */ zzgsv zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhdh zzc2 = zzhdh.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzc2.zza() == 0) {
                return zzgsv.zzc(zzg(zzgzjVar.zzd()), zzhgh.zza(zzc2.zzb().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhep zzf(zzgsz zzgszVar) throws GeneralSecurityException {
        if (zzgsz.zza.equals(zzgszVar)) {
            return zzhep.TINK;
        }
        if (zzgsz.zzb.equals(zzgszVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsz.zzc.equals(zzgszVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgszVar.toString()));
    }

    private static zzgsz zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgsz.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgsz.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsz.zzb;
    }
}
