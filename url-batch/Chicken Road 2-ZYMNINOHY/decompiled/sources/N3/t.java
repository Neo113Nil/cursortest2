package N3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements T3.v {

    /* renamed from: a, reason: collision with root package name */
    public final T3.i f1910a;

    /* renamed from: b, reason: collision with root package name */
    public int f1911b;

    /* renamed from: c, reason: collision with root package name */
    public int f1912c;

    /* renamed from: d, reason: collision with root package name */
    public int f1913d;

    /* renamed from: e, reason: collision with root package name */
    public int f1914e;

    /* renamed from: f, reason: collision with root package name */
    public int f1915f;

    public t(T3.i source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1910a = source;
    }

    @Override // T3.v
    public final T3.x d() {
        return this.f1910a.d();
    }

    @Override // T3.v
    public final long j(T3.g sink, long j4) {
        int i4;
        int readInt;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            int i5 = this.f1914e;
            T3.i iVar = this.f1910a;
            if (i5 == 0) {
                iVar.skip(this.f1915f);
                this.f1915f = 0;
                if ((this.f1912c & 4) == 0) {
                    i4 = this.f1913d;
                    int q4 = H3.b.q(iVar);
                    this.f1914e = q4;
                    this.f1911b = q4;
                    int readByte = iVar.readByte() & 255;
                    this.f1912c = iVar.readByte() & 255;
                    Logger logger = u.f1916d;
                    if (logger.isLoggable(Level.FINE)) {
                        T3.j jVar = g.f1854a;
                        logger.fine(g.a(true, this.f1913d, this.f1911b, readByte, this.f1912c));
                    }
                    readInt = iVar.readInt() & Integer.MAX_VALUE;
                    this.f1913d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j5 = iVar.j(sink, Math.min(8192L, i5));
                if (j5 != -1) {
                    this.f1914e -= (int) j5;
                    return j5;
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
