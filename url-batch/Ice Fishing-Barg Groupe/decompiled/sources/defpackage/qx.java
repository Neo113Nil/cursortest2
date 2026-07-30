package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qx implements y52 {
    public final Deflater OPXfSBeufaJ8;
    public final ds1 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public qx(yf yfVar, Deflater deflater) {
        this.rtx2ld2ELZv4 = new ds1(yfVar);
        this.OPXfSBeufaJ8 = deflater;
    }

    @Override // defpackage.y52
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        cs0.cpQdD2nAriOS(yfVar.OPXfSBeufaJ8, 0L, j);
        while (true) {
            Deflater deflater = this.OPXfSBeufaJ8;
            if (j <= 0) {
                deflater.setInput(ov2.cpQdD2nAriOS, 0, 0);
                return;
            }
            z12 z12Var = yfVar.rtx2ld2ELZv4;
            z12Var.getClass();
            int min = (int) Math.min(j, z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
            deflater.setInput(z12Var.PxuCJdSBwIXG, z12Var.lS5Rgt96tfkO, min);
            lS5Rgt96tfkO(false);
            long j2 = min;
            yfVar.OPXfSBeufaJ8 -= j2;
            int i = z12Var.lS5Rgt96tfkO + min;
            z12Var.lS5Rgt96tfkO = i;
            if (i == z12Var.TSizfFm2Yiuu) {
                yfVar.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
                d22.PxuCJdSBwIXG(z12Var);
            }
            j -= j2;
        }
    }

    @Override // defpackage.y52, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.OPXfSBeufaJ8;
        if (this.wdg6QnbFHrFF) {
            return;
        }
        try {
            deflater.finish();
            lS5Rgt96tfkO(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.rtx2ld2ELZv4.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.wdg6QnbFHrFF = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.y52, java.io.Flushable
    public final void flush() {
        lS5Rgt96tfkO(true);
        this.rtx2ld2ELZv4.flush();
    }

    public final void lS5Rgt96tfkO(boolean z) {
        z12 kpCQ9veP6n3I;
        int deflate;
        ds1 ds1Var = this.rtx2ld2ELZv4;
        yf yfVar = ds1Var.OPXfSBeufaJ8;
        while (true) {
            kpCQ9veP6n3I = yfVar.kpCQ9veP6n3I(1);
            byte[] bArr = kpCQ9veP6n3I.PxuCJdSBwIXG;
            int i = kpCQ9veP6n3I.TSizfFm2Yiuu;
            Deflater deflater = this.OPXfSBeufaJ8;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                kpCQ9veP6n3I.TSizfFm2Yiuu += deflate;
                yfVar.OPXfSBeufaJ8 += deflate;
                ds1Var.lS5Rgt96tfkO();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (kpCQ9veP6n3I.lS5Rgt96tfkO == kpCQ9veP6n3I.TSizfFm2Yiuu) {
            yfVar.rtx2ld2ELZv4 = kpCQ9veP6n3I.PxuCJdSBwIXG();
            d22.PxuCJdSBwIXG(kpCQ9veP6n3I);
        }
    }

    public final String toString() {
        return "DeflaterSink(" + this.rtx2ld2ELZv4 + ')';
    }
}
