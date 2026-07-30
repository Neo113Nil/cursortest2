package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xo0 implements o82 {
    public final Inflater OPXfSBeufaJ8;
    public boolean dgRBjINgWbAK;
    public final es1 rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public xo0(es1 es1Var, Inflater inflater) {
        this.rtx2ld2ELZv4 = es1Var;
        this.OPXfSBeufaJ8 = inflater;
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        do {
            long lS5Rgt96tfkO = lS5Rgt96tfkO(8192L, yfVar);
            if (lS5Rgt96tfkO > 0) {
                return lS5Rgt96tfkO;
            }
            Inflater inflater = this.OPXfSBeufaJ8;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.rtx2ld2ELZv4.lS5Rgt96tfkO());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.dgRBjINgWbAK) {
            return;
        }
        this.OPXfSBeufaJ8.end();
        this.dgRBjINgWbAK = true;
        this.rtx2ld2ELZv4.close();
    }

    public final long lS5Rgt96tfkO(long j, yf yfVar) {
        Inflater inflater = this.OPXfSBeufaJ8;
        if (j < 0) {
            u9.OPXfSBeufaJ8("byteCount < 0: ", j);
            return 0L;
        }
        if (this.dgRBjINgWbAK) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                z12 kpCQ9veP6n3I = yfVar.kpCQ9veP6n3I(1);
                int min = (int) Math.min(j, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu);
                boolean needsInput = inflater.needsInput();
                es1 es1Var = this.rtx2ld2ELZv4;
                if (needsInput && !es1Var.lS5Rgt96tfkO()) {
                    z12 z12Var = es1Var.OPXfSBeufaJ8.rtx2ld2ELZv4;
                    z12Var.getClass();
                    int i = z12Var.TSizfFm2Yiuu;
                    int i2 = z12Var.lS5Rgt96tfkO;
                    int i3 = i - i2;
                    this.wdg6QnbFHrFF = i3;
                    inflater.setInput(z12Var.PxuCJdSBwIXG, i2, i3);
                }
                int inflate = inflater.inflate(kpCQ9veP6n3I.PxuCJdSBwIXG, kpCQ9veP6n3I.TSizfFm2Yiuu, min);
                int i4 = this.wdg6QnbFHrFF;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.wdg6QnbFHrFF -= remaining;
                    es1Var.skip(remaining);
                }
                if (inflate > 0) {
                    kpCQ9veP6n3I.TSizfFm2Yiuu += inflate;
                    long j2 = inflate;
                    yfVar.OPXfSBeufaJ8 += j2;
                    return j2;
                }
                if (kpCQ9veP6n3I.lS5Rgt96tfkO == kpCQ9veP6n3I.TSizfFm2Yiuu) {
                    yfVar.rtx2ld2ELZv4 = kpCQ9veP6n3I.PxuCJdSBwIXG();
                    d22.PxuCJdSBwIXG(kpCQ9veP6n3I);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
