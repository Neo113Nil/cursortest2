package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgwu extends zzgww {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzgwu(ByteBuffer byteBuffer, boolean z, zzgwt zzgwtVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long zze = zzhaz.zze(byteBuffer);
        this.zzf = zze;
        this.zzg = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzh = position;
        this.zzi = position;
    }

    private final int zzC() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzI() {
        long j = this.zzg + this.zzj;
        this.zzg = j;
        int i = (int) (j - this.zzi);
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzg = j - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzc() {
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzd(int i) throws zzgyn {
        if (i < 0) {
            throw zzgyn.zzf();
        }
        int zzc = i + zzc();
        int i2 = this.zzl;
        if (zzc > i2) {
            throw zzgyn.zzi();
        }
        this.zzl = zzc;
        zzI();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 4) {
            throw zzgyn.zzi();
        }
        this.zzh = 4 + j;
        int zza = zzhaz.zza(j) & 255;
        int zza2 = zzhaz.zza(1 + j) & 255;
        int zza3 = zzhaz.zza(2 + j) & 255;
        return ((zzhaz.zza(j + 3) & 255) << 24) | (zza2 << 8) | zza | (zza3 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzk() throws IOException {
        return zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzk = zzi;
        if ((zzi >>> 3) != 0) {
            return zzi;
        }
        throw zzgyn.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 8) {
            throw zzgyn.zzi();
        }
        this.zzh = 8 + j;
        long zza = zzhaz.zza(j);
        long zza2 = zzhaz.zza(1 + j);
        long zza3 = zzhaz.zza(2 + j);
        long zza4 = zzhaz.zza(3 + j);
        long zza5 = zzhaz.zza(4 + j);
        return ((zzhaz.zza(j + 7) & 255) << 56) | (zza & 255) | ((zza2 & 255) << 8) | ((zza3 & 255) << 16) | ((zza4 & 255) << 24) | ((zza5 & 255) << 32) | ((zzhaz.zza(5 + j) & 255) << 40) | ((zzhaz.zza(6 + j) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzt() throws IOException {
        return zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final zzgwm zzv() throws IOException {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return zzgwm.zzb;
            }
            if (zzi < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhaz.zzo(this.zzh, bArr, 0L, j);
        this.zzh += j;
        return new zzgwk(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return "";
            }
            if (zzi < 0) {
                throw zzgyn.zzf();
            }
            throw zzgyn.zzi();
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhaz.zzo(this.zzh, bArr, 0L, j);
        String str = new String(bArr, zzgyl.zza);
        this.zzh += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhbe.zzg(this.zze, (int) (this.zzh - this.zzf), zzi);
            this.zzh += zzi;
            return zzg;
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzy(int i) throws zzgyn {
        if (this.zzk != i) {
            throw zzgyn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzz(int i) {
        this.zzl = i;
        zzI();
    }

    final long zzr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.zzh;
            if (j2 == this.zzg) {
                throw zzgyn.zzi();
            }
            this.zzh = 1 + j2;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzhaz.zza(j2) & 128) == 0) {
                return j;
            }
        }
        throw zzgyn.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhaz.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() throws IOException {
        int i;
        long j = this.zzh;
        if (this.zzg != j) {
            long j2 = 1 + j;
            byte zza = zzhaz.zza(j);
            if (zza >= 0) {
                this.zzh = j2;
                return zza;
            }
            if (this.zzg - j2 >= 9) {
                long j3 = 2 + j;
                int zza2 = (zzhaz.zza(j2) << 7) ^ zza;
                if (zza2 < 0) {
                    i = zza2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int zza3 = zza2 ^ (zzhaz.zza(j3) << Ascii.SO);
                    if (zza3 >= 0) {
                        i = zza3 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int zza4 = zza3 ^ (zzhaz.zza(j4) << Ascii.NAK);
                        if (zza4 < 0) {
                            i = (-2080896) ^ zza4;
                        } else {
                            j4 = 5 + j;
                            byte zza5 = zzhaz.zza(j3);
                            int i2 = (zza4 ^ (zza5 << Ascii.FS)) ^ 266354560;
                            if (zza5 < 0) {
                                j3 = 6 + j;
                                if (zzhaz.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhaz.zza(j3) < 0) {
                                        j3 = 8 + j;
                                        if (zzhaz.zza(j4) < 0) {
                                            j4 = j + 9;
                                            if (zzhaz.zza(j3) < 0) {
                                                j3 = 10 + j;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.zzh = j3;
                return i;
            }
        }
        return (int) zzr();
    }

    public final long zzq() throws IOException {
        long j;
        long j2;
        int i;
        long j3 = this.zzh;
        if (this.zzg != j3) {
            long j4 = 1 + j3;
            byte zza = zzhaz.zza(j3);
            if (zza >= 0) {
                this.zzh = j4;
                return zza;
            }
            if (this.zzg - j4 >= 9) {
                long j5 = 2 + j3;
                int zza2 = (zzhaz.zza(j4) << 7) ^ zza;
                if (zza2 >= 0) {
                    long j6 = 3 + j3;
                    int zza3 = zza2 ^ (zzhaz.zza(j5) << Ascii.SO);
                    if (zza3 >= 0) {
                        j = zza3 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int zza4 = zza3 ^ (zzhaz.zza(j6) << Ascii.NAK);
                        if (zza4 < 0) {
                            i = (-2080896) ^ zza4;
                        } else {
                            j6 = 5 + j3;
                            long zza5 = (zzhaz.zza(j5) << 28) ^ zza4;
                            if (zza5 < 0) {
                                long j7 = 6 + j3;
                                long zza6 = (zzhaz.zza(j6) << 35) ^ zza5;
                                if (zza6 >= 0) {
                                    j5 = j3 + 7;
                                    long zza7 = zza6 ^ (zzhaz.zza(j7) << 42);
                                    if (zza7 >= 0) {
                                        j = 4363953127296L ^ zza7;
                                    } else {
                                        j7 = 8 + j3;
                                        zza6 = zza7 ^ (zzhaz.zza(j5) << 49);
                                        if (zza6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long zza8 = (zza6 ^ (zzhaz.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzhaz.zza(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = zza8;
                                        }
                                    }
                                    this.zzh = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ zza6;
                                j5 = j7;
                                this.zzh = j5;
                                return j;
                            }
                            j = 266354560 ^ zza5;
                        }
                    }
                    j5 = j6;
                    this.zzh = j5;
                    return j;
                }
                i = zza2 ^ (-128);
                j = i;
                this.zzh = j5;
                return j;
            }
        }
        return zzr();
    }
}
