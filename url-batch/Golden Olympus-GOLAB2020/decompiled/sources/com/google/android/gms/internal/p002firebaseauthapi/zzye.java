package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjq;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzye implements zzbj {
    private final ECPrivateKey zza;
    private final zzyg zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzyk zze;
    private final zzla zzf;
    private final byte[] zzg;

    private zzye(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzyk zzykVar, zzla zzlaVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzyg(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzykVar;
        this.zzf = zzlaVar;
        this.zzg = bArr2;
    }

    public static zzbj zza(zzjt zzjtVar) {
        ECPrivateKey zza = zzyi.zza(zzyh.zza.zza((zzmv<zzyl, zzjq.zza>) zzjtVar.zzc().zzd()), zzmo.zza(zzjtVar.zze().zza(zzbl.zza())));
        byte[] bArr = new byte[0];
        if (zzjtVar.zzc().zzh() != null) {
            bArr = zzjtVar.zzc().zzh().zzb();
        }
        return new zzye(zza, bArr, zzyh.zza(zzjtVar.zzc().zze()), zzyh.zzb.zza((zzmv<zzyk, zzjq.zzc>) zzjtVar.zzc().zzf()), zzkw.zza(zzjtVar.zzc()), zzjtVar.zzg().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int i4;
        int i5;
        if (zzpy.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzyk zzykVar = this.zze;
            int zza = zzyi.zza(curve);
            int ordinal = zzykVar.ordinal();
            if (ordinal == 0) {
                zza *= 2;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                i4 = zza * 2;
                i5 = i4 + length;
                if (bArr.length < i5) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i5), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i5);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            i4 = zza + 1;
            i5 = i4 + length;
            if (bArr.length < i5) {
            }
        } else {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
    }
}
