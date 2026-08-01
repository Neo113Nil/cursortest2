package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fu implements ke0 {
    public final w9 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public fu(w9 w9Var) {
        w9Var.getClass();
        this.f = w9Var;
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return this.f.a();
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            w9 w9Var = this.f;
            if (i2 == 0) {
                w9Var.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q = zk0.q(w9Var);
                    this.j = q;
                    this.g = q;
                    int readByte = w9Var.readByte() & 255;
                    this.h = w9Var.readByte() & 255;
                    Logger logger = gu.i;
                    if (logger.isLoggable(Level.FINE)) {
                        y9 y9Var = st.a;
                        logger.fine(st.a(true, this.i, this.g, readByte, this.h));
                    }
                    readInt = w9Var.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long c = w9Var.c(Math.min(8192L, i2), t9Var);
                if (c != -1) {
                    this.j -= (int) c;
                    return c;
                }
            }
            return -1L;
        } while (readInt == i);
        s9.w("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
