package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class po implements q30 {
    public final r8 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public po(r8 r8Var) {
        r8Var.getClass();
        this.f = r8Var;
    }

    @Override // defpackage.q30
    public final d60 a() {
        return this.f.a();
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            r8 r8Var = this.f;
            if (i2 == 0) {
                r8Var.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q = y70.q(r8Var);
                    this.j = q;
                    this.g = q;
                    int readByte = r8Var.readByte() & 255;
                    this.h = r8Var.readByte() & 255;
                    Logger logger = qo.i;
                    if (logger.isLoggable(Level.FINE)) {
                        t8 t8Var = co.a;
                        logger.fine(co.a(true, this.i, this.g, readByte, this.h));
                    }
                    readInt = r8Var.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b = r8Var.b(Math.min(8192L, i2), p8Var);
                if (b != -1) {
                    this.j -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (readInt == i);
        o8.x("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
