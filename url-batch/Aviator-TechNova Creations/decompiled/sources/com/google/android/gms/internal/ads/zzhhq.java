package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhhq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhhp.zza, zzhfq.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhhm.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhhn.zza, zzhfl.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhho.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhfq zzhfqVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhrt zzd2 = zzhru.zzd();
        zzhrv zzb2 = zzhrw.zzb();
        zzb2.zza(zzhfqVar.zzd());
        zzd2.zza((zzhrw) zzb2.zzbu());
        zze2.zzb(((zzhru) zzd2.zzbu()).zzaM());
        zze2.zzc(zzf(zzhfqVar.zzc()));
        return zzhlc.zza((zzhqf) zze2.zzbu());
    }

    static /* synthetic */ zzhfq zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            String zza2 = zzhlcVar.zzc().zza();
            String.valueOf(zza2);
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zza2)));
        }
        try {
            zzhru zzc2 = zzhru.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzhfq.zzb(zzg(zzhlcVar.zzc().zzc()), zzc2.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhfl zzhflVar, zzhbt zzhbtVar) {
        zzhrr zze2 = zzhrs.zze();
        byte[] zzc2 = zzhflVar.zze().zzc(zzhbtVar);
        zze2.zzb(zzian.zzs(zzc2, 0, zzc2.length));
        zzhrv zzb2 = zzhrw.zzb();
        zzb2.zza(zzhflVar.zzf().zzd());
        zze2.zza((zzhrw) zzb2.zzbu());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhrs) zze2.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhflVar.zzf().zzc()), zzhflVar.zzb());
    }

    static /* synthetic */ zzhfl zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhrs zzd2 = zzhrs.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzc().zzc() == 32) {
                return zzhfl.zzd(zzhfq.zzb(zzg(zzhlbVar.zzd()), zzd2.zzb().zza()), zzhyg.zza(zzd2.zzc().zzy(), zzhbtVar), zzhlbVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhqy zzf(zzhfp zzhfpVar) throws GeneralSecurityException {
        if (Objects.equals(zzhfpVar, zzhfp.zza)) {
            return zzhqy.TINK;
        }
        if (Objects.equals(zzhfpVar, zzhfp.zzb)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhfpVar.toString()));
    }

    private static zzhfp zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhfp.zza;
        }
        if (ordinal == 3) {
            return zzhfp.zzb;
        }
        int zza2 = zzhqyVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
