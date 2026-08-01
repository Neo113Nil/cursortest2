package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgvi extends zzgvm {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgvi(Iterable iterable, int i, boolean z, zzgvh zzgvhVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzN();
            return;
        }
        this.zzg = zzgww.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzJ() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzK() throws zzgwy {
        if (!this.zzf.hasNext()) {
            throw zzgwy.zzj();
        }
        zzN();
    }

    private final void zzL(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzJ()) {
            if (i2 > 0) {
                throw zzgwy.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int min = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = min;
            zzgzq.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= min;
            this.zzm += j;
        }
    }

    private final void zzM() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzgzq.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final void zzA(int i) {
        this.zzj = i;
        zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzgzq.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzd() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zze(int i) throws zzgwy {
        if (i < 0) {
            throw zzgwy.zzf();
        }
        int zzd = i + zzd();
        int i2 = this.zzj;
        if (zzd > i2) {
            throw zzgwy.zzj();
        }
        this.zzj = zzd;
        zzM();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int zza = zza() & 255;
            int zza2 = (zza() & 255) << 8;
            return zza | zza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.zzm = 4 + j2;
        int zza3 = zzgzq.zza(j2) & 255;
        int zza4 = (zzgzq.zza(1 + j2) & 255) << 8;
        return zza3 | zza4 | ((zzgzq.zza(2 + j2) & 255) << 16) | ((zzgzq.zza(j2 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzgwy.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
        }
        this.zzm = 8 + j2;
        long zza = zzgzq.zza(j2) & 255;
        long zza2 = (zzgzq.zza(1 + j2) & 255) << 8;
        long zza3 = (zzgzq.zza(j2 + 2) & 255) << 16;
        long zza4 = (zzgzq.zza(3 + j2) & 255) << 24;
        long zza5 = (zzgzq.zza(j2 + 4) & 255) << 32;
        return zza5 | zza | zza2 | zza3 | zza4 | ((zzgzq.zza(j2 + 5) & 255) << 40) | ((zzgzq.zza(j2 + 6) & 255) << 48) | ((zzgzq.zza(j2 + 7) & 255) << 56);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzgwy.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final long zzu() throws IOException {
        return zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgve zzw() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzj];
                zzgzq.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new zzgva(bArr);
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return new zzgva(bArr2);
        }
        if (zzj == 0) {
            return zzgve.zzb;
        }
        if (zzj < 0) {
            throw zzgwy.zzf();
        }
        throw zzgwy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzj];
                zzgzq.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzgww.zzb);
                this.zzm += j3;
                return str;
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return new String(bArr2, zzgww.zzb);
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzgwy.zzf();
        }
        throw zzgwy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final String zzy() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzj;
            if (j3 <= j - j2) {
                String zzg = zzgzv.zzg(this.zzg, (int) (j2 - this.zzn), zzj);
                this.zzm += j3;
                return zzg;
            }
        }
        if (zzj >= 0 && zzj <= zzJ()) {
            byte[] bArr = new byte[zzj];
            zzL(bArr, 0, zzj);
            return zzgzv.zzh(bArr, 0, zzj);
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzgwy.zzf();
        }
        throw zzgwy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final void zzz(int i) throws zzgwy {
        if (this.zzk != i) {
            throw zzgwy.zzb();
        }
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0) {
            if (i <= ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
                while (i > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzK();
                    }
                    int min = Math.min(i, (int) (this.zzo - this.zzm));
                    i -= min;
                    this.zzm += min;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzgwy.zzj();
        }
        throw zzgwy.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final boolean zzE(int i) throws IOException {
        int zzm;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzgwy.zze();
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgwy.zza();
            }
            zzB(4);
            return true;
        }
        do {
            zzm = zzm();
            if (zzm == 0) {
                break;
            }
        } while (zzE(zzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzgzq.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzj() throws IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte zza = zzgzq.zza(j);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = j2 + 1;
                int zza2 = zza ^ (zzgzq.zza(j2) << 7);
                if (zza2 < 0) {
                    i = zza2 ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int zza3 = zza2 ^ (zzgzq.zza(j3) << Ascii.SO);
                    if (zza3 >= 0) {
                        i = zza3 ^ 16256;
                    } else {
                        j3 = j4 + 1;
                        int zza4 = zza3 ^ (zzgzq.zza(j4) << Ascii.NAK);
                        if (zza4 < 0) {
                            i = zza4 ^ (-2080896);
                        } else {
                            j4 = j3 + 1;
                            byte zza5 = zzgzq.zza(j3);
                            i = (zza4 ^ (zza5 << Ascii.FS)) ^ 266354560;
                            if (zza5 < 0) {
                                j3 = j4 + 1;
                                if (zzgzq.zza(j4) < 0) {
                                    j4 = j3 + 1;
                                    if (zzgzq.zza(j3) < 0) {
                                        j3 = j4 + 1;
                                        if (zzgzq.zza(j4) < 0) {
                                            j4 = j3 + 1;
                                            if (zzgzq.zza(j3) < 0) {
                                                j3 = j4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzs();
    }

    public final long zzr() throws IOException {
        long zza;
        long j;
        long j2;
        int i;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte zza2 = zzgzq.zza(j3);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = j4 + 1;
                int zza3 = zza2 ^ (zzgzq.zza(j4) << 7);
                if (zza3 >= 0) {
                    long j6 = j5 + 1;
                    int zza4 = zza3 ^ (zzgzq.zza(j5) << Ascii.SO);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int zza5 = zza4 ^ (zzgzq.zza(j6) << Ascii.NAK);
                        if (zza5 < 0) {
                            i = zza5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long zza6 = zza5 ^ (zzgzq.zza(j5) << 28);
                            if (zza6 < 0) {
                                long j7 = j6 + 1;
                                long zza7 = zza6 ^ (zzgzq.zza(j6) << 35);
                                if (zza7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    zza6 = zza7 ^ (zzgzq.zza(j7) << 42);
                                    if (zza6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        zza7 = zza6 ^ (zzgzq.zza(j6) << 49);
                                        if (zza7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            zza = (zza7 ^ (zzgzq.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j8 = 1 + j6;
                                                if (zzgzq.zza(j6) >= 0) {
                                                    j5 = j8;
                                                    this.zzm = j5;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j;
                                j5 = j7;
                                this.zzm = j5;
                                return zza;
                            }
                            j2 = 266354560;
                            zza = zza6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzm = j5;
                    return zza;
                }
                i = zza3 ^ (-128);
                zza = i;
                this.zzm = j5;
                return zza;
            }
        }
        return zzs();
    }
}
