package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yf implements ig, hg, Cloneable, ByteChannel {
    public long OPXfSBeufaJ8;
    public z12 rtx2ld2ELZv4;

    public final int IAToe7bXGz4N() {
        int i;
        int i2;
        int i3;
        if (this.OPXfSBeufaJ8 == 0) {
            throw new EOFException();
        }
        byte cpQdD2nAriOS = cpQdD2nAriOS(0L);
        if ((cpQdD2nAriOS & 128) == 0) {
            i = cpQdD2nAriOS & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((cpQdD2nAriOS & 224) == 192) {
            i = cpQdD2nAriOS & 31;
            i2 = 2;
            i3 = 128;
        } else if ((cpQdD2nAriOS & 240) == 224) {
            i = cpQdD2nAriOS & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((cpQdD2nAriOS & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = cpQdD2nAriOS & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.OPXfSBeufaJ8 < j) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i2, "size < ", ": ");
            BRwzKIf41E4i.append(this.OPXfSBeufaJ8);
            BRwzKIf41E4i.append(" (to read code point prefixed 0x");
            char[] cArr = f2.PxuCJdSBwIXG;
            BRwzKIf41E4i.append(new String(new char[]{cArr[(cpQdD2nAriOS >> 4) & 15], cArr[cpQdD2nAriOS & 15]}));
            BRwzKIf41E4i.append(')');
            throw new EOFException(BRwzKIf41E4i.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte cpQdD2nAriOS2 = cpQdD2nAriOS(j2);
            if ((cpQdD2nAriOS2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (cpQdD2nAriOS2 & 63);
        }
        skip(j);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.ig
    public final void J54yh1s3n4Aq(long j) {
        if (this.OPXfSBeufaJ8 < j) {
            throw new EOFException();
        }
    }

    public final boolean OPXfSBeufaJ8() {
        return this.OPXfSBeufaJ8 == 0;
    }

    public final void POWyO8hTM6YC(long j) {
        if (j == 0) {
            Pf0ThKz3j5YS(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        z12 kpCQ9veP6n3I = kpCQ9veP6n3I(i);
        byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
        int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = lS5Rgt96tfkO.PxuCJdSBwIXG[(int) (15 & j)];
            j >>>= 4;
        }
        kpCQ9veP6n3I.TSizfFm2Yiuu += i;
        this.OPXfSBeufaJ8 += i;
    }

    public final void Pf0ThKz3j5YS(int i) {
        z12 kpCQ9veP6n3I = kpCQ9veP6n3I(1);
        byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
        int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu;
        kpCQ9veP6n3I.TSizfFm2Yiuu = i2 + 1;
        bArr[i2] = (byte) i;
        this.OPXfSBeufaJ8++;
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        yfVar.getClass();
        if (j < 0) {
            u9.OPXfSBeufaJ8("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.OPXfSBeufaJ8;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        yfVar.VhhvGxCb8gfr(j, this);
        return j;
    }

    public final byte[] RfyTYNmI9Srp(long j) {
        if (j < 0 || j > 2147483647L) {
            u9.OPXfSBeufaJ8("byteCount: ", j);
            return null;
        }
        if (this.OPXfSBeufaJ8 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long S2OOm9zPNm0h() {
        int i;
        if (this.OPXfSBeufaJ8 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            z12 z12Var = this.rtx2ld2ELZv4;
            z12Var.getClass();
            byte[] bArr = z12Var.PxuCJdSBwIXG;
            int i3 = z12Var.lS5Rgt96tfkO;
            int i4 = z12Var.TSizfFm2Yiuu;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = f2.PxuCJdSBwIXG;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
                        d22.PxuCJdSBwIXG(z12Var);
                    } else {
                        z12Var.lS5Rgt96tfkO = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    yf yfVar = new yf();
                    yfVar.POWyO8hTM6YC(j);
                    yfVar.Pf0ThKz3j5YS(b);
                    throw new NumberFormatException("Number too large: ".concat(yfVar.pnx5pC0XzaCw()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.rtx2ld2ELZv4 != null);
        this.OPXfSBeufaJ8 -= i2;
        return j;
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return yj2.Y1f8riQaR6yg;
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        z12 lS5Rgt96tfkO;
        yfVar.getClass();
        if (yfVar == this) {
            u9.XL4ISE6Oc65B("source == this");
            return;
        }
        cs0.cpQdD2nAriOS(yfVar.OPXfSBeufaJ8, 0L, j);
        while (j > 0) {
            z12 z12Var = yfVar.rtx2ld2ELZv4;
            z12Var.getClass();
            int i = z12Var.TSizfFm2Yiuu;
            z12 z12Var2 = yfVar.rtx2ld2ELZv4;
            z12Var2.getClass();
            long j2 = i - z12Var2.lS5Rgt96tfkO;
            int i2 = 0;
            if (j < j2) {
                z12 z12Var3 = this.rtx2ld2ELZv4;
                z12 z12Var4 = z12Var3 != null ? z12Var3.RAsUl2FVSrh6 : null;
                if (z12Var4 != null && z12Var4.e9gEMXR7LXtO) {
                    if ((z12Var4.TSizfFm2Yiuu + j) - (z12Var4.Y1f8riQaR6yg ? 0 : z12Var4.lS5Rgt96tfkO) <= 8192) {
                        z12 z12Var5 = yfVar.rtx2ld2ELZv4;
                        z12Var5.getClass();
                        z12Var5.Y1f8riQaR6yg(z12Var4, (int) j);
                        yfVar.OPXfSBeufaJ8 -= j;
                        this.OPXfSBeufaJ8 += j;
                        return;
                    }
                }
                z12 z12Var6 = yfVar.rtx2ld2ELZv4;
                z12Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > z12Var6.TSizfFm2Yiuu - z12Var6.lS5Rgt96tfkO) {
                    u9.XL4ISE6Oc65B("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    lS5Rgt96tfkO = z12Var6.TSizfFm2Yiuu();
                } else {
                    lS5Rgt96tfkO = d22.lS5Rgt96tfkO();
                    byte[] bArr = z12Var6.PxuCJdSBwIXG;
                    byte[] bArr2 = lS5Rgt96tfkO.PxuCJdSBwIXG;
                    int i4 = z12Var6.lS5Rgt96tfkO;
                    na.D0aTLcX6Uhyo(bArr, bArr2, 0, i4, i4 + i3);
                }
                lS5Rgt96tfkO.TSizfFm2Yiuu = lS5Rgt96tfkO.lS5Rgt96tfkO + i3;
                z12Var6.lS5Rgt96tfkO += i3;
                z12 z12Var7 = z12Var6.RAsUl2FVSrh6;
                z12Var7.getClass();
                z12Var7.lS5Rgt96tfkO(lS5Rgt96tfkO);
                yfVar.rtx2ld2ELZv4 = lS5Rgt96tfkO;
            }
            z12 z12Var8 = yfVar.rtx2ld2ELZv4;
            z12Var8.getClass();
            long j3 = z12Var8.TSizfFm2Yiuu - z12Var8.lS5Rgt96tfkO;
            yfVar.rtx2ld2ELZv4 = z12Var8.PxuCJdSBwIXG();
            z12 z12Var9 = this.rtx2ld2ELZv4;
            if (z12Var9 == null) {
                this.rtx2ld2ELZv4 = z12Var8;
                z12Var8.RAsUl2FVSrh6 = z12Var8;
                z12Var8.a92UlCVFR9N8 = z12Var8;
            } else {
                z12 z12Var10 = z12Var9.RAsUl2FVSrh6;
                z12Var10.getClass();
                z12Var10.lS5Rgt96tfkO(z12Var8);
                z12 z12Var11 = z12Var8.RAsUl2FVSrh6;
                if (z12Var11 == z12Var8) {
                    u9.rtx2ld2ELZv4("cannot compact");
                    return;
                }
                z12Var11.getClass();
                if (z12Var11.e9gEMXR7LXtO) {
                    int i5 = z12Var8.TSizfFm2Yiuu - z12Var8.lS5Rgt96tfkO;
                    z12 z12Var12 = z12Var8.RAsUl2FVSrh6;
                    z12Var12.getClass();
                    int i6 = 8192 - z12Var12.TSizfFm2Yiuu;
                    z12 z12Var13 = z12Var8.RAsUl2FVSrh6;
                    z12Var13.getClass();
                    if (!z12Var13.Y1f8riQaR6yg) {
                        z12 z12Var14 = z12Var8.RAsUl2FVSrh6;
                        z12Var14.getClass();
                        i2 = z12Var14.lS5Rgt96tfkO;
                    }
                    if (i5 <= i6 + i2) {
                        z12 z12Var15 = z12Var8.RAsUl2FVSrh6;
                        z12Var15.getClass();
                        z12Var8.Y1f8riQaR6yg(z12Var15, i5);
                        z12Var8.PxuCJdSBwIXG();
                        d22.PxuCJdSBwIXG(z12Var8);
                    }
                }
            }
            yfVar.OPXfSBeufaJ8 -= j3;
            this.OPXfSBeufaJ8 += j3;
            j -= j3;
        }
    }

    public final void XL4ISE6Oc65B(xf xfVar) {
        xfVar.getClass();
        byte[] bArr = lS5Rgt96tfkO.PxuCJdSBwIXG;
        if (xfVar.rtx2ld2ELZv4 != null) {
            u9.rtx2ld2ELZv4("already attached to a buffer");
        } else {
            xfVar.rtx2ld2ELZv4 = this;
            xfVar.OPXfSBeufaJ8 = true;
        }
    }

    public final String ZbWwgt3aGe7A(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            u9.OPXfSBeufaJ8("byteCount: ", j);
            return null;
        }
        if (this.OPXfSBeufaJ8 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        if (i + j > z12Var.TSizfFm2Yiuu) {
            return new String(RfyTYNmI9Srp(j), charset);
        }
        int i2 = (int) j;
        String str = new String(z12Var.PxuCJdSBwIXG, i, i2, charset);
        int i3 = z12Var.lS5Rgt96tfkO + i2;
        z12Var.lS5Rgt96tfkO = i3;
        this.OPXfSBeufaJ8 -= j;
        if (i3 == z12Var.TSizfFm2Yiuu) {
            this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(z12Var);
        }
        return str;
    }

    public final void a92UlCVFR9N8(yf yfVar, long j, long j2) {
        yfVar.getClass();
        long j3 = j;
        cs0.cpQdD2nAriOS(this.OPXfSBeufaJ8, j3, j2);
        if (j2 == 0) {
            return;
        }
        yfVar.OPXfSBeufaJ8 += j2;
        z12 z12Var = this.rtx2ld2ELZv4;
        while (true) {
            z12Var.getClass();
            long j4 = z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            z12Var = z12Var.a92UlCVFR9N8;
        }
        long j5 = j2;
        while (j5 > 0) {
            z12Var.getClass();
            z12 TSizfFm2Yiuu = z12Var.TSizfFm2Yiuu();
            int i = TSizfFm2Yiuu.lS5Rgt96tfkO + ((int) j3);
            TSizfFm2Yiuu.lS5Rgt96tfkO = i;
            TSizfFm2Yiuu.TSizfFm2Yiuu = Math.min(i + ((int) j5), TSizfFm2Yiuu.TSizfFm2Yiuu);
            z12 z12Var2 = yfVar.rtx2ld2ELZv4;
            if (z12Var2 == null) {
                TSizfFm2Yiuu.RAsUl2FVSrh6 = TSizfFm2Yiuu;
                TSizfFm2Yiuu.a92UlCVFR9N8 = TSizfFm2Yiuu;
                yfVar.rtx2ld2ELZv4 = TSizfFm2Yiuu;
            } else {
                z12 z12Var3 = z12Var2.RAsUl2FVSrh6;
                z12Var3.getClass();
                z12Var3.lS5Rgt96tfkO(TSizfFm2Yiuu);
            }
            j5 -= TSizfFm2Yiuu.TSizfFm2Yiuu - TSizfFm2Yiuu.lS5Rgt96tfkO;
            z12Var = z12Var.a92UlCVFR9N8;
            j3 = 0;
        }
    }

    public final ah aF05bpZJlKEP(int i) {
        if (i == 0) {
            return ah.dgRBjINgWbAK;
        }
        cs0.cpQdD2nAriOS(this.OPXfSBeufaJ8, 0L, i);
        z12 z12Var = this.rtx2ld2ELZv4;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            z12Var.getClass();
            int i5 = z12Var.TSizfFm2Yiuu;
            int i6 = z12Var.lS5Rgt96tfkO;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            z12Var = z12Var.a92UlCVFR9N8;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        z12 z12Var2 = this.rtx2ld2ELZv4;
        int i7 = 0;
        while (i2 < i) {
            z12Var2.getClass();
            bArr[i7] = z12Var2.PxuCJdSBwIXG;
            i2 += z12Var2.TSizfFm2Yiuu - z12Var2.lS5Rgt96tfkO;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = z12Var2.lS5Rgt96tfkO;
            z12Var2.Y1f8riQaR6yg = true;
            i7++;
            z12Var2 = z12Var2.a92UlCVFR9N8;
        }
        return new e22(bArr, iArr);
    }

    public final byte cpQdD2nAriOS(long j) {
        cs0.cpQdD2nAriOS(this.OPXfSBeufaJ8, j, 1L);
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        long j2 = this.OPXfSBeufaJ8;
        if (j2 - j < j) {
            while (j2 > j) {
                z12Var = z12Var.RAsUl2FVSrh6;
                z12Var.getClass();
                j2 -= z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
            }
            return z12Var.PxuCJdSBwIXG[(int) ((z12Var.lS5Rgt96tfkO + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = z12Var.TSizfFm2Yiuu;
            int i2 = z12Var.lS5Rgt96tfkO;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return z12Var.PxuCJdSBwIXG[(int) ((i2 + j) - j3)];
            }
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.ig
    public final String e6tOsSdd2EFb(long j) {
        if (j < 0) {
            u9.OPXfSBeufaJ8("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long gPXPFXrUH4XX = gPXPFXrUH4XX((byte) 10, 0L, j2);
        if (gPXPFXrUH4XX != -1) {
            return lS5Rgt96tfkO.lS5Rgt96tfkO(gPXPFXrUH4XX, this);
        }
        if (j2 < this.OPXfSBeufaJ8 && cpQdD2nAriOS(j2 - 1) == 13 && cpQdD2nAriOS(j2) == 10) {
            return lS5Rgt96tfkO.lS5Rgt96tfkO(j2, this);
        }
        yf yfVar = new yf();
        a92UlCVFR9N8(yfVar, 0L, Math.min(32L, this.OPXfSBeufaJ8));
        throw new EOFException("\\n not found: limit=" + Math.min(this.OPXfSBeufaJ8, j) + " content=" + yfVar.x50lh2ztY7Y5(yfVar.OPXfSBeufaJ8).Y1f8riQaR6yg() + (char) 8230);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        long j = this.OPXfSBeufaJ8;
        yf yfVar = (yf) obj;
        if (j != yfVar.OPXfSBeufaJ8) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        z12 z12Var2 = yfVar.rtx2ld2ELZv4;
        z12Var2.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        int i2 = z12Var2.lS5Rgt96tfkO;
        long j2 = 0;
        while (j2 < this.OPXfSBeufaJ8) {
            long min = Math.min(z12Var.TSizfFm2Yiuu - i, z12Var2.TSizfFm2Yiuu - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (z12Var.PxuCJdSBwIXG[i] != z12Var2.PxuCJdSBwIXG[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == z12Var.TSizfFm2Yiuu) {
                z12Var = z12Var.a92UlCVFR9N8;
                z12Var.getClass();
                i = z12Var.lS5Rgt96tfkO;
            }
            if (i2 == z12Var2.TSizfFm2Yiuu) {
                z12Var2 = z12Var2.a92UlCVFR9N8;
                z12Var2.getClass();
                i2 = z12Var2.lS5Rgt96tfkO;
            }
            j2 += min;
        }
        return true;
    }

    public final void gGoUzNp9JO5I(long j) {
        boolean z;
        if (j == 0) {
            Pf0ThKz3j5YS(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                xbgXKYA2cIfu("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = lS5Rgt96tfkO.PxuCJdSBwIXG;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > lS5Rgt96tfkO.lS5Rgt96tfkO[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        z12 kpCQ9veP6n3I = kpCQ9veP6n3I(i);
        byte[] bArr2 = kpCQ9veP6n3I.PxuCJdSBwIXG;
        int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = lS5Rgt96tfkO.PxuCJdSBwIXG[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        kpCQ9veP6n3I.TSizfFm2Yiuu += i;
        this.OPXfSBeufaJ8 += i;
    }

    public final long gPXPFXrUH4XX(byte b, long j, long j2) {
        z12 z12Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.OPXfSBeufaJ8 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.OPXfSBeufaJ8;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (z12Var = this.rtx2ld2ELZv4) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                z12Var = z12Var.RAsUl2FVSrh6;
                z12Var.getClass();
                j4 -= z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
            }
            while (j4 < j2) {
                byte[] bArr = z12Var.PxuCJdSBwIXG;
                int min = (int) Math.min(z12Var.TSizfFm2Yiuu, (z12Var.lS5Rgt96tfkO + j2) - j4);
                for (int i = (int) ((z12Var.lS5Rgt96tfkO + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - z12Var.lS5Rgt96tfkO) + j4;
                    }
                }
                j4 += z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
                z12Var = z12Var.a92UlCVFR9N8;
                z12Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO) + j3;
            if (j5 > j) {
                break;
            }
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = z12Var.PxuCJdSBwIXG;
            int min2 = (int) Math.min(z12Var.TSizfFm2Yiuu, (z12Var.lS5Rgt96tfkO + j2) - j3);
            for (int i2 = (int) ((z12Var.lS5Rgt96tfkO + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - z12Var.lS5Rgt96tfkO) + j3;
                }
            }
            j3 += z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO;
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final int hashCode() {
        z12 z12Var = this.rtx2ld2ELZv4;
        if (z12Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = z12Var.TSizfFm2Yiuu;
            for (int i3 = z12Var.lS5Rgt96tfkO; i3 < i2; i3++) {
                i = (i * 31) + z12Var.PxuCJdSBwIXG[i3];
            }
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
        } while (z12Var != this.rtx2ld2ELZv4);
        return i;
    }

    public final void i68hK7ahKtgp(int i) {
        z12 kpCQ9veP6n3I = kpCQ9veP6n3I(4);
        byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
        int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        kpCQ9veP6n3I.TSizfFm2Yiuu = i2 + 4;
        this.OPXfSBeufaJ8 += 4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final z12 kpCQ9veP6n3I(int i) {
        if (i < 1 || i > 8192) {
            u9.XL4ISE6Oc65B("unexpected capacity");
            return null;
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        if (z12Var == null) {
            z12 lS5Rgt96tfkO = d22.lS5Rgt96tfkO();
            this.rtx2ld2ELZv4 = lS5Rgt96tfkO;
            lS5Rgt96tfkO.RAsUl2FVSrh6 = lS5Rgt96tfkO;
            lS5Rgt96tfkO.a92UlCVFR9N8 = lS5Rgt96tfkO;
            return lS5Rgt96tfkO;
        }
        z12 z12Var2 = z12Var.RAsUl2FVSrh6;
        z12Var2.getClass();
        if (z12Var2.TSizfFm2Yiuu + i <= 8192 && z12Var2.e9gEMXR7LXtO) {
            return z12Var2;
        }
        z12 lS5Rgt96tfkO2 = d22.lS5Rgt96tfkO();
        z12Var2.lS5Rgt96tfkO(lS5Rgt96tfkO2);
        return lS5Rgt96tfkO2;
    }

    /* renamed from: lS5Rgt96tfkO, reason: merged with bridge method [inline-methods] */
    public final yf clone() {
        yf yfVar = new yf();
        if (this.OPXfSBeufaJ8 == 0) {
            return yfVar;
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        z12 TSizfFm2Yiuu = z12Var.TSizfFm2Yiuu();
        yfVar.rtx2ld2ELZv4 = TSizfFm2Yiuu;
        TSizfFm2Yiuu.RAsUl2FVSrh6 = TSizfFm2Yiuu;
        TSizfFm2Yiuu.a92UlCVFR9N8 = TSizfFm2Yiuu;
        for (z12 z12Var2 = z12Var.a92UlCVFR9N8; z12Var2 != z12Var; z12Var2 = z12Var2.a92UlCVFR9N8) {
            z12 z12Var3 = TSizfFm2Yiuu.RAsUl2FVSrh6;
            z12Var3.getClass();
            z12Var2.getClass();
            z12Var3.lS5Rgt96tfkO(z12Var2.TSizfFm2Yiuu());
        }
        yfVar.OPXfSBeufaJ8 = this.OPXfSBeufaJ8;
        return yfVar;
    }

    public final void nLZGh9p8gVSu(ah ahVar) {
        ahVar.getClass();
        ahVar.cpQdD2nAriOS(this, ahVar.TSizfFm2Yiuu());
    }

    public final void nxJAScVArhE9(int i) {
        if (i < 128) {
            Pf0ThKz3j5YS(i);
            return;
        }
        if (i < 2048) {
            z12 kpCQ9veP6n3I = kpCQ9veP6n3I(2);
            byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
            int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            kpCQ9veP6n3I.TSizfFm2Yiuu = i2 + 2;
            this.OPXfSBeufaJ8 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Pf0ThKz3j5YS(63);
            return;
        }
        if (i < 65536) {
            z12 kpCQ9veP6n3I2 = kpCQ9veP6n3I(3);
            byte[] bArr2 = kpCQ9veP6n3I2.PxuCJdSBwIXG;
            int i3 = kpCQ9veP6n3I2.TSizfFm2Yiuu;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            kpCQ9veP6n3I2.TSizfFm2Yiuu = i3 + 3;
            this.OPXfSBeufaJ8 += 3;
            return;
        }
        if (i > 1114111) {
            u9.XL4ISE6Oc65B("Unexpected code point: 0x".concat(cs0.EpkonXwzFgDB(i)));
            return;
        }
        z12 kpCQ9veP6n3I3 = kpCQ9veP6n3I(4);
        byte[] bArr3 = kpCQ9veP6n3I3.PxuCJdSBwIXG;
        int i4 = kpCQ9veP6n3I3.TSizfFm2Yiuu;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        kpCQ9veP6n3I3.TSizfFm2Yiuu = i4 + 4;
        this.OPXfSBeufaJ8 += 4;
    }

    public final String pnx5pC0XzaCw() {
        return ZbWwgt3aGe7A(this.OPXfSBeufaJ8, pj.PxuCJdSBwIXG);
    }

    @Override // defpackage.ig
    public final boolean r3s1LDPKFs1S(long j) {
        return this.OPXfSBeufaJ8 >= j;
    }

    public final void rZjpSjn4zoMv(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        cs0.cpQdD2nAriOS(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            z12 kpCQ9veP6n3I = kpCQ9veP6n3I(1);
            int min = Math.min(i - i2, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu);
            int i3 = i2 + min;
            na.D0aTLcX6Uhyo(bArr, kpCQ9veP6n3I.PxuCJdSBwIXG, kpCQ9veP6n3I.TSizfFm2Yiuu, i2, i3);
            kpCQ9veP6n3I.TSizfFm2Yiuu += min;
            i2 = i3;
        }
        this.OPXfSBeufaJ8 += j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        cs0.cpQdD2nAriOS(bArr.length, i, i2);
        z12 z12Var = this.rtx2ld2ELZv4;
        if (z12Var == null) {
            return -1;
        }
        int min = Math.min(i2, z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
        byte[] bArr2 = z12Var.PxuCJdSBwIXG;
        int i3 = z12Var.lS5Rgt96tfkO;
        na.D0aTLcX6Uhyo(bArr2, bArr, i, i3, i3 + min);
        int i4 = z12Var.lS5Rgt96tfkO + min;
        z12Var.lS5Rgt96tfkO = i4;
        this.OPXfSBeufaJ8 -= min;
        if (i4 == z12Var.TSizfFm2Yiuu) {
            this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(z12Var);
        }
        return min;
    }

    @Override // defpackage.ig
    public final byte readByte() {
        if (this.OPXfSBeufaJ8 == 0) {
            throw new EOFException();
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        int i2 = z12Var.TSizfFm2Yiuu;
        int i3 = i + 1;
        byte b = z12Var.PxuCJdSBwIXG[i];
        this.OPXfSBeufaJ8--;
        if (i3 != i2) {
            z12Var.lS5Rgt96tfkO = i3;
            return b;
        }
        this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
        d22.PxuCJdSBwIXG(z12Var);
        return b;
    }

    @Override // defpackage.ig
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // defpackage.ig
    public final int readInt() {
        if (this.OPXfSBeufaJ8 < 4) {
            throw new EOFException();
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        int i2 = z12Var.TSizfFm2Yiuu;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = z12Var.PxuCJdSBwIXG;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.OPXfSBeufaJ8 -= 4;
        if (i5 != i2) {
            z12Var.lS5Rgt96tfkO = i5;
            return i6;
        }
        this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
        d22.PxuCJdSBwIXG(z12Var);
        return i6;
    }

    @Override // defpackage.ig
    public final long readLong() {
        if (this.OPXfSBeufaJ8 < 8) {
            throw new EOFException();
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        int i2 = z12Var.TSizfFm2Yiuu;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = z12Var.PxuCJdSBwIXG;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.OPXfSBeufaJ8 -= 8;
        if (i4 != i2) {
            z12Var.lS5Rgt96tfkO = i4;
            return j2;
        }
        this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
        d22.PxuCJdSBwIXG(z12Var);
        return j2;
    }

    @Override // defpackage.ig
    public final short readShort() {
        if (this.OPXfSBeufaJ8 < 2) {
            throw new EOFException();
        }
        z12 z12Var = this.rtx2ld2ELZv4;
        z12Var.getClass();
        int i = z12Var.lS5Rgt96tfkO;
        int i2 = z12Var.TSizfFm2Yiuu;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = z12Var.PxuCJdSBwIXG;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.OPXfSBeufaJ8 -= 2;
        if (i5 == i2) {
            this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(z12Var);
        } else {
            z12Var.lS5Rgt96tfkO = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ig
    public final void rtx2ld2ELZv4(long j, yf yfVar) {
        long j2 = this.OPXfSBeufaJ8;
        if (j2 >= j) {
            yfVar.VhhvGxCb8gfr(j, this);
        } else {
            yfVar.VhhvGxCb8gfr(j2, this);
            throw new EOFException();
        }
    }

    public final void ryVscX7ZL4Ux(o82 o82Var) {
        while (o82Var.RAsUl2FVSrh6(8192L, this) != -1) {
        }
    }

    @Override // defpackage.ig
    public final void skip(long j) {
        while (j > 0) {
            z12 z12Var = this.rtx2ld2ELZv4;
            if (z12Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
            long j2 = min;
            this.OPXfSBeufaJ8 -= j2;
            j -= j2;
            int i = z12Var.lS5Rgt96tfkO + min;
            z12Var.lS5Rgt96tfkO = i;
            if (i == z12Var.TSizfFm2Yiuu) {
                this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
                d22.PxuCJdSBwIXG(z12Var);
            }
        }
    }

    public final String toString() {
        long j = this.OPXfSBeufaJ8;
        if (j <= 2147483647L) {
            return aF05bpZJlKEP((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.OPXfSBeufaJ8).toString());
    }

    public final void wLFCmsViZrNT(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i2, "endIndex > string.length: ", " > ");
            BRwzKIf41E4i.append(str.length());
            throw new IllegalArgumentException(BRwzKIf41E4i.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                z12 kpCQ9veP6n3I = kpCQ9veP6n3I(1);
                byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
                int i3 = kpCQ9veP6n3I.TSizfFm2Yiuu - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = kpCQ9veP6n3I.TSizfFm2Yiuu;
                int i6 = (i3 + i) - i5;
                kpCQ9veP6n3I.TSizfFm2Yiuu = i5 + i6;
                this.OPXfSBeufaJ8 += i6;
            } else {
                if (charAt2 < 2048) {
                    z12 kpCQ9veP6n3I2 = kpCQ9veP6n3I(2);
                    byte[] bArr2 = kpCQ9veP6n3I2.PxuCJdSBwIXG;
                    int i7 = kpCQ9veP6n3I2.TSizfFm2Yiuu;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    kpCQ9veP6n3I2.TSizfFm2Yiuu = i7 + 2;
                    this.OPXfSBeufaJ8 += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    z12 kpCQ9veP6n3I3 = kpCQ9veP6n3I(3);
                    byte[] bArr3 = kpCQ9veP6n3I3.PxuCJdSBwIXG;
                    int i8 = kpCQ9veP6n3I3.TSizfFm2Yiuu;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    kpCQ9veP6n3I3.TSizfFm2Yiuu = i8 + 3;
                    this.OPXfSBeufaJ8 += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        Pf0ThKz3j5YS(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        z12 kpCQ9veP6n3I4 = kpCQ9veP6n3I(4);
                        byte[] bArr4 = kpCQ9veP6n3I4.PxuCJdSBwIXG;
                        int i11 = kpCQ9veP6n3I4.TSizfFm2Yiuu;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        kpCQ9veP6n3I4.TSizfFm2Yiuu = i11 + 4;
                        this.OPXfSBeufaJ8 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            z12 kpCQ9veP6n3I = kpCQ9veP6n3I(1);
            int min = Math.min(i, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu);
            byteBuffer.get(kpCQ9veP6n3I.PxuCJdSBwIXG, kpCQ9veP6n3I.TSizfFm2Yiuu, min);
            i -= min;
            kpCQ9veP6n3I.TSizfFm2Yiuu += min;
        }
        this.OPXfSBeufaJ8 += remaining;
        return remaining;
    }

    @Override // defpackage.hg
    public final /* bridge */ /* synthetic */ hg writeByte(int i) {
        Pf0ThKz3j5YS(i);
        return this;
    }

    @Override // defpackage.hg
    public final /* bridge */ /* synthetic */ hg writeInt(int i) {
        i68hK7ahKtgp(i);
        return this;
    }

    @Override // defpackage.hg
    public final /* bridge */ /* synthetic */ hg writeShort(int i) {
        zf8DYfih6EZu(i);
        return this;
    }

    @Override // defpackage.ig
    public final ah x50lh2ztY7Y5(long j) {
        if (j < 0 || j > 2147483647L) {
            u9.OPXfSBeufaJ8("byteCount: ", j);
            return null;
        }
        if (this.OPXfSBeufaJ8 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ah(RfyTYNmI9Srp(j));
        }
        ah aF05bpZJlKEP = aF05bpZJlKEP((int) j);
        skip(j);
        return aF05bpZJlKEP;
    }

    public final void xbgXKYA2cIfu(String str) {
        str.getClass();
        wLFCmsViZrNT(0, str.length(), str);
    }

    @Override // defpackage.hg
    public final /* bridge */ /* synthetic */ hg xfACYKDMU6Dj(ah ahVar) {
        nLZGh9p8gVSu(ahVar);
        return this;
    }

    public final void zf8DYfih6EZu(int i) {
        z12 kpCQ9veP6n3I = kpCQ9veP6n3I(2);
        byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
        int i2 = kpCQ9veP6n3I.TSizfFm2Yiuu;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        kpCQ9veP6n3I.TSizfFm2Yiuu = i2 + 2;
        this.OPXfSBeufaJ8 += 2;
    }

    @Override // defpackage.hg
    public final hg write(byte[] bArr) {
        rZjpSjn4zoMv(bArr.length, bArr);
        return this;
    }

    @Override // defpackage.ig
    public final yf PxuCJdSBwIXG() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.y52
    public final void close() {
    }

    @Override // defpackage.hg, defpackage.y52, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        z12 z12Var = this.rtx2ld2ELZv4;
        if (z12Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
        byteBuffer.put(z12Var.PxuCJdSBwIXG, z12Var.lS5Rgt96tfkO, min);
        int i = z12Var.lS5Rgt96tfkO + min;
        z12Var.lS5Rgt96tfkO = i;
        this.OPXfSBeufaJ8 -= min;
        if (i == z12Var.TSizfFm2Yiuu) {
            this.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(z12Var);
        }
        return min;
    }
}
