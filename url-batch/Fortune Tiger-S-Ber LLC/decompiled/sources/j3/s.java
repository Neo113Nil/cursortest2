package j3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s implements p3.v {

    /* renamed from: f, reason: collision with root package name */
    public final p3.h f2466f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2467i;

    /* renamed from: j, reason: collision with root package name */
    public int f2468j;

    /* renamed from: k, reason: collision with root package name */
    public int f2469k;

    public s(p3.h hVar) {
        u2.c.e(hVar, "source");
        this.f2466f = hVar;
    }

    @Override // p3.v
    public final p3.x a() {
        return this.f2466f.a();
    }

    @Override // p3.v
    public final long c(long j4, p3.f fVar) {
        int i4;
        int readInt;
        do {
            int i5 = this.f2468j;
            p3.h hVar = this.f2466f;
            if (i5 == 0) {
                hVar.skip(this.f2469k);
                this.f2469k = 0;
                if ((this.h & 4) == 0) {
                    i4 = this.f2467i;
                    int q4 = d3.c.q(hVar);
                    this.f2468j = q4;
                    this.g = q4;
                    int readByte = hVar.readByte() & 255;
                    this.h = hVar.readByte() & 255;
                    Logger logger = t.f2470i;
                    if (logger.isLoggable(Level.FINE)) {
                        p3.i iVar = f.f2422a;
                        logger.fine(f.a(true, this.f2467i, this.g, readByte, this.h));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.f2467i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long c = hVar.c(Math.min(8192L, i5), fVar);
                if (c != -1) {
                    this.f2468j -= (int) c;
                    return c;
                }
            }
            return -1L;
        } while (readInt == i4);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
