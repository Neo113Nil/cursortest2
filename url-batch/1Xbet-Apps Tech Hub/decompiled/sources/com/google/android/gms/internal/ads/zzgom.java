package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgom implements zzgdc {
    private static final byte[] zza = {0};
    private final zzgdc zzb;
    private final zzgss zzc;
    private final byte[] zzd;

    private zzgom(zzgdc zzgdcVar, zzgss zzgssVar, byte[] bArr) {
        this.zzb = zzgdcVar;
        this.zzc = zzgssVar;
        this.zzd = bArr;
    }

    public static zzgdc zzb(zzgkg zzgkgVar) throws GeneralSecurityException {
        byte[] array;
        zzglo zza2 = zzgkgVar.zza(zzgco.zza());
        zzgrj zza3 = zzgrm.zza();
        zza3.zzb(zza2.zzg());
        zza3.zzc(zza2.zze());
        zza3.zza(zza2.zzb());
        zzgdc zzgdcVar = (zzgdc) zzgdo.zzc((zzgrm) zza3.zzal(), zzgdc.class);
        zzgss zzc = zza2.zzc();
        zzgss zzgssVar = zzgss.UNKNOWN_PREFIX;
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = new byte[0];
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgkgVar.zzb().intValue()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgkgVar.zzb().intValue()).array();
        }
        return new zzgom(zzgdcVar, zzc, array);
    }

    @Override // com.google.android.gms.internal.ads.zzgdc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzgss.LEGACY)) {
            bArr2 = zzgti.zzb(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzgss.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }
}
