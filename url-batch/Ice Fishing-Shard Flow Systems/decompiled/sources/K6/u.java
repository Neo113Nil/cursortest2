package K6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements T6.w {

    /* renamed from: d, reason: collision with root package name */
    public final T6.h f1588d;

    /* renamed from: e, reason: collision with root package name */
    public int f1589e;

    /* renamed from: i, reason: collision with root package name */
    public int f1590i;

    /* renamed from: l, reason: collision with root package name */
    public int f1591l;

    /* renamed from: m, reason: collision with root package name */
    public int f1592m;

    /* renamed from: n, reason: collision with root package name */
    public int f1593n;

    public u(T6.h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1588d = source;
    }

    @Override // T6.w
    public final T6.y b() {
        return this.f1588d.b();
    }

    @Override // T6.w
    public final long o(long j, T6.f sink) {
        int i2;
        int readInt;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i5 = this.f1592m;
            T6.h hVar = this.f1588d;
            if (i5 == 0) {
                hVar.skip(this.f1593n);
                this.f1593n = 0;
                if ((this.f1590i & 4) == 0) {
                    i2 = this.f1591l;
                    int k7 = E6.c.k(hVar);
                    this.f1592m = k7;
                    this.f1589e = k7;
                    int readByte = hVar.readByte() & 255;
                    this.f1590i = hVar.readByte() & 255;
                    Logger logger = v.f1594l;
                    if (logger.isLoggable(Level.FINE)) {
                        T6.i iVar = h.f1526a;
                        logger.fine(h.b(true, this.f1591l, this.f1589e, readByte, this.f1590i));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.f1591l = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long o7 = hVar.o(Math.min(8192L, i5), sink);
                if (o7 != -1) {
                    this.f1592m -= (int) o7;
                    return o7;
                }
            }
            return -1L;
        } while (readInt == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
