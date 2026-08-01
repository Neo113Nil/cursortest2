package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class zn implements f30 {
    public final w8 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public zn(w8 w8Var) {
        w8Var.getClass();
        this.f = w8Var;
    }

    @Override // defpackage.f30
    public final v50 a() {
        return this.f.a();
    }

    @Override // defpackage.f30
    public final long b(long j, u8 u8Var) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            w8 w8Var = this.f;
            if (i2 == 0) {
                w8Var.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q = r70.q(w8Var);
                    this.j = q;
                    this.g = q;
                    int readByte = w8Var.readByte() & 255;
                    this.h = w8Var.readByte() & 255;
                    Logger logger = ao.i;
                    if (logger.isLoggable(Level.FINE)) {
                        y8 y8Var = nn.a;
                        logger.fine(nn.a(true, this.i, this.g, readByte, this.h));
                    }
                    readInt = w8Var.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b = w8Var.b(Math.min(8192L, i2), u8Var);
                if (b != -1) {
                    this.j -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (readInt == i);
        t8.y("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
