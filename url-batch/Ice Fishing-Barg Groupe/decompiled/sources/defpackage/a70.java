package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a70 implements o82 {
    public final long OPXfSBeufaJ8;
    public final /* synthetic */ jv QrzZRwfaDlRX;
    public boolean cpQdD2nAriOS;
    public long dgRBjINgWbAK;
    public boolean r3s1LDPKFs1S;
    public final o82 rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public a70(jv jvVar, o82 o82Var, long j, boolean z) {
        o82Var.getClass();
        this.QrzZRwfaDlRX = jvVar;
        this.rtx2ld2ELZv4 = o82Var;
        this.OPXfSBeufaJ8 = j;
        this.wdg6QnbFHrFF = z;
        this.x50lh2ztY7Y5 = true;
        if (j == 0) {
            a92UlCVFR9N8(null);
        }
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        if (this.r3s1LDPKFs1S) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        try {
            long RAsUl2FVSrh6 = this.rtx2ld2ELZv4.RAsUl2FVSrh6(8192L, yfVar);
            if (this.x50lh2ztY7Y5) {
                this.x50lh2ztY7Y5 = false;
                ((js1) this.QrzZRwfaDlRX.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
            }
            if (RAsUl2FVSrh6 == -1) {
                a92UlCVFR9N8(null);
                return -1L;
            }
            long j2 = this.dgRBjINgWbAK + RAsUl2FVSrh6;
            long j3 = this.OPXfSBeufaJ8;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.OPXfSBeufaJ8 + " bytes but received " + j2);
            }
            this.dgRBjINgWbAK = j2;
            if (((d70) this.QrzZRwfaDlRX.Y1f8riQaR6yg).Y1f8riQaR6yg()) {
                a92UlCVFR9N8(null);
            }
            return RAsUl2FVSrh6;
        } catch (IOException e) {
            IOException a92UlCVFR9N8 = a92UlCVFR9N8(e);
            a92UlCVFR9N8.getClass();
            throw a92UlCVFR9N8;
        }
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    public final IOException a92UlCVFR9N8(IOException iOException) {
        if (this.cpQdD2nAriOS) {
            return iOException;
        }
        this.cpQdD2nAriOS = true;
        if (iOException == null && this.x50lh2ztY7Y5) {
            this.x50lh2ztY7Y5 = false;
            ((js1) this.QrzZRwfaDlRX.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
        }
        return jv.PxuCJdSBwIXG(this.QrzZRwfaDlRX, this.wdg6QnbFHrFF, iOException, 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r3s1LDPKFs1S) {
            return;
        }
        this.r3s1LDPKFs1S = true;
        try {
            lS5Rgt96tfkO();
            a92UlCVFR9N8(null);
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
        return a70.class.getSimpleName() + '(' + this.rtx2ld2ELZv4 + ')';
    }
}
