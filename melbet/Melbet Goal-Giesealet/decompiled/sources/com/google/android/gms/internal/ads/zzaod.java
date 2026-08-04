package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaod {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, Ascii.DLE, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = new zzef(8);
        int i = zzaoc.zza(zzacvVar, zzefVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 4);
        zzefVar.zzh(0);
        int zzB = zzefVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        zzds.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaob zzb(zzacv zzacvVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        zzef zzefVar = new zzef(16);
        long j = zzd(1718449184, zzacvVar, zzefVar).zzb;
        zzghc.zzh(j >= 16);
        zzacvVar.zzi(zzefVar.zzi(), 0, 16);
        zzefVar.zzh(0);
        int zzu = zzefVar.zzu();
        int zzu2 = zzefVar.zzu();
        int zzI = zzefVar.zzI();
        int zzI2 = zzefVar.zzI();
        int zzu3 = zzefVar.zzu();
        int zzu4 = zzefVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            bArr = new byte[i2];
            zzacvVar.zzi(bArr, 0, i2);
            if (zzu == 65534) {
                if (i2 != 24) {
                    bArr2 = bArr;
                    i = 65534;
                    zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
                    return new zzaob(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
                }
                zzef zzefVar2 = new zzef(bArr);
                zzefVar2.zzu();
                int zzu5 = zzefVar2.zzu();
                if (zzu5 != 0 && zzu5 != zzu4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzu5).length() + 33 + String.valueOf(zzu4).length() + 19);
                    sb.append("validBits ( ");
                    sb.append(zzu5);
                    sb.append(")  != bitsPerSample( ");
                    sb.append(zzu4);
                    sb.append(") are not supported");
                    throw zzas.zzc(sb.toString());
                }
                int zzI3 = zzefVar2.zzI();
                if ((zzI3 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzI3).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(zzI3);
                    throw zzas.zzc(sb2.toString());
                }
                if (zzI3 != 0 && Integer.bitCount(zzI3) != zzu2) {
                    int bitCount = Integer.bitCount(zzI3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bitCount).length() + 46 + String.valueOf(zzI3).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(bitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(zzI3);
                    throw zzas.zzc(sb3.toString());
                }
                zzu = zzefVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzefVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzas.zzc("invalid wav format extension guid");
                }
            }
        } else {
            bArr = zzeo.zzb;
        }
        i = zzu;
        bArr2 = bArr;
        zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
        return new zzaob(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr2);
    }

    public static Pair zzc(zzacv zzacvVar) throws IOException {
        zzacvVar.zzl();
        zzaoc zzd = zzd(1684108385, zzacvVar, new zzef(8));
        zzacvVar.zzf(8);
        return Pair.create(Long.valueOf(zzacvVar.zzn()), Long.valueOf(zzd.zzb));
    }

    private static zzaoc zzd(int i, zzacv zzacvVar, zzef zzefVar) throws IOException {
        zzaoc zza2 = zzaoc.zza(zzacvVar, zzefVar);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzds.zzc("WavHeaderReader", sb.toString());
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > SieveCacheKt.NodeLinkMask) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzas.zzc(sb2.toString());
            }
            zzacvVar.zzf((int) j2);
            zza2 = zzaoc.zza(zzacvVar, zzefVar);
        }
    }
}
