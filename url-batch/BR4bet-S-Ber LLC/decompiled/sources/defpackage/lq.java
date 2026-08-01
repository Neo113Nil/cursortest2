package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lq implements h60 {
    public final j9 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public lq(j9 j9Var) {
        j9Var.getClass();
        this.f = j9Var;
    }

    @Override // defpackage.h60
    public final f90 a() {
        return this.f.a();
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            j9 j9Var = this.f;
            if (i2 == 0) {
                j9Var.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q = cb0.q(j9Var);
                    this.j = q;
                    this.g = q;
                    int readByte = j9Var.readByte() & 255;
                    this.h = j9Var.readByte() & 255;
                    Logger logger = mq.i;
                    if (logger.isLoggable(Level.FINE)) {
                        l9 l9Var = zp.a;
                        logger.fine(zp.a(true, this.i, this.g, readByte, this.h));
                    }
                    readInt = j9Var.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b = j9Var.b(Math.min(8192L, i2), h9Var);
                if (b != -1) {
                    this.j -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (readInt == i);
        g9.w("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
