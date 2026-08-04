package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgvb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zza2 = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzgyv.zzd(zzgva.zza, zzgru.class, zzgzk.class);
        zzd = zzgys.zzd(zzgux.zza, zza2, zzgzk.class);
        zze = zzgxq.zzd(zzguy.zza, zzgrm.class, zzgzj.class);
        zzf = zzgxn.zzd(zzguz.zza, zza2, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) throws GeneralSecurityException {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgru zzgruVar) {
        zzhdv zze2 = zzhdw.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhck zzd2 = zzhcl.zzd();
        zzhco zzc2 = zzhcp.zzc();
        zzhcq zzb2 = zzhcr.zzb();
        zzb2.zza(zzgruVar.zzf());
        zzc2.zza((zzhcr) zzb2.zzbu());
        zzc2.zzb(zzgruVar.zzc());
        zzd2.zza((zzhcp) zzc2.zzbu());
        zzhdn zze3 = zzhdo.zze();
        zze3.zza(zzi(zzgruVar));
        zze3.zzb(zzgruVar.zzd());
        zzd2.zzb((zzhdo) zze3.zzbu());
        zze2.zzb(((zzhcl) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzgruVar.zzg()));
        return zzgzk.zza((zzhdw) zze2.zzbu());
    }

    static /* synthetic */ zzgru zzc(zzgzk zzgzkVar) {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String zza2 = zzgzkVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhcl zzc2 = zzhcl.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzc2.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgrr zzb2 = zzgru.zzb();
            zzb2.zza(zzc2.zza().zzb());
            zzb2.zzb(zzc2.zzb().zzb());
            zzb2.zzc(zzc2.zza().zza().zza());
            zzb2.zzd(zzc2.zzb().zza().zzb());
            zzb2.zzf(zzh(zzc2.zzb().zza().zza()));
            zzb2.zze(zzg(zzgzkVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (zzhiw e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgrm zzgrmVar, zzgqt zzgqtVar) {
        zzhci zze2 = zzhcj.zze();
        zzhcm zzd2 = zzhcn.zzd();
        zzhcq zzb2 = zzhcr.zzb();
        zzb2.zza(zzgrmVar.zzf().zzf());
        zzd2.zza((zzhcr) zzb2.zzbu());
        byte[] zzc2 = zzgrmVar.zzd().zzc(zzgqtVar);
        zzd2.zzb(zzhhb.zzr(zzc2, 0, zzc2.length));
        zze2.zza((zzhcn) zzd2.zzbu());
        zzhdl zze3 = zzhdm.zze();
        zze3.zza(zzi(zzgrmVar.zzf()));
        byte[] zzc3 = zzgrmVar.zze().zzc(zzgqtVar);
        zze3.zzb(zzhhb.zzr(zzc3, 0, zzc3.length));
        zze2.zzb((zzhdm) zze3.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhcj) zze2.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgrmVar.zzf().zzg()), zzgrmVar.zzg());
    }

    static /* synthetic */ zzgrm zze(zzgzj zzgzjVar, zzgqt zzgqtVar) {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhcj zzd2 = zzhcj.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgrr zzb2 = zzgru.zzb();
            zzb2.zza(zzd2.zzb().zzc().zzc());
            zzb2.zzb(zzd2.zzc().zzc().zzc());
            zzb2.zzc(zzd2.zzb().zzb().zza());
            zzb2.zzd(zzd2.zzc().zzb().zzb());
            zzb2.zzf(zzh(zzd2.zzc().zzb().zza()));
            zzb2.zze(zzg(zzgzjVar.zzd()));
            zzgru zzg = zzb2.zzg();
            zzgrl zzc2 = zzgrm.zzc();
            zzc2.zza(zzg);
            zzc2.zzb(zzhgh.zza(zzd2.zzb().zzc().zzv(), zzgqtVar));
            zzc2.zzc(zzhgh.zza(zzd2.zzc().zzc().zzv(), zzgqtVar));
            zzc2.zzd(zzgzjVar.zze());
            return zzc2.zze();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhep zzf(zzgrt zzgrtVar) throws GeneralSecurityException {
        if (zzgrt.zza.equals(zzgrtVar)) {
            return zzhep.TINK;
        }
        if (zzgrt.zzb.equals(zzgrtVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgrt.zzc.equals(zzgrtVar)) {
            return zzhep.RAW;
        }
        String valueOf = String.valueOf(zzgrtVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzgrt zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int ordinal = zzhepVar.ordinal();
        if (ordinal == 1) {
            return zzgrt.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgrt.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgrt.zzb;
    }

    private static zzgrs zzh(zzhdk zzhdkVar) throws GeneralSecurityException {
        int ordinal = zzhdkVar.ordinal();
        if (ordinal == 1) {
            return zzgrs.zza;
        }
        if (ordinal == 2) {
            return zzgrs.zzd;
        }
        if (ordinal == 3) {
            return zzgrs.zzc;
        }
        if (ordinal == 4) {
            return zzgrs.zze;
        }
        if (ordinal == 5) {
            return zzgrs.zzb;
        }
        int zza2 = zzhdkVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhdq zzi(zzgru zzgruVar) throws GeneralSecurityException {
        zzhdk zzhdkVar;
        zzhdp zzc2 = zzhdq.zzc();
        zzc2.zzb(zzgruVar.zze());
        zzgrs zzh = zzgruVar.zzh();
        if (zzgrs.zza.equals(zzh)) {
            zzhdkVar = zzhdk.SHA1;
        } else if (zzgrs.zzb.equals(zzh)) {
            zzhdkVar = zzhdk.SHA224;
        } else if (zzgrs.zzc.equals(zzh)) {
            zzhdkVar = zzhdk.SHA256;
        } else if (zzgrs.zzd.equals(zzh)) {
            zzhdkVar = zzhdk.SHA384;
        } else {
            if (!zzgrs.zze.equals(zzh)) {
                String valueOf = String.valueOf(zzh);
                String.valueOf(valueOf);
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(valueOf)));
            }
            zzhdkVar = zzhdk.SHA512;
        }
        zzc2.zza(zzhdkVar);
        return (zzhdq) zzc2.zzbu();
    }
}
