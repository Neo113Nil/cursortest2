package com.google.android.gms.internal.drive;

import com.umeng.commonsdk.proguard.ao;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzio {
    private final byte[] buffer;
    private final int zzmn;
    private final int zzmo;
    private int zzmp;
    private int zzmq;
    private int zzmr;
    private int zzms = Integer.MAX_VALUE;
    private int zzmt = 64;
    private int zzmu = 67108864;

    private zzio(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzmn = i;
        int i3 = i2 + i;
        this.zzmp = i3;
        this.zzmo = i3;
        this.zzmq = i;
    }

    public static zzio zza(byte[] bArr, int i, int i2) {
        return new zzio(bArr, 0, i2);
    }

    private final byte zzbg() throws IOException {
        if (this.zzmq == this.zzmp) {
            throw zziw.zzbk();
        }
        byte[] bArr = this.buffer;
        int i = this.zzmq;
        this.zzmq = i + 1;
        return bArr[i];
    }

    private final void zzl(int i) throws IOException {
        if (i < 0) {
            throw zziw.zzbl();
        }
        if (this.zzmq + i > this.zzms) {
            zzl(this.zzms - this.zzmq);
            throw zziw.zzbk();
        }
        if (i > this.zzmp - this.zzmq) {
            throw zziw.zzbk();
        }
        this.zzmq += i;
    }

    public final int getPosition() {
        return this.zzmq - this.zzmn;
    }

    public final String readString() throws IOException {
        int zzbe = zzbe();
        if (zzbe < 0) {
            throw zziw.zzbl();
        }
        if (zzbe > this.zzmp - this.zzmq) {
            throw zziw.zzbk();
        }
        String str = new String(this.buffer, this.zzmq, zzbe, zziv.UTF_8);
        this.zzmq += zzbe;
        return str;
    }

    public final byte[] zza(int i, int i2) {
        if (i2 == 0) {
            return zzja.zzns;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzmn + i, bArr, 0, i2);
        return bArr;
    }

    public final int zzbd() throws IOException {
        if (this.zzmq == this.zzmp) {
            this.zzmr = 0;
            return 0;
        }
        this.zzmr = zzbe();
        if (this.zzmr != 0) {
            return this.zzmr;
        }
        throw new zziw("Protocol message contained an invalid tag (zero).");
    }

    public final int zzbe() throws IOException {
        int i;
        byte zzbg = zzbg();
        if (zzbg >= 0) {
            return zzbg;
        }
        int i2 = zzbg & Byte.MAX_VALUE;
        byte zzbg2 = zzbg();
        if (zzbg2 >= 0) {
            i = zzbg2 << 7;
        } else {
            i2 |= (zzbg2 & Byte.MAX_VALUE) << 7;
            byte zzbg3 = zzbg();
            if (zzbg3 >= 0) {
                i = zzbg3 << ao.l;
            } else {
                i2 |= (zzbg3 & Byte.MAX_VALUE) << 14;
                byte zzbg4 = zzbg();
                if (zzbg4 < 0) {
                    int i3 = i2 | ((zzbg4 & Byte.MAX_VALUE) << 21);
                    byte zzbg5 = zzbg();
                    int i4 = i3 | (zzbg5 << 28);
                    if (zzbg5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzbg() >= 0) {
                            return i4;
                        }
                    }
                    throw zziw.zzbm();
                }
                i = zzbg4 << 21;
            }
        }
        return i2 | i;
    }

    public final long zzbf() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzbg() & 128) == 0) {
                return j;
            }
        }
        throw zziw.zzbm();
    }

    public final void zzj(int i) throws zziw {
        if (this.zzmr != i) {
            throw new zziw("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzk(int i) throws IOException {
        int zzbd;
        switch (i & 7) {
            case 0:
                zzbe();
                return true;
            case 1:
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                return true;
            case 2:
                zzl(zzbe());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzbg();
                zzbg();
                zzbg();
                zzbg();
                return true;
            default:
                throw new zziw("Protocol message tag had invalid wire type.");
        }
        do {
            zzbd = zzbd();
            if (zzbd != 0) {
            }
            zzj(((i >>> 3) << 3) | 4);
            return true;
        } while (zzk(zzbd));
        zzj(((i >>> 3) << 3) | 4);
        return true;
    }
}
