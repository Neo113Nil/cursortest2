package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pl0 implements o82 {
    public int OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final ig rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public pl0(ig igVar) {
        igVar.getClass();
        this.rtx2ld2ELZv4 = igVar;
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        int i;
        int readInt;
        do {
            int i2 = this.dgRBjINgWbAK;
            ig igVar = this.rtx2ld2ELZv4;
            if (i2 == 0) {
                igVar.skip(this.x50lh2ztY7Y5);
                this.x50lh2ztY7Y5 = 0;
                if ((this.OPXfSBeufaJ8 & 4) == 0) {
                    i = this.wdg6QnbFHrFF;
                    int x50lh2ztY7Y5 = kv2.x50lh2ztY7Y5(igVar);
                    this.dgRBjINgWbAK = x50lh2ztY7Y5;
                    int readByte = igVar.readByte() & 255;
                    this.OPXfSBeufaJ8 = igVar.readByte() & 255;
                    ql0.Companion.getClass();
                    Logger logger = ql0.dgRBjINgWbAK;
                    if (logger.isLoggable(Level.FINE)) {
                        ah ahVar = zk0.PxuCJdSBwIXG;
                        logger.fine(zk0.lS5Rgt96tfkO(true, this.wdg6QnbFHrFF, x50lh2ztY7Y5, readByte, this.OPXfSBeufaJ8));
                    }
                    readInt = igVar.readInt() & Integer.MAX_VALUE;
                    this.wdg6QnbFHrFF = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long RAsUl2FVSrh6 = igVar.RAsUl2FVSrh6(Math.min(8192L, i2), yfVar);
                if (RAsUl2FVSrh6 != -1) {
                    this.dgRBjINgWbAK -= (int) RAsUl2FVSrh6;
                    return RAsUl2FVSrh6;
                }
            }
            return -1L;
        } while (readInt == i);
        u9.S9EYkSpbGuxq("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
