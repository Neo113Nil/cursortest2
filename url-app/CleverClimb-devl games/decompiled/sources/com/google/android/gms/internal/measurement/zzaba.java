package com.google.android.gms.internal.measurement;

import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzaba {
    private final byte[] buffer;
    private int zzbtu;
    private final int zzbza;
    private final int zzbzb;
    private int zzbzc;
    private int zzbzd;
    private int zzbze;
    private int zzbzf;
    private int zzbtw = Integer.MAX_VALUE;
    private int zzbtp = 64;
    private int zzbtq = 67108864;

    private zzaba(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzbza = i;
        int i3 = i2 + i;
        this.zzbzc = i3;
        this.zzbzb = i3;
        this.zzbzd = i;
    }

    public static zzaba zza(byte[] bArr, int i, int i2) {
        return new zzaba(bArr, 0, i2);
    }

    private final void zzap(int i) throws IOException {
        if (i < 0) {
            throw zzabi.zzwc();
        }
        if (this.zzbzd + i > this.zzbtw) {
            zzap(this.zzbtw - this.zzbzd);
            throw zzabi.zzwb();
        }
        if (i > this.zzbzc - this.zzbzd) {
            throw zzabi.zzwb();
        }
        this.zzbzd += i;
    }

    public static zzaba zzj(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    private final void zzts() {
        this.zzbzc += this.zzbtu;
        int i = this.zzbzc;
        if (i <= this.zzbtw) {
            this.zzbtu = 0;
        } else {
            this.zzbtu = i - this.zzbtw;
            this.zzbzc -= this.zzbtu;
        }
    }

    private final byte zzvx() throws IOException {
        if (this.zzbzd == this.zzbzc) {
            throw zzabi.zzwb();
        }
        byte[] bArr = this.buffer;
        int i = this.zzbzd;
        this.zzbzd = i + 1;
        return bArr[i];
    }

    public final int getPosition() {
        return this.zzbzd - this.zzbza;
    }

    public final String readString() throws IOException {
        int zzvs = zzvs();
        if (zzvs < 0) {
            throw zzabi.zzwc();
        }
        if (zzvs > this.zzbzc - this.zzbzd) {
            throw zzabi.zzwb();
        }
        String str = new String(this.buffer, this.zzbzd, zzvs, zzabh.UTF_8);
        this.zzbzd += zzvs;
        return str;
    }

    public final void zza(zzabj zzabjVar) throws IOException {
        int zzvs = zzvs();
        if (this.zzbzf >= this.zzbtp) {
            throw zzabi.zzwe();
        }
        int zzah = zzah(zzvs);
        this.zzbzf++;
        zzabjVar.zzb(this);
        zzal(0);
        this.zzbzf--;
        zzan(zzah);
    }

    public final void zza(zzabj zzabjVar, int i) throws IOException {
        if (this.zzbzf >= this.zzbtp) {
            throw zzabi.zzwe();
        }
        this.zzbzf++;
        zzabjVar.zzb(this);
        zzal((i << 3) | 4);
        this.zzbzf--;
    }

    public final int zzah(int i) throws zzabi {
        if (i < 0) {
            throw zzabi.zzwc();
        }
        int i2 = i + this.zzbzd;
        int i3 = this.zzbtw;
        if (i2 > i3) {
            throw zzabi.zzwb();
        }
        this.zzbtw = i2;
        zzts();
        return i3;
    }

    public final void zzal(int i) throws zzabi {
        if (this.zzbze != i) {
            throw new zzabi("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzam(int i) throws IOException {
        int zzvo;
        switch (i & 7) {
            case 0:
                zzvs();
                return true;
            case 1:
                zzvv();
                return true;
            case 2:
                zzap(zzvs());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzvu();
                return true;
            default:
                throw new zzabi("Protocol message tag had invalid wire type.");
        }
        do {
            zzvo = zzvo();
            if (zzvo != 0) {
            }
            zzal(((i >>> 3) << 3) | 4);
            return true;
        } while (zzam(zzvo));
        zzal(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void zzan(int i) {
        this.zzbtw = i;
        zzts();
    }

    public final void zzao(int i) {
        zzd(i, this.zzbze);
    }

    public final byte[] zzc(int i, int i2) {
        if (i2 == 0) {
            return zzabm.zzcae;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzbza + i, bArr, 0, i2);
        return bArr;
    }

    final void zzd(int i, int i2) {
        if (i > this.zzbzd - this.zzbza) {
            int i3 = this.zzbzd - this.zzbza;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0) {
            this.zzbzd = this.zzbza + i;
            this.zzbze = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int zzvo() throws IOException {
        if (this.zzbzd == this.zzbzc) {
            this.zzbze = 0;
            return 0;
        }
        this.zzbze = zzvs();
        if (this.zzbze != 0) {
            return this.zzbze;
        }
        throw new zzabi("Protocol message contained an invalid tag (zero).");
    }

    public final long zzvp() throws IOException {
        return zzvt();
    }

    public final int zzvq() throws IOException {
        return zzvs();
    }

    public final boolean zzvr() throws IOException {
        return zzvs() != 0;
    }

    public final int zzvs() throws IOException {
        int i;
        byte zzvx = zzvx();
        if (zzvx >= 0) {
            return zzvx;
        }
        int i2 = zzvx & Byte.MAX_VALUE;
        byte zzvx2 = zzvx();
        if (zzvx2 >= 0) {
            i = zzvx2 << 7;
        } else {
            i2 |= (zzvx2 & Byte.MAX_VALUE) << 7;
            byte zzvx3 = zzvx();
            if (zzvx3 >= 0) {
                i = zzvx3 << ao.l;
            } else {
                i2 |= (zzvx3 & Byte.MAX_VALUE) << 14;
                byte zzvx4 = zzvx();
                if (zzvx4 < 0) {
                    int i3 = i2 | ((zzvx4 & Byte.MAX_VALUE) << 21);
                    byte zzvx5 = zzvx();
                    int i4 = i3 | (zzvx5 << 28);
                    if (zzvx5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzvx() >= 0) {
                            return i4;
                        }
                    }
                    throw zzabi.zzwd();
                }
                i = zzvx4 << 21;
            }
        }
        return i2 | i;
    }

    public final long zzvt() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzvx() & 128) == 0) {
                return j;
            }
        }
        throw zzabi.zzwd();
    }

    public final int zzvu() throws IOException {
        return (zzvx() & 255) | ((zzvx() & 255) << 8) | ((zzvx() & 255) << 16) | ((zzvx() & 255) << 24);
    }

    public final long zzvv() throws IOException {
        return ((zzvx() & 255) << 8) | (zzvx() & 255) | ((zzvx() & 255) << 16) | ((zzvx() & 255) << 24) | ((zzvx() & 255) << 32) | ((zzvx() & 255) << 40) | ((zzvx() & 255) << 48) | ((zzvx() & 255) << 56);
    }

    public final int zzvw() {
        if (this.zzbtw == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzbtw - this.zzbzd;
    }
}
