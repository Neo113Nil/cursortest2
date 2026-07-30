package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z60 implements y52 {
    public final long OPXfSBeufaJ8;
    public final /* synthetic */ jv QrzZRwfaDlRX;
    public boolean cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public boolean r3s1LDPKFs1S;
    public final y52 rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public long x50lh2ztY7Y5;

    public z60(jv jvVar, y52 y52Var, long j, boolean z) {
        y52Var.getClass();
        this.QrzZRwfaDlRX = jvVar;
        this.rtx2ld2ELZv4 = y52Var;
        this.OPXfSBeufaJ8 = j;
        this.wdg6QnbFHrFF = z;
        this.cpQdD2nAriOS = z;
    }

    public final void OPXfSBeufaJ8() {
        this.rtx2ld2ELZv4.flush();
    }

    @Override // defpackage.y52
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        if (this.r3s1LDPKFs1S) {
            u9.rtx2ld2ELZv4("closed");
            return;
        }
        long j2 = this.OPXfSBeufaJ8;
        if (j2 != -1 && this.x50lh2ztY7Y5 + j > j2) {
            throw new ProtocolException("expected " + this.OPXfSBeufaJ8 + " bytes but received " + (this.x50lh2ztY7Y5 + j));
        }
        try {
            if (this.cpQdD2nAriOS) {
                this.cpQdD2nAriOS = false;
                ((js1) this.QrzZRwfaDlRX.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
            }
            this.rtx2ld2ELZv4.VhhvGxCb8gfr(j, yfVar);
            this.x50lh2ztY7Y5 += j;
        } catch (IOException e) {
            IOException a92UlCVFR9N8 = a92UlCVFR9N8(e);
            a92UlCVFR9N8.getClass();
            throw a92UlCVFR9N8;
        }
    }

    public final IOException a92UlCVFR9N8(IOException iOException) {
        if (this.dgRBjINgWbAK) {
            return iOException;
        }
        this.dgRBjINgWbAK = true;
        return jv.PxuCJdSBwIXG(this.QrzZRwfaDlRX, this.wdg6QnbFHrFF, iOException, 4);
    }

    @Override // defpackage.y52, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r3s1LDPKFs1S) {
            return;
        }
        this.r3s1LDPKFs1S = true;
        long j = this.OPXfSBeufaJ8;
        if (j != -1 && this.x50lh2ztY7Y5 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            lS5Rgt96tfkO();
            a92UlCVFR9N8(null);
        } catch (IOException e) {
            IOException a92UlCVFR9N8 = a92UlCVFR9N8(e);
            a92UlCVFR9N8.getClass();
            throw a92UlCVFR9N8;
        }
    }

    @Override // defpackage.y52, java.io.Flushable
    public final void flush() {
        try {
            OPXfSBeufaJ8();
        } catch (IOException e) {
            IOException a92UlCVFR9N8 = a92UlCVFR9N8(e);
            a92UlCVFR9N8.getClass();
            throw a92UlCVFR9N8;
        }
    }

    public final void lS5Rgt96tfkO() {
        this.rtx2ld2ELZv4.close();
    }

    public final String toString() {
        return z60.class.getSimpleName() + '(' + this.rtx2ld2ELZv4 + ')';
    }
}
