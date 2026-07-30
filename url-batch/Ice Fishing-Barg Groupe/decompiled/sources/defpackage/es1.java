package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class es1 implements ig {
    public final yf OPXfSBeufaJ8;
    public final o82 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public es1(o82 o82Var) {
        o82Var.getClass();
        this.rtx2ld2ELZv4 = o82Var;
        this.OPXfSBeufaJ8 = new yf();
    }

    @Override // defpackage.ig
    public final void J54yh1s3n4Aq(long j) {
        if (!r3s1LDPKFs1S(j)) {
            throw new EOFException();
        }
    }

    public final int OPXfSBeufaJ8() {
        J54yh1s3n4Aq(4L);
        int readInt = this.OPXfSBeufaJ8.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.ig
    public final yf PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        yfVar.getClass();
        if (j < 0) {
            u9.OPXfSBeufaJ8("byteCount < 0: ", j);
            return 0L;
        }
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        yf yfVar2 = this.OPXfSBeufaJ8;
        if (yfVar2.OPXfSBeufaJ8 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar2) == -1) {
                return -1L;
            }
        }
        return yfVar2.RAsUl2FVSrh6(Math.min(j, yfVar2.OPXfSBeufaJ8), yfVar);
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    public final long a92UlCVFR9N8(byte b, long j, long j2) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        if (0 > j2) {
            u9.OPXfSBeufaJ8("fromIndex=0 toIndex=", j2);
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            yf yfVar = this.OPXfSBeufaJ8;
            byte b2 = b;
            long j4 = j2;
            long gPXPFXrUH4XX = yfVar.gPXPFXrUH4XX(b2, j3, j4);
            if (gPXPFXrUH4XX == -1) {
                long j5 = yfVar.OPXfSBeufaJ8;
                if (j5 >= j4 || this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return gPXPFXrUH4XX;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.wdg6QnbFHrFF) {
            return;
        }
        this.wdg6QnbFHrFF = true;
        this.rtx2ld2ELZv4.close();
        yf yfVar = this.OPXfSBeufaJ8;
        yfVar.skip(yfVar.OPXfSBeufaJ8);
    }

    @Override // defpackage.ig
    public final String e6tOsSdd2EFb(long j) {
        if (j < 0) {
            u9.OPXfSBeufaJ8("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a92UlCVFR9N8 = a92UlCVFR9N8((byte) 10, 0L, j2);
        yf yfVar = this.OPXfSBeufaJ8;
        if (a92UlCVFR9N8 != -1) {
            return lS5Rgt96tfkO.lS5Rgt96tfkO(a92UlCVFR9N8, yfVar);
        }
        if (j2 < Long.MAX_VALUE && r3s1LDPKFs1S(j2) && yfVar.cpQdD2nAriOS(j2 - 1) == 13 && r3s1LDPKFs1S(j2 + 1) && yfVar.cpQdD2nAriOS(j2) == 10) {
            return lS5Rgt96tfkO.lS5Rgt96tfkO(j2, yfVar);
        }
        yf yfVar2 = new yf();
        yfVar.a92UlCVFR9N8(yfVar2, 0L, Math.min(32L, yfVar.OPXfSBeufaJ8));
        throw new EOFException("\\n not found: limit=" + Math.min(yfVar.OPXfSBeufaJ8, j) + " content=" + yfVar2.x50lh2ztY7Y5(yfVar2.OPXfSBeufaJ8).Y1f8riQaR6yg() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.wdg6QnbFHrFF;
    }

    public final boolean lS5Rgt96tfkO() {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return false;
        }
        yf yfVar = this.OPXfSBeufaJ8;
        return yfVar.OPXfSBeufaJ8() && this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar) == -1;
    }

    @Override // defpackage.ig
    public final boolean r3s1LDPKFs1S(long j) {
        yf yfVar;
        if (j < 0) {
            u9.OPXfSBeufaJ8("byteCount < 0: ", j);
            return false;
        }
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return false;
        }
        do {
            yfVar = this.OPXfSBeufaJ8;
            if (yfVar.OPXfSBeufaJ8 >= j) {
                return true;
            }
        } while (this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        yf yfVar = this.OPXfSBeufaJ8;
        if (yfVar.OPXfSBeufaJ8 == 0 && this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar) == -1) {
            return -1;
        }
        return yfVar.read(byteBuffer);
    }

    @Override // defpackage.ig
    public final byte readByte() {
        J54yh1s3n4Aq(1L);
        return this.OPXfSBeufaJ8.readByte();
    }

    @Override // defpackage.ig
    public final void readFully(byte[] bArr) {
        yf yfVar = this.OPXfSBeufaJ8;
        bArr.getClass();
        try {
            J54yh1s3n4Aq(bArr.length);
            yfVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = yfVar.OPXfSBeufaJ8;
                if (j <= 0) {
                    throw e;
                }
                int read = yfVar.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // defpackage.ig
    public final int readInt() {
        J54yh1s3n4Aq(4L);
        return this.OPXfSBeufaJ8.readInt();
    }

    @Override // defpackage.ig
    public final long readLong() {
        J54yh1s3n4Aq(8L);
        return this.OPXfSBeufaJ8.readLong();
    }

    @Override // defpackage.ig
    public final short readShort() {
        J54yh1s3n4Aq(2L);
        return this.OPXfSBeufaJ8.readShort();
    }

    @Override // defpackage.ig
    public final void rtx2ld2ELZv4(long j, yf yfVar) {
        yf yfVar2 = this.OPXfSBeufaJ8;
        try {
            J54yh1s3n4Aq(j);
            yfVar2.rtx2ld2ELZv4(j, yfVar);
        } catch (EOFException e) {
            yfVar.ryVscX7ZL4Ux(yfVar2);
            throw e;
        }
    }

    @Override // defpackage.ig
    public final void skip(long j) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return;
        }
        while (j > 0) {
            yf yfVar = this.OPXfSBeufaJ8;
            if (yfVar.OPXfSBeufaJ8 == 0 && this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, yfVar.OPXfSBeufaJ8);
            yfVar.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.rtx2ld2ELZv4 + ')';
    }

    @Override // defpackage.ig
    public final ah x50lh2ztY7Y5(long j) {
        J54yh1s3n4Aq(j);
        return this.OPXfSBeufaJ8.x50lh2ztY7Y5(j);
    }
}
