package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ii0 implements o82 {
    public final es1 OPXfSBeufaJ8;
    public final xo0 dgRBjINgWbAK;
    public byte rtx2ld2ELZv4;
    public final Inflater wdg6QnbFHrFF;
    public final CRC32 x50lh2ztY7Y5;

    public ii0(ig igVar) {
        igVar.getClass();
        es1 es1Var = new es1(igVar);
        this.OPXfSBeufaJ8 = es1Var;
        Inflater inflater = new Inflater(true);
        this.wdg6QnbFHrFF = inflater;
        this.dgRBjINgWbAK = new xo0(es1Var, inflater);
        this.x50lh2ztY7Y5 = new CRC32();
    }

    public static void lS5Rgt96tfkO(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ia2.e4HgwifUDUCA(cs0.EpkonXwzFgDB(i2), 8) + " != expected 0x" + ia2.e4HgwifUDUCA(cs0.EpkonXwzFgDB(i), 8));
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        long j2;
        ii0 ii0Var = this;
        byte b = ii0Var.rtx2ld2ELZv4;
        CRC32 crc32 = ii0Var.x50lh2ztY7Y5;
        es1 es1Var = ii0Var.OPXfSBeufaJ8;
        if (b == 0) {
            es1Var.J54yh1s3n4Aq(10L);
            yf yfVar2 = es1Var.OPXfSBeufaJ8;
            byte cpQdD2nAriOS = yfVar2.cpQdD2nAriOS(3L);
            boolean z = ((cpQdD2nAriOS >> 1) & 1) == 1;
            if (z) {
                ii0Var.a92UlCVFR9N8(yfVar2, 0L, 10L);
            }
            lS5Rgt96tfkO(8075, es1Var.readShort(), "ID1ID2");
            es1Var.skip(8L);
            if (((cpQdD2nAriOS >> 2) & 1) == 1) {
                es1Var.J54yh1s3n4Aq(2L);
                if (z) {
                    a92UlCVFR9N8(yfVar2, 0L, 2L);
                }
                short readShort = yfVar2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                es1Var.J54yh1s3n4Aq(j3);
                if (z) {
                    a92UlCVFR9N8(yfVar2, 0L, j3);
                }
                es1Var.skip(j3);
            }
            if (((cpQdD2nAriOS >> 3) & 1) == 1) {
                long a92UlCVFR9N8 = es1Var.a92UlCVFR9N8((byte) 0, 0L, Long.MAX_VALUE);
                if (a92UlCVFR9N8 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    a92UlCVFR9N8(yfVar2, 0L, a92UlCVFR9N8 + 1);
                } else {
                    j2 = 2;
                }
                es1Var.skip(a92UlCVFR9N8 + 1);
            } else {
                j2 = 2;
            }
            if (((cpQdD2nAriOS >> 4) & 1) == 1) {
                long j4 = j2;
                long a92UlCVFR9N82 = es1Var.a92UlCVFR9N8((byte) 0, 0L, Long.MAX_VALUE);
                if (a92UlCVFR9N82 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    ii0Var = this;
                    ii0Var.a92UlCVFR9N8(yfVar2, 0L, a92UlCVFR9N82 + 1);
                } else {
                    ii0Var = this;
                    j2 = j4;
                }
                es1Var.skip(a92UlCVFR9N82 + 1);
            } else {
                ii0Var = this;
            }
            if (z) {
                es1Var.J54yh1s3n4Aq(j2);
                short readShort2 = yfVar2.readShort();
                lS5Rgt96tfkO((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ii0Var.rtx2ld2ELZv4 = (byte) 1;
        }
        if (ii0Var.rtx2ld2ELZv4 == 1) {
            long j5 = yfVar.OPXfSBeufaJ8;
            long RAsUl2FVSrh6 = ii0Var.dgRBjINgWbAK.RAsUl2FVSrh6(8192L, yfVar);
            if (RAsUl2FVSrh6 != -1) {
                ii0Var.a92UlCVFR9N8(yfVar, j5, RAsUl2FVSrh6);
                return RAsUl2FVSrh6;
            }
            ii0Var.rtx2ld2ELZv4 = (byte) 2;
        }
        if (ii0Var.rtx2ld2ELZv4 == 2) {
            lS5Rgt96tfkO(es1Var.OPXfSBeufaJ8(), (int) crc32.getValue(), "CRC");
            lS5Rgt96tfkO(es1Var.OPXfSBeufaJ8(), (int) ii0Var.wdg6QnbFHrFF.getBytesWritten(), "ISIZE");
            ii0Var.rtx2ld2ELZv4 = (byte) 3;
            if (!es1Var.lS5Rgt96tfkO()) {
                u9.S9EYkSpbGuxq("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    public final void a92UlCVFR9N8(yf yfVar, long j, long j2) {
        z12 z12Var = yfVar.rtx2ld2ELZv4;
        z12Var.getClass();
        while (true) {
            int i = z12Var.TSizfFm2Yiuu;
            int i2 = z12Var.lS5Rgt96tfkO;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(z12Var.TSizfFm2Yiuu - r6, j2);
            this.x50lh2ztY7Y5.update(z12Var.PxuCJdSBwIXG, (int) (z12Var.lS5Rgt96tfkO + j), min);
            j2 -= min;
            z12Var = z12Var.a92UlCVFR9N8;
            z12Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.dgRBjINgWbAK.close();
    }
}
