package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ds1 implements hg {
    public final yf OPXfSBeufaJ8;
    public final y52 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public ds1(y52 y52Var) {
        y52Var.getClass();
        this.rtx2ld2ELZv4 = y52Var;
        this.OPXfSBeufaJ8 = new yf();
    }

    @Override // defpackage.hg
    public final yf PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.y52
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        yfVar.getClass();
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
        } else {
            this.OPXfSBeufaJ8.VhhvGxCb8gfr(j, yfVar);
            lS5Rgt96tfkO();
        }
    }

    public final hg a92UlCVFR9N8(String str) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        this.OPXfSBeufaJ8.xbgXKYA2cIfu(str);
        lS5Rgt96tfkO();
        return this;
    }

    @Override // defpackage.y52, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y52 y52Var = this.rtx2ld2ELZv4;
        if (this.wdg6QnbFHrFF) {
            return;
        }
        try {
            yf yfVar = this.OPXfSBeufaJ8;
            long j = yfVar.OPXfSBeufaJ8;
            if (j > 0) {
                y52Var.VhhvGxCb8gfr(j, yfVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            y52Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.wdg6QnbFHrFF = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.hg, defpackage.y52, java.io.Flushable
    public final void flush() {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return;
        }
        yf yfVar = this.OPXfSBeufaJ8;
        long j = yfVar.OPXfSBeufaJ8;
        y52 y52Var = this.rtx2ld2ELZv4;
        if (j > 0) {
            y52Var.VhhvGxCb8gfr(j, yfVar);
        }
        y52Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.wdg6QnbFHrFF;
    }

    public final hg lS5Rgt96tfkO() {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        yf yfVar = this.OPXfSBeufaJ8;
        long j = yfVar.OPXfSBeufaJ8;
        if (j == 0) {
            j = 0;
        } else {
            z12 z12Var = yfVar.rtx2ld2ELZv4;
            z12Var.getClass();
            z12 z12Var2 = z12Var.RAsUl2FVSrh6;
            z12Var2.getClass();
            if (z12Var2.TSizfFm2Yiuu < 8192 && z12Var2.e9gEMXR7LXtO) {
                j -= r6 - z12Var2.lS5Rgt96tfkO;
            }
        }
        if (j > 0) {
            this.rtx2ld2ELZv4.VhhvGxCb8gfr(j, yfVar);
        }
        return this;
    }

    public final String toString() {
        return "buffer(" + this.rtx2ld2ELZv4 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0;
        }
        int write = this.OPXfSBeufaJ8.write(byteBuffer);
        lS5Rgt96tfkO();
        return write;
    }

    @Override // defpackage.hg
    public final hg writeByte(int i) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        this.OPXfSBeufaJ8.Pf0ThKz3j5YS(i);
        lS5Rgt96tfkO();
        return this;
    }

    @Override // defpackage.hg
    public final hg writeInt(int i) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        this.OPXfSBeufaJ8.i68hK7ahKtgp(i);
        lS5Rgt96tfkO();
        return this;
    }

    @Override // defpackage.hg
    public final hg writeShort(int i) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        this.OPXfSBeufaJ8.zf8DYfih6EZu(i);
        lS5Rgt96tfkO();
        return this;
    }

    @Override // defpackage.hg
    public final hg xfACYKDMU6Dj(ah ahVar) {
        ahVar.getClass();
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return null;
        }
        this.OPXfSBeufaJ8.nLZGh9p8gVSu(ahVar);
        lS5Rgt96tfkO();
        return this;
    }

    @Override // defpackage.hg
    public final hg write(byte[] bArr) {
        if (!this.wdg6QnbFHrFF) {
            this.OPXfSBeufaJ8.rZjpSjn4zoMv(bArr.length, bArr);
            lS5Rgt96tfkO();
            return this;
        }
        u9.rtx2ld2ELZv4("closed");
        return null;
    }
}
