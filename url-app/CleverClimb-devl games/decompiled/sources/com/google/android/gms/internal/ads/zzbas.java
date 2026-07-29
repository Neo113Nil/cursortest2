package com.google.android.gms.internal.ads;

import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzbas extends zzbaq {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzdqd;
    private int zzdqe;
    private int zzdqf;
    private int zzdqg;
    private int zzdqh;

    private zzbas(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzdqh = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzdqf = this.pos;
        this.zzdqd = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r1[r2] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzacc() throws IOException {
        int i;
        int i2 = this.pos;
        if (this.limit != i2) {
            byte[] bArr = this.buffer;
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.pos = i3;
                return b2;
            }
            if (this.limit - i3 >= 9) {
                int i4 = i3 + 1;
                int i5 = b2 ^ (bArr[i3] << 7);
                if (i5 < 0) {
                    i = i5 ^ (-128);
                } else {
                    int i6 = i4 + 1;
                    int i7 = i5 ^ (bArr[i4] << ao.l);
                    if (i7 >= 0) {
                        i = i7 ^ 16256;
                    } else {
                        i4 = i6 + 1;
                        int i8 = i7 ^ (bArr[i6] << 21);
                        if (i8 < 0) {
                            i = i8 ^ (-2080896);
                        } else {
                            i6 = i4 + 1;
                            byte b3 = bArr[i4];
                            i = (i8 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i4 = i6 + 1;
                                if (bArr[i6] < 0) {
                                    i6 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i6 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = i6;
                }
                this.pos = i4;
                return i;
            }
        }
        return (int) zzabz();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r1[r0] >= 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzacd() throws IOException {
        int i;
        long j;
        long j2;
        long j3;
        int i2;
        long j4;
        int i3 = this.pos;
        if (this.limit != i3) {
            byte[] bArr = this.buffer;
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.pos = i4;
                return b2;
            }
            if (this.limit - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b2 ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i2 = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << ao.l);
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                        i = i7;
                        j = j4;
                        this.pos = i;
                        return j;
                    }
                    i5 = i7 + 1;
                    int i9 = i8 ^ (bArr[i7] << 21);
                    if (i9 >= 0) {
                        long j5 = i9;
                        i = i5 + 1;
                        long j6 = (bArr[i5] << 28) ^ j5;
                        if (j6 < 0) {
                            int i10 = i + 1;
                            long j7 = j6 ^ (bArr[i] << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i = i10 + 1;
                                j6 = j7 ^ (bArr[i10] << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i10 = i + 1;
                                    j7 = j6 ^ (bArr[i] << 49);
                                    if (j7 >= 0) {
                                        i = i10 + 1;
                                        j = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                        if (j < 0) {
                                            i10 = i + 1;
                                        }
                                        this.pos = i;
                                        return j;
                                    }
                                    j2 = -558586000294016L;
                                }
                            }
                            j = j2 ^ j7;
                            i = i10;
                            this.pos = i;
                            return j;
                        }
                        j3 = 266354560;
                        j = j6 ^ j3;
                        this.pos = i;
                        return j;
                    }
                    i2 = i9 ^ (-2080896);
                }
                j4 = i2;
                i = i5;
                j = j4;
                this.pos = i;
                return j;
            }
        }
        return zzabz();
    }

    private final int zzace() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzacf() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final void zzacg() {
        this.limit += this.zzdqe;
        int i = this.limit - this.zzdqf;
        if (i <= this.zzdqh) {
            this.zzdqe = 0;
        } else {
            this.zzdqe = i - this.zzdqh;
            this.limit -= this.zzdqe;
        }
    }

    private final byte zzach() throws IOException {
        if (this.pos == this.limit) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzacf());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzace());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String readString() throws IOException {
        int zzacc = zzacc();
        if (zzacc > 0 && zzacc <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzacc, zzbbq.UTF_8);
            this.pos += zzacc;
            return str;
        }
        if (zzacc == 0) {
            return "";
        }
        if (zzacc < 0) {
            throw zzbbu.zzadm();
        }
        throw zzbbu.zzadl();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabk() throws IOException {
        if (zzaca()) {
            this.zzdqg = 0;
            return 0;
        }
        this.zzdqg = zzacc();
        if ((this.zzdqg >>> 3) != 0) {
            return this.zzdqg;
        }
        throw zzbbu.zzado();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabl() throws IOException {
        return zzacd();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabm() throws IOException {
        return zzacd();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabn() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabo() throws IOException {
        return zzacf();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabp() throws IOException {
        return zzace();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzabq() throws IOException {
        return zzacd() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String zzabr() throws IOException {
        int zzacc = zzacc();
        if (zzacc <= 0 || zzacc > this.limit - this.pos) {
            if (zzacc == 0) {
                return "";
            }
            if (zzacc <= 0) {
                throw zzbbu.zzadm();
            }
            throw zzbbu.zzadl();
        }
        if (!zzbem.zzf(this.buffer, this.pos, this.pos + zzacc)) {
            throw zzbbu.zzads();
        }
        int i = this.pos;
        this.pos += zzacc;
        return new String(this.buffer, i, zzacc, zzbbq.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzbah zzabs() throws IOException {
        byte[] bArr;
        int zzacc = zzacc();
        if (zzacc > 0 && zzacc <= this.limit - this.pos) {
            zzbah zzc = zzbah.zzc(this.buffer, this.pos, zzacc);
            this.pos += zzacc;
            return zzc;
        }
        if (zzacc == 0) {
            return zzbah.zzdpq;
        }
        if (zzacc > 0 && zzacc <= this.limit - this.pos) {
            int i = this.pos;
            this.pos += zzacc;
            bArr = Arrays.copyOfRange(this.buffer, i, this.pos);
        } else {
            if (zzacc > 0) {
                throw zzbbu.zzadl();
            }
            if (zzacc != 0) {
                throw zzbbu.zzadm();
            }
            bArr = zzbbq.zzduq;
        }
        return zzbah.zzp(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabt() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabu() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabv() throws IOException {
        return zzace();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabw() throws IOException {
        return zzacf();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabx() throws IOException {
        return zzbu(zzacc());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzaby() throws IOException {
        return zzl(zzacd());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    final long zzabz() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzach() & 128) == 0) {
                return j;
            }
        }
        throw zzbbu.zzadn();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzaca() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzacb() {
        return this.pos - this.zzdqf;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbp(int i) throws zzbbu {
        if (this.zzdqg != i) {
            throw zzbbu.zzadp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzbq(int i) throws IOException {
        int zzabk;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.limit - this.pos < 10) {
                    while (i2 < 10) {
                        if (zzach() < 0) {
                            i2++;
                        }
                    }
                    throw zzbbu.zzadn();
                }
                while (i2 < 10) {
                    byte[] bArr = this.buffer;
                    int i3 = this.pos;
                    this.pos = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw zzbbu.zzadn();
                return true;
            case 1:
                zzbt(8);
                return true;
            case 2:
                zzbt(zzacc());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzbt(4);
                return true;
            default:
                throw zzbbu.zzadq();
        }
        do {
            zzabk = zzabk();
            if (zzabk != 0) {
            }
            zzbp(((i >>> 3) << 3) | 4);
            return true;
        } while (zzbq(zzabk));
        zzbp(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzbr(int i) throws zzbbu {
        if (i < 0) {
            throw zzbbu.zzadm();
        }
        int zzacb = i + zzacb();
        int i2 = this.zzdqh;
        if (zzacb > i2) {
            throw zzbbu.zzadl();
        }
        this.zzdqh = zzacb;
        zzacg();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbs(int i) {
        this.zzdqh = i;
        zzacg();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbt(int i) throws IOException {
        if (i >= 0 && i <= this.limit - this.pos) {
            this.pos += i;
        } else {
            if (i >= 0) {
                throw zzbbu.zzadl();
            }
            throw zzbbu.zzadm();
        }
    }
}
