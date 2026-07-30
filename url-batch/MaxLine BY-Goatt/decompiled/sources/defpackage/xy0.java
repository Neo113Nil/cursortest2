package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xy0 implements pn2 {
    public final pq m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    public xy0(pq pqVar) {
        pqVar.getClass();
        this.m = pqVar;
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m.e();
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        int i;
        int readInt;
        fqVar.getClass();
        do {
            int i2 = this.q;
            pq pqVar = this.m;
            if (i2 == 0) {
                pqVar.skip(this.r);
                this.r = 0;
                if ((this.o & 4) == 0) {
                    i = this.p;
                    int p = n33.p(pqVar);
                    this.q = p;
                    this.n = p;
                    int readByte = pqVar.readByte() & 255;
                    this.o = pqVar.readByte() & 255;
                    Logger logger = yy0.p;
                    if (logger.isLoggable(Level.FINE)) {
                        dr drVar = my0.a;
                        logger.fine(my0.a(true, this.p, this.n, readByte, this.o));
                    }
                    readInt = pqVar.readInt() & Integer.MAX_VALUE;
                    this.p = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long h = pqVar.h(Math.min(j, i2), fqVar);
                if (h != -1) {
                    this.q -= (int) h;
                    return h;
                }
            }
            return -1L;
        } while (readInt == i);
        dm0.j("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
