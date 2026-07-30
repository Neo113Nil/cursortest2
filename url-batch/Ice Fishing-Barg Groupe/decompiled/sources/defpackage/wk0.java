package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wk0 extends tk0 {
    public final /* synthetic */ yk0 cpQdD2nAriOS;
    public long x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk0(yk0 yk0Var, gm0 gm0Var, long j) {
        super(yk0Var, gm0Var);
        gm0Var.getClass();
        this.cpQdD2nAriOS = yk0Var;
        this.x50lh2ztY7Y5 = j;
        if (j == 0) {
            lS5Rgt96tfkO(hj0.OPXfSBeufaJ8);
        }
    }

    @Override // defpackage.tk0, defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        if (this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("closed");
            return 0L;
        }
        long j2 = this.x50lh2ztY7Y5;
        if (j2 == 0) {
            return -1L;
        }
        long RAsUl2FVSrh6 = super.RAsUl2FVSrh6(Math.min(j2, 8192L), yfVar);
        if (RAsUl2FVSrh6 == -1) {
            this.cpQdD2nAriOS.lS5Rgt96tfkO.rtx2ld2ELZv4();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
            throw protocolException;
        }
        long j3 = this.x50lh2ztY7Y5 - RAsUl2FVSrh6;
        this.x50lh2ztY7Y5 = j3;
        if (j3 == 0) {
            lS5Rgt96tfkO(hj0.OPXfSBeufaJ8);
        }
        return RAsUl2FVSrh6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.wdg6QnbFHrFF) {
            return;
        }
        if (this.x50lh2ztY7Y5 != 0) {
            TimeZone timeZone = mv2.PxuCJdSBwIXG;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = mv2.a92UlCVFR9N8(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.cpQdD2nAriOS.lS5Rgt96tfkO.rtx2ld2ELZv4();
                lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
            }
        }
        this.wdg6QnbFHrFF = true;
    }
}
