package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacv {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzacv(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzacv zza(zzfj zzfjVar) throws zzcf {
        int i;
        int i2;
        int i3;
        try {
            zzfjVar.zzH(21);
            int zzl = zzfjVar.zzl() & 3;
            int zzl2 = zzfjVar.zzl();
            int zzc = zzfjVar.zzc();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < zzl2; i6++) {
                zzfjVar.zzH(1);
                int zzp = zzfjVar.zzp();
                for (int i7 = 0; i7 < zzp; i7++) {
                    int zzp2 = zzfjVar.zzp();
                    i5 += zzp2 + 4;
                    zzfjVar.zzH(zzp2);
                }
            }
            zzfjVar.zzG(zzc);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            String str = null;
            float f = 1.0f;
            int i15 = 0;
            int i16 = 0;
            while (i15 < zzl2) {
                int zzl3 = zzfjVar.zzl() & 63;
                int zzp3 = zzfjVar.zzp();
                int i17 = i4;
                while (i17 < zzp3) {
                    int zzp4 = zzfjVar.zzp();
                    int i18 = zzl2;
                    System.arraycopy(zzgg.zza, i4, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(zzfjVar.zzI(), zzfjVar.zzc(), bArr, i19, zzp4);
                    int i20 = i19 + zzp4;
                    if (zzl3 == 33 && i17 == 0) {
                        zzgd zzc2 = zzgg.zzc(bArr, i19 + 2, i20);
                        i8 = zzc2.zzi;
                        i9 = zzc2.zzj;
                        i10 = zzc2.zze + 8;
                        i11 = zzc2.zzf + 8;
                        int i21 = zzc2.zzl;
                        int i22 = zzc2.zzm;
                        int i23 = zzc2.zzn;
                        i = i20;
                        float f2 = zzc2.zzk;
                        i2 = zzl3;
                        i3 = zzp3;
                        str = zzeh.zzb(zzc2.zza, zzc2.zzb, zzc2.zzc, zzc2.zzd, zzc2.zzg, zzc2.zzh);
                        f = f2;
                        i12 = i21;
                        i14 = i23;
                        i13 = i22;
                        i17 = 0;
                    } else {
                        i = i20;
                        i2 = zzl3;
                        i3 = zzp3;
                    }
                    zzfjVar.zzH(zzp4);
                    i17++;
                    zzl2 = i18;
                    i16 = i;
                    zzl3 = i2;
                    zzp3 = i3;
                    i4 = 0;
                }
                i15++;
                i4 = 0;
            }
            return new zzacv(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzl + 1, i8, i9, i10, i11, i12, i13, i14, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcf.zza("Error parsing HEVC config", e);
        }
    }
}
