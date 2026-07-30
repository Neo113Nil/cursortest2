package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhgh {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhgg.zza, zzhdd.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgd.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhge.zza, zzhcx.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgf.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhdd zzhddVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhon zzd2 = zzhoo.zzd();
        zzd2.zza(zzh(zzhddVar));
        zzd2.zzb(zzhddVar.zzc());
        zze2.zzb(((zzhoo) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhddVar.zze()));
        return zzhlc.zza((zzhqf) zze2.zzbu());
    }

    static /* synthetic */ zzhdd zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            String zza2 = zzhlcVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhoo zzc2 = zzhoo.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhdb zzb2 = zzhdd.zzb();
            zzb2.zza(zzc2.zzb());
            zzb2.zzb(zzc2.zza().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhlcVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhcx zzhcxVar, zzhbt zzhbtVar) {
        zzhol zze2 = zzhom.zze();
        zze2.zza(zzh(zzhcxVar.zzf()));
        byte[] zzc2 = zzhcxVar.zze().zzc(zzhbtVar);
        zze2.zzb(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhom) zze2.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhcxVar.zzf().zze()), zzhcxVar.zzb());
    }

    static /* synthetic */ zzhcx zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhom zzd2 = zzhom.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhdb zzb2 = zzhdd.zzb();
            zzb2.zza(zzd2.zzc().zzc());
            zzb2.zzb(zzd2.zzb().zza());
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhlbVar.zzd()));
            zzhdd zze2 = zzb2.zze();
            zzhcw zzd3 = zzhcx.zzd();
            zzd3.zza(zze2);
            zzd3.zzb(zzhyg.zza(zzd2.zzc().zzy(), zzhbtVar));
            zzd3.zzc(zzhlbVar.zze());
            return zzd3.zzd();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzhqy zzf(zzhdc zzhdcVar) throws GeneralSecurityException {
        if (zzhdc.zza.equals(zzhdcVar)) {
            return zzhqy.TINK;
        }
        if (zzhdc.zzb.equals(zzhdcVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhdc.zzc.equals(zzhdcVar)) {
            return zzhqy.RAW;
        }
        String valueOf = String.valueOf(zzhdcVar);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(valueOf)));
    }

    private static zzhdc zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhdc.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhdc.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhdc.zzb;
    }

    private static zzhoq zzh(zzhdd zzhddVar) throws GeneralSecurityException {
        zzhop zzb2 = zzhoq.zzb();
        zzb2.zza(zzhddVar.zzd());
        return (zzhoq) zzb2.zzbu();
    }
}
