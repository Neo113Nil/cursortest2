package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzvt {
    private final zzfj zza = new zzfj(32);
    private zzvs zzb;
    private zzvs zzc;
    private zzvs zzd;
    private long zze;
    private final zzyn zzf;

    public zzvt(zzyn zzynVar) {
        this.zzf = zzynVar;
        zzvs zzvsVar = new zzvs(0L, 65536);
        this.zzb = zzvsVar;
        this.zzc = zzvsVar;
        this.zzd = zzvsVar;
    }

    private final int zzi(int i) {
        zzvs zzvsVar = this.zzd;
        if (zzvsVar.zzc == null) {
            zzyg zzb = this.zzf.zzb();
            zzvs zzvsVar2 = new zzvs(this.zzd.zzb, 65536);
            zzvsVar.zzc = zzb;
            zzvsVar.zzd = zzvsVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvs zzj(zzvs zzvsVar, long j) {
        while (j >= zzvsVar.zzb) {
            zzvsVar = zzvsVar.zzd;
        }
        return zzvsVar;
    }

    private static zzvs zzk(zzvs zzvsVar, long j, ByteBuffer byteBuffer, int i) {
        zzvs zzj = zzj(zzvsVar, j);
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

    private static zzvs zzl(zzvs zzvsVar, long j, byte[] bArr, int i) {
        zzvs zzj = zzj(zzvsVar, j);
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

    private static zzvs zzm(zzvs zzvsVar, zzib zzibVar, zzvv zzvvVar, zzfj zzfjVar) {
        zzvs zzvsVar2;
        if (zzibVar.zzk()) {
            long j = zzvvVar.zzb;
            int i = 1;
            zzfjVar.zzD(1);
            zzvs zzl = zzl(zzvsVar, j, zzfjVar.zzI(), 1);
            long j2 = j + 1;
            byte b = zzfjVar.zzI()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzhy zzhyVar = zzibVar.zzb;
            byte[] bArr = zzhyVar.zza;
            if (bArr == null) {
                zzhyVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzvsVar2 = zzl(zzl, j2, zzhyVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzfjVar.zzD(2);
                zzvsVar2 = zzl(zzvsVar2, j3, zzfjVar.zzI(), 2);
                j3 += 2;
                i = zzfjVar.zzp();
            }
            int i4 = i;
            int[] iArr = zzhyVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhyVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzfjVar.zzD(i5);
                zzvsVar2 = zzl(zzvsVar2, j3, zzfjVar.zzI(), i5);
                j3 += i5;
                zzfjVar.zzG(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzfjVar.zzp();
                    iArr4[i6] = zzfjVar.zzo();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvvVar.zza - ((int) (j3 - zzvvVar.zzb));
            }
            zzadj zzadjVar = zzvvVar.zzc;
            int i7 = zzfs.zza;
            zzhyVar.zzc(i4, iArr2, iArr4, zzadjVar.zzb, zzhyVar.zza, zzadjVar.zza, zzadjVar.zzc, zzadjVar.zzd);
            long j4 = zzvvVar.zzb;
            int i8 = (int) (j3 - j4);
            zzvvVar.zzb = j4 + i8;
            zzvvVar.zza -= i8;
        } else {
            zzvsVar2 = zzvsVar;
        }
        if (!zzibVar.zze()) {
            zzibVar.zzi(zzvvVar.zza);
            return zzk(zzvsVar2, zzvvVar.zzb, zzibVar.zzc, zzvvVar.zza);
        }
        zzfjVar.zzD(4);
        zzvs zzl2 = zzl(zzvsVar2, zzvvVar.zzb, zzfjVar.zzI(), 4);
        int zzo = zzfjVar.zzo();
        zzvvVar.zzb += 4;
        zzvvVar.zza -= 4;
        zzibVar.zzi(zzo);
        zzvs zzk = zzk(zzl2, zzvvVar.zzb, zzibVar.zzc, zzo);
        zzvvVar.zzb += zzo;
        int i9 = zzvvVar.zza - zzo;
        zzvvVar.zza = i9;
        ByteBuffer byteBuffer = zzibVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zzibVar.zzf = ByteBuffer.allocate(i9);
        } else {
            zzibVar.zzf.clear();
        }
        return zzk(zzk, zzvvVar.zzb, zzibVar.zzf, zzvvVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzvs zzvsVar = this.zzd;
        if (j == zzvsVar.zzb) {
            this.zzd = zzvsVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvs zzvsVar = this.zzd;
        int zza = zztVar.zza(zzvsVar.zzc.zza, zzvsVar.zza(this.zze), zzi);
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
        zzvs zzvsVar;
        if (j != -1) {
            while (true) {
                zzvsVar = this.zzb;
                if (j < zzvsVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvsVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvsVar.zza) {
                this.zzc = zzvsVar;
            }
        }
    }

    public final void zzd(zzib zzibVar, zzvv zzvvVar) {
        zzm(this.zzc, zzibVar, zzvvVar, this.zza);
    }

    public final void zze(zzib zzibVar, zzvv zzvvVar) {
        this.zzc = zzm(this.zzc, zzibVar, zzvvVar, this.zza);
    }

    public final void zzf() {
        zzvs zzvsVar = this.zzb;
        if (zzvsVar.zzc != null) {
            this.zzf.zzd(zzvsVar);
            zzvsVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvs zzvsVar2 = this.zzb;
        this.zzc = zzvsVar2;
        this.zzd = zzvsVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfj zzfjVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvs zzvsVar = this.zzd;
            zzfjVar.zzC(zzvsVar.zzc.zza, zzvsVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
