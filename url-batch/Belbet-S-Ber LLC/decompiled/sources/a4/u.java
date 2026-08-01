package a4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u implements g4.v {

    /* renamed from: f, reason: collision with root package name */
    public final g4.h f225f;

    /* renamed from: g, reason: collision with root package name */
    public int f226g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f227j;

    /* renamed from: k, reason: collision with root package name */
    public int f228k;

    public u(g4.h hVar) {
        i3.d.e(hVar, "source");
        this.f225f = hVar;
    }

    @Override // g4.v
    public final g4.x a() {
        return this.f225f.a();
    }

    @Override // g4.v
    public final long c(long j2, g4.f fVar) {
        int i;
        int readInt;
        do {
            int i4 = this.f227j;
            g4.h hVar = this.f225f;
            if (i4 == 0) {
                hVar.skip(this.f228k);
                this.f228k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int q4 = u3.b.q(hVar);
                    this.f227j = q4;
                    this.f226g = q4;
                    int readByte = hVar.readByte() & 255;
                    this.h = hVar.readByte() & 255;
                    Logger logger = v.i;
                    if (logger.isLoggable(Level.FINE)) {
                        g4.i iVar = g.f172a;
                        logger.fine(g.a(true, this.i, this.f226g, readByte, this.h));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long c5 = hVar.c(Math.min(8192L, i4), fVar);
                if (c5 != -1) {
                    this.f227j -= (int) c5;
                    return c5;
                }
            }
            return -1L;
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
