package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzvz {
    private final zzef zza = new zzef(32);
    private zzvy zzb;
    private zzvy zzc;
    private zzvy zzd;
    private long zze;
    private final zzyv zzf;

    public zzvz(zzyv zzyvVar) {
        this.zzf = zzyvVar;
        zzvy zzvyVar = new zzvy(0L, 65536);
        this.zzb = zzvyVar;
        this.zzc = zzvyVar;
        this.zzd = zzvyVar;
    }

    private final int zzi(int i) {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar.zzc == null) {
            zzyo zzc = this.zzf.zzc();
            zzvy zzvyVar2 = new zzvy(this.zzd.zzb, 65536);
            zzvyVar.zzc = zzc;
            zzvyVar.zzd = zzvyVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzvy zzvyVar = this.zzd;
        if (j == zzvyVar.zzb) {
            this.zzd = zzvyVar.zzd;
        }
    }

    private static zzvy zzk(zzvy zzvyVar, zzhg zzhgVar, zzwa zzwaVar, zzef zzefVar) {
        zzvy zzvyVar2;
        if (zzhgVar.zzk()) {
            long j = zzwaVar.zzb;
            int i = 1;
            zzefVar.zza(1);
            zzvy zzm = zzm(zzvyVar, j, zzefVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzefVar.zzi()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzhd zzhdVar = zzhgVar.zzb;
            byte[] bArr = zzhdVar.zza;
            if (bArr == null) {
                zzhdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzvyVar2 = zzm(zzm, j2, zzhdVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzefVar.zza(2);
                zzvyVar2 = zzm(zzvyVar2, j3, zzefVar.zzi(), 2);
                j3 += 2;
                i = zzefVar.zzt();
            }
            int i4 = i;
            int[] iArr = zzhdVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhdVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzefVar.zza(i5);
                zzvyVar2 = zzm(zzvyVar2, j3, zzefVar.zzi(), i5);
                j3 += i5;
                zzefVar.zzh(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzefVar.zzt();
                    iArr4[i6] = zzefVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwaVar.zza - ((int) (j3 - zzwaVar.zzb));
            }
            zzaea zzaeaVar = zzwaVar.zzc;
            String str = zzeo.zza;
            zzhdVar.zza(i4, iArr2, iArr4, zzaeaVar.zzb, zzhdVar.zza, zzaeaVar.zza, zzaeaVar.zzc, zzaeaVar.zzd);
            long j4 = zzwaVar.zzb;
            int i7 = (int) (j3 - j4);
            zzwaVar.zzb = j4 + i7;
            zzwaVar.zza -= i7;
        } else {
            zzvyVar2 = zzvyVar;
        }
        if (!zzhgVar.zze()) {
            zzhgVar.zzj(zzwaVar.zza);
            return zzl(zzvyVar2, zzwaVar.zzb, zzhgVar.zzc, zzwaVar.zza);
        }
        zzefVar.zza(4);
        zzvy zzm2 = zzm(zzvyVar2, zzwaVar.zzb, zzefVar.zzi(), 4);
        int zzH = zzefVar.zzH();
        zzwaVar.zzb += 4;
        zzwaVar.zza -= 4;
        zzhgVar.zzj(zzH);
        zzvy zzl = zzl(zzm2, zzwaVar.zzb, zzhgVar.zzc, zzH);
        zzwaVar.zzb += zzH;
        int i8 = zzwaVar.zza - zzH;
        zzwaVar.zza = i8;
        ByteBuffer byteBuffer = zzhgVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzhgVar.zzf = ByteBuffer.allocate(i8);
        } else {
            zzhgVar.zzf.clear();
        }
        return zzl(zzl, zzwaVar.zzb, zzhgVar.zzf, zzwaVar.zza);
    }

    private static zzvy zzl(zzvy zzvyVar, long j, ByteBuffer byteBuffer, int i) {
        zzvy zzn = zzn(zzvyVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzvy zzm(zzvy zzvyVar, long j, byte[] bArr, int i) {
        zzvy zzn = zzn(zzvyVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j));
            System.arraycopy(zzn.zzc.zza, zzn.zzb(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzvy zzn(zzvy zzvyVar, long j) {
        while (j >= zzvyVar.zzb) {
            zzvyVar = zzvyVar.zzd;
        }
        return zzvyVar;
    }

    public final void zza() {
        zzvy zzvyVar = this.zzb;
        if (zzvyVar.zzc != null) {
            this.zzf.zze(zzvyVar);
            zzvyVar.zzc();
        }
        this.zzb.zza(0L, 65536);
        zzvy zzvyVar2 = this.zzb;
        this.zzc = zzvyVar2;
        this.zzd = zzvyVar2;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzhg zzhgVar, zzwa zzwaVar) {
        this.zzc = zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zzd(zzhg zzhgVar, zzwa zzwaVar) {
        zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zze(long j) {
        zzvy zzvyVar;
        if (j != -1) {
            while (true) {
                zzvyVar = this.zzb;
                if (j < zzvyVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzvyVar.zzc);
                this.zzb = this.zzb.zzc();
            }
            if (this.zzc.zza < zzvyVar.zza) {
                this.zzc = zzvyVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzi zziVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvy zzvyVar = this.zzd;
        int zza = zziVar.zza(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzef zzefVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvy zzvyVar = this.zzd;
            zzefVar.zzm(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
