package e6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class u implements n6.w {

    /* renamed from: f, reason: collision with root package name */
    public final n6.h f4132f;

    /* renamed from: g, reason: collision with root package name */
    public int f4133g;

    /* renamed from: h, reason: collision with root package name */
    public int f4134h;

    /* renamed from: i, reason: collision with root package name */
    public int f4135i;

    /* renamed from: j, reason: collision with root package name */
    public int f4136j;

    /* renamed from: k, reason: collision with root package name */
    public int f4137k;

    public u(n6.h source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f4132f = source;
    }

    @Override // n6.w
    public final n6.y b() {
        return this.f4132f.b();
    }

    @Override // n6.w
    public final long i(long j4, n6.f fVar) {
        int i7;
        int readInt;
        do {
            int i8 = this.f4136j;
            n6.h hVar = this.f4132f;
            if (i8 == 0) {
                hVar.skip(this.f4137k);
                this.f4137k = 0;
                if ((this.f4134h & 4) == 0) {
                    i7 = this.f4135i;
                    int k4 = Y5.c.k(hVar);
                    this.f4136j = k4;
                    this.f4133g = k4;
                    int readByte = hVar.readByte() & 255;
                    this.f4134h = hVar.readByte() & 255;
                    Logger logger = v.f4138i;
                    if (logger.isLoggable(Level.FINE)) {
                        n6.i iVar = h.f4073a;
                        logger.fine(h.b(true, this.f4135i, this.f4133g, readByte, this.f4134h));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.f4135i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long i9 = hVar.i(Math.min(8192L, i8), fVar);
                if (i9 != -1) {
                    this.f4136j -= (int) i9;
                    return i9;
                }
            }
            return -1L;
        } while (readInt == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
