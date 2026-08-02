package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzvq {
    private final zzek zza = new zzek(32);
    private zzvp zzb;
    private zzvp zzc;
    private zzvp zzd;
    private long zze;
    private final zzyk zzf;

    public zzvq(zzyk zzykVar) {
        this.zzf = zzykVar;
        zzvp zzvpVar = new zzvp(0L, 65536);
        this.zzb = zzvpVar;
        this.zzc = zzvpVar;
        this.zzd = zzvpVar;
    }

    private final int zzi(int i) {
        zzvp zzvpVar = this.zzd;
        if (zzvpVar.zzc == null) {
            zzyd zzb = this.zzf.zzb();
            zzvp zzvpVar2 = new zzvp(this.zzd.zzb, 65536);
            zzvpVar.zzc = zzb;
            zzvpVar.zzd = zzvpVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvp zzj(zzvp zzvpVar, long j) {
        while (j >= zzvpVar.zzb) {
            zzvpVar = zzvpVar.zzd;
        }
        return zzvpVar;
    }

    private static zzvp zzk(zzvp zzvpVar, long j, ByteBuffer byteBuffer, int i) {
        zzvp zzj = zzj(zzvpVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvp zzl(zzvp zzvpVar, long j, byte[] bArr, int i) {
        zzvp zzj = zzj(zzvpVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvp zzm(zzvp zzvpVar, zzhd zzhdVar, zzvs zzvsVar, zzek zzekVar) {
        zzvp zzvpVar2;
        int i;
        if (zzhdVar.zzk()) {
            long j = zzvsVar.zzb;
            zzekVar.zzH(1);
            zzvp zzl = zzl(zzvpVar, j, zzekVar.zzM(), 1);
            long j2 = j + 1;
            byte b = zzekVar.zzM()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzha zzhaVar = zzhdVar.zzb;
            byte[] bArr = zzhaVar.zza;
            if (bArr == null) {
                zzhaVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzvpVar2 = zzl(zzl, j2, zzhaVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzekVar.zzH(2);
                zzvpVar2 = zzl(zzvpVar2, j3, zzekVar.zzM(), 2);
                j3 += 2;
                i = zzekVar.zzq();
            } else {
                i = 1;
            }
            int[] iArr = zzhaVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhaVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzekVar.zzH(i4);
                zzvpVar2 = zzl(zzvpVar2, j3, zzekVar.zzM(), i4);
                j3 += i4;
                zzekVar.zzK(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzekVar.zzq();
                    iArr4[i5] = zzekVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvsVar.zza - ((int) (j3 - zzvsVar.zzb));
            }
            zzado zzadoVar = zzvsVar.zzc;
            int i6 = zzet.zza;
            zzhaVar.zzc(i, iArr2, iArr4, zzadoVar.zzb, zzhaVar.zza, zzadoVar.zza, zzadoVar.zzc, zzadoVar.zzd);
            long j4 = zzvsVar.zzb;
            int i7 = (int) (j3 - j4);
            zzvsVar.zzb = j4 + i7;
            zzvsVar.zza -= i7;
        } else {
            zzvpVar2 = zzvpVar;
        }
        if (!zzhdVar.zze()) {
            zzhdVar.zzi(zzvsVar.zza);
            return zzk(zzvpVar2, zzvsVar.zzb, zzhdVar.zzc, zzvsVar.zza);
        }
        zzekVar.zzH(4);
        zzvp zzl2 = zzl(zzvpVar2, zzvsVar.zzb, zzekVar.zzM(), 4);
        int zzp = zzekVar.zzp();
        zzvsVar.zzb += 4;
        zzvsVar.zza -= 4;
        zzhdVar.zzi(zzp);
        zzvp zzk = zzk(zzl2, zzvsVar.zzb, zzhdVar.zzc, zzp);
        zzvsVar.zzb += zzp;
        int i8 = zzvsVar.zza - zzp;
        zzvsVar.zza = i8;
        ByteBuffer byteBuffer = zzhdVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzhdVar.zzf = ByteBuffer.allocate(i8);
        } else {
            zzhdVar.zzf.clear();
        }
        return zzk(zzk, zzvsVar.zzb, zzhdVar.zzf, zzvsVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzvp zzvpVar = this.zzd;
        if (j == zzvpVar.zzb) {
            this.zzd = zzvpVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvp zzvpVar = this.zzd;
        int zza = zzpVar.zza(zzvpVar.zzc.zza, zzvpVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvp zzvpVar;
        if (j != -1) {
            while (true) {
                zzvpVar = this.zzb;
                if (j < zzvpVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvpVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvpVar.zza) {
                this.zzc = zzvpVar;
            }
        }
    }

    public final void zzd(zzhd zzhdVar, zzvs zzvsVar) {
        zzm(this.zzc, zzhdVar, zzvsVar, this.zza);
    }

    public final void zze(zzhd zzhdVar, zzvs zzvsVar) {
        this.zzc = zzm(this.zzc, zzhdVar, zzvsVar, this.zza);
    }

    public final void zzf() {
        zzvp zzvpVar = this.zzb;
        if (zzvpVar.zzc != null) {
            this.zzf.zzd(zzvpVar);
            zzvpVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvp zzvpVar2 = this.zzb;
        this.zzc = zzvpVar2;
        this.zzd = zzvpVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzek zzekVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvp zzvpVar = this.zzd;
            zzekVar.zzG(zzvpVar.zzc.zza, zzvpVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
