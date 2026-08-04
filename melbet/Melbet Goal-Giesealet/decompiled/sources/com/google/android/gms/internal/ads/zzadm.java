package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzadm {
    private final zzef zza = new zzef(10);

    private final boolean zzb(zzacv zzacvVar, int i) throws IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    zzef zzefVar = this.zza;
                    System.arraycopy(zzefVar.zzi(), 10, zzefVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                zzef zzefVar2 = this.zza;
                int i6 = i4 + 10;
                zzacvVar.zzi(zzefVar2.zzi(), i6 - i5, i5);
                zzefVar2.zzh(i2);
                zzefVar2.zzf(i6);
                if (zzefVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzadp.zza(zzefVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzefVar2.zzc(20);
                }
                i3++;
            } catch (EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final zzao zza(zzacv zzacvVar, zzagd zzagdVar, int i) throws IOException {
        zzao zzaoVar = null;
        int i2 = 0;
        while (zzb(zzacvVar, i)) {
            zzef zzefVar = this.zza;
            int zzg = zzefVar.zzg();
            zzefVar.zzk(6);
            int zzG = zzefVar.zzG();
            int i3 = zzG + 10;
            if (zzaoVar == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(zzefVar.zzi(), zzg, bArr, 0, 10);
                zzacvVar.zzi(bArr, 10, zzG);
                zzaoVar = zzagg.zza(bArr, i3, zzagdVar, new zzafr());
            } else {
                zzacvVar.zzk(zzG);
            }
            i2 += i3;
        }
        zzacvVar.zzl();
        zzacvVar.zzk(i2);
        return zzaoVar;
    }
}
